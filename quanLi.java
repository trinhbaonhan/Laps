/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_thi;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GMT
 */
public class quanLi extends javax.swing.JFrame {
    static DefaultTableModel dtm;
    String demTinh="1";
    /**
     * Creates new form quanLi
     */
    public quanLi() throws SQLException {
        initComponents();
        layDS();
        loadTenTinh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_MAHV = new javax.swing.JTextField();
        jTextField_EMAIL = new javax.swing.JTextField();
        jTextField_HOTEN = new javax.swing.JTextField();
        TINH = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton_Nam = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jButton_Luu = new javax.swing.JButton();
        LamLai = new javax.swing.JButton();
        jButton_Xoa = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_DanhSach = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        HIEN_LOI = new javax.swing.JLabel();

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DANH SÁCH HỌC VIÊN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Thông tin");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mã HV");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Họ Tên");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Tỉnh");

        jTextField_MAHV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField_EMAIL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField_HOTEN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        TINH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TINH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TINHActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Giới tính");

        jRadioButton_Nam.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton_Nam.setText("Nam");

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton2.setText("Nữ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Chức năng");

        jButton_Luu.setBackground(new java.awt.Color(0, 102, 51));
        jButton_Luu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Luu.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Luu.setText("Lưu");
        jButton_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LuuActionPerformed(evt);
            }
        });

        LamLai.setBackground(new java.awt.Color(0, 102, 0));
        LamLai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LamLai.setForeground(new java.awt.Color(255, 255, 255));
        LamLai.setText("Làm lại");
        LamLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LamLaiActionPerformed(evt);
            }
        });

        jButton_Xoa.setBackground(new java.awt.Color(0, 102, 102));
        jButton_Xoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Xoa.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Xoa.setText("Xóa");
        jButton_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XoaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Danh sách");

        jTable_DanhSach.setAutoCreateRowSorter(true);
        jTable_DanhSach.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable_DanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ HV", "HỌ TÊN", "EMAIL", "TỈNH", "GIỚI TÍNH"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_DanhSach.setToolTipText("");
        jScrollPane2.setViewportView(jTable_DanhSach);

        jScrollPane1.setViewportView(jScrollPane2);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        HIEN_LOI.setBackground(new java.awt.Color(255, 204, 204));
        HIEN_LOI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HIEN_LOI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HIEN_LOI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HIEN_LOI, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(79, 79, 79)
                                                .addComponent(jButton_Luu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(69, 69, 69)
                                                .addComponent(jButton_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(92, 92, 92)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(LamLai)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_MAHV, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_HOTEN, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TINH, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_MAHV)
                    .addComponent(jTextField_HOTEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TINH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Luu)
                    .addComponent(LamLai)
                    .addComponent(jButton_Xoa))
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XoaActionPerformed
        // TODO add your handling code here:
        String maHV=jTextField_MAHV.getText();
        int check=0;
        int kiemTraMaHV=0;
        if(maHV.equals("")){
            kiemTraMaHV=1;
            JOptionPane.showMessageDialog(this,"Hãy nhập mã học viên bạn muốn xóa!");
        }
        else if(kiemTraMaHV!=1){
            try{
                check=kiemTraMaHV(maHV);    
            } catch (SQLException ex) {
                Logger.getLogger(quanLi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(check==1){
           int ret=JOptionPane.showConfirmDialog(this,"Ban chac chan muon xoa!","xac nhan",0);
           if(ret==JOptionPane.CANCEL_OPTION){
               return;
           }
           else if(ret==JOptionPane.OK_OPTION){
               try {
                   xoaMaHV(maHV);
               } catch (SQLException ex) {
                   Logger.getLogger(quanLi.class.getName()).log(Level.SEVERE, null, ex);
               }
              JOptionPane.showMessageDialog(this,"xoa ma hoc vien thanh cong!");
              this.layDS();
           }
           
           else if(ret == JOptionPane.NO_OPTION){
                   check=1;
                   }
        }
        else{
            JOptionPane.showMessageDialog(this,"hoc vien nay chua co ban co muon them thong tin vao he thong!");
        }
    }//GEN-LAST:event_jButton_XoaActionPerformed

    private void jButton_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LuuActionPerformed
        // TODO add your handling code here:
        
        String  maHV = jTextField_MAHV.getText();
        String eMail =jTextField_EMAIL.getText();
        String hoTen =jTextField_HOTEN.getText();
        String gioiTinh = jRadioButton_Nam.isSelected() == true ? "Nam" : "Nữ";
        String tenTinh = (String)TINH.getSelectedItem();
        
        String keyMaTinh = "";
        try { 
            HashMap<Integer, String> map =  createMap();
            String value = TINH.getSelectedItem().toString();
            for (Map.Entry me : map.entrySet()) {
                if(me.getValue().equals(value))
                {
                    keyMaTinh = me.getKey().toString();
                    //System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
                }
              }
            
        } catch (SQLException ex) {
            Logger.getLogger(quanLi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        int check = 0;
        int check1=0;
        int kiemTraMaHV =0,kiemTraEMail=0,kiemTraHoTen = 0,kiemTraGioiTinh = 0,kiemTraTentinh=0;
        if(maHV.equals("")){
            kiemTraMaHV =1;
            JOptionPane.showMessageDialog(this,"Mã học viên không được bỏ trống");
            HIEN_LOI.setText("Mã học viên là gì?");
        }
        else if(eMail.equals("")){
            kiemTraEMail=1;
            JOptionPane.showMessageDialog(this,"Nhập sai định dạng email,vui lòng nhập lại!");
        }
        else if (eMail.contains("@gmail.com") == false) {
            kiemTraEMail=1;
            HIEN_LOI.setText("Email Không đúng định dạng, vui lòng nhập lại");
            HIEN_LOI.setForeground(Color.BLACK);
        }
        else if(hoTen.equals("")){
            HIEN_LOI.setText("");
            kiemTraHoTen=1;
            JOptionPane.showMessageDialog(this,"Họ và tên không được bỏ trống!");
            HIEN_LOI.setText("Họ tên học viên là gì?");
        }
        else if(gioiTinh.equals("")){
            kiemTraGioiTinh=1;
            JOptionPane.showMessageDialog(this,"Vui lòng chọn giới tính!");
            HIEN_LOI.setText("Giới tính học viên là gì?");
        }
        else if(tenTinh.equals("")){
            kiemTraTentinh=1;
            JOptionPane.showMessageDialog(this,"Vui lòng không được bỏ trống tên tỉnh");
            
        }
        else if(kiemTraMaHV!=1 && kiemTraEMail!=1 && kiemTraHoTen !=1 && kiemTraGioiTinh !=1 && kiemTraTentinh !=1)  {
            try {
                check = kiemTraMaHV(maHV);
                check1= kiemTraEmail(eMail);
            } catch (SQLException ex) {
                Logger.getLogger(quanLi.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(check ==1){
                System.out.println("Mã học viên đã tồn tại!");
                JOptionPane.showMessageDialog(this,"Mã học viên đã có,bạn muốn cập nhật lại thông tin?");
            }
            if(check1==1){
                HIEN_LOI.setText("Email đã được đăng ký!");
                JOptionPane.showMessageDialog(this,"Email đã được đăng ký,vui lòng điền EMail khác!");
            }
            else{
                try {
                    luuDanhSach(maHV,eMail,hoTen,keyMaTinh,gioiTinh);
                } catch (SQLException ex) {
                    Logger.getLogger(quanLi.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this,"thêm học viên thành công");
                this.layDS();
            }
        }      
    }//GEN-LAST:event_jButton_LuuActionPerformed

    private void TINHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TINHActionPerformed
        
    }//GEN-LAST:event_TINHActionPerformed

    private void LamLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LamLaiActionPerformed
       jTextField_MAHV.setText("");
       
    }//GEN-LAST:event_LamLaiActionPerformed

   public void layDS()
    {
        try
        {
            dtm = (DefaultTableModel) jTable_DanhSach.getModel();
            dtm.setNumRows(0);
            
            String query = "SELECT distinct tinh.TENTINH,hv.MAHV,hv.HOTEN,hv.EMAIL,hv.GIOITINH\n" +
"FROM TINH tinh INNER JOIN HOCVIEN hv ON tinh.MATINH = hv.MATINH\n";           
            Connection ketNoi = DEMO_THI.layKetNoi();
            Statement sta = ketNoi.createStatement();
            ResultSet ketQua = sta.executeQuery(query);
            
            while(ketQua.next())
            {
                Vector<Object> data = new Vector<>();
                data.add(ketQua.getString(2));
                data.add(ketQua.getString(3));
                data.add(ketQua.getString(4));
                data.add(ketQua.getString(1));
                data.add(ketQua.getString(5));
                dtm.addRow(data);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
   
   private HashMap<Integer, String> createMap() throws SQLException {
        Connection ketNoi =DEMO_THI.layKetNoi();
        String query="SELECT * FROM TINH";
        HashMap<Integer, String> map = new HashMap<>();
        try{
            
            Statement sta=ketNoi.createStatement();
            ResultSet ketQua = sta.executeQuery(query);
            while(ketQua.next()){
                map.put( ketQua.getInt("MATINH"), ketQua.getString("TENTINH") );
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    return map;
  }
   
    private void luuDanhSach(String maHV,String hoTen,String eMail,String keyMaTinh,String gioiTinh) throws SQLException{
        Connection ketNoi=DEMO_THI.layKetNoi();
        String sql2="INSERT INTO HOCVIEN values(?,?,?,?,?)";
        try{

            PreparedStatement ps2 =ketNoi.prepareStatement(sql2);

            ps2.setString(1,maHV);
            ps2.setString(3,hoTen);
            ps2.setString(2,eMail);
            ps2.setString(5,gioiTinh);
            ps2.setString(4,keyMaTinh);

            ps2.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(quanLi.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    private void loadTenTinh() throws SQLException{
        HashMap<Integer, String> map =  createMap(); 
        for (Map.Entry me : map.entrySet()) {
          TINH.addItem(me.getValue().toString());
        }
//        Connection ketNoi =DEMO_THI.layKetNoi();
//        String query="SELECT * FROM TINH";
//        System.out.println("llllllllllllllllllllllleses");
//        try{
//            
//            Statement sta=ketNoi.createStatement();
//            ResultSet ketQua = sta.executeQuery(query);
//            while(ketQua.next()){
//                TINH.addItem(ketQua.getString("TENTINH") );
//                //TINH.insertItemAt(ketQua.getString("TENTINH"), 1);
//                //System.out.println(Integer.valueOf(ketQua.getString("MATINH")));
//            }
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
    }
    private int kiemTraMaHV(String maHV) throws SQLException{
        Connection ketNoi=DEMO_THI.layKetNoi();
        int tonTai=0;
        String sql="Select * from HOCVIEN WHERE MAHV='"+ maHV +"'";
        try{
                PreparedStatement ps =ketNoi.prepareStatement(sql);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    tonTai=1;
                }
                rs.close();
                ps.close();
                ketNoi.close();
           }catch(SQLException ex){
               Logger.getLogger(quanLi.class.getName()).log(Level.SEVERE,null,ex);
           }
        return tonTai;
    }
    private int kiemTraEmail(String eMail) throws SQLException{
        Connection ketNoi=DEMO_THI.layKetNoi();
        int tonTai=0;
        String sql="Select * from HOCVIEN WHERE EMAIL='"+ eMail +"'";
        try{
            PreparedStatement ps=ketNoi.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                tonTai=1;
            }
                    rs.close();
                    ps.close();
                    ketNoi.close();
        }catch(SQLException ex){
            Logger.getLogger(quanLi.class.getName()).log(Level.SEVERE,null,ex);
        }
        return tonTai;
    }
    
    private void xoaMaHV(String maHV) throws SQLException{
        Connection ketNoi=DEMO_THI.layKetNoi();
        String sql="Delete from HOCVIEN Where MAHV=?";
        try{
            PreparedStatement ps=ketNoi.prepareStatement(sql);
            ps.setString(1,maHV);
            ps.executeUpdate();
            
        }catch(SQLException ex){
            Logger.getLogger(quanLi.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
   
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
            java.util.logging.Logger.getLogger(quanLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quanLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quanLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quanLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new quanLi().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(quanLi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HIEN_LOI;
    private javax.swing.JButton LamLai;
    private javax.swing.JComboBox<String> TINH;
    private javax.swing.JButton jButton_Luu;
    private javax.swing.JButton jButton_Xoa;
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
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton_Nam;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_DanhSach;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField_EMAIL;
    private javax.swing.JTextField jTextField_HOTEN;
    private javax.swing.JTextField jTextField_MAHV;
    // End of variables declaration//GEN-END:variables
}