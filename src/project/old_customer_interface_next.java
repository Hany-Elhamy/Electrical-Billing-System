
package project;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class old_customer_interface_next extends javax.swing.JFrame {
       static String p,t ;
       static int i=1;
       
   
    public old_customer_interface_next() {
        initComponents();
        setSize(410, 330);
                setVisible(true);
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        complain_ = new javax.swing.JButton();
        old_customer_interface_next_exit_ = new javax.swing.JButton();
        old_customer_interface_next_back_ = new javax.swing.JButton();
        welcome = new javax.swing.JLabel();
        enter_reading_text = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        complain_area_text = new javax.swing.JTextArea();
        submit_reading_ = new javax.swing.JButton();
        enter_payment_text = new javax.swing.JTextField();
        pay_bills_ = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        metercode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        image.setIcon(new javax.swing.ImageIcon("D:\\importan papers\\pl2\\project\\incandescent-bulbs-photo.jpg")); // NOI18N

        jLabel2.setText("jLabel2");

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\importan papers\\pl2\\project\\incandescent-bulbs-photo.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("the electricity company");
        getContentPane().setLayout(null);

        complain_.setBackground(new java.awt.Color(204, 204, 204));
        complain_.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        complain_.setForeground(new java.awt.Color(102, 0, 0));
        complain_.setText("complain");
        complain_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complain_ActionPerformed(evt);
            }
        });
        getContentPane().add(complain_);
        complain_.setBounds(230, 160, 103, 31);

        old_customer_interface_next_exit_.setBackground(new java.awt.Color(204, 204, 204));
        old_customer_interface_next_exit_.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        old_customer_interface_next_exit_.setForeground(new java.awt.Color(102, 0, 0));
        old_customer_interface_next_exit_.setText("exit");
        old_customer_interface_next_exit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                old_customer_interface_next_exit_ActionPerformed(evt);
            }
        });
        getContentPane().add(old_customer_interface_next_exit_);
        old_customer_interface_next_exit_.setBounds(310, 250, 80, 31);

        old_customer_interface_next_back_.setBackground(new java.awt.Color(204, 204, 204));
        old_customer_interface_next_back_.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        old_customer_interface_next_back_.setForeground(new java.awt.Color(102, 0, 0));
        old_customer_interface_next_back_.setText("back");
        old_customer_interface_next_back_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                old_customer_interface_next_back_ActionPerformed(evt);
            }
        });
        getContentPane().add(old_customer_interface_next_back_);
        old_customer_interface_next_back_.setBounds(10, 250, 100, 31);

        welcome.setBackground(new java.awt.Color(204, 204, 204));
        welcome.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        welcome.setForeground(new java.awt.Color(204, 204, 204));
        welcome.setText("    welcome");
        getContentPane().add(welcome);
        welcome.setBounds(140, 10, 112, 22);

        enter_reading_text.setBackground(new java.awt.Color(204, 204, 204));
        enter_reading_text.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        enter_reading_text.setForeground(new java.awt.Color(102, 0, 0));
        enter_reading_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_reading_textActionPerformed(evt);
            }
        });
        getContentPane().add(enter_reading_text);
        enter_reading_text.setBounds(10, 80, 110, 28);

        complain_area_text.setBackground(new java.awt.Color(204, 204, 204));
        complain_area_text.setColumns(20);
        complain_area_text.setForeground(new java.awt.Color(102, 0, 0));
        complain_area_text.setRows(5);
        jScrollPane1.setViewportView(complain_area_text);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 210, 80);

        submit_reading_.setBackground(new java.awt.Color(204, 204, 204));
        submit_reading_.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        submit_reading_.setForeground(new java.awt.Color(102, 0, 0));
        submit_reading_.setText("submit reading");
        submit_reading_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_reading_ActionPerformed(evt);
            }
        });
        getContentPane().add(submit_reading_);
        submit_reading_.setBounds(130, 80, 149, 31);

        enter_payment_text.setBackground(new java.awt.Color(204, 204, 204));
        enter_payment_text.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        enter_payment_text.setForeground(new java.awt.Color(102, 0, 0));
        enter_payment_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_payment_textActionPerformed(evt);
            }
        });
        getContentPane().add(enter_payment_text);
        enter_payment_text.setBounds(10, 120, 110, 28);

        pay_bills_.setBackground(new java.awt.Color(204, 204, 204));
        pay_bills_.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        pay_bills_.setForeground(new java.awt.Color(102, 0, 0));
        pay_bills_.setText("pay bills");
        pay_bills_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_bills_ActionPerformed(evt);
            }
        });
        getContentPane().add(pay_bills_);
        pay_bills_.setBounds(130, 120, 149, 31);

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("enter meter code");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 40, 150, 22);

        metercode.setBackground(new java.awt.Color(204, 204, 204));
        metercode.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        metercode.setForeground(new java.awt.Color(102, 0, 0));
        metercode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metercodeActionPerformed(evt);
            }
        });
        getContentPane().add(metercode);
        metercode.setBounds(180, 40, 100, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\importan papers\\pl2\\project\\incandescent-bulbs-photo.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 400, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void old_customer_interface_next_exit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_old_customer_interface_next_exit_ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_old_customer_interface_next_exit_ActionPerformed

    private void old_customer_interface_next_back_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_old_customer_interface_next_back_ActionPerformed
       
        customer_interface oci=new customer_interface();
       oci.show();
       this.dispose();
    }//GEN-LAST:event_old_customer_interface_next_back_ActionPerformed
