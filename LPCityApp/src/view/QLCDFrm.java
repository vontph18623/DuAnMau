/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import mydao.CDDao;
import myentity.ChuyenDe;
import myinterfaces.BaseDaoInterface;
import xhelper.ImageHelper;
import xhelper.MyMess;
import xhelper.MyValidate;

/**
 *
 * @author NTV
 */
public class QLCDFrm extends javax.swing.JInternalFrame {

    private DefaultTableModel dtm;
    private BaseDaoInterface dao;
    private int index;
    private JFileChooser fileChooser;

    /**
     * Creates new form QLCDFrm
     */
    public QLCDFrm() {
        initComponents();
        init();
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
        lblHinh = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTenCD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtThoiLuong = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtMaCD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHocPhi = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        txtTimkiem = new javax.swing.JTextField();
        btnTimkiem = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnpre = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblQLCD = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setResizable(true);
        setPreferredSize(new java.awt.Dimension(588, 240));

        jPanel1.setLayout(new java.awt.BorderLayout(10, 0));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(160, 209));
        jPanel2.setLayout(new java.awt.GridLayout());

        lblHinh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblHinh.setForeground(new java.awt.Color(255, 51, 51));
        lblHinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinh.setText("Nhấp để chọn\n Logo");
        lblHinh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblHinh.setMinimumSize(new java.awt.Dimension(0, 0));
        lblHinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhMouseClicked(evt);
            }
        });
        jPanel2.add(lblHinh);

        jPanel1.add(jPanel2, java.awt.BorderLayout.WEST);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 15, 10));

        jPanel4.setLayout(new java.awt.GridLayout(4, 2, 0, 5));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tên chuyên đề");
        jLabel3.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel4.add(jLabel3);

        txtTenCD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTenCD.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel4.add(txtTenCD);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Thời lượng(giờ)");
        jLabel5.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel4.add(jLabel5);

        txtThoiLuong.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtThoiLuong.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel4.add(txtThoiLuong);

        jPanel3.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(4, 0, 0, 5));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Mã chuyên đề");
        jLabel4.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel5.add(jLabel4);

        txtMaCD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMaCD.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel5.add(txtMaCD);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Học phí");
        jLabel6.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel5.add(jLabel6);

        txtHocPhi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtHocPhi.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel5.add(txtHocPhi);

        jPanel3.add(jPanel5);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mô tả chuyên đề", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        txtMoTa.setColumns(20);
        txtMoTa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMoTa.setRows(5);
        jScrollPane1.setViewportView(txtMoTa);

        jPanel6.add(jScrollPane1);

        jPanel8.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel8.setLayout(new java.awt.GridLayout(1, 0, 15, 15));

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setMinimumSize(new java.awt.Dimension(0, 0));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel8.add(btnThem);

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setMinimumSize(new java.awt.Dimension(0, 0));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel8.add(btnSua);

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.setMinimumSize(new java.awt.Dimension(0, 0));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel8.add(btnXoa);

        btnMoi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.setMinimumSize(new java.awt.Dimension(0, 0));
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        jPanel8.add(btnMoi);

        txtTimkiem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTimkiem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTimkiem.setText("Nhập mã chuyên đề cần tìm");
        txtTimkiem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimkiemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimkiemFocusLost(evt);
            }
        });
        txtTimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimkiemKeyPressed(evt);
            }
        });

        btnTimkiem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.setMinimumSize(new java.awt.Dimension(0, 0));
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        jPanel9.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel9.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        btnFirst.setBackground(new java.awt.Color(255, 255, 255));
        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/firtsicon.png"))); // NOI18N
        btnFirst.setMinimumSize(new java.awt.Dimension(0, 0));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel9.add(btnFirst);

        btnpre.setBackground(new java.awt.Color(255, 255, 255));
        btnpre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/preicon.png"))); // NOI18N
        btnpre.setMinimumSize(new java.awt.Dimension(0, 0));
        btnpre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreActionPerformed(evt);
            }
        });
        jPanel9.add(btnpre);

        btnNext.setBackground(new java.awt.Color(255, 255, 255));
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nexticon.png"))); // NOI18N
        btnNext.setMinimumSize(new java.awt.Dimension(0, 0));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel9.add(btnNext);

        btnLast.setBackground(new java.awt.Color(255, 255, 255));
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lasticon.png"))); // NOI18N
        btnLast.setMinimumSize(new java.awt.Dimension(0, 0));
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel9.add(btnLast);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btnTimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtTimkiem)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tblQLCD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã chuyên đề", "Tên chuyên đề", "Thời lượng", "Học phí", "Hình", "Mô Tả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQLCD.setMinimumSize(new java.awt.Dimension(0, 0));
        tblQLCD.setRowHeight(24);
        tblQLCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQLCDMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblQLCD);

        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ CHUYÊN ĐỀ");
        jLabel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel10.add(jLabel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblQLCDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQLCDMouseClicked
        // TODO add your handling code here:
        if (mouseClicked());
        System.out.println(lblHinh.getIcon().toString());
        if (!lblHinh.getIcon().toString().isEmpty()) {
            lblHinh.setText("");
            return;
        }
            lblHinh.setText("Nhấp để chọn logo");
        
    }//GEN-LAST:event_tblQLCDMouseClicked

    private void txtTimkiemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemFocusGained
        // TODO add your handling code here:
        if (txtTimkiem.getText().equals("Nhập mã chuyên đề cần tìm")) {
            txtTimkiem.setText("");
            txtTimkiem.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtTimkiemFocusGained

    private void txtTimkiemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemFocusLost
        // TODO add your handling code here:
        timKiemFocus();
    }//GEN-LAST:event_txtTimkiemFocusLost

    private void txtTimkiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimkiemKeyPressed
        // TODO add your handling code here:
        EnterAcctions(evt);
    }//GEN-LAST:event_txtTimkiemKeyPressed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        // TODO add your handling code here:
        if (txtTimkiem.getText().equals("Nhập mã chuyên đề cần tìm") || txtTimkiem.getText().trim().isEmpty()) {
            timKiemFocus();
            return;
        }
        String macd = txtTimkiem.getText();
        if (!checkTrung(macd)) {
            MyMess.msgFalse(this, "Mã chuyên đề này không tồn tại!");
            return;
        }
        for (int i = 0; i < tblQLCD.getRowCount(); i++) {
            if (macd.equals(tblQLCD.getValueAt(i, 0))) {
                index = i;
                showForm(index);
                updateStatus();
            }
        }
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void lblHinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhMouseClicked
        // TODO add your handling code here:
        chonAnh();
    }//GEN-LAST:event_lblHinhMouseClicked

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnpreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreActionPerformed
        // TODO add your handling code here:
        prev();
    }//GEN-LAST:event_btnpreActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (themChuyenDe());
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (suaChuyenDe());
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if (xoaChuyenDe());
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnpre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JTable tblQLCD;
    private javax.swing.JTextField txtHocPhi;
    private javax.swing.JTextField txtMaCD;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtTenCD;
    private javax.swing.JTextField txtThoiLuong;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables

    private void init() {
        //Khai báo lớp dao
        this.dao = new CDDao();

        //khai báo dtm
        this.dtm = (DefaultTableModel) tblQLCD.getModel();
        //Load dữ liệu lên bảng
        LoadDataToTable();
//        if (!lblHinh.getIcon().toString().isEmpty()) {
//            lblHinh.setText("");
//        }
        //khai báo filechooser
        this.fileChooser = new JFileChooser();
        mouseHover();
    }

    private void LoadDataToTable() {
        //load dữ liệu từ cơ sở dữ liệu vào bảng
        this.dtm.setRowCount(0);
        ArrayList<ChuyenDe> list = new ArrayList<>();
        try {
            list = this.dao.selectALL();
            for (ChuyenDe cd : list) {
                setDataRow(cd);
            }
            this.index = 0;
            updateStatus();
            showForm(index);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setDataRow(ChuyenDe cd) {
        //thêm một row vào bảng
        this.dtm.addRow(new Object[]{
            cd.getMaCD().trim(),
            cd.getTenCD(),
            cd.getHocPhi(),
            cd.getThoiLuong(),
            cd.getHinh(),
            cd.getMoTa()
        });
    }

    private void updateStatus() {
        //cập nhập trạng thái cho các button điều hướng
        boolean first = (this.index <= 0);
        boolean last = (this.index >= tblQLCD.getRowCount() - 1);
        this.btnFirst.setEnabled(!first);
        this.btnpre.setEnabled(!first);
        this.btnLast.setEnabled(!last);
        this.btnNext.setEnabled(!last);
        if (index == -1) {
            this.tblQLCD.setRowSelectionAllowed(false);
        } else {
            this.tblQLCD.setRowSelectionAllowed(true);
        }
    }

    private void showForm(int i) {
        //hiển thị dữ liệu lên form tương ứng
        String tooltip = tblQLCD.getValueAt(i, 4) + "";
        this.txtMaCD.setText(tblQLCD.getValueAt(i, 0) + "");
        this.txtTenCD.setText(tblQLCD.getValueAt(i, 1) + "");
        this.txtHocPhi.setText(tblQLCD.getValueAt(i, 2) + "");
        this.txtThoiLuong.setText(tblQLCD.getValueAt(i, 3) + "");
        if (tooltip != null) {
            this.lblHinh.setToolTipText(tooltip);
            this.lblHinh.setIcon(ImageHelper.read(tooltip));
        }
        this.txtMoTa.setText(tblQLCD.getValueAt(i, 5) + "");
        tblQLCD.setRowSelectionInterval(i, i);
    }

    private ChuyenDe getForm() {
        String maCD = txtMaCD.getText().trim();
        String tenCD = txtTenCD.getText();
        float hocPhi = Float.parseFloat(txtHocPhi.getText());
        int thoiLuong = Integer.parseInt(txtThoiLuong.getText());
        String hinh = lblHinh.getToolTipText();
        String moTa = txtMoTa.getText();
        return new ChuyenDe(maCD, tenCD, hocPhi, thoiLuong, hinh, moTa);
    }

    private void clearForm() {
        //xóa trắng form
        this.txtMaCD.setText("");
        this.txtTenCD.setText("");
        this.txtHocPhi.setText("");
        this.txtThoiLuong.setText("");
        this.txtMoTa.setText("");
        this.lblHinh.setIcon(null);
        this.lblHinh.setToolTipText(null);
        this.index = -1;
        updateStatus();
    }

    private boolean mouseClicked() {
        //xử lý sưk kiện click lên table
        this.index = tblQLCD.getSelectedRow();
        updateStatus();
        if (index == -1) {
            return true;
        }
        showForm(index);
        return false;
    }

    private void next() {
        index++;
        updateStatus();
        showForm(index);
    }

    private void last() {
        index = tblQLCD.getRowCount() - 1;
        updateStatus();
        showForm(index);
    }

    private void prev() {
        index--;
        updateStatus();
        showForm(index);
    }

    private void first() {
        index = 0;
        updateStatus();
        showForm(index);
    }

    private void EnterAcctions(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnTimkiem.doClick();
        }
    }

    private void timKiemFocus() {
        if (btnTimkiem.getText().trim().isEmpty()) {
            btnTimkiem.setForeground(new Color(255, 0, 0));
            btnTimkiem.setText("Nhập mã chuyên đề cần tìm");
        }
    }

    private boolean checkTrung(String macd) {
        //check Trùng
        for (int i = 0; i < tblQLCD.getRowCount(); i++) {
            if (macd.trim().equals(tblQLCD.getValueAt(i, 0))) {
                index = i;
                this.tblQLCD.setRowSelectionInterval(i, i);
                return true;
            }
        }
        return false;
    }

    private void chonAnh() {
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            ImageHelper.save(file); // lưu hình ảnh vào thư mục logos
            ImageIcon icon = ImageHelper.read(file.getName());//đọc hình từ thư mục logos
            lblHinh.setIcon(icon);
            lblHinh.setToolTipText(file.getName());//giữ tên hình trong tooltop
            lblHinh.setText("");
        }
    }

    private boolean checkForm() {
        //checkRong
        StringBuilder loi = new StringBuilder();
        //check mã chuyên đề
        if (MyValidate.isEmpty(txtMaCD)) {
            loi.append("Không được để trông mã chuyên đề\n");
        } else if (txtMaCD.getText().length() > 5) {
            loi.append("Mã chuyên đề không được quá 5 ký tự\n");
        }
        //check tên chuyên đề
        if (MyValidate.isEmpty(txtTenCD)) {
            loi.append("không được để trống tên chuyên đề\n");
        } else if (txtTenCD.getText().length() > 50) {
            loi.append("Tên chuyên đề không được quá 50 ký tự\n");
        }
        //check thời lượng
        if (MyValidate.isEmpty(txtThoiLuong)) {
            loi.append("Không được để trống thời lượng\n");
        } else {
            try {
                int tl = Integer.parseInt(txtThoiLuong.getText());
                if (tl <= 0 || tl > 120) {
                    loi.append("Thời lượng phải lớn hơn 0 và không quá 120 giờ!\n");
                }
            } catch (Exception e) {
                loi.append("Thời lượng phải đúng định dạng số!\n");
            }
        }
        //check học phí
        if (MyValidate.isEmpty(txtHocPhi)) {
            loi.append("Không được để trống học phí\n");
        } else {
            try {
                float hp = Float.parseFloat(txtHocPhi.getText());
                if (hp <= 1000) {
                    loi.append("học phí phải lớn hơn 1000\n");
                }
            } catch (Exception e) {
                loi.append("Học phí phải số thực\n");
            }
        }
        //check mô tả
        if (MyValidate.isEmpty(txtMoTa)) {
            loi.append("không được để trống phần mô tả\n");
        } else if (txtMoTa.getText().length() < 10 || txtMoTa.getText().length() > 300) {
            loi.append("Phần mô tả phải đủ ít nhất 10 ký tự và không quá 300 ký tự\n");
        }
        //check hình logo
        if (lblHinh.getToolTipText() == null) {
            loi.append("Bạn phải chọn logo cho chuyên đề\n");
        }
        if (loi.length() > 0) {
            MyMess.msgFalse(this, loi.toString());
            return true;
        }
        return false;
    }

    private boolean themChuyenDe() {
        if (checkForm()) {
            return true;
        }
        //check trùng
        if (checkTrung(getForm().getMaCD())) {
            MyMess.msgFalse(this, "Mã chuyên đề đã tồn tại!\n");
            return true;
        }
        //thêm chuyên đề mới
        try {
            this.dao.insert(getForm());
            MyMess.msgTrue(this, "Thêm thành công");
            setDataRow(getForm());
            this.index = tblQLCD.getRowCount() - 1;
            this.tblQLCD.setRowSelectionInterval(index, index);
            showForm(index);
        } catch (Exception ex) {
            ex.printStackTrace();
            return true;
        }
        return false;
    }

    private boolean suaChuyenDe() {
        if (checkForm()) {
            return true;
        }
        //check trùng
        if (!checkTrung(getForm().getMaCD())) {
            MyMess.msgFalse(this, "Mã chuyên đề không tồn tại!\n");
            return true;
        }
        //sủa chuyên đề
        try {
            this.dao.update(getForm());
            MyMess.msgTrue(this, "Sửa thành công");
            this.index = tblQLCD.getSelectedRow();
            this.tblQLCD.setValueAt(getForm().getTenCD(), index, 1);
            this.tblQLCD.setValueAt(getForm().getHocPhi(), index, 2);
            this.tblQLCD.setValueAt(getForm().getThoiLuong(), index, 3);
            this.tblQLCD.setValueAt(getForm().getHinh(), index, 4);
            this.tblQLCD.setValueAt(getForm().getMoTa(), index, 5);
            this.tblQLCD.setRowSelectionInterval(index, index);
        } catch (Exception ex) {
            ex.printStackTrace();
            return true;
        }
        return false;
    }

    private boolean xoaChuyenDe() {
        String macd = txtMaCD.getText();
        macd = nhapMaCD(macd);
        if (!MyMess.question(this, "Bạn có muốn xóa chuyên đề " + macd + " này không?")) {
            try {
                this.dao.delete(macd);
                MyMess.msgTrue(this, "Xoá thành công");
                for (int i = 0; i < tblQLCD.getRowCount(); i++) {
                    if (macd.equals(tblQLCD.getValueAt(i, 0))) {
                        this.index = i;
                    }
                }
                this.dtm.removeRow(index);
                showForm(index > tblQLCD.getRowCount() - 1 ? tblQLCD.getRowCount() - 1 : index);
            } catch (Exception ex) {
                MyMess.msgWarning(this, "Xoá khoá học của chuyên đề này trước!");
                ex.printStackTrace();
                return true;
            }
        }
        return false;
    }

    private String nhapMaCD(String macd) {
        //Bắt phải nhập không nhập thì bấm cancel mới thoát được nhá
        if (macd.isEmpty()) {
            macd = String.valueOf(MyMess.prompt(this, "Bạn phải nhập vào mã chuyên đề muốn xóa"));
            if (macd.isEmpty()) {
                macd = nhapMaCD(macd);
            }
        }
        if (!checkTrung(macd)) {
            macd = String.valueOf(MyMess.prompt(this, "Mã chuyên đề " + macd + " này không tồn tại\n"
                    + "Xin hãy kiểm tra lại"));
            if (!checkTrung(macd)) {
                macd = nhapMaCD(macd);
            }
        }
        return macd;
    }
    private void mouseHover() {
        //Hiệu ứng di chuột vào các button menu
        JButton[] btns = {btnFirst, btnLast, btnMoi, btnNext, btnSua, btnThem, btnTimkiem, btnXoa, btnpre};
        for (JButton btn : btns) {

            btn.setBackground(new Color(255, 255, 255));
//            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                                        
                }

                @Override
                public void mousePressed(java.awt.event.MouseEvent e) {
                }

                @Override
                public void mouseReleased(java.awt.event.MouseEvent e) {
                }

                @Override
                public void mouseEntered(java.awt.event.MouseEvent e) {
                    btn.setBackground(new Color(204,255,255));
//                    btn.setVerticalTextPosition(1);
//                    btn.setVerticalAlignment(3);
//                    if (btn == btnHome) {
//                        btn.setText("Trang Chủ");
//                    } else if (btn == btnQLCD) {
//                        btn.setText("Chuyên Đề");
//                    } else if (btn == btnQLHV) {
//                        btn.setText("Học Viên");
//                    } else if (btn == btnQLKH) {
//                        btn.setText("Khoá Học");
//                    } else if (btn == btnQLNH) {
//                        btn.setText("Người Học");
//                    } else if (btn == btnQLNhanVien) {
//                        btn.setText("Nhân Viên");
//                    } else if (btn == btnBCTK) {
//                        btn.setText("Thống Kê");
//                    }
                }

                @Override
                public void mouseExited(java.awt.event.MouseEvent e) {
                    btn.setBackground(new Color(255, 255, 255));
//                    btn.setVerticalAlignment(2);
//                    if (btn == btnHome) {
//                        btn.setText("");
//                    } else if (btn == btnQLCD) {
//                        btn.setText("");
//                    } else if (btn == btnQLHV) {
//                        btn.setText("");
//                    } else if (btn == btnQLKH) {
//                        btn.setText("");
//                    } else if (btn == btnQLNH) {
//                        btn.setText("");
//                    } else if (btn == btnQLNhanVien) {
//                        btn.setText("");
//                    } else if (btn == btnBCTK) {
//                        btn.setText("");
//                    }
                }
            });
        }
    }
}
