import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class jabatan extends javax.swing.JFrame {
    Connection con;
    Statement stm;
    String sql;
    ResultSet rs;
    PreparedStatement ps;

    public jabatan() {
        initComponents();
        load_table();
        kosong();
    }

    private void load_table(){
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID JABATAN");
        model.addColumn("JABATAN");
        model.addColumn("GAJI POKOK");
        model.addColumn("TUNJANGAN JABATAN");
        model.addColumn("TUNJANGAN ANAK");
        model.addColumn("TUNJANGAN KESEHATAN");
        model.addColumn("PERJALANAN DINAS");
        //menampilkan data database kedalam tabel
        try {
            //int no=1;
            String sql = "select * from jabatan";
            con=(Connection)config.configDB();
            stm=con.createStatement();
            rs=stm.executeQuery(sql);
            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
            }
            tbjabatan.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void kosong(){
        txtidjabatan.setText(null);
        txtjabatan.setText(null);
        txtgajipokok.setText(null);
        txttunjjabatan.setText(null);
        txttunjanak.setText(null);
        txttunjkes.setText(null);
        txtperdin.setText(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtidjabatan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtjabatan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtgajipokok = new javax.swing.JTextField();
        btntambah = new javax.swing.JToggleButton();
        btnupdate = new javax.swing.JToggleButton();
        btnhapus = new javax.swing.JToggleButton();
        btnkeluar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbjabatan = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txttunjjabatan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttunjanak = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttunjkes = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtperdin = new javax.swing.JTextField();
        btnclear = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID JABATAN");

        jLabel2.setText("JABATAN");

        jLabel3.setText("GAJI POKOK");

        btntambah.setText("TAMBAH");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnkeluar.setText("KELUAR");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        tbjabatan.setModel(new javax.swing.table.DefaultTableModel(
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
        tbjabatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbjabatanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbjabatan);

        jLabel4.setText("TUNJ. JABATAN");

        jLabel5.setText("TUNJ. ANAK");

        jLabel6.setText("TUNJ. KESEHATAN");

        jLabel7.setText("PERJALANAN DINAS");

        btnclear.setText("CLEAR");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        jMenu1.setText("Form Jabatan");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btntambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnhapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnkeluar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnclear)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtjabatan, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txtgajipokok))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtidjabatan))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txttunjjabatan))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txttunjanak, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txttunjkes))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txtperdin)))))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtidjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtgajipokok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttunjjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttunjanak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttunjkes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtperdin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntambah)
                    .addComponent(btnupdate)
                    .addComponent(btnhapus)
                    .addComponent(btnkeluar)
                    .addComponent(btnclear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try {
            String sql = "UPDATE jabatan set id_jabatan = '"+txtidjabatan.getText()+"',"
            + " jabatan = '"+txtjabatan.getText()+"', gaji_pokok = '"+txtgajipokok.getText()+"',"
            + " tunj_jabatan = '"+txttunjjabatan.getText()+"', tunj_anak = '"+txttunjanak.getText()+"',"
            + " tunj_kesehatan = '"+txttunjkes.getText()+"', perj_dinas = '"+txtperdin.getText()+"' WHERE id_jabatan = '"+txtidjabatan.getText()+"'";
            con=(Connection)config.configDB();
            ps=con.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data diedit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    load_table();
    kosong();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        try {
            String sql = "DELETE from jabatan WHERE id_jabatan = '"+txtidjabatan.getText()+"'";
            con=(Connection)config.configDB();
            ps=con.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    load_table();
    kosong();
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        new menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        try {
            String sql = "INSERT INTO jabatan VALUES ('"+txtidjabatan.getText()+"',"
            + "'"+txtjabatan.getText()+"','"+txtgajipokok.getText()+"','"+txttunjjabatan.getText()+"','"+txttunjanak.getText()+"','"+txttunjkes.getText()+"','"+txtperdin.getText()+"')";
            con=(Connection)config.configDB();
            ps=con.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    load_table();
    kosong();
    }//GEN-LAST:event_btntambahActionPerformed

    private void tbjabatanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbjabatanMouseClicked
        int baris = tbjabatan.rowAtPoint(evt.getPoint());
        txtidjabatan.setText(tbjabatan.getValueAt(baris, 0).toString());
        txtjabatan.setText(tbjabatan.getValueAt(baris, 1).toString());
        txtgajipokok.setText(tbjabatan.getValueAt(baris, 2).toString());
        txttunjjabatan.setText(tbjabatan.getValueAt(baris, 3).toString());
        txttunjanak.setText(tbjabatan.getValueAt(baris, 4).toString());
        txttunjkes.setText(tbjabatan.getValueAt(baris, 5).toString());
        txtperdin.setText(tbjabatan.getValueAt(baris, 6).toString());
    }//GEN-LAST:event_tbjabatanMouseClicked

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        kosong();
    }//GEN-LAST:event_btnclearActionPerformed

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
            java.util.logging.Logger.getLogger(divisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(divisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(divisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(divisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jabatan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnclear;
    private javax.swing.JToggleButton btnhapus;
    private javax.swing.JToggleButton btnkeluar;
    private javax.swing.JToggleButton btntambah;
    private javax.swing.JToggleButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbjabatan;
    private javax.swing.JTextField txtgajipokok;
    private javax.swing.JTextField txtidjabatan;
    private javax.swing.JTextField txtjabatan;
    private javax.swing.JTextField txtperdin;
    private javax.swing.JTextField txttunjanak;
    private javax.swing.JTextField txttunjjabatan;
    private javax.swing.JTextField txttunjkes;
    // End of variables declaration//GEN-END:variables
}
