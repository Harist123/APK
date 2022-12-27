package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class crud extends javax.swing.JFrame {
    Connection con = Koneksi.getKoneksi();
    ResultSet rs = null;
    PreparedStatement pst = null;
    Object set;
    DefaultTableModel model;
    
    private String sql;
    
    public String nisn;
    public String nama;
    public String ttl;
    public String jenis_kelamin;
    public String agama;
    public String alamat;
    public String nama_wali;
    public String asal_sekolah;
    public String no_telp;
    
    public crud() {
        try {
            initComponents();
            String [] isi = {"nisn","nama","ttl","jenis_kelamin","agama","alamat","nama_wali","asal_sekolah","no_telp"};
            model = new DefaultTableModel (isi,0);
            tabelxx.setModel(model);
            tabelxx.setEnabled(false);
            Updatetxttable();
        } catch (SQLException ex) {
            Logger.getLogger(crud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void AmbilJK(String jk){
        if(jk.equals("laki-laki")){
            rdlk.setSelected(true);
        }else{
            rdpr.setSelected(true);
        }
    }
    
    private void AmbilAgama(String Agama){
        String[]ag = {"Islam","Kristen","Hindu","Budha","Konghucu"};
        cbagama.removeAllItems();
        cbagama.addItem(Agama);
        for(int i = 0; i<ag.length; i++){
            if(!ag[i].equals(Agama)){
                cbagama.addItem(ag[i]);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        cbagama = new javax.swing.JComboBox<>();
        txnama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttl = new javax.swing.JTextField();
        hapus = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txalamat = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelxx = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        rdpr = new javax.swing.JRadioButton();
        rdlk = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txnisn = new javax.swing.JTextField();
        txnamawali = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txasalsekolah = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txnotelp = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("TTL  :");

        simpan.setFont(new java.awt.Font("Futura Md BT", 0, 12)); // NOI18N
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        tambah.setFont(new java.awt.Font("Futura Md BT", 0, 12)); // NOI18N
        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        cbagama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbagama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Hindu", "Budha", "Konghucu", " ", " ", " ", " " }));
        cbagama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbagamaActionPerformed(evt);
            }
        });

        txnama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nama  :");

        txttl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txttl.setText("YYYY-MM-DD");

        hapus.setFont(new java.awt.Font("Futura Md BT", 0, 12)); // NOI18N
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        edit.setFont(new java.awt.Font("Futura Md BT", 0, 12)); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        txalamat.setColumns(20);
        txalamat.setRows(5);
        jScrollPane2.setViewportView(txalamat);

        tabelxx.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(51, 51, 51), null, null));
        tabelxx.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "nisn", "nama ", "ttl", "jenis_kelamin", "agama", "alamat", "nama_wali", "asal_sekolah", "no_telp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelxx.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelxx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelxxMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelxx);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Jenis Kelamin  :");

        rdpr.setText("Perempuan");
        rdpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdprActionPerformed(evt);
            }
        });

        rdlk.setText("Laki-laki");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Agama  :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Alamat  :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("NISN  :");

        txnisn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txnamawali.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Nama Wali  :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Asal Sekolah :");

        txasalsekolah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("No. Telp. :");

        txnotelp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 51, 102));

        jLabel1.setFont(new java.awt.Font("Futura Md BT", 0, 24)); // NOI18N
        jLabel1.setText("DATA SISWA PPDB TP 2023/2024");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(232, 232, 232))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txnisn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txnama, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdpr)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdlk))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txttl, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                        .addComponent(cbagama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txnamawali)
                                    .addComponent(txasalsekolah)
                                    .addComponent(txnotelp, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(simpan)
                                .addGap(18, 18, 18)
                                .addComponent(tambah)
                                .addGap(18, 18, 18)
                                .addComponent(hapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edit)))))
                .addContainerGap(60, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txnisn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txnamawali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txasalsekolah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txnotelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hapus)
                            .addComponent(edit)
                            .addComponent(simpan)
                            .addComponent(tambah)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txttl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(rdpr)
                            .addComponent(rdlk))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbagama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbagamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbagamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbagamaActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        try {
            String nisn = txnisn.getText();
            String nama = txnama.getText();
            String ttl = txttl.getText();
            if(rdlk.isSelected()==true){
                jenis_kelamin = "laki-laki";
            }else{
                jenis_kelamin = "perempuan";
            }
            String agama = (String)cbagama.getSelectedItem();
            String alamat = txalamat.getText();
            String nama_wali = txnamawali.getText();
            String asal_sekolah = txasalsekolah.getText();
            String no_telp = txnotelp.getText();
            pst=con.prepareStatement("INSERT INTO data(nisn,nama,ttl,jenis_kelamin,agama,alamat,nama_wali,asal_sekolah,no_telp)VALUES(?,?,?,?,?,?,?,?,?)");
            pst.setString(1, nisn);
            pst.setString(2, nama);
            pst.setString(3, ttl);
            pst.setString(4, jenis_kelamin);
            pst.setString(5, agama);
            pst.setString(6, alamat);
            pst.setString(7, nama_wali);
            pst.setString(8, asal_sekolah);
            pst.setString(9, no_telp);
            pst.executeUpdate();
            pst.close(); 
            Updatetxttable();
            
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan");
        } catch (SQLException ex) {
            Logger.getLogger(crud.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_simpanActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        txnisn.setText("");
        txnama.setText("");
        txttl.setText("");
        cbagama.setSelectedItem("");
        txalamat.setText("");
        txnamawali.setText("");
        txasalsekolah.setText("");
        txnotelp.setText("");
    }//GEN-LAST:event_tambahActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        //String ObjButtons[]={"Yes","No"};
        //int PromptResult = JOptionPane.showOptionDialog(null, "Yakin Mau Menghapus?", "Massage", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, ObjButtons, ObjButtons[1]);
        try {
                String nisnklik = txnisn.getText().toString();
                pst=con.prepareStatement("DELETE FROM data WHERE nisn=?");
                pst.setString(1, nisnklik);
                
                int k =pst.executeUpdate();
                if (k==1){
                    JOptionPane.showMessageDialog(null, "Berhasil Menghapus");
                    pst = con.prepareStatement(sql);
                    pst.executeUpdate();     
                }else{
                    JOptionPane.showMessageDialog(null, "Gagal Menghapus");
                }
                Updatetxttable();
            } catch (SQLException ex) {
                Logger.getLogger(crud.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_hapusActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        try {
            String nisn = txnisn.getText();
            String nama = txnama.getText();
            String ttl = txttl.getText();
            if(rdlk.isSelected()==true){
                jenis_kelamin = "laki-laki";
            }else{
                jenis_kelamin = "perempuan";
            }
            String agama = (String)cbagama.getSelectedItem();
            String alamat = txalamat.getText();
            String nama_wali = txnamawali.getText();
            String asal_sekolah = txasalsekolah.getText();
            String no_telp = txnotelp.getText();
            pst=con.prepareStatement("UPDATE data set nama=?,ttl=?,jenis_kelamin=?,agama=?,alamat=?,nama_wali=?,asal_sekolah=?,no_telp=? WHERE nisn=?");
            
            pst.setString(1, nama);
            pst.setString(2, ttl);
            pst.setString(3, jenis_kelamin);
            pst.setString(4, agama);
            pst.setString(5, alamat);
            pst.setString(6, nama_wali);
            pst.setString(7, asal_sekolah);
            pst.setString(8, no_telp);
            pst.setString(9, nisn);
            pst.executeUpdate();
            pst.close();
            JOptionPane.showMessageDialog(null, "Berhasil di Edit");
            Updatetxttable();
        } catch (SQLException ex) {
            Logger.getLogger(crud.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_editActionPerformed

    private void tabelxxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelxxMouseClicked
        
    }//GEN-LAST:event_tabelxxMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void rdprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdprActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdprActionPerformed

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
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbagama;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rdlk;
    private javax.swing.JRadioButton rdpr;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabelxx;
    private javax.swing.JButton tambah;
    private javax.swing.JTextArea txalamat;
    private javax.swing.JTextField txasalsekolah;
    private javax.swing.JTextField txnama;
    private javax.swing.JTextField txnamawali;
    private javax.swing.JTextField txnisn;
    private javax.swing.JTextField txnotelp;
    private javax.swing.JTextField txttl;
    // End of variables declaration//GEN-END:variables

    private TableModel resultSetTableModel(ResultSet Updatetxttable) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
    
    public void edit()throws SQLException{
        sql = "UPDATE data set nama=?, ttl=?, jenis_kelamin=?, agama=?, alamat=?, nama_wali=?, asal_sekolah=?, no_telp=? WHERE nisn=?";
        pst.setString(1, nama);
        pst.setString(2, ttl);
        pst.setString(3, jenis_kelamin);
        pst.setString(4, agama);
        pst.setString(5, alamat);
        pst.setString(6, nama_wali);
        pst.setString(7, asal_sekolah);
        pst.setString(8, no_telp);
        pst.setString(9, nisn);
        pst.execute();
        pst.close();
    }
    
    public void hapus()throws SQLException{
        try{
            sql ="DELETE from data";
            pst = con.prepareStatement(sql);
            pst.setString(1, nisn);
            pst.execute();
        }catch (SQLException ex){
            Logger.getLogger(crud.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public void Updatetxttable()throws SQLException{
        int row = tabelxx.getRowCount();
        for (int a=0; a<row;a++){
            model.removeRow(0);
        }
        
        try{
            pst=con.prepareStatement("SELECT * FROM data");
            rs=pst.executeQuery();
            
            while(rs.next()){
                String data []={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)};
                model.addRow(data);
            }
        }catch (SQLException ex){
            Logger.getLogger(crud.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
}