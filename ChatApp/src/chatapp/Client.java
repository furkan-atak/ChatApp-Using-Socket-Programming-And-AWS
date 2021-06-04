/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp;

import Message.Message;
import static chatapp.Client.sInput;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pc
 */

class ServerListener extends Thread {

    @Override
    public void run() {
        while (Client.socket.isConnected()) {
            try {
                Message received = (Message) (sInput.readObject());

                switch (received.type) {

                    case CreateRoom:
                        Login.Login.getRooms((ArrayList<String>)received.content);
                        System.out.println("Rooms list reached from server...");
                        break;
                    case JoinRoom:
                        ArrayList<Object> aboutRoom = (ArrayList<Object>)received.content;
                        ChatRoom cr = Login.Login.findChatRoom((String)aboutRoom.get(0));
                        cr.getUsers((ArrayList<String>)aboutRoom.get(1));
                        break;
                    case JoinServer:
                        Thread.sleep(100);
                        Login.Login.getUsers((ArrayList<String>)received.content);
                        break;
                    case ShowRoomUsers:
                        Thread.sleep(100);
                        Login.Login.getRoomUsers((ArrayList<String>)received.content);
                        break;
                    case RoomMessage:
                        ArrayList<String> chatRoomMsg = (ArrayList<String>)received.content;
                        ChatRoom chatRm = Login.Login.findChatRoom(chatRoomMsg.get(1));
                        chatRm.getMessage(chatRoomMsg.get(0), chatRoomMsg.get(2));
                        break;
                    case CreatePrivateChat:
                        Login.Login.openPrivChat((String)received.content);
                        break;
                    case PrivateMessage:
                        String chatMate = ((ArrayList<String>)received.content).get(0);
                        String txtMsg = ((ArrayList<String>)received.content).get(1);
                        Login.Login.findPrivChat(chatMate).getMessage(txtMsg);
                        break;
                }

            } catch (IOException | ClassNotFoundException ex) {

                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                break;
            } catch (InterruptedException ex) {
                Logger.getLogger(ServerListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

public class Client {

    public static Socket socket;
    public static ObjectInputStream sInput;
    public static ObjectOutputStream sOutput;
    public static ServerListener listenMe;
    

    public static void Start(String ip, int port, String userName) {
        try {
            Client.socket = new Socket(ip, port);
            Client.Display("Servera bağlandı");
            Client.sInput = new ObjectInputStream(Client.socket.getInputStream());
            Client.sOutput = new ObjectOutputStream(Client.socket.getOutputStream());
            Client.listenMe = new ServerListener();
            Client.listenMe.start();

            Message msg = new Message(Message.Message_Type.JoinServer);
            msg.content = userName;
            Client.Send(msg);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Stop() {
        try {
            if (Client.socket != null) {
                Client.listenMe.stop();
                Client.socket.close();
                Client.sOutput.flush();
                Client.sOutput.close();
                Client.sInput.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void Display(String msg) {

        System.out.println(msg);

    }

    //mesaj gönderme fonksiyonu
    public static void Send(Message msg) {
        try {
            Client.sOutput.flush();
            Client.sOutput.writeObject(msg);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
