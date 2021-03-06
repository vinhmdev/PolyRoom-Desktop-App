package poro.gui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import poro.module.db.DatabaseManager;
import poro.module.db.data.TaiKhoan;
import poro.gui.exception.ToViewException;
import poro.module.FileManager;
import poro.module.Mailer;
import poro.module.StringHelper;

/**
 *
 * @author Cô Ngọc
 */
public class QuenMatKhauJDialog extends javax.swing.JDialog {

    /**
     * Creates new form QuenMatKhau
     */
    public QuenMatKhauJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        doiMatKhauJDialog = new DoiMatKhauJDialog(parent, true);
    }

    private DoiMatKhauJDialog doiMatKhauJDialog;

    private static String otp = "";
    TaiKhoan tk = new TaiKhoan();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        btnGuiMa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMaOTP = new javax.swing.JTextField();
        btnXacNhan = new javax.swing.JButton();
        hinh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quên mật khẩu");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nhập email tài khoản của bạn");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 290, 50));

        txtemail.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 420, 30));

        btnGuiMa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnGuiMa.setText("Gửi mã OTP");
        btnGuiMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiMaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuiMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 120, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nhập mã OTP của bạn");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txtMaOTP.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        getContentPane().add(txtMaOTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 420, 30));

        btnXacNhan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnXacNhan.setText("Xác nhận");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });
        getContentPane().add(btnXacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 120, 30));

        hinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/br1.jpg"))); // NOI18N
        getContentPane().add(hinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 270));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuiMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiMaActionPerformed
        try {
            // TODO add your handling code here:
            guiOTP();
            JOptionPane.showMessageDialog(this, "Đã gửi mã OTP vui lòng kiểm tra email!");
        } catch (ToViewException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnGuiMaActionPerformed

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        // TODO add your handling code here:
        xacNhan();
    }//GEN-LAST:event_btnXacNhanActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuiMa;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JLabel hinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtMaOTP;
    private javax.swing.JTextField txtemail;
    // End of variables declaration//GEN-END:variables

    private void guiOTP() throws ToViewException {
        if (!otp.isEmpty()) {
            throw new ToViewException("Đã gửi mã OTP rồi vui lòng kiểm tra lại email!");
        }
        if (!txtemail.getText().matches("\\w+(\\.\\w+)*@\\w+(\\.\\w+)+")) {
            throw new ToViewException("Email không đúng định dạng!");
        }
        
        tk.setEmail(txtemail.getText().trim());
        
        ArrayList<TaiKhoan> tkList = DatabaseManager.executeQuery(tk, TaiKhoan.EXECUTE_SELECT_BY_MAIL);

        if (tkList.size() <= 0) {
            throw new ToViewException("Không tồn tại tài khoản có email " + tk.getEmail());
        }

        otp = StringHelper.random(6);
        tk = tkList.get(0);
        
        FileManager fm = new FileManager("asset/html/mail_quen_mat_khau.html");
        String text = String.format(fm.readString(), tk.getTen(), otp);

        Mailer mailer = new Mailer(tk.getEmail());
        mailer.setSubject("Quên mật khẩu - PolyRoom");
        mailer.setText(text);
        new Thread(mailer).start();
    }

    private void xacNhan() {
        if (otp.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa có mã OTP gửi đến email của bạn!");
            return;
        }
        if (txtMaOTP.getText().equals(otp)) {
            otp = "";
            doiMatKhauJDialog.setTaiKhoanDMK(tk);
            doiMatKhauJDialog.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Mã OTP sai!");
        }
    }

}
