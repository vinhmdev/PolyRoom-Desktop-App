package poro.gui;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import poro.gui.exception.ToViewException;
import poro.module.CalendarManager;
import poro.module.FileManager;
import poro.module.Mailer;
import poro.module.Session;
import poro.module.StringHelper;
import poro.module.db.DatabaseManager;
import poro.module.db.DatabaseRefresh;
import poro.module.db.data.MuonPhong;
import poro.module.db.data.Phong;
import poro.module.db.data.SinhVien;
import poro.module.db.data.TaiKhoan;
import poro.module.db.data.TempMuonPhong;
import poro.module.db.data.ThongTinMuonPhong;
import poro.module.web.WebStdManager;

/**
 *
 * @author ASUS
 */
public class MuonPhongJDialog extends javax.swing.JDialog {

    public MuonPhongJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        pnlSinhVien.setVisible(chkMuonHo.isSelected());
    }

    @SuppressWarnings(value = "serial")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTenPhong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContent = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtLau = new javax.swing.JTextField();
        txtIdPhong = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTestTGBatDau = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTestTGKetThuc = new javax.swing.JTextField();
        btnTest = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtLyDo = new javax.swing.JTextField();
        chkMuonHo = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        txtTGBatDau = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTraDuKien = new javax.swing.JTextField();
        btnDangKy = new javax.swing.JButton();
        pnlSinhVien = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTenSV = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("????ng k?? m?????n ph??ng");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Th??ng tin ph??ng"));

        txtTenPhong.setEditable(false);

        jLabel3.setText("T??n ph??ng");

        tblContent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "T??n NM", "B???t ?????u", "K???t th??c"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblContent);

        jLabel4.setText("Danh s??ch m?????n:");

        jLabel9.setText("L???u");

        txtLau.setEditable(false);

        txtIdPhong.setEditable(false);

        jLabel10.setText("M?? ph??ng");

        jLabel11.setText("Th???i gian b???t ?????u");

        txtTestTGBatDau.setEditable(false);
        txtTestTGBatDau.setBackground(new java.awt.Color(255, 255, 255));
        txtTestTGBatDau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTestTGBatDauMouseClicked(evt);
            }
        });

        jLabel12.setText("Th???i gian k???t th??c");

        txtTestTGKetThuc.setEditable(false);
        txtTestTGKetThuc.setBackground(new java.awt.Color(255, 255, 255));
        txtTestTGKetThuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTestTGKetThucMouseClicked(evt);
            }
        });

        btnTest.setText("Ki???m tra");
        btnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtTestTGBatDau, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTenPhong, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTestTGKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)
                                            .addComponent(txtLau, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(txtIdPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnTest)))
                                    .addComponent(jLabel12))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtIdPhong, txtLau, txtTenPhong});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTestTGBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTestTGKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTest))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("????ng k?? m?????n"));

        jLabel8.setText("L?? do");

        chkMuonHo.setText("T??ch v??o ????y n???u m?????n ph??ng h???");
        chkMuonHo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkMuonHoItemStateChanged(evt);
            }
        });

        jLabel1.setText("Th???i gian b???t ?????u");

        txtTGBatDau.setEditable(false);
        txtTGBatDau.setBackground(new java.awt.Color(255, 255, 255));
        txtTGBatDau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTGBatDauMouseClicked(evt);
            }
        });

        jLabel2.setText("Th???i gian tr??? d??? ki???n");

        txtTraDuKien.setEditable(false);
        txtTraDuKien.setBackground(new java.awt.Color(255, 255, 255));
        txtTraDuKien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTraDuKienMouseClicked(evt);
            }
        });

        btnDangKy.setText("????ng k?? m?????n");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });

        jLabel5.setText("M?? SV");

        jLabel6.setText("T??n SV");

        jLabel7.setText("Email SV");

        javax.swing.GroupLayout pnlSinhVienLayout = new javax.swing.GroupLayout(pnlSinhVien);
        pnlSinhVien.setLayout(pnlSinhVienLayout);
        pnlSinhVienLayout.setHorizontalGroup(
            pnlSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTenSV)
            .addComponent(txtMaSV)
            .addComponent(txtEmail)
            .addGroup(pnlSinhVienLayout.createSequentialGroup()
                .addGroup(pnlSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlSinhVienLayout.setVerticalGroup(
            pnlSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSinhVienLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDangKy))
                    .addComponent(txtLyDo)
                    .addComponent(txtTraDuKien)
                    .addComponent(txtTGBatDau)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkMuonHo)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1))
                        .addGap(0, 95, Short.MAX_VALUE))
                    .addComponent(pnlSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTGBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTraDuKien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLyDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chkMuonHo)
                .addGap(18, 18, 18)
                .addComponent(pnlSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDangKy)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTGBatDauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTGBatDauMouseClicked
        setGioBatDau(txtTGBatDau);
    }//GEN-LAST:event_txtTGBatDauMouseClicked

    private void txtTraDuKienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTraDuKienMouseClicked
        setGioKetThuc(txtTGBatDau, txtTraDuKien);
    }//GEN-LAST:event_txtTraDuKienMouseClicked

    private void chkMuonHoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkMuonHoItemStateChanged
        pnlSinhVien.setVisible(chkMuonHo.isSelected());
        txtMaSV.setText("");
        txtTenSV.setText("");
        txtEmail.setText("");
    }//GEN-LAST:event_chkMuonHoItemStateChanged

    private void txtTestTGBatDauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTestTGBatDauMouseClicked
        setGioBatDau(txtTestTGBatDau);
    }//GEN-LAST:event_txtTestTGBatDauMouseClicked

    private void txtTestTGKetThucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTestTGKetThucMouseClicked
        setGioKetThuc(txtTestTGBatDau, txtTestTGKetThuc);
    }//GEN-LAST:event_txtTestTGKetThucMouseClicked

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        try {
            txtTestTGBatDau.setText(txtTGBatDau.getText());
            txtTestTGKetThuc.setText(txtTraDuKien.getText());
            test();

            if (txtLyDo.getText().trim().isEmpty()) {
                throw new ToViewException("Ch??a nh???p l?? do m?????n ph??ng");
            }

            if (chkMuonHo.isSelected()) {
                if (txtMaSV.getText().trim().isEmpty()) {
                    throw new ToViewException("Ch??a nh???p m?? sinh vi??n");
                }
                if (txtTenSV.getText().trim().isEmpty()) {
                    throw new ToViewException("Ch??a nh???p t??n sinh vi??n");
                }
                if (txtEmail.getText().trim().isEmpty()) {
                    throw new ToViewException("Ch??a nh???p email sinh vi??n");
                }
                if (!txtEmail.getText().trim().matches("^\\w+(\\.\\w+)*@\\w+(\\.\\w+)+$")) {
                    throw new ToViewException("Email sinh vi??n kh??ng ????ng ?????nh d???ng");
                }
            }

            insert();
            if (chkMuonHo.isSelected()) {
                JOptionPane.showMessageDialog(this, "????ng k?? th??nh c??ng, ch??? x??c nh???n c???a sinh vi??n");
            } else {
                JOptionPane.showMessageDialog(this, "M?????n ph??ng th??nh c??ng");
            }
            this.dispose();
        } catch (ToViewException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
        try {
            test();
            txtTGBatDau.setText(txtTestTGBatDau.getText());
            txtTraDuKien.setText(txtTestTGKetThuc.getText());
            JOptionPane.showMessageDialog(this, "C?? th??? m?????n");
        } catch (ToViewException ex) {
            txtTGBatDau.setText("");
            txtTraDuKien.setText("");
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnTestActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnTest;
    private javax.swing.JCheckBox chkMuonHo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlSinhVien;
    private javax.swing.JTable tblContent;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdPhong;
    private javax.swing.JTextField txtLau;
    private javax.swing.JTextField txtLyDo;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtTGBatDau;
    private javax.swing.JTextField txtTenPhong;
    private javax.swing.JTextField txtTenSV;
    private javax.swing.JTextField txtTestTGBatDau;
    private javax.swing.JTextField txtTestTGKetThuc;
    private javax.swing.JTextField txtTraDuKien;
    // End of variables declaration//GEN-END:variables

    ArrayList<ThongTinMuonPhong> ttmps = new ArrayList<>();

    public void loading(int soTang, int idPhong) {
        ThongTinMuonPhong ttmp = new ThongTinMuonPhong();
        ttmp.setSoTang(soTang);
        ttmp.setIdPhong(idPhong);
        ttmps = DatabaseManager.executeQuery(ttmp, ThongTinMuonPhong.EXECUTE_SELECT_BY_ID_PHONG);
        if (ttmps == null || ttmps.isEmpty()) {
            return;
        }
        Phong p = ttmps.get(0).getPhong();
        txtLau.setText(p.getIdSoTang() + "");
        txtIdPhong.setText(p.getIdPhong() + "");
        txtTenPhong.setText(p.getTenPhong());
        DefaultTableModel dtm = (DefaultTableModel) tblContent.getModel();
        dtm.setRowCount(0);
        ttmps.forEach(tt -> {
            if (tt.getPhong().getLuotDat() >= 0 && tt.getMuonPhong() != null && tt.getMuonPhong().getTgTraThucTe() == null) {
                dtm.addRow(new Object[]{
                    tt.getTaiKhoan().getTen() + " (" + tt.getTaiKhoan().getIdTaiKhoan() + ")",
                    CalendarManager.getString(tt.getMuonPhong().getTgMuon(), CalendarManager.DATE_HOUR_FULL_FORMAT),
                    CalendarManager.getString(tt.getMuonPhong().getTgTra(), CalendarManager.DATE_HOUR_FULL_FORMAT)
                });
            }
        });
    }

    public void reset() {
        txtTGBatDau.setText("");
        txtTraDuKien.setText("");
        txtLyDo.setText("");
        txtMaSV.setText("");
        txtTenSV.setText("");
        txtEmail.setText("");
    }

    private Form getForm() {
        Form form = new Form();
        
        TaiKhoan tk = Session.USER;
        int soTang = Integer.parseInt(txtLau.getText());
        int idPhong = Integer.parseInt(txtIdPhong.getText());
        Date tgMuon = CalendarManager.getDateByString(txtTGBatDau.getText(), CalendarManager.DATE_HOUR_FULL_FORMAT);
        Date tgTra = CalendarManager.getDateByString(txtTraDuKien.getText(), CalendarManager.DATE_HOUR_FULL_FORMAT);
        String lyDo = txtLyDo.getText();
        form.muonPhong = new MuonPhong(-1, tk.getIdTaiKhoan(), soTang, idPhong, tgMuon, tgTra, null, lyDo);

        String idSv = txtMaSV.getText().trim();
        String email = txtEmail.getText().trim();
        String tenSv = txtTenSV.getText().trim();
        form.sinhVien = new SinhVien(idSv, email, tenSv, -1);
        return form;
    }

    private void insert() throws ToViewException {
        Form form = getForm();
        if (!chkMuonHo.isSelected()) { // m?????n b??nh th?????ng
            int ok = DatabaseManager.executeUpdate(form.muonPhong, MuonPhong.EXECUTE_INSERT);
            if (ok <= 0) {
                throw new ToViewException("M?????n ph??ng th???t b???i");
            }
            return;
        }

        // sinh vi??n m?????n
        MuonPhong mp = form.muonPhong;
        SinhVien sv = form.sinhVien;
        TempMuonPhong temp = new TempMuonPhong();
        temp.setSoTang(mp.getSoTang());
        temp.setIdPhong(mp.getIdPhong());
        temp.setTgMuon(mp.getTgMuon());
        temp.setTgTra(mp.getTgTra());
        temp.setIdSinhVien(sv.getIdSV());
        temp.setEmailSinhVien(sv.getEmail());
        temp.setTenSinhVien(sv.getTenSV());
        temp.setLyDo(mp.getLyDo());
        temp.setIdTaiKhoan(Session.USER.getIdTaiKhoan());
        temp.setOtp(StringHelper.random(8));
        temp.setThoiGianDangKy(CalendarManager.getNow());
        
        DatabaseManager.executeUpdate(temp, TempMuonPhong.EXECUTE_INSERT);
        ArrayList<TempMuonPhong> tmps = DatabaseManager.executeQuery(temp, TempMuonPhong.EXECUTE_SELECT_LAST_INSERT);
        if (tmps == null || tmps.isEmpty()){
            throw new ToViewException("Kh??ng th??? l??u l???i d??? li???u");
        }
        temp = tmps.get(0);
        
        FileManager fm = new FileManager("asset/html/mail_muon_phong_ho.html");
        String email = String.format(fm.readString(),
                temp.getTenSinhVien(),
                txtTenPhong.getText(),
                CalendarManager.getString(temp.getThoiGianDangKy(), CalendarManager.DATE_HOUR_FULL_FORMAT),
                txtTenPhong.getText(),
                temp.getSoTang(),
                temp.getIdPhong(),
                String.format("%s (%s)", Session.USER.getTen(), temp.getIdTaiKhoan()),
                CalendarManager.getString(temp.getThoiGianDangKy(), CalendarManager.DATE_HOUR_FULL_FORMAT),
                CalendarManager.getString(temp.getTgMuon(), CalendarManager.DATE_HOUR_FULL_FORMAT),
                CalendarManager.getString(temp.getTgTra(), CalendarManager.DATE_HOUR_FULL_FORMAT),
                temp.getIdSinhVien(),
                temp.getTenSinhVien(),
                temp.getLyDo(),
                String.format("http://%s?id=%d&otp=%s", WebStdManager.getAddress(), temp.getIdTemp(), temp.getOtp()),
                String.format("http://%s?id=%d&otp=%s", WebStdManager.getAddress(), temp.getIdTemp(), temp.getOtp())
        );

        Mailer mailer = new Mailer(temp.getEmailSinhVien());
        mailer.setSubject("X??c nh???n m?????n ph??ng - PolyRoom");
        mailer.setText(email);
        Thread tMail = new Thread(mailer);
        tMail.start();
    }

    private void setGioBatDau(JTextField txtBatDau) {
        ChonNgayGioJDialog cngjd = new ChonNgayGioJDialog((JFrame) this.getParent(), true);

        Date dateOrigin = CalendarManager.getNow();
        if (!txtBatDau.getText().isEmpty()) {
            dateOrigin = CalendarManager.getDateByString(txtBatDau.getText(), CalendarManager.DATE_HOUR_FULL_FORMAT);
        }

        cngjd.setDateOrigin(dateOrigin);
        cngjd.setVisible(true);
        txtBatDau.setText(cngjd.getResult());
    }

    private void setGioKetThuc(JTextField txtBatDau, JTextField txtKetThuc) {
        ChonNgayGioJDialog cngjd = new ChonNgayGioJDialog((JFrame) this.getParent(), true);

        Date dateOrigin = CalendarManager.getNow();

        if (!txtKetThuc.getText().isEmpty()) {
            dateOrigin = CalendarManager.getDateByString(txtKetThuc.getText(), CalendarManager.DATE_HOUR_FULL_FORMAT);
        } else {
            if (!txtBatDau.getText().isEmpty()) {
                Date first = CalendarManager.getDateByString(txtBatDau.getText(), CalendarManager.DATE_HOUR_FULL_FORMAT);
                dateOrigin = CalendarManager.addTimes(first, 1000L * 60 * 60 * 2);
            }
        }

        cngjd.setDateOrigin(dateOrigin);
        cngjd.setVisible(true);
        txtKetThuc.setText(cngjd.getResult());
    }

    private void test() throws ToViewException {
        DatabaseRefresh.refresh();
        ThongTinMuonPhong ttmp = new ThongTinMuonPhong();

        String sbatDau = txtTestTGBatDau.getText();
        String sketThuc = txtTestTGKetThuc.getText();

        if (sbatDau.isEmpty()) {
            throw new ToViewException("Ch??a ch???n th???i gian m?????n");
        }

        Date batDau = CalendarManager.getDateByString(sbatDau, CalendarManager.DATE_HOUR_FULL_FORMAT);

        if (batDau.before(CalendarManager.addTimes(CalendarManager.getNow(), -15L * 60 * 1000))) {
            throw new ToViewException("L???i th???i gian b???t ?????u tr??? h??n 15 ph??t so v???i hi???n t???i");
        }

        if (sketThuc.isEmpty()) {
            throw new ToViewException("Ch??a ch???n th???i gian tr??? ph??ng");
        }

        Date ketThuc = CalendarManager.getDateByString(sketThuc, CalendarManager.DATE_HOUR_FULL_FORMAT);

        if (batDau.after(ketThuc)) {
            throw new ToViewException("L???i th???i gian b???t ?????u sau th???i gian k???t th??c");
        }

        int soTang = Integer.parseInt(txtLau.getText());
        int idPhong = Integer.parseInt(txtIdPhong.getText());

        ttmp.setTgBatDauF(batDau);
        ttmp.setTgKetThucF(ketThuc);
        ttmp.setSoTang(soTang);
        ttmp.setIdPhong(idPhong);

        ArrayList<ThongTinMuonPhong> ttmps = DatabaseManager.executeQuery(ttmp, ThongTinMuonPhong.EXECUTE_SELECT_KIEM_TRA_PHONG);
        if (ttmps == null || ttmps.isEmpty()) {
            throw new ToViewException("Th???i gian n??y ???? ???????c ?????t tr?????c");

        }
    }

    private class Form {

        MuonPhong muonPhong;
        SinhVien sinhVien;
    }
}
