/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainMenu;


/**
 *
 * @author shanjutha
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        cardNoLbl = new javax.swing.JLabel();
        cardNo = new javax.swing.JPasswordField();
        cvvLbl = new javax.swing.JLabel();
        cvvNo = new javax.swing.JPasswordField();
        confirmBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon("/Users/shanjutha/NetBeansProjects/EarthCafeRestaurant/images/4e2a4a22-67ad-4826-b9a0-8e36eda39090_200x200.png")); // NOI18N
        logo.setToolTipText("");
        logo.setName(""); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -10, 200, 210));

        title.setFont(new java.awt.Font("Digory Doodles", 0, 50)); // NOI18N
        title.setText("Payment");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, 150));

        cardNoLbl.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        cardNoLbl.setText("Card Number:");
        getContentPane().add(cardNoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        cardNo.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        getContentPane().add(cardNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 280, 40));

        cvvLbl.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        cvvLbl.setText("CVV:");
        getContentPane().add(cvvLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, -1));

        cvvNo.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        getContentPane().add(cvvNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 90, 40));

        confirmBtn.setFont(new java.awt.Font("Century Gothic", 1, 50)); // NOI18N
        confirmBtn.setText("CONFIRM");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });
        getContentPane().add(confirmBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 350, 90));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        String CardNo = cardNo.getText();
        String CVV = cvvNo.getText();
        
        if (CardNo.length()==16 && CVV.length()==3){
            this.setVisible(false);
        }
    }//GEN-LAST:event_confirmBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPasswordField cardNo;
    private javax.swing.JLabel cardNoLbl;
    public javax.swing.JButton confirmBtn;
    private javax.swing.JLabel cvvLbl;
    public javax.swing.JPasswordField cvvNo;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}