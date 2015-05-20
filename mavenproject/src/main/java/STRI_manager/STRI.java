

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STRI_manager;

/**
 *
 * @author Boubacar
 */
public class STRI extends javax.swing.JFrame {

    /**
     * Creates new form STRI
     */
    public STRI() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        labelAccueil = new javax.swing.JLabel();
        ajoutSalle = new javax.swing.JButton();
        ajoutEq = new javax.swing.JButton();
        affecterEq = new javax.swing.JButton();
        desactiverEq = new javax.swing.JButton();
        majOS = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 190, 73));
        setForeground(new java.awt.Color(0, 0, 0));

        labelAccueil.setForeground(new java.awt.Color(0, 0, 255));
        labelAccueil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.jpg"))); // NOI18N
        labelAccueil.setText("BIENVENUE SUR LE SERVICE DE GESTION D'EQUIPEMENTS STRICOM  ");
        labelAccueil.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 255), java.awt.Color.black));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, labelAccueil, org.jdesktop.beansbinding.ELProperty.create("${font}"), labelAccueil, org.jdesktop.beansbinding.BeanProperty.create("font"));
        bindingGroup.addBinding(binding);

        ajoutSalle.setBackground(new java.awt.Color(255, 255, 255));
        ajoutSalle.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        ajoutSalle.setForeground(new java.awt.Color(0, 63, 197));
        ajoutSalle.setText("Ajouter Une Salle");
        ajoutSalle.setToolTipText("");
        ajoutSalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutSalleActionPerformed(evt);
            }
        });

        ajoutEq.setBackground(new java.awt.Color(255, 255, 255));
        ajoutEq.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        ajoutEq.setForeground(new java.awt.Color(0, 63, 197));
        ajoutEq.setText("Ajouter Un Equipement");
        ajoutEq.setToolTipText("");
        ajoutEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutEqActionPerformed(evt);
            }
        });

        affecterEq.setBackground(new java.awt.Color(255, 255, 255));
        affecterEq.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        affecterEq.setForeground(new java.awt.Color(0, 63, 197));
        affecterEq.setText("Affecter Un Equipement");
        affecterEq.setToolTipText("");

        desactiverEq.setBackground(new java.awt.Color(255, 255, 255));
        desactiverEq.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        desactiverEq.setForeground(new java.awt.Color(0, 63, 197));
        desactiverEq.setText("Désactiver Un Equipement");
        desactiverEq.setToolTipText("");

        majOS.setBackground(new java.awt.Color(255, 255, 255));
        majOS.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        majOS.setForeground(new java.awt.Color(0, 63, 197));
        majOS.setText("Mettre à Jour Un OS");
        majOS.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ajoutSalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desactiverEq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(affecterEq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ajoutEq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(majOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(106, 106, 106))
            .addComponent(labelAccueil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ajoutSalle)
                        .addGap(18, 18, 18)
                        .addComponent(ajoutEq)
                        .addGap(18, 18, 18)
                        .addComponent(affecterEq)
                        .addGap(23, 23, 23)
                        .addComponent(desactiverEq)
                        .addGap(18, 18, 18)
                        .addComponent(majOS)
                        .addContainerGap())))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajoutSalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutSalleActionPerformed
        /* On ouvre Une nouvelle fenêtre avec le clic*/
        ajoutSalle ajoutEq= new ajoutSalle();
        ajoutEq.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ajoutSalleActionPerformed

    private void ajoutEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutEqActionPerformed
        /*Nouvelle fenêtre pour ajout d'un équipement*/
        ajoutEquipement ajoutEq= new ajoutEquipement();
        ajoutEq.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_ajoutEqActionPerformed

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
            java.util.logging.Logger.getLogger(STRI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(STRI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(STRI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(STRI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new STRI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton affecterEq;
    private javax.swing.JButton ajoutEq;
    private javax.swing.JButton ajoutSalle;
    private javax.swing.JButton desactiverEq;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelAccueil;
    private javax.swing.JButton majOS;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
     
}
