/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KeimalST
 */
public class Chart extends javax.swing.JFrame {

    public Connection conn = null;
    public Statement cn;
    public void Koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/c_keimal_d", "root", "");
            cn = conn.createStatement();
        } catch(Exception ex){
            System.out.println(""+ex);
        }
    }
    
    int a,b,c,d,e,f,g,h;
    int harga1, harga2, harga3, harga4, harga5;

    /**
     * Creates new form TransaksiPage
     */
    public Chart() {
        initComponents();        
        bersih();
        tampildata();
        tampil_combo1();
        IdAuto();
    }
    
    private void tampildata() {
        DefaultTableModel tblpgw = new DefaultTableModel();
        tblpgw.addColumn("ID");
        tblpgw.addColumn("ID User");
        tblpgw.addColumn("Menu 1");
        tblpgw.addColumn("Menu 2");
        tblpgw.addColumn("Menu 3");
        tblpgw.addColumn("Menu 4");
        tblpgw.addColumn("Menu 5");
        tblpgw.addColumn("Total Harga");
        
        try{
            Koneksi();
            String sql = "Select * from chart order by id asc";
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                tblpgw.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8)
                });
            }
            jTable1.setModel(tblpgw);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ada kesalahan...");
        }
    }
    
    private void bersih() {
        txtHarga.setText("");
        cboxUser.setSelectedIndex(0);
        cboxMenu1.setSelectedIndex(0);
        cboxMenu2.setSelectedIndex(0);
        cboxMenu3.setSelectedIndex(0);
        cboxMenu4.setSelectedIndex(0);
        cboxMenu5.setSelectedIndex(0);
        
        txtId.setEnabled(false);
        btnInsert.setEnabled(true);
    }
    
    private void IdAuto() {
        try{
            Koneksi();
            String sql = "select max(right(id,1)) as no from chart";
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                if(rs.first() == false){
                    txtId.setText("1");
                } else{
                    rs.last();
                    int set_id = rs.getInt(1)+1;
                    String no = String.valueOf(set_id);
                    int id_next = no.length();
                    for (int a = 0; a <1 - id_next; a++){
                        no = "0" + no;
                    }
                    txtId.setText(""+no);
                }
            }
        }catch(SQLException ex){
            Logger.getLogger(Chart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void tampil_combo1(){
        
        // Ambil dari Fasilitas
        try{
            String sql1 = "Select * from user INNER JOIN level ON user.id_level = level.id";
            ResultSet rs1 = cn.executeQuery(sql1);
            while(rs1.next()){
                cboxUser.addItem(rs1.getString("nama_level")+" - "+rs1.getString("nama_user"));
            }
        }catch(SQLException e){
            
        }
        
        // Ambil dari Fasilitas
        try{
            String sql1 = "Select * from masakan";
            ResultSet rs1 = cn.executeQuery(sql1);
            while(rs1.next()){
                cboxMenu1.addItem(rs1.getString("nama_masakan")+" - "+rs1.getString("harga"));    
                harga1 = rs1.getInt("harga");
            }
        }catch(SQLException e){
            
        }        
        
        // Ambil dari Fasilitas
        try{
            String sql1 = "Select * from masakan";
            ResultSet rs1 = cn.executeQuery(sql1);
            while(rs1.next()){
                cboxMenu2.addItem(rs1.getString("nama_masakan")+" - "+rs1.getString("harga"));
                harga2 = rs1.getInt("harga");
            }
        }catch(SQLException e){
            
        }
        
        // Ambil dari Fasilitas
        try{
            String sql1 = "Select * from masakan";
            ResultSet rs1 = cn.executeQuery(sql1);
            while(rs1.next()){
                cboxMenu3.addItem(rs1.getString("nama_masakan")+" - "+rs1.getString("harga"));
                harga3 = rs1.getInt("harga");
            }
        }catch(SQLException e){
            
        }
        
        // Ambil dari Fasilitas
        try{
            String sql1 = "Select * from masakan";
            ResultSet rs1 = cn.executeQuery(sql1);
            while(rs1.next()){
                cboxMenu4.addItem(rs1.getString("nama_masakan")+" - "+rs1.getString("harga"));
                harga4 = rs1.getInt("harga");
            }
        }catch(SQLException e){
            
        }
        
        // Ambil dari Fasilitas
        try{
            String sql1 = "Select * from masakan";
            ResultSet rs1 = cn.executeQuery(sql1);
            while(rs1.next()){
                cboxMenu5.addItem(rs1.getString("nama_masakan")+" - "+rs1.getString("harga"));
                harga5 = rs1.getInt("harga");
            }
        }catch(SQLException e){
            
        }
    }
    
    private void to_order(){
        Order dos = new Order();
        dos.setVisible(true);
        this.setVisible(false);
        dos.btnBack2.setVisible(false);
        dos.jTable1.setVisible(false);
        dos.btnInsert.setVisible(false);
        dos.btnUpdate.setVisible(false);
        dos.btnDelete.setVisible(false);
        dos.btnRefresh.setVisible(false);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        btnBack2 = new javax.swing.JButton();
        cboxUser = new javax.swing.JComboBox<>();
        btnInsert1 = new javax.swing.JButton();
        cboxMenu1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboxMenu2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cboxMenu3 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cboxMenu4 = new javax.swing.JComboBox<>();
        cboxMenu5 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnHitung = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHART");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ID                      :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("ID USER            :");

        btnInsert.setText("INSERT");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnRefresh.setText("REFRESH");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnBack1.setText("Back?");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        btnBack2.setText("Back?");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        cboxUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih User!" }));

        btnInsert1.setText("INSERT");
        btnInsert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsert1ActionPerformed(evt);
            }
        });

        cboxMenu1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Menu!" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("MENU 1             :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("MENU 2             :");

        cboxMenu2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Menu!" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("MENU 3             :");

        cboxMenu3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Menu!" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("MENU 4             :");

        cboxMenu4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Menu!" }));

        cboxMenu5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Menu!" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("MENU 5             :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("TOTAL HARGA :");

        btnHitung.setText("HITUNG HARGA");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHitung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(txtId))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 269, Short.MAX_VALUE)
                        .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(22, 22, 22)
                        .addComponent(cboxUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnInsert1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(22, 22, 22)
                        .addComponent(cboxMenu1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(22, 22, 22)
                        .addComponent(cboxMenu2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(22, 22, 22)
                        .addComponent(cboxMenu3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(22, 22, 22)
                        .addComponent(cboxMenu4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(22, 22, 22)
                        .addComponent(cboxMenu5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(txtHarga)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboxUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboxMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboxMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboxMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboxMenu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cboxMenu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHarga))
                .addGap(18, 18, 18)
                .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnInsert1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try{
            Koneksi();
            String sql = "delete from chart where id='"+txtId.getText()+"'";
            cn.executeUpdate(sql);
            conn.close();
            tampildata();
            bersih();
            IdAuto();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus...");
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Proses hapus gagal/koneksi gagal...");
            System.out.println(e.getMessage());
        }
        txtId.setEnabled(true);
        btnInsert.setEnabled(true);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try{
            Koneksi();
            String sql = "update chart set id_user='"
                    +cboxUser.getSelectedItem()
                    +"',"
                    +"id_menu1='"
                    +cboxMenu1.getSelectedItem()
                    +"',"
                    +"id_menu2='"
                    +cboxMenu2.getSelectedItem()
                    +"',"
                    +"id_menu3='"
                    +cboxMenu3.getSelectedItem()
                    +"',"
                    +"id_menu4='"
                    +cboxMenu4.getSelectedItem()
                    +"',"
                    +"id_menu5='"
                    +cboxMenu5.getSelectedItem()
                    +"',"
                    +"total_harga='"
                    +txtHarga.getText()
                    +"'"
                    +"where id='"
                    +txtId.getText()
                    +"'";
            cn.executeUpdate(sql);
            conn.close();
            tampildata();
            IdAuto();
            bersih();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah...");
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Proses update gagal/koneksi gagal...");
            System.out.println(e.getMessage());
        }
        txtId.setEnabled(true);    
        btnInsert.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
        AdminPage lg = new AdminPage();
        lg.setVisible(true);
        this.setVisible(false);           
    }//GEN-LAST:event_btnBack2ActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        PelangganPage l = new PelangganPage();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    int table = jTable1.getSelectedRow();
        
        String a = jTable1.getValueAt(table, 0).toString();
        String b = jTable1.getValueAt(table, 1).toString();
        String c = jTable1.getValueAt(table, 2).toString();
        String d = jTable1.getValueAt(table, 3).toString();
        String e = jTable1.getValueAt(table, 4).toString();
        String f = jTable1.getValueAt(table, 5).toString();
        String g = jTable1.getValueAt(table, 6).toString();
        String h = jTable1.getValueAt(table, 7).toString();
        
        txtId.setText(a);
        cboxUser.setSelectedItem(b);
        cboxMenu1.setSelectedItem(c);
        cboxMenu2.setSelectedItem(d);
        cboxMenu3.setSelectedItem(e);
        cboxMenu4.setSelectedItem(f);
        cboxMenu5.setSelectedItem(g);
        txtHarga.setText(h);
        
        btnInsert.setEnabled(false);
        txtHarga.requestFocus();
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        try{
            Koneksi();
            String sql = "insert into chart values('"
                    +txtId.getText()
                    +"','"
                    +cboxUser.getSelectedItem()
                    +"','"
                    +cboxMenu1.getSelectedItem()
                    +"','"
                    +cboxMenu2.getSelectedItem()
                    +"','"
                    +cboxMenu3.getSelectedItem()
                    +"','"
                    +cboxMenu4.getSelectedItem()
                    +"','"
                    +cboxMenu5.getSelectedItem()
                    +"','"
                    +txtHarga.getText()
                    +"')";
            cn.executeUpdate(sql);
            conn.close();
            tampildata();
            IdAuto();
            bersih();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan...");
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Proses update gagal/koneksi gagal...");
            System.out.println(e.getMessage());
        }
        txtId.setEnabled(true);
        btnInsert.setEnabled(true);
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnInsert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsert1ActionPerformed
        // TODO add your handling code here:
        try{
            Koneksi();
            String sql = "insert into chart values('"
                    +txtId.getText()
                    +"','"
                    +cboxUser.getSelectedItem()
                    +"','"
                    +cboxMenu1.getSelectedItem()
                    +"','"
                    +cboxMenu2.getSelectedItem()
                    +"','"
                    +cboxMenu3.getSelectedItem()
                    +"','"
                    +cboxMenu4.getSelectedItem()
                    +"','"
                    +cboxMenu5.getSelectedItem()
                    +"','"
                    +txtHarga.getText()
                    +"')";
            cn.executeUpdate(sql);
            conn.close();
            tampildata();
            IdAuto();
            bersih();
            to_order();
            JOptionPane.showMessageDialog(null, "Silahkan lanjut ke Order Tempat");
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Proses update gagal/koneksi gagal...");
            System.out.println(e.getMessage());
        }
        txtId.setEnabled(true);
        btnInsert.setEnabled(true);
    }//GEN-LAST:event_btnInsert1ActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        // TODO add your handling code here:
        b = Integer.parseInt((String) cboxMenu1.getSelectedItem());
        c = Integer.parseInt((String) cboxMenu2.getSelectedItem());
        d = Integer.parseInt((String) cboxMenu3.getSelectedItem());
        e = Integer.parseInt((String) cboxMenu4.getSelectedItem());
        f = Integer.parseInt((String) cboxMenu5.getSelectedItem());
        a = b + c + d + e + f;
        
        txtHarga.setText(String.valueOf(a));
    }//GEN-LAST:event_btnHitungActionPerformed

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
            java.util.logging.Logger.getLogger(Chart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBack1;
    public javax.swing.JButton btnBack2;
    public javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHitung;
    public javax.swing.JButton btnInsert;
    public javax.swing.JButton btnInsert1;
    public javax.swing.JButton btnRefresh;
    public javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboxMenu1;
    private javax.swing.JComboBox<String> cboxMenu2;
    private javax.swing.JComboBox<String> cboxMenu3;
    private javax.swing.JComboBox<String> cboxMenu4;
    private javax.swing.JComboBox<String> cboxMenu5;
    private javax.swing.JComboBox<String> cboxUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
