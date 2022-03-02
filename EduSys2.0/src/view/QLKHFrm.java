/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import mydao.CDDao;
import mydao.KHDao;
import myentity.ChuyenDe;
import myentity.KhoaHoc;
import xhelper.Auth;
import xhelper.DateHelper;
import xhelper.MyMess;
import xhelper.MyValidate;

/**
 *
 * @author NTV
 */
public class QLKHFrm extends javax.swing.JInternalFrame {

    private DefaultComboBoxModel<ChuyenDe> dcbm;
    private DefaultTableModel dtm;
    private CDDao cddao;
    private KHDao khdao;
    private int index;

    /**
     * Creates new form QLKH
     */
    public QLKHFrm() {
        initComponents();
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
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
        cbbChuyenDe = new javax.swing.JComboBox<>();
        btnLoadCD = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTenCD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHocPhi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNT = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtKG = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtThoiLuong = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNgayTao = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnpre = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKhoaHoc = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setResizable(true);
        setPreferredSize(new java.awt.Dimension(458, 281));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CHUYÊN ĐỀ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(51, 102, 255))); // NOI18N
        jPanel1.setLayout(new java.awt.BorderLayout(5, 6));

        cbbChuyenDe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbbChuyenDe.setMinimumSize(new java.awt.Dimension(0, 0));
        cbbChuyenDe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbChuyenDeItemStateChanged(evt);
            }
        });
        jPanel1.add(cbbChuyenDe, java.awt.BorderLayout.CENTER);

        btnLoadCD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLoadCD.setText("Tải Chuyên Đề");
        btnLoadCD.setMinimumSize(new java.awt.Dimension(0, 0));
        btnLoadCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadCDActionPerformed(evt);
            }
        });
        jPanel1.add(btnLoadCD, java.awt.BorderLayout.EAST);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 6, 0));

        jPanel3.setLayout(new java.awt.GridLayout(6, 1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Mã Chuyên Đề");
        jLabel2.setMinimumSize(new java.awt.Dimension(6, 0));
        jPanel3.add(jLabel2);

        txtTenCD.setEditable(false);
        txtTenCD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTenCD.setMinimumSize(new java.awt.Dimension(6, 0));
        jPanel3.add(txtTenCD);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Học Phí");
        jLabel3.setMinimumSize(new java.awt.Dimension(6, 0));
        jPanel3.add(jLabel3);

        txtHocPhi.setEditable(false);
        txtHocPhi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtHocPhi.setMinimumSize(new java.awt.Dimension(6, 0));
        jPanel3.add(txtHocPhi);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Người Tạo");
        jLabel4.setMinimumSize(new java.awt.Dimension(6, 0));
        jPanel3.add(jLabel4);

        txtNT.setEditable(false);
        txtNT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNT.setMinimumSize(new java.awt.Dimension(6, 0));
        jPanel3.add(txtNT);

        jPanel2.add(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout(6, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Khai Giảng");
        jLabel5.setMinimumSize(new java.awt.Dimension(6, 0));
        jPanel4.add(jLabel5);

        txtKG.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtKG.setMinimumSize(new java.awt.Dimension(6, 0));
        jPanel4.add(txtKG);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Thời Lượng");
        jLabel6.setMinimumSize(new java.awt.Dimension(6, 0));
        jPanel4.add(jLabel6);

        txtThoiLuong.setEditable(false);
        txtThoiLuong.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtThoiLuong.setMinimumSize(new java.awt.Dimension(6, 0));
        jPanel4.add(txtThoiLuong);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Ngày Tạo");
        jLabel7.setMinimumSize(new java.awt.Dimension(6, 0));
        jPanel4.add(jLabel7);

        txtNgayTao.setEditable(false);
        txtNgayTao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNgayTao.setMinimumSize(new java.awt.Dimension(6, 0));
        jPanel4.add(txtNgayTao);

        jPanel2.add(jPanel4);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ghi chú khoá học", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        txtGhiChu.setColumns(20);
        txtGhiChu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtGhiChu.setRows(5);
        jScrollPane1.setViewportView(txtGhiChu);

        jPanel6.add(jScrollPane1);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel8.setLayout(new java.awt.GridLayout(1, 0, 3, 0));

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setMaximumSize(new java.awt.Dimension(3000, 4000));
        btnThem.setMinimumSize(new java.awt.Dimension(0, 0));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel8.add(btnThem);

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setMaximumSize(new java.awt.Dimension(3000, 4000));
        btnSua.setMinimumSize(new java.awt.Dimension(0, 0));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel8.add(btnSua);

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.setMaximumSize(new java.awt.Dimension(3000, 4000));
        btnXoa.setMinimumSize(new java.awt.Dimension(0, 0));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel8.add(btnXoa);

        btnMoi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.setMaximumSize(new java.awt.Dimension(3000, 4000));
        btnMoi.setMinimumSize(new java.awt.Dimension(0, 0));
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        jPanel8.add(btnMoi);

        jPanel7.add(jPanel8, java.awt.BorderLayout.WEST);

        jPanel9.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel9.setLayout(new java.awt.GridLayout(1, 0, 3, 0));

        btnFirst.setBackground(new java.awt.Color(255, 255, 255));
        btnFirst.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/firtsicon.png"))); // NOI18N
        btnFirst.setMinimumSize(new java.awt.Dimension(0, 0));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel9.add(btnFirst);

        btnpre.setBackground(new java.awt.Color(255, 255, 255));
        btnpre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnpre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/preicon.png"))); // NOI18N
        btnpre.setMinimumSize(new java.awt.Dimension(0, 0));
        btnpre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreActionPerformed(evt);
            }
        });
        jPanel9.add(btnpre);

        btnNext.setBackground(new java.awt.Color(255, 255, 255));
        btnNext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nexticon.png"))); // NOI18N
        btnNext.setMinimumSize(new java.awt.Dimension(0, 0));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel9.add(btnNext);

        btnLast.setBackground(new java.awt.Color(255, 255, 255));
        btnLast.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lasticon.png"))); // NOI18N
        btnLast.setMinimumSize(new java.awt.Dimension(0, 0));
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel9.add(btnLast);

        jPanel7.add(jPanel9, java.awt.BorderLayout.EAST);

        tblKhoaHoc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblKhoaHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Khoá Học", "Thời lượng", "Học Phí", "Khai Giảng", "Người Tạo", "Ngày Tạo", "Ghi Chú"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhoaHoc.setRowHeight(24);
        tblKhoaHoc.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblKhoaHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhoaHocMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblKhoaHoc);

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ KHOÁ HỌC");
        jLabel1.setMinimumSize(new java.awt.Dimension(6, 0));
        jPanel5.add(jLabel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbChuyenDeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbChuyenDeItemStateChanged
        // TODO add your handling code here:
        if(cbbChuyenDe.getSelectedIndex() < 0) {
            return;
        }
        ChuyenDe cd = (ChuyenDe) cbbChuyenDe.getSelectedItem();
        this.txtTenCD.setText(cd.getMaCD());
//        System.out.println(cd.getMaCD());
//        this.txtGhiChu.setText(cd.getMoTa());
        loadDataToTable(cd.getMaCD());
    }//GEN-LAST:event_cbbChuyenDeItemStateChanged

    private void btnLoadCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadCDActionPerformed
        // TODO add your handling code here:
        this.loadDataToCBB();
        ChuyenDe cd = (ChuyenDe) this.cbbChuyenDe.getSelectedItem();
