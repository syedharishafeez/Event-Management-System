/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A.R COM
 */
public class adminresult extends javax.swing.JFrame {

    String s1="SYED HARIS BIN HAFEEZ";
    String s2="RIYAM SARFARAZ";
    String s3="SYED MUHAMMAD UMER";
    String p1="52";
    String p2="68";
    String p3="71";
    String r1,r2,r3;
    /**
     * Creates new form adminresult
     */
    public adminresult() {
        initComponents();
    }

    public adminresult(String a) {
        initComponents();
        r2=a;
    }
    public adminresult(String a,String c) {
        initComponents();
        r3=a;
        r2=c;
    }
    public adminresult(String a, String b,String c) {
        initComponents();
        r1=b;
        r3=a;
        r2=c;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(570, 319));
        setPreferredSize(new java.awt.Dimension(570, 350));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter name and password in order to make sure that you have ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 48, 570, 26);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("the right to make changes in record");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 80, 570, 14);

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(26, 139, 72, 28);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(146, 139, 373, 28);

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(26, 212, 72, 28);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(146, 212, 373, 28);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(114, 258, 108, 34);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(342, 258, 108, 34);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 570, 320);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String t=jTextField1.getText();
        String p=jPasswordField1.getText();

        if((t.equalsIgnoreCase(s1))||(t.equalsIgnoreCase(s2))||(t.equalsIgnoreCase(s3))){

            if(s1.equalsIgnoreCase(t)){
                if(p1.equals(p)){
                    if(r2.equals("i")){
                    insert obj=new insert();
                    obj.setVisible(true);
                    dispose();
                    }
                    if(r2.equals("d")){
                    deleteresult dr=new deleteresult();
                    dr.setVisible(true);
                    dispose();
                    }
                    if(r2.equals("u")){
                    updateresultA obj=new updateresultA();
                    obj.setVisible(true);
                    dispose();
                    }
                }
                else{
                    denay obj1=new denay(r2);
                    obj1.setVisible(true);
                    dispose();
                }}

                if(s2.equalsIgnoreCase(t)){
                    if(p2.equals(p)){
                        if(r2.equals("i")){
                    insert obj=new insert();
                    obj.setVisible(true);
                    dispose();
                    }
                    if(r2.equals("d")){
                    deleteresult dr=new deleteresult();
                    dr.setVisible(true);
                    dispose();
                    }
                    if(r2.equals("u")){
                    insert obj=new insert();
                    obj.setVisible(true);
                    dispose();
                    }
                    }
                    else{
                        denay obj1=new denay(r2);
                        obj1.setVisible(true);
                        dispose();
                    }}

                    if(s3.equalsIgnoreCase(t)){
                        if(p3.equals(p)){
                            if(r2.equals("i")){
                                insert obj=new insert();
                                obj.setVisible(true);
                                dispose();
                            }
                            if(r2.equals("d")){
                                deleteresult dr=new deleteresult();
                                dr.setVisible(true);
                                dispose();
                            }
                            if(r2.equals("u")){
                                insert obj=new insert();
                                obj.setVisible(true);
                                dispose();
                            }
                        }
                        else{
                            denay obj1=new denay(r2);
                            obj1.setVisible(true);
                            dispose();
                        }}
                    }
                    else{
                        denay obj1=new denay(r2);
                        obj1.setVisible(true);
                        dispose();
                    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        result obj=new result();
        obj.setVisible(true);
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
            java.util.logging.Logger.getLogger(adminresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminresult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
