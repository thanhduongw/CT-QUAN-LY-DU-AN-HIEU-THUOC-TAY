/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

/**
 *
 * @author nguye
 */
public class Thuoc_GUI extends javax.swing.JPanel {

    /**
     * Creates new form Thuoc_GUI
     */
    public Thuoc_GUI() {
        initComponents();
        jDialog_them.setSize(680, 490); // Set the size of the dialog
        jDialog_them.setLocationRelativeTo(null); // Center the dialog on the screen
        jDialog_them.setModal(true); // Make the dialog modal if needed
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_them = new javax.swing.JDialog();
        thongTinThuoc_lbl = new javax.swing.JLabel();
        tenThuoc_txt = new javax.swing.JTextField();
        tenThuoc_lbl = new javax.swing.JLabel();
        maThuoc_lbl = new javax.swing.JLabel();
        maThuoc_txt = new javax.swing.JTextField();
        tenHoatChat_lbl = new javax.swing.JLabel();
        tenHoatChat_txt = new javax.swing.JTextField();
        soDangKy_lbl = new javax.swing.JLabel();
        duongDung_lbl = new javax.swing.JLabel();
        nongDo_lbl = new javax.swing.JLabel();
        nongDo_txt = new javax.swing.JTextField();
        soDangKy_txt = new javax.swing.JTextField();
        duongDung_cbo = new javax.swing.JComboBox<>();
        soLuong_lbl = new javax.swing.JLabel();
        giaNhap_lbl = new javax.swing.JLabel();
        giaNhap_txt = new javax.swing.JTextField();
        giaBan_lbl = new javax.swing.JLabel();
        giaBan_txt = new javax.swing.JTextField();
        vat_lbl = new javax.swing.JLabel();
        vat_txt = new javax.swing.JTextField();
        ngaySanXuat_lbl = new javax.swing.JLabel();
        ngaySanXuat_date = new com.toedter.calendar.JDateChooser();
        themThuoc_btn = new javax.swing.JButton();
        soLuong_spin = new javax.swing.JSpinner();
        hanSuDung_lbl = new javax.swing.JLabel();
        hanSuDung_date = new com.toedter.calendar.JDateChooser();
        themThuoc_btn1 = new javax.swing.JButton();
        bangKhachHangPanel = new javax.swing.JPanel();
        khachHangScollPanel = new javax.swing.JScrollPane();
        khachHangTable = new javax.swing.JTable();
        quanLyKhachHang_lbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        danhMucThuoc_lbl = new javax.swing.JLabel();
        ma_txt = new javax.swing.JTextField();
        nhomThuoc_cbo = new javax.swing.JComboBox<>();
        tim_btn = new javax.swing.JButton();
        them_btn = new javax.swing.JButton();

        jDialog_them.setTitle("Thông tin thuốc");
        jDialog_them.setBackground(new java.awt.Color(255, 255, 255));

        thongTinThuoc_lbl.setBackground(new java.awt.Color(255, 255, 255));
        thongTinThuoc_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        thongTinThuoc_lbl.setText("Thông tin thuốc");

        tenThuoc_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tenThuoc_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenThuoc_txtActionPerformed(evt);
            }
        });

        tenThuoc_lbl.setBackground(new java.awt.Color(255, 255, 255));
        tenThuoc_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tenThuoc_lbl.setText("Tên thuốc");

        maThuoc_lbl.setBackground(new java.awt.Color(255, 255, 255));
        maThuoc_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        maThuoc_lbl.setText("Mã thuốc");

        maThuoc_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        maThuoc_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maThuoc_txtActionPerformed(evt);
            }
        });

        tenHoatChat_lbl.setBackground(new java.awt.Color(255, 255, 255));
        tenHoatChat_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tenHoatChat_lbl.setText("Tên hoạt chất");

        tenHoatChat_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tenHoatChat_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenHoatChat_txtActionPerformed(evt);
            }
        });

        soDangKy_lbl.setBackground(new java.awt.Color(255, 255, 255));
        soDangKy_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        soDangKy_lbl.setText("Số đăng ký");

        duongDung_lbl.setBackground(new java.awt.Color(255, 255, 255));
        duongDung_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        duongDung_lbl.setText("Đường dùng");

        nongDo_lbl.setBackground(new java.awt.Color(255, 255, 255));
        nongDo_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nongDo_lbl.setText("Nồng độ");

        nongDo_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nongDo_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nongDo_txtActionPerformed(evt);
            }
        });

        soDangKy_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        soDangKy_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soDangKy_txtActionPerformed(evt);
            }
        });

        duongDung_cbo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        duongDung_cbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Chọn đường dùng--", "Viên", "Chai", "Hộp", "Ống", "Cái", "Vỉ" }));

        soLuong_lbl.setBackground(new java.awt.Color(255, 255, 255));
        soLuong_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        soLuong_lbl.setText("Số lượng");

        giaNhap_lbl.setBackground(new java.awt.Color(255, 255, 255));
        giaNhap_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        giaNhap_lbl.setText("Giá nhập");

        giaNhap_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        giaNhap_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giaNhap_txtActionPerformed(evt);
            }
        });

        giaBan_lbl.setBackground(new java.awt.Color(255, 255, 255));
        giaBan_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        giaBan_lbl.setText("Giá bán");

        giaBan_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        giaBan_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giaBan_txtActionPerformed(evt);
            }
        });

        vat_lbl.setBackground(new java.awt.Color(255, 255, 255));
        vat_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        vat_lbl.setText("VAT");

        vat_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        vat_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vat_txtActionPerformed(evt);
            }
        });

        ngaySanXuat_lbl.setBackground(new java.awt.Color(255, 255, 255));
        ngaySanXuat_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ngaySanXuat_lbl.setText("Ngày sản xuất");

        ngaySanXuat_date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        themThuoc_btn.setBackground(new java.awt.Color(77, 189, 116));
        themThuoc_btn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        themThuoc_btn.setForeground(new java.awt.Color(255, 255, 255));
        themThuoc_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\NetBeansProjects\\CT-QUAN-LY-DU-AN-HIEU-THUOC-TAY\\QuanLyHieuThuoc\\image\\plus-24.png")); // NOI18N
        themThuoc_btn.setText("Thêm");

        hanSuDung_lbl.setBackground(new java.awt.Color(255, 255, 255));
        hanSuDung_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        hanSuDung_lbl.setText("Hạn sử dụng");

        hanSuDung_date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        themThuoc_btn1.setBackground(new java.awt.Color(189, 189, 189));
        themThuoc_btn1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        themThuoc_btn1.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\NetBeansProjects\\CT-QUAN-LY-DU-AN-HIEU-THUOC-TAY\\QuanLyHieuThuoc\\image\\Github-Octicons-X-16.24.png")); // NOI18N
        themThuoc_btn1.setText("Hủy");

        javax.swing.GroupLayout jDialog_themLayout = new javax.swing.GroupLayout(jDialog_them.getContentPane());
        jDialog_them.getContentPane().setLayout(jDialog_themLayout);
        jDialog_themLayout.setHorizontalGroup(
            jDialog_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(thongTinThuoc_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDialog_themLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jDialog_themLayout.createSequentialGroup()
                        .addGroup(jDialog_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(giaBan_lbl)
                            .addComponent(giaBan_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(themThuoc_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(themThuoc_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jDialog_themLayout.createSequentialGroup()
                        .addGroup(jDialog_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDialog_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tenThuoc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tenThuoc_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(maThuoc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(maThuoc_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tenHoatChat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tenHoatChat_lbl)
                                .addGroup(jDialog_themLayout.createSequentialGroup()
                                    .addGroup(jDialog_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(soLuong_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(soLuong_spin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(32, 32, 32)
                                    .addGroup(jDialog_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(vat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(vat_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(giaNhap_lbl))
                            .addComponent(giaNhap_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDialog_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ngaySanXuat_lbl)
                            .addGroup(jDialog_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(soDangKy_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                .addComponent(soDangKy_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nongDo_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                .addComponent(nongDo_lbl)
                                .addComponent(duongDung_lbl)
                                .addComponent(duongDung_cbo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ngaySanXuat_date, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hanSuDung_date, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hanSuDung_lbl))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog_themLayout.setVerticalGroup(
            jDialog_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_themLayout.createSequentialGroup()
                .addGroup(jDialog_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDialog_themLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jDialog_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(themThuoc_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(themThuoc_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDialog_themLayout.createSequentialGroup()
                        .addComponent(thongTinThuoc_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDialog_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog_themLayout.createSequentialGroup()
                                .addComponent(tenThuoc_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tenThuoc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maThuoc_lbl))
                            .addGroup(jDialog_themLayout.createSequentialGroup()
                                .addComponent(soDangKy_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(soDangKy_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(duongDung_lbl)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDialog_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jDialog_themLayout.createSequentialGroup()
                                .addComponent(maThuoc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tenHoatChat_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tenHoatChat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDialog_themLayout.createSequentialGroup()
                                .addComponent(duongDung_cbo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nongDo_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nongDo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDialog_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(soLuong_lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDialog_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(vat_lbl)
                                .addComponent(ngaySanXuat_lbl)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDialog_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soLuong_spin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ngaySanXuat_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDialog_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(giaNhap_lbl)
                            .addComponent(hanSuDung_lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDialog_themLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hanSuDung_date, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(giaNhap_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(giaBan_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(giaBan_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        bangKhachHangPanel.setBackground(new java.awt.Color(255, 255, 255));

        khachHangScollPanel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        khachHangTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        khachHangTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "aloha", "Title 2", "Title 3", "Title 4"
            }
        ));
        khachHangScollPanel.setViewportView(khachHangTable);

        quanLyKhachHang_lbl.setBackground(new java.awt.Color(199, 199, 199));
        quanLyKhachHang_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        quanLyKhachHang_lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        quanLyKhachHang_lbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\NetBeansProjects\\CT-QUAN-LY-DU-AN-HIEU-THUOC-TAY\\QuanLyHieuThuoc\\image\\Amitjakhu-Drip-Menu.24.png")); // NOI18N
        quanLyKhachHang_lbl.setText("   Quản lý khách hàng");
        quanLyKhachHang_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout bangKhachHangPanelLayout = new javax.swing.GroupLayout(bangKhachHangPanel);
        bangKhachHangPanel.setLayout(bangKhachHangPanelLayout);
        bangKhachHangPanelLayout.setHorizontalGroup(
            bangKhachHangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(khachHangScollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bangKhachHangPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quanLyKhachHang_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bangKhachHangPanelLayout.setVerticalGroup(
            bangKhachHangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bangKhachHangPanelLayout.createSequentialGroup()
                .addComponent(quanLyKhachHang_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(khachHangScollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
        );

        add(bangKhachHangPanel, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        danhMucThuoc_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        danhMucThuoc_lbl.setForeground(new java.awt.Color(72, 160, 255));
        danhMucThuoc_lbl.setText("Danh mục thuốc");

        ma_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ma_txt.setForeground(new java.awt.Color(189, 189, 189));
        ma_txt.setText("Tên, Mã, Barcode");

        nhomThuoc_cbo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nhomThuoc_cbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Nhóm thuốc--" }));

        tim_btn.setBackground(new java.awt.Color(77, 189, 116));
        tim_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tim_btn.setForeground(new java.awt.Color(255, 255, 255));
        tim_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\NetBeansProjects\\CT-QUAN-LY-DU-AN-HIEU-THUOC-TAY\\QuanLyHieuThuoc\\image\\Custom-Icon-Design-Pretty-Office-2-Search.24.png")); // NOI18N
        tim_btn.setText("Tìm kiếm");
        tim_btn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        tim_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tim_btnActionPerformed(evt);
            }
        });

        them_btn.setBackground(new java.awt.Color(199, 199, 199));
        them_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        them_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\NetBeansProjects\\CT-QUAN-LY-DU-AN-HIEU-THUOC-TAY\\QuanLyHieuThuoc\\image\\Microsoft-Fluentui-Emoji-Mono-Plus.24.png")); // NOI18N
        them_btn.setText("Thêm thuốc");
        them_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                them_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ma_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nhomThuoc_cbo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tim_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(them_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(danhMucThuoc_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(danhMucThuoc_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(ma_txt)
                    .addComponent(nhomThuoc_cbo)
                    .addComponent(tim_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(them_btn))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.NORTH);
    }// </editor-fold>//GEN-END:initComponents

    private void tim_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tim_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tim_btnActionPerformed

    private void them_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_them_btnActionPerformed
        // TODO add your handling code here:
        jDialog_them.setVisible(true);
    }//GEN-LAST:event_them_btnActionPerformed

    private void tenThuoc_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenThuoc_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenThuoc_txtActionPerformed

    private void maThuoc_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maThuoc_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maThuoc_txtActionPerformed

    private void tenHoatChat_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenHoatChat_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenHoatChat_txtActionPerformed

    private void nongDo_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nongDo_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nongDo_txtActionPerformed

    private void soDangKy_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soDangKy_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soDangKy_txtActionPerformed

    private void giaNhap_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giaNhap_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_giaNhap_txtActionPerformed

    private void giaBan_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giaBan_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_giaBan_txtActionPerformed

    private void vat_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vat_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vat_txtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bangKhachHangPanel;
    private javax.swing.JLabel danhMucThuoc_lbl;
    private javax.swing.JComboBox<String> duongDung_cbo;
    private javax.swing.JLabel duongDung_lbl;
    private javax.swing.JLabel giaBan_lbl;
    private javax.swing.JTextField giaBan_txt;
    private javax.swing.JLabel giaNhap_lbl;
    private javax.swing.JTextField giaNhap_txt;
    private com.toedter.calendar.JDateChooser hanSuDung_date;
    private javax.swing.JLabel hanSuDung_lbl;
    private javax.swing.JDialog jDialog_them;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane khachHangScollPanel;
    private javax.swing.JTable khachHangTable;
    private javax.swing.JLabel maThuoc_lbl;
    private javax.swing.JTextField maThuoc_txt;
    private javax.swing.JTextField ma_txt;
    private com.toedter.calendar.JDateChooser ngaySanXuat_date;
    private javax.swing.JLabel ngaySanXuat_lbl;
    private javax.swing.JComboBox<String> nhomThuoc_cbo;
    private javax.swing.JLabel nongDo_lbl;
    private javax.swing.JTextField nongDo_txt;
    private javax.swing.JLabel quanLyKhachHang_lbl;
    private javax.swing.JLabel soDangKy_lbl;
    private javax.swing.JTextField soDangKy_txt;
    private javax.swing.JLabel soLuong_lbl;
    private javax.swing.JSpinner soLuong_spin;
    private javax.swing.JLabel tenHoatChat_lbl;
    private javax.swing.JTextField tenHoatChat_txt;
    private javax.swing.JLabel tenThuoc_lbl;
    private javax.swing.JTextField tenThuoc_txt;
    private javax.swing.JButton themThuoc_btn;
    private javax.swing.JButton themThuoc_btn1;
    private javax.swing.JButton them_btn;
    private javax.swing.JLabel thongTinThuoc_lbl;
    private javax.swing.JButton tim_btn;
    private javax.swing.JLabel vat_lbl;
    private javax.swing.JTextField vat_txt;
    // End of variables declaration//GEN-END:variables
}
