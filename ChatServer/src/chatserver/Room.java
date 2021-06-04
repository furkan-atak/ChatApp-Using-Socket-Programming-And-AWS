/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver;

import java.util.ArrayList;

/**
 *
 * @author Pc
 */
public class Room {
    String roomName;
    ArrayList<Client> clients = new ArrayList<>();
    

    public Room(String roomName) {
        this.roomName = roomName;
    }
    
}
