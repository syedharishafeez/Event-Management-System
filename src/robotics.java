
import javax.swing.ImageIcon;

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


    
public class robotics extends javax.swing.JFrame {

        public AnimationClass ac=new AnimationClass();
        String s1;
        String s3="robotics";
    

    /**
     * Creates new form robotics
     */
    public robotics() {
        initComponents();
        sliderobotics();
    }

    public void sliderobotics(){
        new Thread(){
            int count;
    
        public void run(){
            try{
                while(true){
                    switch(count){
                       case 0:{
                            ImageIcon I1=new ImageIcon(getClass().getResource("/robotimages/1.jpg"));
                            jLabel1.setIcon(I1);
                            Thread.sleep(1800);
                            //ac.jLabelXLeft(0,-1030, 10, 5, jLabel1);
                            //ac.jLabelXLeft(1030,0, 10, 5, jLabel2);
                            
                            count=1;
                            break;
                        }
                        
                        case 1:{
                            ImageIcon I2=new ImageIcon(getClass().getResource("/robotimages/2.jpg"));
                            jLabel1.setIcon(I2);
                            
                            Thread.sleep(1800);
                            //ac.jLabelXRight(-1030,0, 10, 5, jLabel1);
                            //ac.jLabelXRight(0,1030, 10, 5, jLabel2);
                            
                            count=2;
                            break;
                        }
                        case 2:{
                            ImageIcon I3=new ImageIcon(getClass().getResource("/robotimages/3.jpg"));
                            jLabel1.setIcon(I3);
                            Thread.sleep(1800);
                            //ac.jLabelXLeft(0,-1030, 10, 5, jLabel1);
                            //ac.jLabelXLeft(1030,0, 10, 5, jLabel2);
                            
                            count=3;
                            break;
                        }
                        
                        case 3:{
                            ImageIcon I4=new ImageIcon(getClass().getResource("/robotimages/4.jpg"));
                            jLabel1.setIcon(I4);
                            
                            Thread.sleep(1800);
                            //ac.jLabelXRight(-1030,0, 10, 5, jLabel1);
                            //ac.jLabelXRight(0,1030, 10, 5, jLabel2);
                            
                            count=4;
                            break;
                        }case 4:{
                            ImageIcon I5=new ImageIcon(getClass().getResource("/robotimages/5.jpg"));
                            jLabel1.setIcon(I5);
                            Thread.sleep(1800);
                            //ac.jLabelXLeft(0,-1030, 10, 5, jLabel1);
                            //ac.jLabelXLeft(1030,0, 10, 5, jLabel2);
                            
                            count=5;
                            break;
                        }
                        
                        case 5:{
                            ImageIcon I6=new ImageIcon(getClass().getResource("/robotimages/6.jpg"));
                            jLabel1.setIcon(I6);
                            
                            Thread.sleep(1800);
                            //ac.jLabelXRight(-1030,0, 10, 5, jLabel1);
                            //ac.jLabelXRight(0,1030, 10, 5, jLabel2);
                            
                            count=6;
                            break;
                        }case 6:{
                            ImageIcon I7=new ImageIcon(getClass().getResource("/robotimages/7.jpg"));
                            jLabel1.setIcon(I7);
                            Thread.sleep(1800);
                            //ac.jLabelXLeft(0,-1030, 10, 5, jLabel1);
                            //ac.jLabelXLeft(1030,0, 10, 5, jLabel2);
                            
                            count=7;
                            break;
                        }
                        
                        case 7:{
                            ImageIcon I8=new ImageIcon(getClass().getResource("/robotimages/8.jpg"));
                            jLabel1.setIcon(I8);
                            
                            Thread.sleep(1800);
                            //ac.jLabelXRight(-1030,0, 10, 5, jLabel1);
                            //ac.jLabelXRight(0,1030, 10, 5, jLabel2);
                            
                            count=8;
                            break;
                        
                        }
                        case 8:{
                            ImageIcon I9=new ImageIcon(getClass().getResource("/robotimages/9.jpg"));
                            jLabel1.setIcon(I9);
                            Thread.sleep(1800);
                            //ac.jLabelXLeft(0,-1030, 10, 5, jLabel1);
                            //ac.jLabelXLeft(1030,0, 10, 5, jLabel2);
                            
                            count=9;
                            break;
                        }
                        
                        case 9:{
                            ImageIcon I10=new ImageIcon(getClass().getResource("/robotimages/10.jpg"));
                            jLabel1.setIcon(I10);
                            
                            Thread.sleep(1800);
                            //ac.jLabelXRight(-1030,0, 10, 5, jLabel1);
                            //ac.jLabelXRight(0,1030, 10, 5, jLabel2);
                            
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
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1030, 690));
        setPreferredSize(new java.awt.Dimension(1030, 690));
        getContentPane().setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 0));
        jLabel10.setText("ROBOTICS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(320, 10, 390, 130);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 540, 120, 50);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("PARTICIPANTS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(380, 230, 230, 50);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setText("SPONSORS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(380, 450, 230, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/robotimages/1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1030, 690);

        jLabel2.setText("jLabel1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1030, 0, 1030, 690);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1030, 690);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        event e=new event();
        e.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        newparticipant1 np=new newparticipant1(s3);
        np.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        sponsor s=new sponsor(s3);
        s.setVisible(true);
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
            java.util.logging.Logger.getLogger(robotics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(robotics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(robotics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(robotics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new robotics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