objectt nn=new objectt();
    
    private void submit_reading_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_reading_ActionPerformed
         
        boolean check=false;
        
        
      
        
        if((metercode.getText()).isEmpty())
            {
                  enter_reading_text.setText("");
          enter_payment_text.setText("");
          complain_area_text.setText("");
                JOptionPane.showMessageDialog(null,"please enter the meter code" ,"the meter code is not valid", JOptionPane.ERROR_MESSAGE);
                
            }
        else{ 
        try{
             
         
        
        BufferedReader r=nn.file_read(nn.meter_code);
          String s=metercode.getText();
          String struct;
          while((struct=r.readLine())!=null){
              if(struct.equals(s+" |active"))
              {System.out.println("correct");
              
                check=true;       
                 double charge;
         int  read = Integer.parseInt(enter_reading_text.getText());
         if(read<500){
             charge=1.00;
         }
         else if(read<500 && read<600){
             charge=1.80;
         }
         else if(read<600 &&read<800){
             charge=2.80;
         }
         else{
             charge=3.00;
         }
     double payment=charge*read;
    p=Double.toString(payment);
     enter_payment_text.setText(p);
        
              }
             
              
          }
        
        if(!check){
                  check=false;
                    enter_reading_text.setText("");
          enter_payment_text.setText("");
          complain_area_text.setText("");
                   JOptionPane.showMessageDialog(null,"the meter code is not correct or stoped" ," METER CODE invalid", JOptionPane.ERROR_MESSAGE);
              
              }
           
         
          System.out.println(check);
         }
        
         catch (IOException e) 
         {
         
           System.out.println("An error occurred.");
         } 
        }
    
       
           
         
       
           
         
             
      
    }//GEN-LAST:event_submit_reading_ActionPerformed

    private void pay_bills_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_bills_ActionPerformed

         
        boolean check=false;
        try{

          
        BufferedReader r=nn.file_read(nn.meter_code);
    
          String s=metercode.getText();
          String struct;
          while((struct=r.readLine())!=null){
              if(struct.equals(s+" |active"))
              {check=true;
                  System.out.println("correct");
             double charge;
         int  read = Integer.parseInt(enter_reading_text.getText());
         if(read<500){
             charge=1.00;
         }
         else if(read<500 && read<600){
             charge=1.80;
         }
         else if(read<600 &&read<800){
             charge=2.80;
         }
         else{
             charge=3.00;
         }
     double payment=charge*read;
    p =Double.toString(payment);
     enter_payment_text.setText(p);
    Date dd=new Date();
           String m=metercode.getText()+"|"+enter_reading_text.getText()+"|"+p+"|"+dd.toLocaleString()+"\n";
        nn.file_write(nn.payments,m,true);
        
              JOptionPane.showMessageDialog(null,"transaction done successfully" ,"successful", JOptionPane.INFORMATION_MESSAGE);}}
          if(metercode.getText().isEmpty())
              { check=true;
                   JOptionPane.showMessageDialog(null,"please enter meter code" ," METER CODE invalid", JOptionPane.ERROR_MESSAGE);
              }
          else if(!check)
              {
                  
                   JOptionPane.showMessageDialog(null,"the meter code is not correct" ," METER CODE invalid", JOptionPane.ERROR_MESSAGE);
              }
        }
        catch (IOException e) {
      System.out.println("An error occurred.");
        }
        
    }//GEN-LAST:event_pay_bills_ActionPerformed

    private void complain_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complain_ActionPerformed
     
        String x=complain_area_text.getText();
           try{
          boolean check=false;
          BufferedReader bb=nn.file_read(nn.meter_code);
          String k;
          String s=(metercode.getText()).toString();
         if(metercode.getText().isEmpty())
            {check=true;
                JOptionPane.showMessageDialog(null,"please enter the meter code" ,"the meter code is not valid", JOptionPane.ERROR_MESSAGE);
                
            }
          while((k=bb.readLine())!=null)
          {
              if((k.equals( s+" |active")))
              {
                check=true;
                nn.file_write(nn.complaints,metercode.getText()+"|"+x+'\n', true);
              JOptionPane.showMessageDialog(null,"complaint documented" ,"successful", JOptionPane.INFORMATION_MESSAGE);}
               
        }
          if(!check){
                  check=false;
                   JOptionPane.showMessageDialog(null," not complaint documented" ," faild", JOptionPane.ERROR_MESSAGE);
              
              }
           }
        catch (IOException e) {
      System.out.println("An error occurred.");
        }
     
      

      
    }//GEN-LAST:event_complain_ActionPerformed

    private void enter_payment_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter_payment_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enter_payment_textActionPerformed

    private void metercodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metercodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_metercodeActionPerformed

    private void enter_reading_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter_reading_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enter_reading_textActionPerformed

    
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
            java.util.logging.Logger.getLogger(old_customer_interface_next.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(old_customer_interface_next.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(old_customer_interface_next.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(old_customer_interface_next.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new old_customer_interface_next().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton complain_;
    private javax.swing.JTextArea complain_area_text;
    private javax.swing.JTextField enter_payment_text;
    private javax.swing.JTextField enter_reading_text;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField metercode;
    private javax.swing.JButton old_customer_interface_next_back_;
    private javax.swing.JButton old_customer_interface_next_exit_;
    private javax.swing.JButton pay_bills_;
    private javax.swing.JButton submit_reading_;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
