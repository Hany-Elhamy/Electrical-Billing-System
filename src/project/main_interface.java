
package project;


public class main_interface extends javax.swing.JFrame {

 
    public main_interface() {
        initComponents();
         setSize(400, 330);
                 setVisible(true);
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customer_ = new javax.swing.JButton();
        employee_ = new javax.swing.JButton();
        exit_ = new javax.swing.JButton();
        main_menu_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("electricity company");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        customer_.setBackground(new java.awt.Color(204, 204, 204));
        customer_.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        customer_.setForeground(new java.awt.Color(102, 0, 0));
        customer_.setText("customer");
        customer_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_ActionPerformed(evt);
            }
        });
        getContentPane().add(customer_);
        customer_.setBounds(135, 76, 113, 31);

        employee_.setBackground(new java.awt.Color(204, 204, 204));
        employee_.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        employee_.setForeground(new java.awt.Color(102, 0, 0));
        employee_.setText("employee");
        employee_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employee_ActionPerformed(evt);
            }
        });
        getContentPane().add(employee_);
        employee_.setBounds(133, 163, 115, 31);

        exit_.setBackground(new java.awt.Color(204, 204, 204));
        exit_.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        exit_.setForeground(new java.awt.Color(102, 0, 0));
        exit_.setText("exit ");
        exit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_ActionPerformed(evt);
            }
        });
        getContentPane().add(exit_);
        exit_.setBounds(286, 227, 83, 31);

        main_menu_label.setBackground(new java.awt.Color(204, 204, 204));
        main_menu_label.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        main_menu_label.setForeground(new java.awt.Color(204, 204, 204));
        main_menu_label.setText("  main menu");
        getContentPane().add(main_menu_label);
        main_menu_label.setBounds(139, 13, 109, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\importan papers\\pl2\\project\\incandescent-bulbs-photo.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 390, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customer_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_ActionPerformed
       customer_interface c=new customer_interface();
       c.show();
       this.dispose();
       
    }//GEN-LAST:event_customer_ActionPerformed

    private void employee_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employee_ActionPerformed
     login e=new login ();
        e.show();
       this.dispose();
    }//GEN-LAST:event_employee_ActionPerformed

    private void exit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new main_interface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customer_;
    private javax.swing.JButton employee_;
    private javax.swing.JButton exit_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel main_menu_label;
    // End of variables declaration//GEN-END:variables
}
