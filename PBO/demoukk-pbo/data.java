import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class data extends javax.swing.JFrame {
    Connection con;
    PreparedStatement ps;
    Statement stm;
    ResultSet rs;
    public data() {
        initComponents();
        update_table();
        clear();
    }
    
    public void update_table(){
        DefaultTableModel m = new DefaultTableModel();
        m.addColumn("NO. ABSEN");
        m.addColumn("NAMA");
        m.addColumn("KELAS");
        m.addColumn("NO. HP");
        try{
            con = koneksi_static.db();
            stm = con.createStatement();
            rs = stm.executeQuery("select * from data");
            while (rs.next()) {
                m.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                });
            }
            tbdata.setModel(m);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void clear(){
        tabsen.setText("");
        tnama.setText("");
        tkelas.setText("");
        thp.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        tabsen = new javax.swing.JTextField();
        badd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tnama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tkelas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        thp = new javax.swing.JTextField();
        bedit = new javax.swing.JButton();
        bclr = new javax.swing.JButton();
        bdel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdata = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        mdata = new javax.swing.JMenu();
        mkaryawan = new javax.swing.JMenu();
        mlogout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("NO. ABSEN");

        tabsen.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        badd.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        badd.setText("ADD");
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setText("FORM INPUT DATA");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("NAMA");

        tnama.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("KELAS");

        tkelas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("NO. HP");

        thp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        bedit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bedit.setText("EDIT");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });

        bclr.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bclr.setText("CLEAR");
        bclr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclrActionPerformed(evt);
            }
        });

        bdel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bdel.setText("DELETE");
        bdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdelActionPerformed(evt);
            }
        });

        tbdata.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tbdata.setModel(new javax.swing.table.DefaultTableModel(
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
        tbdata.setRowHeight(24);
        tbdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbdata);

        mdata.setText("Data");
        mdata.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar1.add(mdata);

        mkaryawan.setText("Karyawan");
        mkaryawan.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mkaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mkaryawanMouseClicked(evt);
            }
        });
        jMenuBar1.add(mkaryawan);

        mlogout.setText("Logout");
        mlogout.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mlogoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(mlogout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(badd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bedit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bclr, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bdel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tabsen, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thp, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(tabsen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(tkelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(thp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(badd, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bedit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bclr, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bdel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
        try{
            con = koneksi_static.db();
            ps = con.prepareStatement("insert into data values('" + tabsen.getText() + "','" + tnama.getText() + "','" + tkelas.getText() + "','" + thp.getText() + "')");
            ps.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil ditambah!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        update_table();
        clear();
    }//GEN-LAST:event_baddActionPerformed

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
        try{
            con = koneksi_static.db();
            ps = con.prepareStatement("update data set no_absen='" + tabsen.getText() + "' ,nama='" + tnama.getText() + "' ,kelas='" + tkelas.getText() + "' ,no_hp='" + thp.getText() + "' where no_absen='" + tabsen.getText() + "'");
            ps.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil diedit!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        update_table();
        clear();
    }//GEN-LAST:event_beditActionPerformed

    private void bclrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclrActionPerformed
        clear();
    }//GEN-LAST:event_bclrActionPerformed

    private void bdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdelActionPerformed
        try{
            con = koneksi_static.db();
            ps = con.prepareStatement("delete from data where no_absen='" + tabsen.getText() + "'");
            ps.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        update_table();
        clear();
    }//GEN-LAST:event_bdelActionPerformed

    private void tbdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdataMouseClicked
        int row = tbdata.rowAtPoint(evt.getPoint());
        tabsen.setText(tbdata.getValueAt(row, 0).toString());
        tnama.setText(tbdata.getValueAt(row, 1).toString());
        tkelas.setText(tbdata.getValueAt(row, 2).toString());
        thp.setText(tbdata.getValueAt(row, 3).toString());
    }//GEN-LAST:event_tbdataMouseClicked

    private void mkaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mkaryawanMouseClicked
        new karyawan().setVisible(true);
        dispose();
    }//GEN-LAST:event_mkaryawanMouseClicked

    private void mlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlogoutMouseClicked
        new login().setVisible(true);
        dispose();
    }//GEN-LAST:event_mlogoutMouseClicked

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
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton badd;
    private javax.swing.JButton bclr;
    private javax.swing.JButton bdel;
    private javax.swing.JButton bedit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mdata;
    private javax.swing.JMenu mkaryawan;
    private javax.swing.JMenu mlogout;
    private javax.swing.JTextField tabsen;
    private javax.swing.JTable tbdata;
    private javax.swing.JTextField thp;
    private javax.swing.JTextField tkelas;
    private javax.swing.JTextField tnama;
    // End of variables declaration//GEN-END:variables
}
