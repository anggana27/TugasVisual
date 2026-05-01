package tampilan;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import koneksi.koneksi;

public class Pelanggan extends javax.swing.JFrame {
private Connection conn =new koneksi() .connect();
private DefaultTableModel tabmode;


     private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Pelanggan.class.getName());

   
    public Pelanggan() {
        initComponents();
        kosong();
        aktif();
        datatable();
    }
    protected void aktif(){
            txtid.requestFocus();
    }
    
    protected void kosong(){
                txtid.setText("");
                txtnm.setText("");
                txttelp.setText("");
                txtalamat.setText("");
                txtcari.setText("");              
                
                
    } 
    
    
protected void datatable(){
    Object[]Baris ={"ID Pelanggan", "Nama", "Jenis kelamin", "No. Telepon", "Alamat"};
    tabmode = new DefaultTableModel(null, Baris);
    String cariitem=txtcari.getText();
    
    try{
         String sql = "SELECT * FROM pelanggan WHERE id LIKE '%" + cariitem + "%' "
                   + "OR nmplg LIKE '%" + cariitem + "%' ORDER BY id ASC";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next ()){
                tabmode.addRow(new Object[]{
                hasil.getString(1),
                hasil.getString(2),
                hasil.getString(3),
                hasil.getString(4),
                hasil.getString(5)
                });
            }
            tblplgn.setModel(tabmode);
    } catch (Exception e){
            JOptionPane.showMessageDialog(null, "data gagal dipanggil"+e);
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnJK = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnm = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rlaki = new javax.swing.JRadioButton();
        rperempuan = new javax.swing.JRadioButton();
        txtalamat = new javax.swing.JTextField();
        bsimpan = new javax.swing.JButton();
        bubah = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bbatal = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();
        bcari = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblplgn = new javax.swing.JTable();
        txtcari = new javax.swing.JTextField();
        txttelp = new javax.swing.JTextField();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Data Pelanggan");

        jLabel2.setText("Id pelanggan");

        jLabel3.setText("Nama Pelanggan");

        jLabel4.setText("Jenis Kelamin");

        txtid.addActionListener(this::txtidActionPerformed);

        txtnm.addActionListener(this::txtnmActionPerformed);

        jLabel5.setText("No Telp");

        jLabel6.setText("Alamat ");

        btnJK.add(rlaki);
        rlaki.setText("Laki Laki");
        rlaki.addActionListener(this::rlakiActionPerformed);

        btnJK.add(rperempuan);
        rperempuan.setText("Perempuan");
        rperempuan.addActionListener(this::rperempuanActionPerformed);

        bsimpan.setText("Simpan");
        bsimpan.addActionListener(this::bsimpanActionPerformed);

        bubah.setText("Ubah");
        bubah.addActionListener(this::bubahActionPerformed);

        bhapus.setText("Hapus");
        bhapus.addActionListener(this::bhapusActionPerformed);

        bbatal.setText("Batal");

        bkeluar.setText("Keluar");
        bkeluar.addActionListener(this::bkeluarActionPerformed);

        bcari.setText("Cari");
        bcari.addActionListener(this::bcariActionPerformed);

        tblplgn.setModel(new javax.swing.table.DefaultTableModel(
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
        tblplgn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblplgnMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblplgn);

        txtcari.setText("jTextField1");

        txttelp.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)
                                .addComponent(txtnm, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(bsimpan)
                                            .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(bcari))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bubah)
                                                .addGap(18, 18, 18)
                                                .addComponent(bhapus)
                                                .addGap(18, 18, 18)
                                                .addComponent(bbatal)
                                                .addGap(18, 18, 18)
                                                .addComponent(bkeluar))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rlaki, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(rperempuan))
                                            .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                            .addComponent(txtalamat)
                                            .addComponent(txttelp, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 170, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtnm, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rlaki)
                    .addComponent(rperempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsimpan)
                    .addComponent(bubah)
                    .addComponent(bhapus)
                    .addComponent(bbatal)
                    .addComponent(bkeluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bcari)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rlakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rlakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rlakiActionPerformed

    private void rperempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rperempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rperempuanActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnmActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
    String jenis = null;
    if(rlaki.isSelected()){
        jenis = "Laki-Laki";
    }else if (rperempuan.isSelected()){
        jenis = "perempuan";
    }
    String sql = "insert  into pelanggan values (?,?,?,?,?)";
