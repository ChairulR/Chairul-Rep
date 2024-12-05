/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject2.pertemuan10;

import com.mycompany.mavenproject2.pertemuan10.Mahasiswa;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Arraylist extends javax.swing.JFrame {

    DefaultTableModel modelmahasiswa;
    InputDataMahasiswa datamahasiswa;

    public class ArrayListTable extends javax.swing.JFrame {

        DefaultTableModel modelmahasiswa;
        InputDataMahasiswa datamahasiswa;
    }

    public Arraylist() {
        initComponents();
        datamahasiswa = new InputDataMahasiswa();
        viewDataTabel();
    }

    class CustomTableModel extends DefaultTableModel {

        public CustomTableModel(Object[][] data, Object[] columnNames) {
            super(data, columnNames);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    }

    public final void viewDataTabel() {
        String[] namakolom = {"NIM", "Nama", "Alamat", "Mata kuliah", "Nilai Akhir"};
        Object[][] objekmahasiswa = new Object[datamahasiswa.getALL().size()][5];
        int i = 0;
        for (Mahasiswa mhs : datamahasiswa.getALL()) {
            objekmahasiswa[i] = new Object[]{
                mhs.getNIM(),
                mhs.getNama(),
                mhs.getAlamat(),
                mhs.Matakuliah(),
                mhs.getNilaiAkhir()
                
            };
            i++;
        }
        modelmahasiswa = new CustomTableModel(objekmahasiswa, namakolom);
        mahasiswaTB.setModel(modelmahasiswa);
    }

    public void ClearTextField() {
        nimTF.setText("");
        namaTF.setText("");
        alamatTF.setText("");
        MatkulTF.setText("");
        Nilai1TF.setText("");
        Nilai2TF.setText("");
        Nilai3TF.setText("");
        Nilai4TF.setText("");
        Nilai5TF.setText("");
        nimTF.requestFocus();
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
        nimTF = new javax.swing.JTextField();
        namaTF = new javax.swing.JTextField();
        alamatTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MatkulTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Nilai1TF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Nilai2TF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Nilai3TF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Nilai4TF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Nilai5TF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        NialiAkhirTF = new javax.swing.JTextField();
        simpanBtn = new javax.swing.JButton();
        hapusBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mahasiswaTB = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        nimTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimTFActionPerformed(evt);
            }
        });

        namaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTFActionPerformed(evt);
            }
        });

        alamatTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatTFActionPerformed(evt);
            }
        });

        jLabel1.setText("NIM");

        jLabel2.setText("NAMA");

        jLabel3.setText("Alamat");

        jLabel4.setText("Mata Kuliah");

        MatkulTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatkulTFActionPerformed(evt);
            }
        });

        jLabel5.setText("Nilai 1 [10%]");

        jLabel6.setText("Nilai 2 [15%]");

        jLabel7.setText("Nilai 3-UTS[25%]");

        jLabel8.setText("Nilai 4 [15%]");

        Nilai4TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nilai4TFActionPerformed(evt);
            }
        });

        jLabel9.setText("Nilai 5 [35%]");

        jLabel10.setText("Nilai Akhir");

        NialiAkhirTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NialiAkhirTFActionPerformed(evt);
            }
        });

        simpanBtn.setText("Simpan");
        simpanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBtnActionPerformed(evt);
            }
        });

        hapusBtn.setText("Hapus");
        hapusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nimTF, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(alamatTF)
                            .addComponent(namaTF)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(simpanBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapusBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MatkulTF)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nilai5TF, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(NialiAkhirTF)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nilai4TF)
                            .addComponent(Nilai3TF)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nilai1TF)
                            .addComponent(Nilai2TF))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nimTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(Nilai1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(Nilai2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alamatTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(Nilai3TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MatkulTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(Nilai4TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Nilai5TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(NialiAkhirTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(simpanBtn)
                            .addComponent(hapusBtn))))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        mahasiswaTB.setBackground(new java.awt.Color(204, 204, 204));
        mahasiswaTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIM", "NAMA", "Alamat", "Mata Kuliah", "Nilai Akhir"
            }
        ));
        jScrollPane1.setViewportView(mahasiswaTB);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void namaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTFActionPerformed

    private void simpanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBtnActionPerformed
        double nilai1 = Double.parseDouble(Nilai1TF.getText());
        double nilai2 = Double.parseDouble(Nilai2TF.getText());
        double nilai3 = Double.parseDouble(Nilai3TF.getText());
        double nilai4 = Double.parseDouble(Nilai4TF.getText());
        double nilai5 = Double.parseDouble(Nilai5TF.getText());
        datamahasiswa.insertData(nimTF.getText(), namaTF.getText(), alamatTF.getText(),
                MatkulTF.getText(), nilai1, nilai2, nilai3, nilai4, nilai5);
        ClearTextField();
        viewDataTabel();
    }//GEN-LAST:event_simpanBtnActionPerformed

    private void hapusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBtnActionPerformed
        datamahasiswa.deleteData(mahasiswaTB.getSelectedRow());
        NialiAkhirTF.setText("");
        viewDataTabel();
    }//GEN-LAST:event_hapusBtnActionPerformed

    private void nimTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nimTFActionPerformed

    private void alamatTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatTFActionPerformed

    private void MatkulTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatkulTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatkulTFActionPerformed

    private void Nilai4TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nilai4TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nilai4TFActionPerformed

    private void NialiAkhirTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NialiAkhirTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NialiAkhirTFActionPerformed

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
            java.util.logging.Logger.getLogger(Arraylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arraylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arraylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arraylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arraylist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MatkulTF;
    private javax.swing.JTextField NialiAkhirTF;
    private javax.swing.JTextField Nilai1TF;
    private javax.swing.JTextField Nilai2TF;
    private javax.swing.JTextField Nilai3TF;
    private javax.swing.JTextField Nilai4TF;
    private javax.swing.JTextField Nilai5TF;
    private javax.swing.JTextField alamatTF;
    private javax.swing.JButton hapusBtn;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mahasiswaTB;
    private javax.swing.JTextField namaTF;
    private javax.swing.JTextField nimTF;
    private javax.swing.JButton simpanBtn;
    // End of variables declaration//GEN-END:variables
}
