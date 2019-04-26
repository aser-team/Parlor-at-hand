
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.filechooser.FileNameExtensionFilter;
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
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
     String filename =null;
     private int pid;
     byte[] img =null;
    public NewJFrame(int pid) {
        initComponents();
        this.pid=pid;
        Show_Information(pid);
    
    }
    
    DBConnection DB = new DBConnection();
  String ImgPath=null;
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        lbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pname_label = new javax.swing.JLabel();
        pfor_label = new javax.swing.JLabel();
        plocation_label = new javax.swing.JLabel();
        prating = new javax.swing.JLabel();
        pcontact_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        lbl.setOpaque(true);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jButton1.setText("Choose Image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jButton2.setText("Manage Bookings");

        jButton3.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jButton3.setText("See Reviews");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jButton4.setText("Account Setting");

        jButton5.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jButton5.setText("Service & Payment History");

        jButton6.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jButton6.setText("Service List");

        pname_label.setFont(new java.awt.Font("Open Sans Semibold", 1, 18)); // NOI18N
        pname_label.setText("Parlour Name");

        pfor_label.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pfor_label.setText("Women Parlor");

        plocation_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        plocation_label.setText("location");

        prating.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        prating.setText("Rating");

        pcontact_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pcontact_label.setText("Contact");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 62, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(187, 187, 187))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(47, 47, 47))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(178, 178, 178)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(156, 156, 156)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(prating)
                                            .addComponent(pname_label)
                                            .addComponent(pfor_label)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(159, 159, 159)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pcontact_label)
                                            .addComponent(plocation_label)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButton1)))
                        .addContainerGap(174, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pname_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prating)
                        .addGap(18, 18, 18)
                        .addComponent(pfor_label, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(plocation_label)
                        .addGap(28, 28, 28)
                        .addComponent(pcontact_label)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

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
public ImageIcon ResizeImage(String imagePath,byte[] pic)
    {
        ImageIcon myImage=null;
        if(imagePath!=null)
        {
            myImage=new ImageIcon(imagePath);
        }
        else{
            myImage=new ImageIcon(pic);
        }
        Image img=myImage.getImage();
        Image img2=img.getScaledInstance(lbl.getWidth(),lbl.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image=new ImageIcon(img2);
        return image;
    }   
private void Btn_choose_ImageActionPerformed(java.awt.event.ActionEvent evt) {                                                 

    }                      
    public void Show_Information(int pid)
    { 
      Connection conn =DB.getConnection();
      String query="SELECT pname,pfor,pservicel,pcontact,rating FROM parlor WHERE pid="+pid+"";
      Statement st;
      ResultSet rs;
     try 
        {
            st=conn.createStatement();
            rs=st.executeQuery(query);
            
            while(rs.next())
            {
               pname_label.setText(rs.getString("pname"));
               prating.setText(rs.getString("rating"));
               pfor_label.setText(rs.getString("pfor"));
               plocation_label.setText(rs.getString("pservicel"));
               pcontact_label.setText(rs.getString("pcontact"));
            } 
        } 
        catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JFileChooser file= new JFileChooser();
       file.setCurrentDirectory(new File(System.getProperty("user.home")));
       
       FileNameExtensionFilter filter=new FileNameExtensionFilter("*.images","jpg","png");
       file.addChoosableFileFilter(filter);
       int result=file.showSaveDialog(null);
       if(result == JFileChooser.APPROVE_OPTION)
       {
           File selectedFile=file.getSelectedFile();
           String path=selectedFile.getAbsolutePath();
           lbl.setIcon(ResizeImage(path,null));
           ImgPath=path;
           
//           if(ImgPath!=null)
//             {
//                    try {
//                        Connection con=DB.getConnection();
////                        String query="INSERT INTO parlor(photo)values(?) WHERE pid="+pid+"";
////                        PreparedStatement ps=con.prepareStatement(query);
//
//                        InputStream img=new FileInputStream(new File(ImgPath));
////                        ps.setBlob(1,img);
////                        ps.executeUpdate();
//
//                        JOptionPane.showMessageDialog(null, "image inserted");
//                    } 
////                    catch (SQLException ex) 
//                    {
//                      JOptionPane.showMessageDialog(null, ex.getMessage());
//                    } catch (FileNotFoundException ex) {
//                        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
//                    }  
//              }
//            else
//            {
//                JOptionPane.showMessageDialog(null,"one or more field are empty");
//            }
       }
       else
       {
           System.out.println("No file Selected");
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel pcontact_label;
    private javax.swing.JLabel pfor_label;
    private javax.swing.JLabel plocation_label;
    private javax.swing.JLabel pname_label;
    private javax.swing.JLabel prating;
    // End of variables declaration//GEN-END:variables
}