try{
    PreparedStatement stat = conn.prepareStatement(sql);
    stat.setString(1, txtid.getText());
    stat.setString(2, txtnm.getText());
    stat.setString(3, jenis);
    stat.setString(4, txttelp.getText());
    stat.setString(5, txtalamat.getText());

    stat.executeUpdate();
    JOptionPane.showMessageDialog(null, "data berhasil disimpan");
kosong();
txtid.requestFocus();
}
catch (SQLException e){
    JOptionPane.showMessageDialog(null, "data gagal disimpan " + e);
}
datatable();
// TODO add your handling code here:
    }//GEN-LAST:event_bsimpanActionPerformed

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubahActionPerformed
        String jenis = null;
        if(rlaki.isSelected()){
            jenis = "Laki-Laki";
        }else if (rperempuan.isSelected()){
            jenis = "Perempuan";
        }
        try{
            String sql = "update pelanggan set nmplg=?, jenis=?, telepon=?, alamat=? where id='"+txtid.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtnm.getText());
            stat.setString(2, jenis);
            stat.setString(3, txttelp.getText());
            stat.setString(4, txtalamat.getText());
            
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil diubah");
            kosong();
            txtid.requestFocus();
        }
        catch (SQLException e){
    JOptionPane.showMessageDialog(null, "data gagal diubah " + e);
}
        datatable();
    }//GEN-LAST:event_bubahActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
    int ok = JOptionPane.showConfirmDialog(null, "hapus", "konfirmasi dialog", JOptionPane.YES_NO_OPTION);
            if(ok==0){
                String sql ="delete from pelanggan where id ='"+txtid.getText()+"'";
                try{
                    PreparedStatement stat = conn.prepareStatement(sql);
                    stat.executeUpdate();
                    JOptionPane.showMessageDialog(null, "data berhasil dihapus");
                    kosong();
                    txtid.requestFocus();
                }
                catch (SQLException e){
                JOptionPane.showMessageDialog(null,"data gagal dihapus " + e);
                }
                datatable();
            }
    }//GEN-LAST:event_bhapusActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
        dispose();
    }//GEN-LAST:event_bkeluarActionPerformed

 
    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
   kosong();
   datatable();
    }//GEN-LAST:event_bcariActionPerformed

    private void tblplgnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblplgnMouseClicked
         int bar = tblplgn.getSelectedRow();
            String a = tabmode.getValueAt(bar, 0).toString();
            String b = tabmode.getValueAt(bar, 1).toString();
            String c = tabmode.getValueAt(bar, 2).toString();
            String d = tabmode.getValueAt(bar, 3).toString(); 
            String e = tabmode.getValueAt(bar, 4).toString();
            
            txtid.setText(a);
            txtnm.setText(b);
            if ("Laki-Laki".equals(c)){
                rlaki.setSelected(true);
            }else{
            rperempuan.setSelected(true);
            }
            txtalamat.setText(e);
}
        public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Pelanggan().setVisible(true));
    }//GEN-LAST:event_tblplgnMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bcari;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bkeluar;
    private javax.swing.JButton bsimpan;
    private javax.swing.ButtonGroup btnJK;
    private javax.swing.JButton bubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rlaki;
    private javax.swing.JRadioButton rperempuan;
    private javax.swing.JTable tblplgn;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnm;
    private javax.swing.JTextField txttelp;
    // End of variables declaration//GEN-END:variables
}