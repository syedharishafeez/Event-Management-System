/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A.R COM
 */
import AppPackage.AnimationClass;
import javax.swing.ImageIcon;

public class dgaming extends javax.swing.JFrame {

    public AnimationClass ac=new AnimationClass();
    
    /**
     * Creates new form dgaming
     */
    public dgaming() {
        initComponents();
        slidegaming();
    }

    public void slidegaming(){
        new Thread(){
            int count;
    
        public void run(){
            try{
                while(true){
                    switch(count){
                        case 0:{
                            ImageIcon I1=new ImageIcon(getClass().getResource("/gamingimages/2.jpg"));
                            jLabel1.setIcon(I1);
                            Thread.sleep(1800);
                            /*ac.jLabelXLeft(0,-1030, 10, 5, jLabel1);
                            ac.jLabelXLeft(1030,0, 10, 5, jLabel2);
                            */
                            count=1;
                            break;
                        }
                        
                        case 1:{
                            ImageIcon I2=new ImageIcon(getClass().getResource("/gamingimages/4.jpg"));
                            jLabel1.setIcon(I2);
                            
                            Thread.sleep(1800);
                            /*ac.jLabelXRight(-1030,0, 10, 5, jLabel1);
                            ac.jLabelXRight(0,1030, 10, 5, jLabel2);
                            */
                            count=2;
                            break;
                        }
                        case 2:{
                            ImageIcon I3=new ImageIcon(getClass().getResource("/gamingimages/3.jpeg"));
                            jLabel1.setIcon(I3);
                            Thread.sleep(1800);
                            /*ac.jLabelXLeft(0,-1030, 10, 5, jLabel1);
                            ac.jLabelXLeft(1030,0, 10, 5, jLabel2);
                            */
                            count=3;
                            break;
                        }
                        
                        case 3:{
                            ImageIcon I4=new ImageIcon(getClass().getResource("/gamingimages/5.jpg"));
                            jLabel1.setIcon(I4);
                            
                            Thread.sleep(1800);
                            /*ac.jLabelXRight(-1030,0, 10, 5, jLabel1);
                            ac.jLabelXRight(0,1030, 10, 5, jLabel2);
                            */
                            count=4;
                            break;
                        }case 4:{
                            ImageIcon I5=new ImageIcon(getClass().getResource("/gamingimages/6.jpg"));
                            jLabel1.setIcon(I5);
                            Thread.sleep(1800);
                            /*ac.jLabelXLeft(0,-1030, 10, 5, jLabel1);
                            ac.jLabelXLeft(1030,0, 10, 5, jLabel2);
                            */
                            count=5;
                            break;
                        }
                        
                        case 5:{
                            ImageIcon I6=new ImageIcon(getClass().getResource("/gamingimages/8.jpg"));
                            jLabel1.setIcon(I6);
                            
                            Thread.sleep(1800);
                            /*ac.jLabelXRight(-1030,0, 10, 5, jLabel1);
                            ac.jLabelXRight(0,1030, 10, 5, jLabel2);
                            */
                            count=6;
                            break;
                        }case 6:{
                            ImageIcon I7=new ImageIcon(getClass().getResource("/gamingimages/9.jpg"));
                            jLabel1.setIcon(I7);
                            Thread.sleep(1800);
                            /*ac.jLabelXLeft(0,-1030, 10, 5, jLabel1);
                            ac.jLabelXLeft(1030,0, 10, 5, jLabel2);
                            */
                            count=7;
                            break;
                        }
                        
                        case 7:{
                            ImageIcon I8=new ImageIcon(getClass().getResource("/gamingimages/10.jpg"));
                            jLabel1.setIcon(I8);
                            
                            Thread.sleep(1800);
                            /*ac.jLabelXRight(-1030,0, 10, 5, jLabel1);
                            ac.jLabelXRight(0,1030, 10, 5, jLabel2);
                            */
                            count=0;
                            break;
                        }
                    }
                }
            }
            catch(Exception e){
                
            }
        }
    }.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1030, 690));
        getContentPane().setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 0));
        jLabel10.setText("GAMING");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(350, 10, 320, 130);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("CRICKET 2011");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 590, 220, 50);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("FIFA 17");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(280, 590, 150, 50);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("COUNTER STRIKE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(440, 590, 270, 50);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setText("NEED FOR SPEED");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(720, 590, 270, 50);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(10, 10, 110, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamingimages/3.jpeg"))); // NOI18N
        jLabel2.setText("jLabel1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1030, 0, 1030, 690);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamingimages/2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1030, 690);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamingimages/4.jpg"))); // NOI18N
        jLabel3.setText("jLabel1");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(2060, 0, 1030, 690);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamingimages/5.jpg"))); // NOI18N
        jLabel4.setText("jLabel1");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(3090, 0, 1030, 690);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamingimages/6.jpg"))); // NOI18N
        jLabel5.setText("jLabel1");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(4120, 0, 1030, 690);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamingimages/7.jpg"))); // NOI18N
        jLabel6.setText("jLabel1");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(5150, 0, 1030, 690);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamingimages/8.jpg"))); // NOI18N
        jLabel7.setText("jLabel1");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(6180, 0, 1030, 690);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamingimages/9.jpg"))); // NOI18N
        jLabel8.setText("jLabel1");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(7210, 0, 1030, 690);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gamingimages/10.jpg"))); // NOI18N
        jLabel9.setText("jLabel1");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(8240, 0, 1030, 690);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1030, 690);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cricket cr=new cricket();
        cr.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        fifa f=new fifa();
        f.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cs c=new cs();
        c.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        nfs n=new nfs();
        n.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        event e=new event();
        e.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(dgaming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dgaming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dgaming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dgaming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dgaming().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
