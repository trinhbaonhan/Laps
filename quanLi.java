
public class quanLi extends javax.swing.JFrame {
    static DefaultTableModel dtm;
    /**
     * Creates new form quanLi
     */
    public quanLi() throws SQLException {
        initComponents();
        layDS();
        loadTenTinh();
    }
    -----private void jButton_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XoaActionPerformed
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

    ---private void jButton_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LuuActionPerformed
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

    -----private void LamLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LamLaiActionPerformed
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
   
  ------------ private HashMap<Integer, String> createMap() throws SQLException {
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
   
   ------- private void luuDanhSach(String maHV,String hoTen,String eMail,String keyMaTinh,String gioiTinh) throws SQLException{
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
    ---------private void loadTenTinh() throws SQLException{
        HashMap<Integer, String> map =  createMap(); 
        for (Map.Entry me : map.entrySet()) {
          TINH.addItem(me.getValue().toString());
        }
//        Connection ketNoi =DEMO_THI.layKetNoi();
//        String query="SELECT * FROM TINH";
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
   
   