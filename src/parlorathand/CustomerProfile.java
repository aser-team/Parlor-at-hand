package parlorathand;


import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
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
public class CustomerProfile extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
     String filename =null;
     private int cid;
     byte[] img =null;
    public CustomerProfile(int cid) {
        initComponents();
        this.cid=cid;
        Show_Information(cid);
        this.setSize(650,550);
    }
    
     Db_Connection DB=new Db_Connection();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        lbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(null);

        lbl.setOpaque(true);
        jPanel1.add(lbl);
        lbl.setBounds(10, 56, 168, 165);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jButton1.setText("Choose Image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(263, 232, 113, 41);

        jButton2.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jButton2.setText("Manage Bookings");
        jPanel1.add(jButton2);
        jButton2.setBounds(33, 312, 257, 76);

        jButton4.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jButton4.setText("Account Setting");
        jPanel1.add(jButton4);
        jButton4.setBounds(338, 312, 241, 76);

        jButton5.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jButton5.setText("Service & Payment History");
        jPanel1.add(jButton5);
        jButton5.setBounds(196, 406, 241, 76);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(399, 20, 0, 0);

        lbl_name.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lbl_name.setText("Customer Name");
        jPanel1.add(lbl_name);
        lbl_name.setBounds(263, 0, 130, 37);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parlorathand/prf.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 620, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public void Show_Information(int pid)
    { 
      Connection conn =DB.get_DBconnection();
      String query="SELECT cname FROM customer WHERE cid="+cid+"";
      Statement st;
      ResultSet rs;
     try 
        {
            st=conn.createStatement();
            rs=st.executeQuery(query);
            
            while(rs.next())
            {
              lbl_name.setText(rs.getString("cname"));
          
            } 
        } 
        catch (SQLException ex) {
            Logger.getLogger(CustomerProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        JFileChooser chooser =new JFileChooser();
        chooser.showOpenDialog(null);
        File f =chooser.getSelectedFile();
        filename= f.getAbsolutePath();
        ImageIcon imageIcon =new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH));
        lbl.setIcon(imageIcon);
                
        
        
        try{
            
            File image = new File(filename);
        FileInputStream fis =new FileInputStream(image);
        ByteArrayOutputStream bos =new  ByteArrayOutputStream();
      byte[] buf = new byte[1024];
      for (int r; (r=fis.read(buf))!=-1;){
          bos.write(buf,0,r);
      }
       img =bos.toByteArray();
         
         }catch(Exception e){
       
       JOptionPane.showMessageDialog(null, e);
   }
               
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new NewJFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl_name;
    // End of variables declaration//GEN-END:variables
}
