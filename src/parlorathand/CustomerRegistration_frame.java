package parlorathand;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aspire
 */
public class CustomerRegistration_frame extends javax.swing.JFrame {
    public CustomerRegistration_frame() {
        initComponents();
        this.setSize(650,550);
        
    }
 Db_Connection DB=new Db_Connection();
 int Globalcid;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rd1 = new javax.swing.JRadioButton();
        rd2 = new javax.swing.JRadioButton();
        rd3 = new javax.swing.JRadioButton();
        t1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Customer Account");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(247, 11, 166, 22);

        rd1.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup1.add(rd1);
        rd1.setText("Women");
        jPanel1.add(rd1);
        rd1.setBounds(173, 149, 114, 13);

        rd2.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup1.add(rd2);
        rd2.setText("Men");
        jPanel1.add(rd2);
        rd2.setBounds(305, 149, 72, 13);

        rd3.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroup1.add(rd3);
        rd3.setText("Other");
        jPanel1.add(rd3);
        rd3.setBounds(427, 149, 72, 13);
        jPanel1.add(t1);
        t1.setBounds(173, 114, 359, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Name                       :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(49, 114, 106, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Gender                    :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(49, 145, 106, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Contact No.            :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(49, 176, 106, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("Email ID                  :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(49, 207, 106, 20);
        jPanel1.add(t2);
        t2.setBounds(173, 176, 361, 20);
        jPanel1.add(t3);
        t3.setBounds(173, 207, 361, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setText("Account Information");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(269, 257, 117, 20);
        jPanel1.add(t4);
        t4.setBounds(173, 305, 361, 20);
        jPanel1.add(t5);
        t5.setBounds(173, 343, 361, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 0));
        jLabel13.setText("*Username           :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(49, 305, 106, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 0));
        jLabel14.setText("*Password            :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(49, 343, 106, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Customer Information");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(247, 65, 156, 17);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(278, 393, 85, 37);

        jSeparator1.setForeground(new java.awt.Color(51, 51, 0));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(207, 39, 248, 15);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parlorathand/reg.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 620, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
           // Class.forName("com.mysql.jdbc.Driver");
           // Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/parlour","root","");
           Connection conn =DB.get_DBconnection();
           String sql ="insert into customer(cname,cgender,ccontact,cemail,cusername,cpassword)values(?,?,?,?,?,?)";
            PreparedStatement ps =conn.prepareStatement(sql);

            ps.setString(1,t1.getText());
            String gender = null;
            if (rd1.isSelected()){
                gender =rd1.getText();
            }
            if (rd2.isSelected()){
                gender =rd2.getText();
            }
            if (rd3.isSelected()){
                gender =rd3.getText();
            }
            ps.setString(2,gender );
            ps.setInt(3,Integer.parseInt(t2.getText())); ps.setString(3,t2.getText());
            
            ps.setString(4,t3.getText() );
            ps.setString(5, t4.getText());
            ps.setString(6,new String(t5.getPassword()));

       
      
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Insertion successful");
          
            int Globalcid2=GetCid();
            dispose();
            conn.close();
            new CustomerProfile(Globalcid2).setVisible(true);
        }catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
public int GetCid()
    {
        try {
            Connection conn =DB.get_DBconnection();
            String query="SELECT * FROM customer ORDER BY cid DESC LIMIT 1";
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
            Globalcid=rs.getInt("cid");
            return Globalcid;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRegistration_frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
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
            java.util.logging.Logger.getLogger(CustomerRegistration_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistration_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistration_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistration_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerRegistration_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rd1;
    private javax.swing.JRadioButton rd2;
    private javax.swing.JRadioButton rd3;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JPasswordField t5;
    // End of variables declaration//GEN-END:variables

 
}
