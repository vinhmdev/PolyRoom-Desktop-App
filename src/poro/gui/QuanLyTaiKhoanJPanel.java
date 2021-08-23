/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poro.gui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import poro.gui.exception.ToViewException;
import poro.module.Encrypter;
import poro.module.Session;
import poro.module.db.DatabaseManager;
import poro.module.db.data.TaiKhoan;

/**
 *
 * @author ASUS
 */
public class QuanLyTaiKhoanJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyTaiKhoanJPanel
     */
    public QuanLyTaiKhoanJPanel() {
        initComponents();
        setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTenTaiKhoan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHoVaTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        chkQuanLy = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnMoi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtXacNhanMatKhau = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTaiKhoan = new javax.swing.JTable();

        jLabel1.setText("Tên tài khoản");

        jLabel2.setText("Họ và tên");

        jLabel3.setText("Mật khẩu");

        chkQuanLy.setText("Là quản lý?");

        jLabel4.setText("Email");

        jLabel5.setText("Số điện thoại");

        jLabel6.setText("Xác nhận mật khẩu");

        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnMoi)
                        .addGap(18, 18, 18)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnCapNhat)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa))
                    .addComponent(chkQuanLy)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtTenTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(txtHoVaTen, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(txtXacNhanMatKhau))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCapNhat, btnMoi, btnThem, btnXoa});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtXacNhanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chkQuanLy)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMoi)
                    .addComponent(btnThem)
                    .addComponent(btnCapNhat)
                    .addComponent(btnXoa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Form nhập", jPanel1);

        tblTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "User", "Tên", "Email", "Số ĐT", "Chức vụ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTaiKhoanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTaiKhoan);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Danh sách", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabs)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void loading() {
        loadTblTaiKhoan();
    }

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        lamMoi();
        setEditable(false);
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            them();
            loading();
            JOptionPane.showMessageDialog(this, "Thêm thành công");
        } catch (ToViewException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        try {
            capNhat();
            loading();
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
        } catch (ToViewException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        try {
            String confirm = JOptionPane.showInputDialog(
                    this,
                    "Tất cả dữ liệu liên quan user \'"
                    + txtTenTaiKhoan.getText().trim()
                    + "\' sẽ bị xóa\nNhập CONFIRM và ấn xác nhận để tiếp tục xóa!"
            );
            if (null == confirm || !confirm.equals("CONFIRM")) {
                return;
            }
            xoa();
            loading();
            setEditable(false);
            JOptionPane.showMessageDialog(this, "Xóa thành công");
        } catch (ToViewException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTaiKhoanMouseClicked
        if (evt.getClickCount() != 2) {
            return;
        }
        selectTable();
    }//GEN-LAST:event_tblTaiKhoanMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JCheckBox chkQuanLy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblTaiKhoan;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenTaiKhoan;
    private javax.swing.JPasswordField txtXacNhanMatKhau;
    // End of variables declaration//GEN-END:variables

    public void setTab(int i) {
        tabs.setSelectedIndex(i);
    }

    private void lamMoi() {
        txtTenTaiKhoan.setText("");
        txtHoVaTen.setText("");
        txtMatKhau.setText("");
        txtEmail.setText("");
        txtSoDienThoai.setText("");
        txtMatKhau.setText("");
        txtXacNhanMatKhau.setText("");
        chkQuanLy.setSelected(false);
        txtTenTaiKhoan.requestFocus();
    }

    private TaiKhoan getModel() {
        TaiKhoan model = new TaiKhoan();
        model.setIdTaiKhoan(txtTenTaiKhoan.getText().trim());
        model.setTen(txtHoVaTen.getText().trim());
        model.setMatKhau(txtMatKhau.getText().trim());
        model.setEmail(txtEmail.getText().trim());
        model.setSdt(txtSoDienThoai.getText().trim());
        model.setPhanQuyen(chkQuanLy.isSelected());
        return model;
    }

    private void checkLoi() throws ToViewException {
        TaiKhoan tk = getModel();
        if (tk.getIdTaiKhoan().isEmpty()) {
            throw new ToViewException("Tài khoản không được để trống!!");

        }
        if (tk.getEmail().isEmpty()) {
            throw new ToViewException("Email không được để trống");
        }
        if (!tk.getEmail().matches("\\w+(\\.\\w+)*@\\w+(\\.\\w+)+")) {
            throw new ToViewException("Email không đúng định dạng");
        }
        if (tk.getTen().isEmpty()) {
            throw new ToViewException("Họ tên không được để trống");
        }
        if (tk.getSdt().isEmpty()) {
            throw new ToViewException("Số điện thoại không được để trống");
        }
        if (!tk.getSdt().matches("\\d{10}")) {
            throw new ToViewException("Số điện thoại không đúng");
        }
        if (tk.getMatKhau().isEmpty()) {
            throw new ToViewException("Mật khẩu không được để trống");
        }
        if (!tk.getMatKhau().equals(txtXacNhanMatKhau.getText())) {
            throw new ToViewException("Mật khẩu không khớp");
        }
    }

    private void them() throws ToViewException {
        checkLoi();
        TaiKhoan taikh = getModel();
        taikh.setMatKhau(Encrypter.toMD5(taikh.getMatKhau()));

        int i = DatabaseManager.executeUpdate(taikh, TaiKhoan.EXECUTE_INSERT);

        if (i == 0) {
            ArrayList<TaiKhoan> tkList;
            tkList = DatabaseManager.executeQuery(taikh, TaiKhoan.EXECUTE_SELECT_BY_ID);
            if (tkList.size() > 0) {
                throw new ToViewException("Tài khoản đã tồn tại");
            }
            tkList = DatabaseManager.executeQuery(taikh, TaiKhoan.EXECUTE_SELECT_BY_MAIL);
            if (tkList.size() > 0) {
                throw new ToViewException("Email đã tồn tại");
            }
        }
    }

    private void capNhat() throws ToViewException {
        checkLoi();
        TaiKhoan taikh = getModel();
        int i = DatabaseManager.executeUpdate(taikh, TaiKhoan.EXECUTE_UPDATE_BY_ID);
        if (i == 0) {
            ArrayList<TaiKhoan> tkList;
            tkList = DatabaseManager.executeQuery(taikh, TaiKhoan.EXECUTE_SELECT_BY_MAIL);
            if (tkList.size() > 0) {
                throw new ToViewException("Email bị trùng lặp với tài khoản khác");
            }
        }
    }

    private void xoa() throws ToViewException {
        checkLoi();
        TaiKhoan taikh = getModel();
        if (taikh.getIdTaiKhoan().equals(Session.USER.getIdTaiKhoan())) {
            throw new ToViewException("Không được xóa tài khoản của bản thân");
        }
        DatabaseManager.executeUpdate(taikh, TaiKhoan.EXECUTE_DELETE_BY_ID);
    }

    private void loadTblTaiKhoan() {
        DefaultTableModel dtm = (DefaultTableModel) tblTaiKhoan.getModel();
        dtm.setRowCount(0);
        ArrayList<TaiKhoan> tkList = DatabaseManager.executeQuery(new TaiKhoan(), TaiKhoan.EXECUTE_SELECT_ALL);
        tkList.forEach(taiKhoan -> {
            dtm.addRow(new Object[]{taiKhoan.getIdTaiKhoan(), taiKhoan.getTen(), taiKhoan.getEmail(), taiKhoan.getSdt(), taiKhoan.isPhanQuyen() ? "Quản lý" : "Người mượn"});
        });
    }

    private void setEditable(boolean selected) {
        txtTenTaiKhoan.setEnabled(!selected);
        btnThem.setEnabled(!selected);
        txtMatKhau.setEnabled(!selected);
        txtXacNhanMatKhau.setEnabled(!selected);
        btnCapNhat.setEnabled(selected);
        btnXoa.setEnabled(selected);
    }

    private void setForm(TaiKhoan tk) {
        txtTenTaiKhoan.setText(tk.getIdTaiKhoan());
        txtHoVaTen.setText(tk.getTen());
        txtMatKhau.setText(tk.getMatKhau());
        txtEmail.setText(tk.getEmail());
        txtSoDienThoai.setText(tk.getSdt());
        txtMatKhau.setText(tk.getMatKhau());
        txtXacNhanMatKhau.setText(tk.getMatKhau());
        chkQuanLy.setSelected(tk.isPhanQuyen());
        txtTenTaiKhoan.requestFocus();
    }

    private void selectTable() {
        int rowSelected = tblTaiKhoan.getSelectedRow();
        if (rowSelected < 0) {
            return;
        }
        DefaultTableModel dtm = (DefaultTableModel) tblTaiKhoan.getModel();
        String id = (String) dtm.getValueAt(rowSelected, 0);
        TaiKhoan tk = new TaiKhoan();
        tk.setIdTaiKhoan(id);
        ArrayList<TaiKhoan> tkList = DatabaseManager.executeQuery(tk, TaiKhoan.EXECUTE_SELECT_BY_ID);
        if (tkList.isEmpty()) {
            return;
        }
        setForm(tkList.get(0));
        setEditable(true);
        tabs.setSelectedIndex(0);
    }
}
