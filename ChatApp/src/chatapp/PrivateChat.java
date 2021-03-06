/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp;

import Message.Message;
import java.awt.ComponentOrientation;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

/**
 *
 * @author Pc
 */
public class PrivateChat extends javax.swing.JFrame {

    String userName;
    String chatMate;
    DefaultListModel dlm;
    DefaultListCellRenderer renderer;
    String lastClicked;
    int clickTime = 0;
    boolean canDownload = false;

    public PrivateChat() {
        initComponents();
    }

    public PrivateChat(String userName, String chatMate) {
        this.userName = userName;
        this.chatMate = chatMate;
        dlm = new DefaultListModel();
        renderer = new DefaultListCellRenderer();
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        chatMateLabel.setText("CHATTING WITH " + chatMate.toUpperCase());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sendButton = new javax.swing.JButton();
        fileSendButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        msgList = new javax.swing.JList<>();
        chatMateLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        msgTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sendButton.setBackground(new java.awt.Color(255, 255, 255));
        sendButton.setForeground(new java.awt.Color(0, 0, 102));
        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        fileSendButton.setBackground(new java.awt.Color(255, 255, 255));
        fileSendButton.setForeground(new java.awt.Color(0, 0, 102));
        fileSendButton.setText("Send File");
        fileSendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileSendButtonActionPerformed(evt);
            }
        });

        closeButton.setBackground(new java.awt.Color(255, 255, 255));
        closeButton.setForeground(new java.awt.Color(0, 0, 153));
        closeButton.setText("Close Chat");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        msgList.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        msgList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                msgListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(msgList);

        chatMateLabel.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        chatMateLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(chatMateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chatMateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        msgTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgTxtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Text Here:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(msgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 85, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fileSendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(closeButton))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fileSendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addComponent(closeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void msgTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msgTxtActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        dlm.addElement(userName + ": " + msgTxt.getText() + "\n");
        msgList.setModel(dlm);
        ArrayList<String> aboutPrivChat = new ArrayList<>();
        aboutPrivChat.add(chatMate);
        aboutPrivChat.add(msgTxt.getText());
        msgTxt.setText("");
        Message msg = new Message(Message.Message_Type.PrivateMessage);
        msg.content = aboutPrivChat;
        Client.Send(msg);
    }//GEN-LAST:event_sendButtonActionPerformed

    private void fileSendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileSendButtonActionPerformed
        ArrayList<Object> fileArr = new ArrayList<>();
        JFileChooser j = new JFileChooser();
        int dialog = j.showSaveDialog(this);
        if (dialog == JFileChooser.APPROVE_OPTION) {
            File inputFile = j.getSelectedFile();
            byte[] mybytearray = new byte[(int) inputFile.length()];

            try {
                FileInputStream fis = new FileInputStream(inputFile);
                BufferedInputStream bis = new BufferedInputStream(fis);
                bis.read(mybytearray, 0, mybytearray.length);
                fileArr.add(chatMate);
                fileArr.add(inputFile.getName());
                fileArr.add(mybytearray);
                fileArr.add(0);
                fileArr.add(mybytearray.length);
                dlm.addElement("FILE --> " + inputFile.getName());
                msgList.setModel(dlm);
                Message msg = new Message(Message.Message_Type.SendFile);
                msg.content = fileArr;
                Client.Send(msg);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(PrivateChat.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(PrivateChat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_fileSendButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        Login.Login.pchats.remove(this);
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void msgListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msgListMouseClicked
      
    }//GEN-LAST:event_msgListMouseClicked
 

    public void getMessage(String msg) {
        dlm.addElement(chatMate + ": " + msg + "\n");
        msgList.setModel(dlm);
    }

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
            java.util.logging.Logger.getLogger(PrivateChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrivateChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrivateChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrivateChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrivateChat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chatMateLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton fileSendButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> msgList;
    private javax.swing.JTextField msgTxt;
    private javax.swing.JButton sendButton;
    // End of variables declaration//GEN-END:variables
}
