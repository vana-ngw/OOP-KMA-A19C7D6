/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package De2_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author chang
 */
public class TimKiemHangHoa extends javax.swing.JFrame {

    /**
     * Creates new form TimKiemHangHoa
     */
    public TimKiemHangHoa() {
        initComponents();
        setLocationRelativeTo(null);
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
        txtTimKiemHangHoa = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        txtKetQuaTimKiem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSapXep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIM KIEM HANG HOA");

        jLabel2.setText("Nhap Ma Hang Hoa Can Tim:");

        btnTimKiem.setText("Tim Kiem");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        txtKetQuaTimKiem.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SAP XEP HANG HOA");

        btnSapXep.setText("Sap Xep");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKetQuaTimKiem)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtTimKiemHangHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnTimKiem))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSapXep)
                .addGap(234, 234, 234))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTimKiemHangHoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addGap(36, 36, 36)
                .addComponent(txtKetQuaTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(btnSapXep)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        try {
            File file = new File("hanghoaDe2_1.txt");
            Scanner scanner = new Scanner(file);
            
            String timKiem = txtTimKiemHangHoa.getText().trim();
            int count = 0;
            
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                
                String[] parts = line.split("\\$");
                
                if(parts[2].equals(timKiem)){
                    boolean isString = false;
                
                    if(parts[parts.length - 1].contains(Character.toString('x'))){
                        isString = true;
                    }
                    
                    if(isString == true){
                        count = 1;
                        txtKetQuaTimKiem.setText("Loai Hang: " + parts[0] + ", Ten Hang: " + parts[1] + ", Ma Hang: " + parts[2] + ", Gia Nhap: " + parts[3] + ", Gia Ban: " + parts[4]+ ", Kich Thuoc Man Hinh: " + parts[6]);
                    }else{
                        count = 1;
                        txtKetQuaTimKiem.setText("Loai Hang: " + parts[0] + ", Ten Hang: " + parts[1] + ", Ma Hang: " + parts[2] + ", Gia Nhap: " + parts[3] + ", Gia Ban: " + parts[4]+ ", Gia Sim Ghep: " + parts[6]);
                    }
                }
            }
            if(count == 0){
                JOptionPane.showMessageDialog(rootPane, "Khong tim thay san pham!");
                txtKetQuaTimKiem.setText("");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger("Loi Khi Mo File" + ex.getMessage());
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        // TODO add your handling code here:
        ArrayList<HangHoa> danhSachHangHoa = new ArrayList<>();
        
        try{
            File file = new File("hanghoaDe2_1.txt");
            
            Scanner scanner = new Scanner(file);
            
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                
                String[] parts = line.split("\\$");
                
                boolean isString = false;
                
                if(parts[parts.length - 1].contains(Character.toString('x'))){
                    isString = true;
                }
                
                if(isString == false){
                    danhSachHangHoa.add(new DienThoai(parts[1], parts[2], Double.parseDouble(parts[3]), Double.parseDouble(parts[4]), Double.parseDouble(parts[5])));
                }
                else{
                    danhSachHangHoa.add(new MayTinhBang(parts[1], parts[2], Double.parseDouble(parts[3]), Double.parseDouble(parts[4]), parts[5]));
                }
            }
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }
        
        for(int i = 0; i < danhSachHangHoa.size(); i++){
            for(int j = i + 1; j < danhSachHangHoa.size(); j++){
                if(danhSachHangHoa.get(i).tinhLoiNhuan() > danhSachHangHoa.get(j).tinhLoiNhuan()){
                    Collections.swap(danhSachHangHoa, i, j);
                }
            }
        }
        
        for(HangHoa hh : danhSachHangHoa){
            System.out.println(hh);
        }
        JOptionPane.showMessageDialog(rootPane, "Da Sap Xep Thanh Cong! Vui long kiem tra man hinh Console.");
    }//GEN-LAST:event_btnSapXepActionPerformed

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
            java.util.logging.Logger.getLogger(TimKiemHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimKiemHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimKiemHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimKiemHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimKiemHangHoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtKetQuaTimKiem;
    private javax.swing.JTextField txtTimKiemHangHoa;
    // End of variables declaration//GEN-END:variables
}
