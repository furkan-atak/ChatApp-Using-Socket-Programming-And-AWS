/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver;

import Message.Message;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pc
 */
public class ClientListener extends Thread {

    Client TheClient;

    ClientListener(Client TheClient) {
        this.TheClient = TheClient;
    }

    @Override
    public void run() {
        while (TheClient.soket.isConnected()) {
            try {
                try {
                    Message msg = (Message) TheClient.sInput.readObject();

                    switch (msg.type) {
                        case JoinServer:
                            TheClient.name = msg.content.toString();
                            Server.bcastUsers();
                            System.out.println("User " + TheClient.name + " has joined the server...");
                            break;
                        case CreateRoom:
                            Room r = new Room((String) msg.content);
                            Server.rooms.add(r);
                            r.clients.add(TheClient);
                            Server.bcastRooms();
                            System.out.println(TheClient.name + " has create a room named : " + r.roomName);
                            break;
                        case JoinRoom:
                            ArrayList<String> roomUsers = new ArrayList<>();
                            ArrayList<Object> aboutRoom = new ArrayList<>();
                            Room room = Server.findRoom((String) msg.content);
                            aboutRoom.add(room.roomName);
                            room.clients.add(TheClient);
                            for (Client client : room.clients) {
                                roomUsers.add(client.name);
                            }
                            aboutRoom.add(roomUsers);
                            Message msgClients = new Message(Message.Message_Type.JoinRoom);
                            msgClients.content = aboutRoom;
                            for (Client client : room.clients) {
                                Server.Send(client, msgClients);
                            }
                            System.out.println("User " + TheClient.name + " is joining the room named " + room.roomName);
                            break;
                        case ShowRoomUsers:
                            Room roomUsrs = Server.findRoom((String)msg.content); 
                            Server.bcRoomUsers(roomUsrs);
                            break;
                        case RoomMessage:
                            ArrayList<String> roomMsg = (ArrayList<String>) msg.content;
                            Server.bcRoomMsg(roomMsg);
                            break;
                        case CreatePrivateChat:
                            TheClient.chatMates.add((String) msg.content);
                            Client client = Server.findClient((String) msg.content);
                            Message privateMsg = new Message(Message.Message_Type.CreatePrivateChat);
                            privateMsg.content = TheClient.name;
                            Server.Send(client, privateMsg);
                            break;
                        case PrivateMessage:
                            Client c = Server.findClient(((ArrayList<String>) msg.content).get(0));
                            Server.Send(c, msg);
                            break;
                    }

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ClientListener.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                Server.Clients.remove(TheClient);

            }
        }
    }
}

class NewClientListener extends Thread {

    @Override
    public void run() {
        while (!Server.serverSocket.isClosed()) {
            try {
                System.out.println("Waiting For Client...");

                Socket clientSocket = Server.serverSocket.accept();

                System.out.println("Client Came...");

                Client nclient = new Client(clientSocket, Server.IdClient);

                Server.IdClient++;
                Server.Clients.add(nclient);

                nclient.listenThread.start();

            } catch (IOException ex) {
                Logger.getLogger(NewClientListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
