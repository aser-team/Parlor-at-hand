package parlor2;


public class Front_start_page extends javax.swing.JFrame {
    public Front_start_page() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BTN_parlor = new javax.swing.JButton();
        BTN_customer = new javax.swing.JButton();
        BTN_guest = new javax.swing.JButton();
        LBL_parlor = new javax.swing.JLabel();
        LBL_customer = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        BTN_parlor.setBackground(new java.awt.Color(255, 102, 0));
        BTN_parlor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BTN_parlor.setText("Parlor Login");
        BTN_parlor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_parlorActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_parlor);
        BTN_parlor.setBounds(360, 350, 180, 40);

        BTN_customer.setBackground(new java.awt.Color(255, 102, 0));
        BTN_customer.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BTN_customer.setText("Customer login");
        BTN_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_customerActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_customer);
        BTN_customer.setBounds(90, 350, 170, 40);

        BTN_guest.setBackground(new java.awt.Color(255, 102, 0));
        BTN_guest.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BTN_guest.setText("Guest");
        BTN_guest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_guestActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_guest);
        BTN_guest.setBounds(220, 280, 190, 40);

        LBL_parlor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LBL_parlor.setForeground(new java.awt.Color(255, 255, 255));
        LBL_parlor.setText("Create your parlor");
        LBL_parlor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBL_parlorMouseClicked(evt);
            }
        });
        jPanel1.add(LBL_parlor);
        LBL_parlor.setBounds(400, 400, 150, 17);

        LBL_customer.setBackground(new java.awt.Color(255, 255, 255));
        LBL_customer.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LBL_customer.setForeground(new java.awt.Color(255, 255, 255));
        LBL_customer.setText("Be a customer");
        LBL_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBL_customerMouseClicked(evt);
            }
        });
        jPanel1.add(LBL_customer);
        LBL_customer.setBounds(120, 400, 130, 17);

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\cse\\javacode\\Parlour2\\front.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 630, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_customerActionPerformed
        // TODO add your handling code here:
              //new Login_page("cid").setVisible(true);
              dispose();
    }//GEN-LAST:event_BTN_customerActionPerformed

    private void BTN_guestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_guestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_guestActionPerformed

    private void BTN_parlorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_parlorActionPerformed
        //new Login_page("pid").setVisible(true);
        dispose();
    }//GEN-LAST:event_BTN_parlorActionPerformed

    private void LBL_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBL_customerMouseClicked
        // TODO add your handling code here:
         //new CustomerRegistration_frame().setVisible(true);
         dispose();
    }//GEN-LAST:event_LBL_customerMouseClicked

    private void LBL_parlorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBL_parlorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LBL_parlorMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Front_start_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Front_start_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Front_start_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Front_start_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Front_start_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_customer;
    private javax.swing.JButton BTN_guest;
    private javax.swing.JButton BTN_parlor;
    private javax.swing.JLabel LBL_customer;
    private javax.swing.JLabel LBL_parlor;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
