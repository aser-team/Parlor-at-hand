package parlorathand;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Login_page extends javax.swing.JFrame {

    /**
     * Creates new form Login_page
     */
    private String user;
    public Login_page(String user) {
        initComponents();
        this.user=user;
        LBL_try.setVisible(false);
    }
    Db_Connection Database_Connection=new Db_Connection();
       public String getuser()
       {
           return this.user;
       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Field_username = new javax.swing.JTextField();
        LBL_try = new javax.swing.JLabel();
        BTN_login = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Username  :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 280, 78, 17);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Password  :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 330, 78, 26);

        Field_username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Field_username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jPanel1.add(Field_username);
        Field_username.setBounds(240, 270, 219, 31);

        LBL_try.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LBL_try.setForeground(new java.awt.Color(255, 51, 0));
        LBL_try.setText("try again");
        LBL_try.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBL_tryMouseClicked(evt);
            }
        });
        LBL_try.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                LBL_tryComponentResized(evt);
            }
        });
        jPanel1.add(LBL_try);
        LBL_try.setBounds(290, 440, 90, 17);

        BTN_login.setBackground(new java.awt.Color(255, 102, 0));
        BTN_login.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BTN_login.setText("Login");
        BTN_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_loginActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_login);
        BTN_login.setBounds(270, 380, 100, 32);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(240, 330, 220, 30);

        jButton1.setText("back");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(50, 410, 50, 50);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 630, 490);

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

    private void LBL_tryComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_LBL_tryComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_LBL_tryComponentResized

    private void BTN_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_loginActionPerformed
  
        String checkuser=getuser();   
        String query="";
        
        String fusername=Field_username.getText();
        String fpassword=jPasswordField1.getText();
        
        String UsernameCol="";
        String passwordCol="";
        
       if(checkuser.equals("pid"))
            {
            query="SELECT username,password FROM parlor";
            UsernameCol="username";
            passwordCol="password";
            }
        else
            {
            query="SELECT cusername,cpassword FROM customer";
            UsernameCol="cusername";
            passwordCol="cpassword";
            }
        if(Check_Login(UsernameCol,passwordCol,query)==true)
        {
            System.out.println(getCID(UsernameCol,passwordCol,query));
        }
        else
        {
            LBL_try.setVisible(true);
        }
    }//GEN-LAST:event_BTN_loginActionPerformed

       public String getCID(String UsernameCol, String passwordCol, String query)
       {
        Connection con=Database_Connection.get_DBconnection();
        Statement st;
        ResultSet rs;
        try 
        {
            st=con.createStatement();
            rs=st.executeQuery(query);
            while(rs.next())
            {
                if(Field_username.getText().equals(rs.getString(UsernameCol)) && jPasswordField1.getText().equals(rs.getString(passwordCol)))
                {
                    return rs.getString("cname");
                }     
            }
        } 
        catch (SQLException ex) {}
        return "nth";
       }
       
    private void LBL_tryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBL_tryMouseClicked
        new Login_page(getuser()).setVisible(true);
    }//GEN-LAST:event_LBL_tryMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean Check_Login(String UsernameCol, String passwordCol, String query)
    {
      Connection con=Database_Connection.get_DBconnection();
        Statement st;
        ResultSet rs;
        try 
        {
            st=con.createStatement();
            rs=st.executeQuery(query);
            while(rs.next())
            {
                return Field_username.getText().equals(rs.getString(UsernameCol)) && jPasswordField1.getText().equals(rs.getString(passwordCol));
            }
        } 
        catch (SQLException ex) {}
        return false;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_page("pid").setVisible(true);
        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_login;
    private javax.swing.JTextField Field_username;
    private javax.swing.JLabel LBL_try;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
