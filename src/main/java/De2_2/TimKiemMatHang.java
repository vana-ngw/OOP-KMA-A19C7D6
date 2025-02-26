/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package De2_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author An Nguyen Van
 */
public class TimKiemMatHang extends javax.swing.JFrame {

    /**
     * Creates new form TimKiemMatHang
     */
    
    private DefaultTableModel tableModel;
    
    public TimKiemMatHang() {
        initComponents();
        setLocationRelativeTo(null);
        tableModel = (DefaultTableModel) tblMatHang.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTimKiemMatHang = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatHang = new javax.swing.JTable();
        btnSapXep = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIM KIEM MAT HANG");

        jLabel2.setText("Nhap Ma Hang Can Tim Kiem");

        btnTimKiem.setText("Tim Kiem");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        tblMatHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TenMatHang", "MaHang", "SoLuong", "GiaVon", "TYLEGIAVON", "Options", "TinhGia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMatHang);

        btnSapXep.setText("Sap Xep");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        btnDong.setText("Dong");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimKiemMatHang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnTimKiem)
                        .addGap(18, 18, 18)
                        .addComponent(btnSapXep)
                        .addGap(18, 18, 18)
                        .addComponent(btnDong))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTimKiemMatHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem)
                    .addComponent(btnSapXep)
                    .addComponent(btnDong))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        ArrayList<MatHang> danhSachMatHang = new ArrayList<>();
        try{
            File file = new File("mathangDe2_2.txt");
            
            Scanner scanner = new Scanner(file);
            
            String maHangTimKiem = txtTimKiemMatHang.getText().trim();
            int isCheck = 0;
            
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                
                String[] parts = line.split("\\$");
                
                if(parts[2].equals(maHangTimKiem)){
                    isCheck = 1;
                    
                    if(parts[0].equals("MonAn")){
                        MonAn monAn = new MonAn();
                        monAn.setTenMatHang(parts[1]);
                        monAn.setMaHang(parts[2]);
                        monAn.setSoLuong(Integer.parseInt(parts[3]));
                        monAn.setGiaVon(Double.parseDouble(parts[4]));
                        monAn.setCanTrinhDien(Boolean.parseBoolean(parts[6]));
                        
                        if(monAn.isCanTrinhDien() == true){
                            if(tableModel.getRowCount() > 0){
                                tableModel.removeRow(0);
                            }
                            
                            Object[] row = new Object[]{
                                monAn.getTenMatHang(), monAn.getMaHang(), monAn.getSoLuong(), monAn.getGiaVon(), monAn.TY_LE_GIA_VON, "CoTrinhDien" ,monAn.tinhGiaTrenMenu()
                            };
                            tableModel.addRow(row);
                            tableModel.fireTableDataChanged();
                            
                            txtTimKiemMatHang.setText("");
                        }
                        else if(monAn.isCanTrinhDien() == false){
                            if(tableModel.getRowCount() > 0){
                                tableModel.removeRow(0);
                            }
                            
                            Object[] row = new Object[]{
                                monAn.getTenMatHang(), monAn.getMaHang(), monAn.getSoLuong(), monAn.getGiaVon(), monAn.TY_LE_GIA_VON, "KhongTrinhDien" ,monAn.tinhGiaTrenMenu()
                            };
                            tableModel.addRow(row);
                            tableModel.fireTableDataChanged();
                            
                            txtTimKiemMatHang.setText("");
                        }
                    }
                    else if(parts[0].equals("DoUong")){
                        DoUong doUong = new DoUong();
                        doUong.setTenMatHang(parts[1]);
                        doUong.setMaHang(parts[2]);
                        doUong.setSoLuong(Integer.parseInt(parts[3]));
                        doUong.setGiaVon(Double.parseDouble(parts[4]));
                        doUong.setCoNongKhong(Boolean.parseBoolean(parts[6]));
                        
                        if(doUong.isCoNongKhong() == true){
                            if(tableModel.getRowCount() > 0){
                                tableModel.removeRow(0);
                            }
                            
                            Object[] row = new Object[]{
                                doUong.getTenMatHang(), doUong.getMaHang(), doUong.getSoLuong(), doUong.getGiaVon(), doUong.TY_LE_GIA_VON, "CoNong",doUong.tinhGiaTrenMenu()
                            };

                            tableModel.addRow(row);
                            tableModel.fireTableDataChanged();
                            
                            txtTimKiemMatHang.setText("");
                        }
                        else if(doUong.isCoNongKhong() == false){
                            if(tableModel.getRowCount() > 0){
                                tableModel.removeRow(0);
                            }
                            
                            Object[] row = new Object[]{
                                doUong.getTenMatHang(), doUong.getMaHang(), doUong.getSoLuong(), doUong.getGiaVon(), doUong.TY_LE_GIA_VON, "KhongNong",doUong.tinhGiaTrenMenu()
                            };

                            tableModel.addRow(row);
                            tableModel.fireTableDataChanged();
                            
                            txtTimKiemMatHang.setText("");
                        }
                    }
                }
            }
            if(isCheck == 0){
                JOptionPane.showMessageDialog(rootPane, "Khong tim thay mat hang tren! Vui long thu lai");
                txtTimKiemMatHang.setText("");
            }
        }catch(FileNotFoundException ex){
            System.out.println("Loi khi mo File" + ex);
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        // TODO add your handling code here:
        tableModel.removeRow(0);
        
        try{
            ArrayList<MatHang> danhSachMatHang = new ArrayList<>();
            File file = new File("mathangDe2_2.txt");
            
            Scanner scanner = new Scanner(file);
            
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                
                String[] parts = line.split("\\$");
                
                if(parts[0].equals("MonAn")){
                    MonAn monAn = new MonAn();
                    monAn.setTenMatHang(parts[1]);
                    monAn.setMaHang(parts[2]);
                    monAn.setSoLuong(Integer.parseInt(parts[3]));
                    monAn.setGiaVon(Double.parseDouble(parts[4]));
                    monAn.setCanTrinhDien(Boolean.parseBoolean(parts[6]));
                    
                    danhSachMatHang.add(monAn);
                }
                else if(parts[0].equals("DoUong")){
                    DoUong doUong = new DoUong();
                    doUong.setTenMatHang(parts[1]);
                    doUong.setMaHang(parts[2]);
                    doUong.setSoLuong(Integer.parseInt(parts[3]));
                    doUong.setGiaVon(Double.parseDouble(parts[4]));
                    doUong.setCoNongKhong(Boolean.parseBoolean(parts[6]));

                    danhSachMatHang.add(doUong);
                }
            }
            
            for(int i=0 ; i<danhSachMatHang.size(); i++){
                for(int j=i+1; j<danhSachMatHang.size(); j++){
                    if(danhSachMatHang.get(i).tinhGiaTrenMenu() < danhSachMatHang.get(j).tinhGiaTrenMenu()){
                        Collections.swap(danhSachMatHang, i, j);
                    }
                }
            }

            for(MatHang mh : danhSachMatHang){
                Object[] row = new Object[]{
                    mh.getTenMatHang(), mh.getMaHang(), mh.getSoLuong(), mh.getGiaVon(), mh.TY_LE_GIA_VON, "options",mh.tinhGiaTrenMenu()
                };
                tableModel.addRow(row);
                tableModel.fireTableDataChanged();
            }
        }catch(FileNotFoundException ex){
            System.out.println("Loi khi mo File" + ex);
        }
    }//GEN-LAST:event_btnSapXepActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnDongActionPerformed

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
            java.util.logging.Logger.getLogger(TimKiemMatHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimKiemMatHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimKiemMatHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimKiemMatHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimKiemMatHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMatHang;
    private javax.swing.JTextField txtTimKiemMatHang;
    // End of variables declaration//GEN-END:variables
}
