/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kovacevic.view;

import java.math.BigDecimal;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import kovacevic.controller.Obrada;
import kovacevic.model.AnalizaCijene;
import kovacevic.model.AnalizaRad;
import kovacevic.model.Rad;
import kovacevic.pomocno.HibernateUtil;

/**
 *
 * @author Marko Kovačević
 */
public class FormaAnalizaRad extends Forma<AnalizaRad> {

    private List<AnalizaRad> analizaRada;

    /**
     * Creates new form FormaRad
     */
    public FormaAnalizaRad() {
        initComponents();
        setTitle("Analiza Rada");
        obrada = new Obrada();

        ucitaj();
        ucitajAnalizaCijene();
        ucitajRad();
    }
//
//private void ucitajOpisIzOdabraneNorme(){
//    cmbOznakaNorme.addItemListener(new ItemListener() {
//        @Override
//        public void itemStateChanged(ItemEvent ie) {
//           if (ie.getStateChange() == ItemEvent.SELECTED){
//               AnalizaCijene opis = (AnalizaCijene) cmbOznakaNorme.getSelectedItem();
//               tarOpisStavkeTroskovnika.setText(opis.toString());
//
//               
//           }
//        }
//    });
//}
//    

    @Override
    protected void ucitaj() {
        DefaultListModel<AnalizaRad> m = new DefaultListModel<>();
        lstAnalizaRada.setModel(m);
        analizaRada = HibernateUtil.getSession().createQuery("from AnalizaRad a where a.obrisan=false").list();
        analizaRada.forEach((s) -> {
            m.addElement(s);
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstAnalizaRada = new javax.swing.JList<>();
        lblOpisOperacije = new javax.swing.JLabel();
        lblBrojOperacije = new javax.swing.JLabel();
        lblJedinicniNormativVremena = new javax.swing.JLabel();
        txtOpisOperacije = new javax.swing.JTextField();
        txtBrojOperacije = new javax.swing.JTextField();
        txtJedinicniNormativVremena = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        lblBrupaRadova = new javax.swing.JLabel();
        lblOznakaNorme = new javax.swing.JLabel();
        cmbOznakaNorme = new javax.swing.JComboBox<>();
        cmbGrupaRadova = new javax.swing.JComboBox<>();
        lblCijenaRada = new javax.swing.JLabel();
        txtCijenaVrijeme = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tarOpisNorme = new javax.swing.JTextArea();
        lblBrupaRadova1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(895, 400));
        setPreferredSize(new java.awt.Dimension(885, 292));
        setSize(new java.awt.Dimension(0, 0));

        jScrollPane1.setMinimumSize(new java.awt.Dimension(450, 23));
        jScrollPane1.setName(""); // NOI18N
        jScrollPane1.setPreferredSize(new java.awt.Dimension(450, 130));

        lstAnalizaRada.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstAnalizaRada.setToolTipText("");
        lstAnalizaRada.setDropMode(javax.swing.DropMode.INSERT);
        lstAnalizaRada.setMaximumSize(new java.awt.Dimension(1000, 1000));
        lstAnalizaRada.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstAnalizaRadaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstAnalizaRada);

        lblOpisOperacije.setText("Opis operacije:");

        lblBrojOperacije.setText("Broj operacije:");

        lblJedinicniNormativVremena.setText("Normativ vremena:");
        lblJedinicniNormativVremena.setToolTipText("");

        txtOpisOperacije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOpisOperacijeActionPerformed(evt);
            }
        });

        txtJedinicniNormativVremena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJedinicniNormativVremenaActionPerformed(evt);
            }
        });

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        lblBrupaRadova.setText("Grupa radova:");
        lblBrupaRadova.setToolTipText("");

        lblOznakaNorme.setText("Oznaka norme:");

        cmbOznakaNorme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOznakaNormeActionPerformed(evt);
            }
        });

        cmbGrupaRadova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGrupaRadovaActionPerformed(evt);
            }
        });

        lblCijenaRada.setText("Cijena rada:");
        lblCijenaRada.setToolTipText("");

        txtCijenaVrijeme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCijenaVrijemeActionPerformed(evt);
            }
        });

        jScrollPane2.setToolTipText("");

        tarOpisNorme.setColumns(20);
        tarOpisNorme.setRows(5);
        tarOpisNorme.setWrapStyleWord(true);
        tarOpisNorme.setPreferredSize(new java.awt.Dimension(104, 79));
        jScrollPane2.setViewportView(tarOpisNorme);
        tarOpisNorme.setLineWrap(true);

        lblBrupaRadova1.setText("Opis norme:");
        lblBrupaRadova1.setToolTipText("");

        jLabel1.setText("cijena iz grupe radova * normativ vremena");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOznakaNorme)
                    .addComponent(lblBrupaRadova1)
                    .addComponent(lblBrupaRadova)
                    .addComponent(lblOpisOperacije)
                    .addComponent(lblBrojOperacije)
                    .addComponent(lblJedinicniNormativVremena)
                    .addComponent(lblCijenaRada))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbOznakaNorme, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(cmbGrupaRadova, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBrojOperacije)
                    .addComponent(txtOpisOperacije)
                    .addComponent(txtJedinicniNormativVremena)
                    .addComponent(txtCijenaVrijeme)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPromjeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(btnObrisi)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbOznakaNorme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOznakaNorme))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBrupaRadova1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBrupaRadova)
                            .addComponent(cmbGrupaRadova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBrojOperacije, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBrojOperacije))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOpisOperacije, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOpisOperacije))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJedinicniNormativVremena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblJedinicniNormativVremena))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCijenaVrijeme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCijenaRada)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        entitet = new AnalizaRad();
        spremi();
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        if (lstAnalizaRada.getSelectedValue() == null) {
            JOptionPane.showConfirmDialog(rootPane, "Prvo odaberite stavku");
        }
        spremi();

    }//GEN-LAST:event_btnPromjeniActionPerformed
    @Override
    protected void spremi() {
        entitet.setOpis_operacije(txtOpisOperacije.getText());
        entitet.setBroj_operacije(Integer.parseInt(txtBrojOperacije.getText()));
        entitet.setJedinicni_normativ_vremena(new BigDecimal(txtJedinicniNormativVremena.getText()));
        entitet.setCijena_vrijeme(new BigDecimal(txtCijenaVrijeme.getText()));
        entitet.setAnaliza_cijene((AnalizaCijene) cmbOznakaNorme.getSelectedItem());
        entitet.setRad((Rad) cmbGrupaRadova.getSelectedItem());
        super.spremi();
        repaint();
    }

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        if (lstAnalizaRada.getSelectedValue() == null) {
            JOptionPane.showConfirmDialog(rootPane, "Prvo odaberite stavku");
        }
        obrisi();
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void txtOpisOperacijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOpisOperacijeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOpisOperacijeActionPerformed

    private void txtJedinicniNormativVremenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJedinicniNormativVremenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJedinicniNormativVremenaActionPerformed

    private void txtCijenaVrijemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCijenaVrijemeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCijenaVrijemeActionPerformed

    private void lstAnalizaRadaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstAnalizaRadaValueChanged

        if (evt.getValueIsAdjusting()) {
            return;
        }

        try {
            this.entitet = lstAnalizaRada.getSelectedValue();
            txtOpisOperacije.setText(lstAnalizaRada.getSelectedValue().getOpis_operacije());
            txtBrojOperacije.setText(String.valueOf(lstAnalizaRada.getSelectedValue().getBroj_operacije()));
            txtJedinicniNormativVremena.setText(lstAnalizaRada.getSelectedValue().getJedinicni_normativ_vremena().toString());
            txtCijenaVrijeme.setText(lstAnalizaRada.getSelectedValue().getCijena_vrijeme().toString());
            cmbOznakaNorme.setSelectedItem(entitet.getAnaliza_cijene());
            cmbGrupaRadova.setSelectedItem(entitet.getRad());
            tarOpisNorme.setText(entitet.getAnaliza_cijene().getOpis());

        } catch (Exception e) {
        }
        repaint();
    }//GEN-LAST:event_lstAnalizaRadaValueChanged

    private void cmbOznakaNormeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOznakaNormeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOznakaNormeActionPerformed

    private void cmbGrupaRadovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGrupaRadovaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGrupaRadovaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JComboBox<Rad> cmbGrupaRadova;
    private javax.swing.JComboBox<AnalizaCijene> cmbOznakaNorme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBrojOperacije;
    private javax.swing.JLabel lblBrupaRadova;
    private javax.swing.JLabel lblBrupaRadova1;
    private javax.swing.JLabel lblCijenaRada;
    private javax.swing.JLabel lblJedinicniNormativVremena;
    private javax.swing.JLabel lblOpisOperacije;
    private javax.swing.JLabel lblOznakaNorme;
    private javax.swing.JList<AnalizaRad> lstAnalizaRada;
    private javax.swing.JTextArea tarOpisNorme;
    private javax.swing.JTextField txtBrojOperacije;
    private javax.swing.JTextField txtCijenaVrijeme;
    private javax.swing.JTextField txtJedinicniNormativVremena;
    private javax.swing.JTextField txtOpisOperacije;
    // End of variables declaration//GEN-END:variables

    private void ucitajAnalizaCijene() {
        DefaultComboBoxModel<AnalizaCijene> m = new DefaultComboBoxModel<>();
        cmbOznakaNorme.setModel(m);
        List<AnalizaCijene> oznakaNorme = HibernateUtil.getSession().
                createQuery("from AnalizaCijene a where "
                        + "a.obrisan=false  ").list();

        for (AnalizaCijene p : oznakaNorme) {

            m.addElement(p);
            cmbOznakaNorme.setSelectedItem(p);

        }

    }

    private void ucitajRad() {
        DefaultComboBoxModel<Rad> m = new DefaultComboBoxModel<>();
        cmbGrupaRadova.setModel(m);
        List<Rad> rad = HibernateUtil.getSession().createQuery("from Rad a where " + "a.obrisan=false  ").list();

        for (Rad p : rad) {

            m.addElement(p);
            cmbGrupaRadova.setSelectedItem(p);

        }

    }

}
