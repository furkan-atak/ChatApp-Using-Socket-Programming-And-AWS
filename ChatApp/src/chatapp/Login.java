/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp;

import Message.Message;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Pc
 */
public class Login extends javax.swing.JFrame {

    public static Login Login;
    DefaultListModel dlmRoom;
    DefaultListModel dlmUsers;
    DefaultListModel dlmRoUsers;
    String userName;
    ArrayList<ChatRoom> chatrooms;
    ArrayList<PrivateChat> pchats;
    ArrayList<String> existRooms;
    boolean clicked = true;

    public Login() {
        dlmRoom = new DefaultListModel();
        dlmUsers = new DefaultListModel();
        dlmRoUsers = new DefaultListModel();
        Login = this;
        chatrooms = new ArrayList<>();
        pchats = new ArrayList<>();
        existRooms = new ArrayList<>();
        this.setTitle("Chat App");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        roomUsersList = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        joinButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        roomList = new javax.swing.JList<>();
        refreshButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        roomTxt = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        connectButt = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        userList = new javax.swing.JList<>();
        privateChatBtton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setText("User Name: ");

        userTxt.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });

        jTabbedPane4.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane4.setForeground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        roomUsersList.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(roomUsersList);

        jLabel3.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Users in the room: ");

        joinButton.setBackground(new java.awt.Color(255, 255, 255));
        joinButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        joinButton.setForeground(new java.awt.Color(0, 153, 153));
        joinButton.setText("Join The Room");
        joinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinButtonActionPerformed(evt);
            }
        });

        roomList.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        roomList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomListMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(roomList);
        roomList.getAccessibleContext().setAccessibleName("");
        roomList.getAccessibleContext().setAccessibleDescription("");

        refreshButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(0, 153, 153));
        refreshButton.setText("Refresh Rooms");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 173, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(joinButton)
                        .addGap(18, 18, 18)
                        .addComponent(refreshButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(120, 120, 120)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(joinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))))
        );

        jTabbedPane4.addTab("Current Rooms", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Room Name: ");

        roomTxt.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        roomTxt.setForeground(new java.awt.Color(0, 0, 102));
        roomTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomTxtActionPerformed(evt);
            }
        });

        createButton.setBackground(new java.awt.Color(255, 255, 255));
        createButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        createButton.setForeground(new java.awt.Color(0, 153, 153));
        createButton.setText("CREATE ROOM");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(346, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(roomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Create New Room", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));

        connectButt.setBackground(new java.awt.Color(255, 255, 255));
        connectButt.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        connectButt.setForeground(new java.awt.Color(0, 153, 153));
        connectButt.setText("Go Online");
        connectButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(connectButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(connectButt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Online Users: ");

        userList.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jScrollPane3.setViewportView(userList);

        privateChatBtton.setBackground(new java.awt.Color(255, 255, 255));
        privateChatBtton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        privateChatBtton.setForeground(new java.awt.Color(0, 153, 153));
        privateChatBtton.setText("Chat With Selected");
        privateChatBtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privateChatBttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(privateChatBtton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jLabel2))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(privateChatBtton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane4)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void refreshRooms() {
        roomList.setModel(dlmRoom);
    }

    public void getUsers(ArrayList<String> userNames) {
        dlmUsers.removeAllElements();
        userList.removeAll();
        for (String usrName : userNames) {
            dlmUsers.addElement(usrName);
        }
        userList.setModel(dlmUsers);
    }

    public void getRooms(ArrayList<String> rooms) {
        dlmRoom.removeAllElements();
        roomList.removeAll();
        for (String roomName : rooms) {
            dlmRoom.addElement(roomName);
            existRooms.add(roomName);
        }
        roomList.setModel(dlmRoom);
    }

    public ChatRoom findChatRoom(String rName) {
        for (ChatRoom chatroom : this.chatrooms) {
            if (chatroom.roomName.equalsIgnoreCase(rName)) {
                return chatroom;
            }
        }
        return null;
    }

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void roomTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomTxtActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        Message msg = new Message(Message.Message_Type.ReturnRoomsNames);
        Client.Send(msg);
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void joinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinButtonActionPerformed
        if(roomList.getSelectedValue() != null){
        ChatRoom cr = new ChatRoom(this.userName, roomList.getSelectedValue());
        cr.users.add(userName);
        this.chatrooms.add(cr);
        cr.setVisible(true);
        Message msg = new Message(Message.Message_Type.JoinRoom);
        msg.content = roomList.getSelectedValue();
        Client.Send(msg);
        }
    }//GEN-LAST:event_joinButtonActionPerformed

    private void connectButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtActionPerformed
        if (clicked) {
            userTxt.setEditable(false);
            this.userName = userTxt.getText();
            Client.Start("localhost", 2000, this.userName);  // your server's ip adress goes here. If you dont have a server localhost works fine.
            clicked = false;
        }else{
            JOptionPane.showMessageDialog(null,"Already Connected!","Connection Exist",1);
        }
    }//GEN-LAST:event_connectButtActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        
        if(!roomTxt.getText().equalsIgnoreCase("") && !(existRooms.contains(roomTxt.getText()))){
        ChatRoom cr = new ChatRoom(userName, roomTxt.getText());
        cr.users.add(userName);
        this.chatrooms.add(cr);
        existRooms.add(roomTxt.getText());
        cr.setVisible(true);
        
        Message msg = new Message(Message.Message_Type.CreateRoom);
        msg.content = roomTxt.getText();
        Client.Send(msg);
        }else{
            JOptionPane.showMessageDialog(null,"              Invalid Room Name! \n The Room Is Already Exist Or Emty Name.","Invalid Room Entrance",0);
        }
    }//GEN-LAST:event_createButtonActionPerformed

    public void openPrivChat(String chatMate) {
        PrivateChat privChat = new PrivateChat(userName, chatMate);
        privChat.setVisible(true);
        this.pchats.add(privChat);
    }

    public PrivateChat findPrivChat(String chatMate) {
        for (PrivateChat pchat : pchats) {
            if (chatMate.equalsIgnoreCase(pchat.userName)) {
                return pchat;
            }
        }
        return null;
    }

    private void privateChatBttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_privateChatBttonActionPerformed
        if (userList.getSelectedValue() != null && !userList.getSelectedValue().equals(this.userName)) {
            PrivateChat privateChat = new PrivateChat(userName, userList.getSelectedValue());
            privateChat.setVisible(true);
            this.pchats.add(privateChat);
            Message msg = new Message(Message.Message_Type.CreatePrivateChat);
            msg.content = userList.getSelectedValue();
            Client.Send(msg);
        }else{
            System.out.println("You should make a proper selection from the user list!");
             JOptionPane.showMessageDialog(null, "You should make a proper selection from the user list!","Invalid User",2);
        }
    }//GEN-LAST:event_privateChatBttonActionPerformed

    public void getRoomUsers(ArrayList<String> userNames) {
        dlmRoUsers.removeAllElements();
        roomUsersList.removeAll();
        System.out.println(userNames.get(0));
        for (String usrName : userNames) {
            dlmRoUsers.addElement(usrName);
        }
        roomUsersList.setModel(dlmRoUsers);
    }


    private void roomListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomListMouseClicked
        roomUsersList.removeAll();
        dlmRoUsers.removeAllElements();
        Message msg = new Message(Message.Message_Type.ShowRoomUsers);
        msg.content = roomList.getSelectedValue();
        Client.Send(msg);
    }//GEN-LAST:event_roomListMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connectButt;
    private javax.swing.JButton createButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JButton joinButton;
    private javax.swing.JButton privateChatBtton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JList<String> roomList;
    private javax.swing.JTextField roomTxt;
    private javax.swing.JList<String> roomUsersList;
    private javax.swing.JList<String> userList;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
