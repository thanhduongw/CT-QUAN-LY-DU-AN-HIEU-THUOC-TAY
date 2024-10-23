/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JFrame;
import javax.swing.UIManager;
import com.formdev.flatlaf.FlatLightLaf;

/**
 *
 * @author nguye
 */
public class TrangChu_GUI extends javax.swing.JFrame {
    
    /**
     * Creates new form TrangChu_GUI
     */
    public TrangChu_GUI() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        trangChu_btn = new javax.swing.JButton();
        banThuoc_btn1 = new javax.swing.JButton();
        hoaDon_btn = new javax.swing.JButton();
        khachHang_btn = new javax.swing.JButton();
        thuoc_btn = new javax.swing.JButton();
        tonKho_btn = new javax.swing.JButton();
        jPanel_TonKho = new javax.swing.JPanel();
        phieuNhap_btn = new javax.swing.JButton();
        phieuXuat_btn = new javax.swing.JButton();
        nhanVien_btn = new javax.swing.JButton();
        thongKe_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tonKho_btn1 = new javax.swing.JButton();
        tonKho_btn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.BorderLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\NetBeansProjects\\CT-QUAN-LY-DU-AN-HIEU-THUOC-TAY\\QuanLyHieuThuoc\\image\\BG.png")); // NOI18N
        mainPanel.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(72, 160, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\NetBeansProjects\\CT-QUAN-LY-DU-AN-HIEU-THUOC-TAY\\QuanLyHieuThuoc\\image\\title.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, -1));

        trangChu_btn.setBackground(new java.awt.Color(204, 204, 204));
        trangChu_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        trangChu_btn.setForeground(new java.awt.Color(255, 255, 255));
        trangChu_btn.setText("Trang chủ");
        trangChu_btn.setBorder(null);
        trangChu_btn.setBorderPainted(false);
        trangChu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trangChu_btnActionPerformed(evt);
            }
        });
        jPanel1.add(trangChu_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 260, 40));

        banThuoc_btn1.setBackground(new java.awt.Color(72, 160, 255));
        banThuoc_btn1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        banThuoc_btn1.setForeground(new java.awt.Color(72, 160, 255));
        banThuoc_btn1.setText("Bán thuốc");
        banThuoc_btn1.setBorder(null);
        banThuoc_btn1.setBorderPainted(false);
        banThuoc_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banThuoc_btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(banThuoc_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 260, 40));

        hoaDon_btn.setBackground(new java.awt.Color(72, 160, 255));
        hoaDon_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        hoaDon_btn.setForeground(new java.awt.Color(255, 255, 255));
        hoaDon_btn.setText("Hóa đơn");
        hoaDon_btn.setBorder(null);
        hoaDon_btn.setBorderPainted(false);
        hoaDon_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoaDon_btnActionPerformed(evt);
            }
        });
        jPanel1.add(hoaDon_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 260, 40));

        khachHang_btn.setBackground(new java.awt.Color(72, 160, 255));
        khachHang_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        khachHang_btn.setForeground(new java.awt.Color(255, 255, 255));
        khachHang_btn.setText("Khách hàng");
        khachHang_btn.setBorder(null);
        khachHang_btn.setBorderPainted(false);
        khachHang_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                khachHang_btnActionPerformed(evt);
            }
        });
        jPanel1.add(khachHang_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 40));

        thuoc_btn.setBackground(new java.awt.Color(72, 160, 255));
        thuoc_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        thuoc_btn.setForeground(new java.awt.Color(255, 255, 255));
        thuoc_btn.setText("Thuốc");
        thuoc_btn.setBorder(null);
        thuoc_btn.setBorderPainted(false);
        thuoc_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thuoc_btnActionPerformed(evt);
            }
        });
        jPanel1.add(thuoc_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 260, 40));

        tonKho_btn.setBackground(new java.awt.Color(72, 160, 255));
        tonKho_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        tonKho_btn.setForeground(new java.awt.Color(255, 255, 255));
        tonKho_btn.setText("Tồn kho");
        tonKho_btn.setBorder(null);
        tonKho_btn.setBorderPainted(false);
        tonKho_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tonKho_btnActionPerformed(evt);
            }
        });
        jPanel1.add(tonKho_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 40));

        jPanel_TonKho.setBackground(new java.awt.Color(72, 160, 255));

        phieuNhap_btn.setBackground(new java.awt.Color(72, 160, 255));
        phieuNhap_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        phieuNhap_btn.setForeground(new java.awt.Color(255, 255, 255));
        phieuNhap_btn.setText("Phiếu nhập");
        phieuNhap_btn.setBorder(null);
        phieuNhap_btn.setMargin(new java.awt.Insets(2, 14, 0, 14));
        phieuNhap_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phieuNhap_btnActionPerformed(evt);
            }
        });

        phieuXuat_btn.setBackground(new java.awt.Color(72, 160, 255));
        phieuXuat_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        phieuXuat_btn.setForeground(new java.awt.Color(255, 255, 255));
        phieuXuat_btn.setText("Phiếu xuất");
        phieuXuat_btn.setBorder(null);
        phieuXuat_btn.setMargin(new java.awt.Insets(0, 14, 3, 14));
        phieuXuat_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phieuXuat_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_TonKhoLayout = new javax.swing.GroupLayout(jPanel_TonKho);
        jPanel_TonKho.setLayout(jPanel_TonKhoLayout);
        jPanel_TonKhoLayout.setHorizontalGroup(
            jPanel_TonKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(phieuNhap_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(phieuXuat_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel_TonKhoLayout.setVerticalGroup(
            jPanel_TonKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TonKhoLayout.createSequentialGroup()
                .addComponent(phieuNhap_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(phieuXuat_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel_TonKho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 260, -1));

        nhanVien_btn.setBackground(new java.awt.Color(72, 160, 255));
        nhanVien_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        nhanVien_btn.setForeground(new java.awt.Color(255, 255, 255));
        nhanVien_btn.setText("Nhân viên");
        nhanVien_btn.setBorder(null);
        nhanVien_btn.setBorderPainted(false);
        nhanVien_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhanVien_btnActionPerformed(evt);
            }
        });
        jPanel1.add(nhanVien_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 260, 40));

        thongKe_btn.setBackground(new java.awt.Color(72, 160, 255));
        thongKe_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        thongKe_btn.setForeground(new java.awt.Color(255, 255, 255));
        thongKe_btn.setText("Thống kê");
        thongKe_btn.setBorder(null);
        thongKe_btn.setBorderPainted(false);
        thongKe_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongKe_btnActionPerformed(evt);
            }
        });
        jPanel1.add(thongKe_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 260, 40));

        jPanel2.setBackground(new java.awt.Color(72, 160, 255));

        tonKho_btn1.setBackground(new java.awt.Color(72, 160, 255));
        tonKho_btn1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        tonKho_btn1.setForeground(new java.awt.Color(255, 255, 255));
        tonKho_btn1.setText("Thống kê");
        tonKho_btn1.setBorder(null);
        tonKho_btn1.setBorderPainted(false);
        tonKho_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tonKho_btn1ActionPerformed(evt);
            }
        });

        tonKho_btn2.setBackground(new java.awt.Color(72, 160, 255));
        tonKho_btn2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        tonKho_btn2.setForeground(new java.awt.Color(255, 255, 255));
        tonKho_btn2.setText("Thống kê");
        tonKho_btn2.setBorder(null);
        tonKho_btn2.setBorderPainted(false);
        tonKho_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tonKho_btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tonKho_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(tonKho_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(tonKho_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tonKho_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 260, 100));

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void trangChu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trangChu_btnActionPerformed
        // TODO add your handling code here:
        // Xóa các thành phần cũ trong mainPanel
        mainPanel.removeAll();

        mainPanel.add(jLabel1);

        // Cập nhật lại giao diện
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_trangChu_btnActionPerformed

    private void phieuXuat_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phieuXuat_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phieuXuat_btnActionPerformed

    private void banThuoc_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banThuoc_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_banThuoc_btn1ActionPerformed

    private void hoaDon_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoaDon_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hoaDon_btnActionPerformed

    private void khachHang_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_khachHang_btnActionPerformed
        // TODO add your handling code here:
        // Xóa các thành phần cũ trong mainPanel
        mainPanel.removeAll();

        // Tạo và thêm KhachHang_GUI vào mainPanel
        KhachHang_GUI khachHangPanel = new KhachHang_GUI();
        mainPanel.add(khachHangPanel);

        // Cập nhật lại giao diện
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_khachHang_btnActionPerformed

    private void thuoc_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thuoc_btnActionPerformed
        // TODO add your handling code here:
        // Xóa các thành phần cũ trong mainPanel
        mainPanel.removeAll();

        // Tạo và thêm KhachHang_GUI vào mainPanel
        Thuoc_GUI thuocPanel = new Thuoc_GUI();
        mainPanel.add(thuocPanel);
        
        // Cập nhật lại giao diện
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_thuoc_btnActionPerformed

    private void tonKho_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tonKho_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tonKho_btnActionPerformed

    private void phieuNhap_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phieuNhap_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phieuNhap_btnActionPerformed

    private void tonKho_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tonKho_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tonKho_btn1ActionPerformed

    private void nhanVien_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhanVien_btnActionPerformed
        // TODO add your handling code here:
        // Xóa các thành phần cũ trong mainPanel
        mainPanel.removeAll();

        // Tạo và thêm NhanVien_GUI vào mainPanel
        NhanVien_GUI nhanVienPanel = new NhanVien_GUI();
        mainPanel.add(nhanVienPanel);

        // Cập nhật lại giao diện
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_nhanVien_btnActionPerformed

    private void thongKe_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongKe_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thongKe_btnActionPerformed

    private void tonKho_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tonKho_btn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tonKho_btn2ActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChu_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e){
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TrangChu_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton banThuoc_btn1;
    private javax.swing.JButton hoaDon_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_TonKho;
    private javax.swing.JButton khachHang_btn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton nhanVien_btn;
    private javax.swing.JButton phieuNhap_btn;
    private javax.swing.JButton phieuXuat_btn;
    private javax.swing.JButton thongKe_btn;
    private javax.swing.JButton thuoc_btn;
    private javax.swing.JButton tonKho_btn;
    private javax.swing.JButton tonKho_btn1;
    private javax.swing.JButton tonKho_btn2;
    private javax.swing.JButton trangChu_btn;
    // End of variables declaration//GEN-END:variables
}