
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A.R COM
 */
public class deletesponsor extends javax.swing.JFrame {

    String r1,r3;
    String t2;
   /**
     * Creates new form deletesponsor
     */
    public deletesponsor() {
        initComponents();
    }
    public deletesponsor(String s3){
            initComponents();
    
        r3=""+s3;
        t2=r3;
    }
    public deletesponsor(String s1,String s3){
            initComponents();
    
        r1=""+s1;
        r3=""+s3;
        t2=r3;
    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 320));
        setPreferredSize(new java.awt.Dimension(500, 320));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SPONSOR NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(25, 123, 86, 28);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENTER SPONSOR NAME YOU WANT TO DELETE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 510, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{

            String rn=jTextField1.getText();

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/table3","root","");
            Statement stmt=con.createStatement();

            
            
            
            
            
            
            if(jTextField1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter SPONSOR NAME");
                }
                else{
                    
            
            if(t2.equalsIgnoreCase("speedprogramming")){
                String sql="Select * from sspo";
            ResultSet rs=stmt.executeQuery(sql);
            
            int i=0;
            int j=0;
            loop1:
            while (rs.next()){
                i++;
                    if(((""+rs.getString(1)).equalsIgnoreCase(rn))){
                        sql = "DELETE FROM sspo " +
                        "WHERE sname = '"+rn+"'";
                        stmt.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null,"THE SPONSOR NAME = "+rn+" IS DELETE SUCCESSFULLY");
                    }
                    else{
                        j++;
                    }}
                    if(i==j){
                        JOptionPane.showMessageDialog(null,"THE SPONSOR NAME YOU ENTERED ISNOT EXIST IN THIS LIST");

                    }

            }
            
            if(t2.equalsIgnoreCase("robotics")){
                String sql="Select * from rspo";
            ResultSet rs=stmt.executeQuery(sql);
            
            int i=0;
            int j=0;
            loop1:
            while (rs.next()){
                i++;
                    if(((""+rs.getString(1)).equalsIgnoreCase(rn))){
                        sql = "DELETE FROM rspo " +
                        "WHERE sname = '"+rn+"'";
                        stmt.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null,"THE SPONSOR NAME = "+rn+" IS DELETE SUCCESSFULLY");
                    }
                    else{
                        j++;
                    }}
                    if(i==j){
                        JOptionPane.showMessageDialog(null,"THE SPONSOR NAME YOU ENTERED ISNOT EXIST IN THIS LIST");

                    }

            }
            
            if(t2.equalsIgnoreCase("logodesign")){
                String sql="Select * from lspo";
            ResultSet rs=stmt.executeQuery(sql);
            
            int i=0;
            int j=0;
            loop1:
            while (rs.next()){
                i++;
                    if(((""+rs.getString(1)).equalsIgnoreCase(rn))){
                        sql = "DELETE FROM lspo " +
                        "WHERE sname = '"+rn+"'";
                        stmt.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null,"THE SPONSOR NAME = "+rn+" IS DELETE SUCCESSFULLY");
                    }
                    else{
                        j++;
                    }}
                    if(i==j){
                        JOptionPane.showMessageDialog(null,"THE SPONSOR NAME YOU ENTERED ISNOT EXIST IN THIS LIST");

                    }

            }
            
            if(t2.equalsIgnoreCase("cricket")){
                String sql="Select * from cspo";
            ResultSet rs=stmt.executeQuery(sql);
            
            int i=0;
            int j=0;
            loop1:
            while (rs.next()){
                i++;
                    if(((""+rs.getString(1)).equalsIgnoreCase(rn))){
                        sql = "DELETE FROM cspo " +
                        "WHERE sname = '"+rn+"'";
                        stmt.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null,"THE SPONSOR NAME = "+rn+" IS DELETE SUCCESSFULLY");
                    }
                    else{
                        j++;
                    }}
                    if(i==j){
                        JOptionPane.showMessageDialog(null,"THE SPONSOR NAME YOU ENTERED ISNOT EXIST IN THIS LIST");

                    }

            }
            
            if(t2.equalsIgnoreCase("fifa")){
                String sql="Select * from fspo";
            ResultSet rs=stmt.executeQuery(sql);
            
            int i=0;
            int j=0;
            loop1:
            while (rs.next()){
                i++;
                    if(((""+rs.getString(1)).equalsIgnoreCase(rn))){
                        sql = "DELETE FROM fspo " +
                        "WHERE sname = '"+rn+"'";
                        stmt.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null,"THE SPONSOR NAME = "+rn+" IS DELETE SUCCESSFULLY");
                    }
                    else{
                        j++;
                    }}
                    if(i==j){
                        JOptionPane.showMessageDialog(null,"THE SPONSOR NAME YOU ENTERED ISNOT EXIST IN THIS LIST");

                    }

            }
            
            if(t2.equalsIgnoreCase("needforspeed")){
                String sql="Select * from nspo";
            ResultSet rs=stmt.executeQuery(sql);
            
            int i=0;
            int j=0;
            loop1:
            while (rs.next()){
                i++;
                    if(((""+rs.getString(1)).equalsIgnoreCase(rn))){
                        sql = "DELETE FROM nspo " +
                        "WHERE sname = '"+rn+"'";
                        stmt.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null,"THE SPONSOR NAME = "+rn+" IS DELETE SUCCESSFULLY");
                    }
                    else{
                        j++;
                    }}
                    if(i==j){
                        JOptionPane.showMessageDialog(null,"THE SPONSOR NAME YOU ENTERED ISNOT EXIST IN THIS LIST");

                    }

            }
            
            if(t2.equalsIgnoreCase("counterstrike")){
                String sql="Select * from csspo";
            ResultSet rs=stmt.executeQuery(sql);
            
            int i=0;
            int j=0;
            loop1:
            while (rs.next()){
                i++;
                    if(((""+rs.getString(1)).equalsIgnoreCase(rn))){
                        sql = "DELETE FROM csspo " +
                        "WHERE sname = '"+rn+"'";
                        stmt.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null,"THE SPONSOR NAME = "+rn+" IS DELETE SUCCESSFULLY");
                    }
                    else{
                        j++;
                    }}
                    if(i==j){
                        JOptionPane.showMessageDialog(null,"THE SPONSOR NAME YOU ENTERED ISNOT EXIST IN THIS LIST");

                    }

            }
            }
            
            
            
            
            
            
            
                    stmt.close();
                    con.close();

                }
                catch(Exception e){
                    System.out.println(e);
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        sponsor s=new sponsor(r3);
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(deletesponsor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deletesponsor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deletesponsor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deletesponsor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deletesponsor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}