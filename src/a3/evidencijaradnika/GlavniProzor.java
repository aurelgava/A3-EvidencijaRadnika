/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3.evidencijaradnika;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Korisnik
 */
public class GlavniProzor extends javax.swing.JFrame {

    Connection c;

    /**
     * Creates new form GlavniProzor
     */
    public GlavniProzor() {
        initComponents();
        try {
            c = DriverManager.getConnection("jdbc:ucanaccess://src\\resursi\\Evidencija_Radnik_Projekat.accdb");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Greska prilikom pvezivanja s bazom", "Greska", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(GlavniProzor.class.getName()).log(Level.SEVERE, null, ex);
        }
        populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projekti");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resursi/bar-chart.png"))); // NOI18N
        jButton1.setText("Pregled projekata");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setText("Шифра");

        jLabel2.setText("Назив");

        jLabel3.setText("Датум почетка");

        jLabel4.setText("Буџет");

        jLabel6.setText("Опис");

        jCheckBox1.setText("Завршен");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton2.setText("Obrisi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Izadji");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int id = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        String naziv = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 1);
        Date datum = (Date) jTable1.getValueAt(jTable1.getSelectedRow(), 2);
        int sredstva = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 3);
        boolean zavrsen = (boolean) jTable1.getValueAt(jTable1.getSelectedRow(), 4);
        String opis = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 5);

        jTextField1.setText(Integer.toString(id));
        jTextField2.setText(naziv);
        jTextField3.setText(datum.toString());
        jTextField4.setText(Integer.toString(sredstva));
        jCheckBox1.setSelected(zavrsen);
        jTextArea1.setText(opis);

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*try {
           
            PreparedStatement ps = c.prepareStatement("DELETE FROM Projekat WHERE ProjekatID = ?");
            int id = Integer.parseInt(jTextField1.getText());
            ps.setInt(1, id);
            ps.execute();
            JOptionPane.showMessageDialog(this, "Uspesno obrisano", "Uspeh!", JOptionPane.INFORMATION_MESSAGE);
            File f = new File("log_" + LocalDate.now().toString() + ".txt");
            try {
                FileWriter fw = new FileWriter(f, true);
                fw.write(jTextField1.getText() + " " + jTextField2.getText() + "\n");
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(GlavniProzor.class.getName()).log(Level.SEVERE, null, ex);
            }
            //BazaProxy.brisiProjekat(id);
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jCheckBox1.setSelected(false);
            jTextArea1.setText("");
            populate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Nespesno obrisano", "Greska!", JOptionPane.WARNING_MESSAGE);
            Logger.getLogger(GlavniProzor.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        /*
        Ovo je što sledi je dopunjen kod koji proverava ispravnost unete šifre i da li ta šifra postoji u tabeli
        Credits to Aleksej Mitić!
         */
        try {
            int i, id2;
            boolean found = false;
            int id = Integer.parseInt(jTextField1.getText());
            for (i = 0; i < jTable1.getRowCount(); i++) {
                id2 = (int) jTable1.getValueAt(i, 0);
                if (id == id2) {
                    found = true;

                    PreparedStatement ps = c.prepareStatement("DELETE FROM PROJEKAT WHERE ProjekatID = ?");
                    ps.setInt(1, id);
                    ps.execute();
                    JOptionPane.showMessageDialog(this, "Uspesno obrisano", "Uspeh!", JOptionPane.INFORMATION_MESSAGE);

                    File f = new File("log_" + LocalDate.now().toString() + ".txt");
                    try {
                        FileWriter fw = new FileWriter(f, true);
                        fw.write(jTextField1.getText() + jTextField2.getText() + "\n");
                        fw.close();

                    } catch (IOException ex) {
                        Logger.getLogger(GlavniProzor.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    jCheckBox1.setSelected(false);
                    jTextArea1.setText("");
                    populate();

                    break;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(this, "Sifra ne postoji!", "Greska!", JOptionPane.ERROR_MESSAGE);
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jCheckBox1.setSelected(false);
                jTextArea1.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(GlavniProzor.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Greska prilikom Brisanja", "Greska!", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ex) {
            Logger.getLogger(GlavniProzor.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Šifra nije ispravno napisana!", "Greska!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new AnalizaProzor().setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GlavniProzor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GlavniProzor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GlavniProzor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GlavniProzor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GlavniProzor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    private void populate() {
        try {
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM Projekat");
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Шифра");
            dtm.addColumn("Назив");
            dtm.addColumn("Датум");
            dtm.addColumn("Средства");
            dtm.addColumn("Завршен");
            dtm.addColumn("Опис");
            while (rs.next()) {
                Object[] red = new Object[6];
                red[0] = rs.getInt("ProjekatID");
                red[1] = rs.getString("Naziv");
                red[2] = rs.getDate("DatumPocetka");
                red[3] = rs.getInt("Sredstva");
                red[4] = rs.getBoolean("ProjekatZavrsen");
                red[5] = rs.getString("Opis");

                dtm.addRow(red);
            }
            jTable1.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(GlavniProzor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
