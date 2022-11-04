/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MD5;

import java.awt.FileDialog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

/**
 *
 * @author QuocTrong
 */
public class CreateMD5 extends javax.swing.JFrame {

    /**
     * Creates new form CreateMD5
     */
    public CreateMD5() {
        initComponents();
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
        pnlDeCrypt = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtFileMH = new javax.swing.JTextField();
        btnBWMH = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtChuoi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnGiaima = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kiểm Tra MD5");

        pnlDeCrypt.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("File mã hóa");

        btnBWMH.setText("...");
        btnBWMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBWMHActionPerformed(evt);
            }
        });

        jLabel5.setText("MD5 gốc:");

        txtChuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChuoiActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));

        btnGiaima.setText("Tạo MD5");
        btnGiaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaimaActionPerformed(evt);
            }
        });

        jLabel2.setText("Tạo MD5");

        javax.swing.GroupLayout pnlDeCryptLayout = new javax.swing.GroupLayout(pnlDeCrypt);
        pnlDeCrypt.setLayout(pnlDeCryptLayout);
        pnlDeCryptLayout.setHorizontalGroup(
            pnlDeCryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDeCryptLayout.createSequentialGroup()
                .addGroup(pnlDeCryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDeCryptLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlDeCryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDeCryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtChuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDeCryptLayout.createSequentialGroup()
                                .addComponent(txtFileMH, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBWMH))))
                    .addGroup(pnlDeCryptLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                        .addGap(43, 43, 43)))
                .addGap(32, 32, 32))
            .addGroup(pnlDeCryptLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(btnGiaima)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDeCryptLayout.setVerticalGroup(
            pnlDeCryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDeCryptLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(pnlDeCryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFileMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBWMH))
                .addGap(18, 18, 18)
                .addGroup(pnlDeCryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(btnGiaima)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlDeCrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlDeCrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 83, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 83, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBWMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBWMHActionPerformed
        // TODO add your handling code here:
        File file = getFileDialogOpen("*.*");
        if(file == null) return;
        txtFileMH.setText(file.getAbsolutePath());
    }//GEN-LAST:event_btnBWMHActionPerformed

    private void txtChuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChuoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChuoiActionPerformed

    private void btnGiaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaimaActionPerformed
        // TODO add your handling code here:
        File file = new File(txtFileMH.getText());

        if(!file.exists()){
            JOptionPane.showMessageDialog(null, "File mã hóa không tồn tại hoặc không thể truy cập",
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String mahoa = readByteFile(file);
        txtChuoi.setText(getMd5(mahoa));
    }//GEN-LAST:event_btnGiaimaActionPerformed
     public static String getMd5(String input)
    {
        try {
  
            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
  
            // digest() method is called to calculate message digest
            //  of an input digest() return array of byte
            byte[] messageDigest = md.digest(input.getBytes());
  
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
  
            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } 
  
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
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
            java.util.logging.Logger.getLogger(CreateMD5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateMD5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateMD5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateMD5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateMD5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBWMH;
    private javax.swing.JButton btnGiaima;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel pnlDeCrypt;
    private javax.swing.JTextField txtChuoi;
    private javax.swing.JTextField txtFileMH;
    // End of variables declaration//GEN-END:variables
private File getFileDialogOpen(String string) {
        FileDialog fd = new FileDialog(this, "Chọn file", FileDialog.LOAD);
        fd.setFile(string);
        fd.setVisible(true);
        if (fd.getFile()==null) {
            return null;
        }
        File file = new File(fd.getDirectory()+fd.getFile());
        if(!file.canRead()){
            JOptionPane.showMessageDialog(null, "File bạn chọn không thể đọc.",
                    "Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return file;
    }
    
    private String readByteFile(File file) {
        String data=null;
        try {
            FileInputStream fi = new FileInputStream(file);
            int c,i=0;
          
            while((c = fi.read())!=-1)
            {
                data += c;
            }
            fi.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, file.getName()+" không thể đọc file",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return data;
    }
    private boolean writeByFile(String fileName, byte[]data){
        File file = new File(fileName);
        if(!file.canWrite()){
            try {
                file.createNewFile();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Không thể tạo file "+file.getName(),
                        "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        try {
            FileOutputStream fo = new FileOutputStream(file);
            fo.write(data);
            fo.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể ghi file "+file.getName(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    private Object readObjectFile(File file){
        Object obj;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            obj = (Object)ois.readObject();
            ois.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể đọc được file "+file.getName(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
        return obj;
    }
    private boolean writeObjectFile(String filename, Object data){
        File file = new File(filename);
        if(!file.canWrite()){
            try {
                file.createNewFile();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Không thể tạo được file "+file.getName(),
                        "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(data);
            oos.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể ghi dữ liệu lên file "+ file.getName(),
                    "Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    //</editor-fold>
}
