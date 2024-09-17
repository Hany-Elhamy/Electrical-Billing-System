
package project;

import sendingemail.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import javax.swing.JOptionPane;
import java.awt.Image;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
public class new_customer_interface extends javax.swing.JFrame {
objectt nn=new objectt();
 
     int z=1000;
   
    public new_customer_interface() {
        initComponents();
        setSize(600, 330);
                setVisible(true);
        setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        name_text = new javax.swing.JTextField();
        address_label = new javax.swing.JLabel();
        address_text = new javax.swing.JTextField();
        info_submit_ = new javax.swing.JButton();
        image_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        email_text = new javax.swing.JTextField();
        fill_info_back_ = new javax.swing.JButton();
        file_name_text = new javax.swing.JTextField();
        attach_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\importan papers\\pl2\\project\\incandescent-bulbs-photo.jpg")); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("the electricity company");
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText(" fill your information");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(105, 13, 174, 32);

        name_label.setBackground(new java.awt.Color(204, 204, 204));
        name_label.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        name_label.setForeground(new java.awt.Color(204, 204, 204));
        name_label.setText("  name:");
        getContentPane().add(name_label);
        name_label.setBounds(12, 88, 71, 22);

        name_text.setBackground(new java.awt.Color(204, 204, 204));
        name_text.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        name_text.setForeground(new java.awt.Color(102, 0, 0));
        name_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_textActionPerformed(evt);
            }
        });
        getContentPane().add(name_text);
        name_text.setBounds(119, 85, 184, 28);

        address_label.setBackground(new java.awt.Color(204, 204, 204));
        address_label.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        address_label.setForeground(new java.awt.Color(204, 204, 204));
        address_label.setText("  address:");
        getContentPane().add(address_label);
        address_label.setBounds(12, 198, 89, 22);

        address_text.setBackground(new java.awt.Color(204, 204, 204));
        address_text.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        address_text.setForeground(new java.awt.Color(102, 0, 0));
        getContentPane().add(address_text);
        address_text.setBounds(119, 195, 184, 28);

        info_submit_.setBackground(new java.awt.Color(204, 204, 204));
        info_submit_.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        info_submit_.setForeground(new java.awt.Color(102, 0, 0));
        info_submit_.setText("submit");
        info_submit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info_submit_ActionPerformed(evt);
            }
        });
        getContentPane().add(info_submit_);
        info_submit_.setBounds(250, 240, 101, 31);
        getContentPane().add(image_label);
        image_label.setBounds(360, 20, 210, 180);

        email_label.setBackground(new java.awt.Color(204, 204, 204));
        email_label.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        email_label.setForeground(new java.awt.Color(204, 204, 204));
        email_label.setText("  email:");
        getContentPane().add(email_label);
        email_label.setBounds(12, 143, 81, 22);

        email_text.setBackground(new java.awt.Color(204, 204, 204));
        email_text.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        email_text.setForeground(new java.awt.Color(102, 0, 0));
        getContentPane().add(email_text);
        email_text.setBounds(119, 140, 184, 28);

        fill_info_back_.setBackground(new java.awt.Color(204, 204, 204));
        fill_info_back_.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        fill_info_back_.setForeground(new java.awt.Color(102, 0, 0));
        fill_info_back_.setText("back");
        fill_info_back_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fill_info_back_ActionPerformed(evt);
            }
        });
        getContentPane().add(fill_info_back_);
        fill_info_back_.setBounds(10, 240, 90, 31);

        file_name_text.setBackground(new java.awt.Color(204, 204, 204));
        file_name_text.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        file_name_text.setForeground(new java.awt.Color(102, 0, 0));
        file_name_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_name_textActionPerformed(evt);
            }
        });
        getContentPane().add(file_name_text);
        file_name_text.setBounds(390, 210, 160, 28);

        attach_button.setBackground(new java.awt.Color(204, 204, 204));
        attach_button.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        attach_button.setForeground(new java.awt.Color(102, 0, 0));
        attach_button.setText("attach");
        attach_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attach_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(attach_button);
        attach_button.setBounds(420, 240, 110, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\importan papers\\pl2\\project\\incandescent-bulbs-photo.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 600, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void info_submit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info_submit_ActionPerformed
String image =file_name_text.getText();
image =image.replace("\\","\\\\");        
    if(!name_text.getText().isEmpty()&&!email_text.getText().isEmpty()&&!address_text.getText().isEmpty()&&!file_name_text.getText().isEmpty())
       {
          try{
            BufferedReader br=nn.file_read(nn.meter_code);
            String dd;  
          while((dd=br.readLine())!=null){
              if(dd.contains(Integer.toString(z))){
                  z++;
                  //Integer.toString(z).equals(r.nextLine())
              }
          }
          
           String SPACE="|";
           
        String s=Integer.toString(z)+" "+SPACE+name_text.getText()+SPACE+email_text.getText()+SPACE+address_text.getText()+SPACE+"active"+SPACE+image+"\n";
        nn.file_write(nn.meter_code,Integer.toString(z)+" "+SPACE+"active\n",true);
        nn.file_write(nn.info,s,true);
       
          }catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }  
       {
       String from = "electricitycompany4@gmail.com";
        String password = "electricity123";
        String host = "smtp.gmail.com";
        String to[] = new String[1];
        to[0]=email_text.getText();
        String message = Integer.toString(z);
        Properties props = System.getProperties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", password);
        props.put("mail.smtp.port", 587);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        Session session = Session.getDefaultInstance(props, null);
        MimeMessage mimeMessage = new MimeMessage(session);
        try {
            mimeMessage.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];
            for (int i = 0; i < to.length; i++) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for (int i = 0; i < toAddress.length; i++) {
                mimeMessage.addRecipient(Message.RecipientType.TO, toAddress[i]);
                mimeMessage.setSubject("your meter code is ready");
                mimeMessage.setText(message);
                Transport transport = session.getTransport("smtp");
                transport.connect(host, from, password);
                transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
                transport.close();
            }

        } catch (MessagingException me) {
            me.printStackTrace();
        }
       }
  
        z++;
               customer_interface ci2=new customer_interface();
       ci2.show();
        this.dispose();
       }
       else{JOptionPane.showMessageDialog(null,"enter your data","submit failure", JOptionPane.WARNING_MESSAGE);}
    }//GEN-LAST:event_info_submit_ActionPerformed

    private void fill_info_back_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fill_info_back_ActionPerformed
       customer_interface ci=new customer_interface();
       ci.show();
       this.dispose();
       
    }//GEN-LAST:event_fill_info_back_ActionPerformed

    private void name_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_textActionPerformed
    
    
    }//GEN-LAST:event_name_textActionPerformed

    private void file_name_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_name_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_file_name_textActionPerformed

    private void attach_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attach_buttonActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String fileName=f.getAbsolutePath();
        file_name_text.setText(fileName);
        Image getAbsolutePath=null;
        ImageIcon icon = new ImageIcon (fileName);
        Image image =icon.getImage().getScaledInstance(image_label.getWidth(),image_label.getHeight() , Image.SCALE_SMOOTH);
        image_label.setIcon(icon);
    }//GEN-LAST:event_attach_buttonActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new new_customer_interface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address_label;
    private javax.swing.JTextField address_text;
    private javax.swing.JButton attach_button;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField email_text;
    private javax.swing.JTextField file_name_text;
    private javax.swing.JButton fill_info_back_;
    private javax.swing.JLabel image_label;
    private javax.swing.JButton info_submit_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField name_text;
    // End of variables declaration//GEN-END:variables
}
