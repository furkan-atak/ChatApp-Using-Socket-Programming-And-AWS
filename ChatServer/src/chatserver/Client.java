/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver;

import Message.Message;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pc
 */
public class Client {
    int id;
    String name = "NoName";
    ArrayList<String> chatMates;
    Socket soket;
    ObjectOutputStream sOutput;
    ObjectInputStream sInput;
    ClientListener listenThread;

    public Client(Socket gelenSoket, int id) {
        this.soket = gelenSoket;
        this.id = id;
        chatMates = new ArrayList<>();
        try {
            this.sOutput = new ObjectOutputStream(this.soket.getOutputStream());
            this.sInput = new ObjectInputStream(this.soket.getInputStream());
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.listenThread = new ClientListener(this);
    }

    public void Send(Message message) {
        try {
            this.sOutput.writeObject(message);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
