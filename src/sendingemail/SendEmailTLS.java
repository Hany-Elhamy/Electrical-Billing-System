/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sendingemail;import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendEmailTLS {

    public static void main(String[] args) {
        {
       String from = "electricitycompany4@gmail.com";
        String password = "electricity123";
        String host = "smtp.gmail.com";
        String to[] = new String[1];
        to[0]="moatazsalah376@gmail.com";
        String message = "hello";
        Properties props = System.getProperties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", password);
        props.put("mail.smtp.port", 587);
        props.put("mail.smtp.auth", "true");
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
 
   
}
    
}

