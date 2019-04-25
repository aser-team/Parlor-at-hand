/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parlour.at.hand.main;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import parlour.at.hand.dao.FactoryDao;
import parlour.at.hand.model.QueryModel;

import parlour.at.hand.model.parlor;
import parlour.at.hand.util.StaticVariables;

/**
 *
 * @author Shakiba
 */
public class FindParlorJFrame extends javax.swing.JFrame {
      String location,gender,parlor_name,service_at;

  FactoryDao fdao;
    public FindParlorJFrame() {
        initComponents();
        
        locationComboBox.addItem("Dhanmondi");
        locationComboBox.addItem("Mirpur");
        locationComboBox.addItem("Mohammadpur"); 
        genderComboBox.addItem("Female");
        genderComboBox.addItem("Male");  
         genderComboBox.addItem("Both");  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        locationComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        parlorNameTextField1 = new javax.swing.JTextField();
        serviceAtTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 510));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Find Parlours Here!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 40, 210, 28);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("*Choose Location");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 80, 110, 15);

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 360, 100, 40);

        locationComboBox.setBackground(new java.awt.Color(255, 102, 0));
        getContentPane().add(locationComboBox);
        locationComboBox.setBounds(190, 110, 244, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Parlor For:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 200, 90, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Filter Your Search");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 150, 130, 17);

        genderComboBox.setBackground(new java.awt.Color(255, 102, 0));
        getContentPane().add(genderComboBox);
        genderComboBox.setBounds(310, 190, 109, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Parlor Name:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 250, 90, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Service At:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 300, 80, 17);

        parlorNameTextField1.setBackground(new java.awt.Color(255, 102, 0));
        getContentPane().add(parlorNameTextField1);
        parlorNameTextField1.setBounds(310, 240, 111, 30);

        serviceAtTextField.setBackground(new java.awt.Color(255, 102, 0));
        getContentPane().add(serviceAtTextField);
        serviceAtTextField.setBounds(310, 290, 111, 30);

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setText("Back");
        getContentPane().add(jButton2);
        jButton2.setBounds(50, 40, 80, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parlour/at/hand/main/parlorfind.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 640, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         location= locationComboBox.getItemAt(locationComboBox.getSelectedIndex());
         gender= genderComboBox.getItemAt(genderComboBox.getSelectedIndex());
         parlor_name=parlorNameTextField1.getText();
         service_at=serviceAtTextField.getText();
         QueryModel qModel=new QueryModel(parlor_name,location,service_at,gender);
         fdao=new FactoryDao();        
       List resultlist= fdao.getParlorData(prePareQueryStatement(qModel)); 
       dispose();
      new SearchParlorListJFrame(resultlist).setVisible(true);
      System.out.println( prePareQueryStatement(qModel) );
    }//GEN-LAST:event_jButton1ActionPerformed

    public String prePareQueryStatement(QueryModel model)
    {
        List<String> list=new ArrayList<>();
        if(!model.getName().isEmpty())
        {
            list.add(" pname = '"+model.getName()+"'");
        }
        if(!model.getLocation().isEmpty())
        {
            list.add(" pservicel = '"+model.getLocation()+"'");
        }
          if(!model.getService().isEmpty())
        {
            list.add(" pservicet = '"+model.getService()+"'");
        }
          if(!model.getGender().isEmpty())
        {
            list.add(" pfor = '"+model.getGender()+"'");
        }
         String preparedSubQuery="FROM parlor WHERE (";
          for(int i=0;i<list.size();i++)
          {
              preparedSubQuery=preparedSubQuery+list.get(i);
              if(i==list.size()-1)
                  continue;
              preparedSubQuery=preparedSubQuery+" AND ";
          }
          return preparedSubQuery+")";
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
            java.util.logging.Logger.getLogger(FindParlorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindParlorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindParlorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindParlorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindParlorJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> locationComboBox;
    private javax.swing.JTextField parlorNameTextField1;
    private javax.swing.JTextField serviceAtTextField;
    // End of variables declaration//GEN-END:variables
}
