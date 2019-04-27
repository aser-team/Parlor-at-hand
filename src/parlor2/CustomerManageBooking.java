package parlor2;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class CustomerManageBooking extends javax.swing.JFrame {

    /**
     * Creates new form CustomerManageBooking
     */
    private int pid;
    public CustomerManageBooking(int pid) {
        initComponents();
        this.pid=pid;
        Show_Bookings_In_JTable();
    }
    
    public int getPID()
    {
        return this.pid;
    }

     DBManagement DBConnection=new DBManagement();
        ArrayList<ParlorManageBooking> bookList1=new ArrayList<ParlorManageBooking>();
        
        public ArrayList<ParlorManageBooking> getBookingList1()
        {
        Connection con=DBConnection.getConnection();
          String query="SELECT bid,cname,sname,sprice,date_and_time,book_status FROM customer,service,booking WHERE customer.cid=booking.cid and booking.sid=service.sid and booking.BStatus='true' and booking.pid="+getPID()+"";
        Statement st;
        ResultSet rs;
        
        try 
        {
            st=con.createStatement();
            rs=st.executeQuery(query);
            ParlorManageBooking bookings;
            
            while(rs.next())
            {
               bookings=new ParlorManageBooking(rs.getString("cname"),rs.getString("sname"),rs.getString("sprice"),rs.getString("date_and_time"),rs.getString("book_status"));
               bookList1.add(bookings);
            }
        } 
        catch (SQLException ex) {
          
        }
        
        return bookList1;
        }
        
        public void Show_Bookings_In_JTable()
        {
        ArrayList<ParlorManageBooking> list=getBookingList1();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        
        Object[] row=new Object[5];
        for (int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getCname();
            row[1]=list.get(i).getServiceName();
            row[2]=list.get(i).getPrice();
            row[3]=list.get(i).getDateandTime();
            row[4]=list.get(i).getBookStatus();
            
            model.addRow(row);
        }
        }
        
        
            public void ShowItem(int index){
        jTextField2.setText(getBookingList1().get(index).getCname());
         jTextField3.setText(getBookingList1().get(index).getServiceName());
           jTextField4.setText(getBookingList1().get(index). getDateandTime());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Your Bookings");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(227, 31, 184, 17);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer", "Service", "Price", "Date and time", "Book status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(42, 114, 547, 220);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(151, 74, 249, 20);

        jButton1.setText("Search");
        jPanel1.add(jButton1);
        jButton1.setBounds(418, 73, 65, 23);

        jButton2.setText("Accept");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(400, 400, 74, 33);

        jButton3.setText("Reject");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(500, 400, 73, 33);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(190, 360, 166, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(190, 400, 166, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(190, 440, 166, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 360, 140, 20);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Service :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 400, 90, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("date and time: ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 440, 100, 14);

        jButton4.setIcon(new javax.swing.ImageIcon("E:\\cse\\javacode\\Parlour2\\icons8-chevron-right-48.png")); // NOI18N
        jPanel1.add(jButton4);
        jButton4.setBounds(60, 470, 40, 40);

        jTextField5.setEnabled(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(610, 500, 20, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon("E:\\cse\\javacode\\Parlour2\\create_parlor.jpg")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 630, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    public void GETID(int index)
    {
        jTextField5.setText(Integer.toString(getBookingList1().get(index).getBookingId()));
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
              int index=jTable1.getSelectedRow();
        ShowItem(index);
        GETID(index);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        try {
            int SelectedRow=jTable1.getSelectedRow();
            Connection con=DBConnection.getConnection();
                    PreparedStatement ps=con.prepareStatement("UPDATE booking SET book_status=? WHERE bid=?");
                    int bid=Integer.parseInt(jTextField5.getText());
                    ps.setInt(2, bid);
                    String f="Accepted";
                    ps.setString(1,f);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null,"accepted");
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        try {
            int SelectedRow=jTable1.getSelectedRow();
            model.removeRow(SelectedRow);
            Connection con=DBConnection.getConnection();
                    PreparedStatement ps=con.prepareStatement("UPDATE booking SET book_status=? WHERE bid=?");
                    int bid=Integer.parseInt(jTextField5.getText());
                    ps.setInt(2, bid);
                    String f="Rejected";
                    ps.setString(1,f);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null,"rejected");
        } catch (SQLException ex) {
          
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerManageBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerManageBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerManageBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerManageBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerManageBooking(2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
