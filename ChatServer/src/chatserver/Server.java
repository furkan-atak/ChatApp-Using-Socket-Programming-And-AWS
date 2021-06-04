/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver;

import Message.Message;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Pc
 */
public class Server {

    public static ServerSocket serverSocket;
    public static int IdClient = 0;
    public static int port = 0;
    public static ArrayList<Room> rooms = new ArrayList<>();
    public static NewClientListener runThread;
    public static ArrayList<Client> Clients = new ArrayList<>();
    
    public static void Start(int openport) {
        try {
            Server.port = openport;
            Server.serverSocket = new ServerSocket(Server.port);

            Server.runThread = new NewClientListener();
            Server.runThread.start();

        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Send(Client cl, Message msg) {

        try {
            cl.sOutput.flush();
            cl.sOutput.writeObject(msg);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public static void bcastUsers(){
        ArrayList<String> clientList = new ArrayList<>();
        
        for (Client client : Clients) {
            clientList.add(client.name);
        }
        Message msg = new Message(Message.Message_Type.JoinServer);
        msg.content = clientList;
        for (Client client : Clients) {
            Send(client, msg);
        }
    }
    
    public static void bcastRooms(){
        ArrayList<String> roomList = new ArrayList<>();
        
        for (Room room : rooms) {
            roomList.add(room.roomName);
        }
        Message msg = new Message(Message.Message_Type.CreateRoom);
        msg.content = roomList;
        for (Client client : Clients) {
            Send(client, msg);
        }
    }
    
    public static Room findRoom(String rName){
        System.out.println(rName);
        System.out.println("room size: "+rooms.size());
        for (Room room : rooms) {
            if(rName.equalsIgnoreCase(room.roomName)){
                return room;
            }
        }
        System.out.println("Bulamadı");
        return null;
    }
       
    public static void bcRoomMsg(ArrayList<String> msg){
        Room theRoom = Server.findRoom(msg.get(1));
        Message theMsg = new Message(Message.Message_Type.RoomMessage);
        theMsg.content = msg;
        for (Client client : theRoom.clients) {
            if(!client.name.equalsIgnoreCase(msg.get(0))){
                Send(client, theMsg);
            }
        }
    }
    
    public static void bcRoomUsers(Room room){
        ArrayList<String> roomUsrs = new ArrayList<>();
        for (Client client : room.clients) {
            roomUsrs.add(client.name);
        }
        Message theMsg = new Message(Message.Message_Type.ShowRoomUsers);
        theMsg.content = roomUsrs;
        for (Client client : Clients) {
            Send(client, theMsg);
        }
    }
    
    public static Client findClient(String userName){
        for (Client client : Clients) {
            if(userName.equalsIgnoreCase(client.name)){
                return client;
            }
        }
        return null;
    }
    
}