//        this.txtTenCD.setText(cd.getMaCD());
        loadDataToTable(cd.getMaCD());
    }//GEN-LAST:event_btnLoadCDActionPerformed

    private void tblKhoaHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhoaHocMouseClicked
        // TODO add your handling code here:
        if (mouseClicked());
    }//GEN-LAST:event_tblKhoaHocMouseClicked

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnpreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreActionPerformed
        // TODO add your handling code here:
        prev();
    }//GEN-LAST:event_btnpreActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if (xoa());
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (sua()) return;

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (them()) return;
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnLoadCD;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnpre;
    private javax.swing.JComboBox<String> cbbChuyenDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JTable tblKhoaHoc;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtHocPhi;
    private javax.swing.JTextField txtKG;
    private javax.swing.JTextField txtNT;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtTenCD;
    private javax.swing.JTextField txtThoiLuong;
    // End of variables declaration//GEN-END:variables

    private boolean xoa() {
        int makh = (int) this.tblKhoaHoc.getValueAt(index, 0);
        if (!MyMess.question(this, "Bạn có muốn xóa khóa học có mã: " + makh + " này không?")) {
            try {
                this.khdao.delete(makh);
                MyMess.msgTrue(this, "Xoá thành công" );
                this.dtm.removeRow(index);
                showForm(index > tblKhoaHoc.getRowCount() - 1 ? tblKhoaHoc.getRowCount() - 1 : index);
                return false;
            } catch (Exception ex) {
                MyMess.msgTrue(this, "Xoá học viên khỏi khoá học trước" );
                ex.printStackTrace();
            }
        }
        return true;
    }
    
    private boolean them() {
        // TODO add your handling code here:
        ChuyenDe cd = (ChuyenDe) this.cbbChuyenDe.getSelectedItem();
        if (checkForm()) {
            return true;
        }
        try {
            this.khdao.insert(getForm());
            MyMess.msgTrue(this, "Thêm thành công");
            this.loadDataToTable(cd.getMaCD());
            this.index = tblKhoaHoc.getRowCount() - 1;
            this.tblKhoaHoc.setRowSelectionInterval(index, index);
            showForm(index);
        } catch (Exception ex) {
            ex.printStackTrace();
            MyMess.msgTrue(this, "Lỗi truy vấn");
        }
        return false;
    }
    
    private boolean sua() {
        // TODO add your handling code here:
        if (checkForm()) {
            return true;
        }
        KhoaHoc kh = getForm();
        kh.setMaKH((int) this.tblKhoaHoc.getValueAt(index, 0));
        if (!MyMess.question(this, "Bạn có muốn sửa khóa học có mã " + kh.getMaKH() + " không?")) {
            try {
                this.khdao.update(kh);
                MyMess.msgTrue(this, "Sửa thành công");
                this.tblKhoaHoc.setValueAt(kh.getThoiLuong(), index, 1);
                this.tblKhoaHoc.setValueAt(kh.getHocPhi(), index, 2);
                this.tblKhoaHoc.setValueAt(kh.getNgayKG(), index, 3);
                this.tblKhoaHoc.setValueAt(Auth.nguoiDungHienTai.getHoTen(), index, 4);
                this.tblKhoaHoc.setValueAt(kh.getNgayTao(), index, 5);
                this.tblKhoaHoc.setValueAt(kh.getGhiChu(), index, 6);
            } catch (Exception e) {
                MyMess.msgTrue(this, "Lỗi truy vấn");
                e.printStackTrace();
            }
        }
        return false;
    }
    
    public void init() {
        //khai báo chuyên đề dao
        this.cddao = new CDDao();
        //khai báo khóa học dao
        this.khdao = new KHDao();

        this.dcbm = (DefaultComboBoxModel) this.cbbChuyenDe.getModel();
        this.dtm = (DefaultTableModel) this.tblKhoaHoc.getModel();

        //load dữ liệu lên combobox chuyên đề
        loadDataToCBB();
        //load dữ liệu lên bảng theo chuyên đề
        ChuyenDe cd = (ChuyenDe) this.cbbChuyenDe.getSelectedItem();
        loadDataToTable(cd.getMaCD());
        mouseHover();
        statusButton();
    }

    public void loadDataToCBB() {
        this.dcbm.removeAllElements();
        this.cbbChuyenDe.removeAllItems();
        ArrayList<ChuyenDe> listCD = new ArrayList<>();        
        try {
            listCD = this.cddao.selectALL();
            for (ChuyenDe cd : listCD) {
                this.dcbm.addElement(cd);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void loadDataToTable(String maCD) {
        ArrayList<KhoaHoc> listKH = new ArrayList<>();
        this.dtm.setRowCount(0);
        try {
            listKH = this.khdao.selectByQuery("SELECTBYMACD", maCD);
            if (listKH.size() <= 0) {
                clearForm();
                return;
            }
            for (KhoaHoc kh : listKH) {
                setDataRow(kh);
            }
            this.index = 0;
            updateStatus();
            showForm(index);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setDataRow(KhoaHoc kh) {
        String ngKG = DateHelper.toString(DateHelper.toDate(kh.getNgayKG(), "yyyy-MM-dd"), "dd/MM/yyyy");
        String ngTao = DateHelper.toString(DateHelper.toDate(kh.getNgayTao(), "yyyy-MM-dd"), "dd/MM/yyyy");
        dtm.addRow(new Object[]{
            kh.getMaKH(),
            kh.getThoiLuong(),
            kh.getHocPhi(),
            ngKG,
            Auth.nguoiDungHienTai.getHoTen(),
            ngTao,
            kh.getGhiChu()
        });
    }

    private void updateStatus() {
        //cập nhập trạng thái cho các button điều hướng
        boolean first = (this.index <= 0);
        boolean last = (this.index == tblKhoaHoc.getRowCount() - 1);
        this.btnSua.setEnabled(this.index >= 0);
        this.btnXoa.setEnabled(this.index >= 0);
        this.btnFirst.setEnabled(!first);
        this.btnpre.setEnabled(!first);
        this.btnLast.setEnabled(!last);
        this.btnNext.setEnabled(!last);
        if (index == -1) {
            this.tblKhoaHoc.setRowSelectionAllowed(false);
        } else {
            this.tblKhoaHoc.setRowSelectionAllowed(true);
        }
    }

    private void showForm(int i) {
        //hiển thị dữ liệu lên form tương ứng
        txtThoiLuong.setText(tblKhoaHoc.getValueAt(i, 1) + "");
        txtHocPhi.setText(tblKhoaHoc.getValueAt(i, 2) + "");
        this.txtNT.setText(tblKhoaHoc.getValueAt(i, 4) + "");
        this.txtKG.setText(tblKhoaHoc.getValueAt(i, 3) + "");
        this.txtNgayTao.setText(tblKhoaHoc.getValueAt(i, 5) + "");
        this.txtGhiChu.setText(tblKhoaHoc.getValueAt(i, 6) + "");
        this.tblKhoaHoc.setRowSelectionInterval(i, i);
    }

    private KhoaHoc getForm() {
        ChuyenDe cd = (ChuyenDe) this.cbbChuyenDe.getSelectedItem();
        String maCD = cd.getMaCD();
        float hocPhi = Float.parseFloat(this.txtHocPhi.getText());
        int thoiLuong = Integer.parseInt(this.txtThoiLuong.getText());
        String ngayKG = DateHelper.toString(DateHelper.toDate(this.txtKG.getText(), "dd/MM/yyyy"), "MM/dd/yyyy");
        String ghiChu = this.txtGhiChu.getText();
        String maNV = Auth.nguoiDungHienTai.getMaNV();
        String ngayTao = DateHelper.toString(new Date(), "MM/dd/yyyy");
        
        return new KhoaHoc(maCD, hocPhi, thoiLuong, ngayKG, ghiChu, maNV, ngayTao);
    }

    private void clearForm() {
        //xóa trắng form
        ChuyenDe cd = (ChuyenDe) this.cbbChuyenDe.getSelectedItem();
        this.txtKG.setText("");
        this.txtGhiChu.setText("");
        this.txtNgayTao.setText(DateHelper.toString(new Date(), "MM/dd/yyyy"));
        this.txtThoiLuong.setText(cd.getThoiLuong() + "");
        this.txtThoiLuong.setEditable(true);
        this.txtHocPhi.setText(cd.getHocPhi() + "");
        this.txtHocPhi.setEditable(true);
        this.txtNT.setText(Auth.nguoiDungHienTai.getHoTen());
        this.index = -1;
        updateStatus();
    }

    private boolean mouseClicked() {
        //xử lý sưk kiện click lên table
        this.txtThoiLuong.setEditable(false);
        this.txtHocPhi.setEditable(false);
        this.index = tblKhoaHoc.getSelectedRow();
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
        index = tblKhoaHoc.getRowCount() - 1;
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

    private boolean checkForm() {
        StringBuilder loi = new StringBuilder();
        if (MyValidate.isEmpty(txtHocPhi)) {
            loi.append("Bạn phải nhập học phí!");
        }else {
            try {
                double hp = Double.parseDouble(txtHocPhi.getText());
                if (hp < 3000) {
                    loi.append("Bạn phải nhập học phí > 3000!");
                }
            }catch( Exception ex){
                loi.append("Bạn phải nhập học phí đúng định dạng!");
            }
        }
        
        if (MyValidate.isEmpty(txtKG)) {
            loi.append("Bạn phải nhập ngày khai giảng!");
        } else {
            try {
                Date nkg = DateHelper.toDate(txtKG.getText(), "dd/MM/yyyy");
                Date now = new Date();
                if (nkg.before(now)) {
                    loi.append("Ngày khai giảng phải là ngày sau hiện tại");
                }
            } catch (Exception e) {
                e.printStackTrace();
                loi.append("Sai định dạng(dd/MM/yyyy)");
            }
        }
        
        if (MyValidate.isEmpty(txtThoiLuong)) {
            loi.append("Bạn phải nhập thời lượng khoá học!");
        }else {
            try {
                int tl = Integer.parseInt(txtThoiLuong.getText());
                if (tl < 40 || tl > 200) {
                    loi.append("Bạn phải nhập thời lượng > 40 và thời lượng < 200!");
                }
            }catch( Exception ex){
                loi.append("Bạn phải nhập thời lượng đúng định dạng!");
            }
        }
        //hiển thị thông báo lỗi
        if (loi.length() > 0) {
            MyMess.msgFalse(this, loi.toString());
            return true;
        }
        return false;
    }
    
    private void mouseHover() {
        //Hiệu ứng di chuột vào các button menu
        JButton[] btns = {btnFirst, btnLast, btnMoi, btnNext, btnSua, btnThem, btnLoadCD, btnXoa, btnpre};
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
                }

                @Override
                public void mouseExited(java.awt.event.MouseEvent e) {
                    btn.setBackground(new Color(255, 255, 255));
                }
            });
        }
    }
    
    private void statusButton() {
        if (!Auth.isManager()) {
            btnXoa.setEnabled(false);
        }
    }
}
