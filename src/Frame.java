/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Nilai = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        Absen = new javax.swing.JTextField();
        Mapel = new javax.swing.JTextField();
        Ok = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Hasil = new javax.swing.JTextArea();
        Hapus = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("PENILAIAN SISWA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 10, 130, 30);

        jLabel2.setText("Nilai");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 180, 80, 40);

        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 50, 80, 40);

        jLabel4.setText("Absen");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 90, 80, 40);

        jLabel6.setText("Mapel");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 130, 80, 40);

        Nilai.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(Nilai);
        Nilai.setBounds(140, 180, 160, 30);

        Nama.setBackground(new java.awt.Color(255, 255, 153));
        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });
        getContentPane().add(Nama);
        Nama.setBounds(140, 60, 160, 30);

        Absen.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(Absen);
        Absen.setBounds(140, 100, 160, 30);

        Mapel.setBackground(new java.awt.Color(255, 255, 153));
        Mapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MapelActionPerformed(evt);
            }
        });
        getContentPane().add(Mapel);
        Mapel.setBounds(140, 140, 160, 30);

        Ok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Ok.setText("Proses");
        Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkActionPerformed(evt);
            }
        });
        getContentPane().add(Ok);
        Ok.setBounds(170, 220, 70, 23);

        Hasil.setBackground(new java.awt.Color(255, 255, 153));
        Hasil.setColumns(20);
        Hasil.setRows(5);
        jScrollPane1.setViewportView(Hasil);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 250, 270, 130);

        Hapus.setBackground(new java.awt.Color(204, 204, 255));
        Hapus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Hapus);
        Hapus.setBounds(70, 220, 70, 23);

        Keluar.setBackground(new java.awt.Color(204, 204, 255));
        Keluar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar);
        Keluar.setBounds(270, 220, 70, 23);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 400);

        setBounds(0, 0, 416, 437);
    }// </editor-fold>//GEN-END:initComponents

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void MapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MapelActionPerformed

    private void OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkActionPerformed
        // TODO add your handling code here:
        String nama = Nama.getText();
        String absen = Absen.getText();
        String alamat = Mapel.getText();
        
        double nilai = Double.valueOf(Nilai.getText());
        String keterangan = "";
       
         if(nilai>=0 && nilai<75){
             keterangan = "Tidak Lulus";
         }
         else if(nilai>75 && nilai<100){
             keterangan = "Lulus";
         }
         else if(nilai==100){
             keterangan = "Sempurna";
         }
         else if (nilai>100){
             keterangan = "Amazing";
         }
         else {
             keterangan ="Belum mengisi Nilai";
         }

        Hasil.setText("Nama siswa : "+nama+"\n"+"Absen : "+absen+"\n"+"Alamat: "+alamat+"\n"+"Nilai : "+nilai+"\n"+"Keterangan : "+keterangan);

    }//GEN-LAST:event_OkActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        Hasil.setText("");
        Nama.setText("");
        Absen.setText("");
        Mapel.setText("");
        Nilai.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_HapusActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_KeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextArea Hasil;
    private javax.swing.JButton Keluar;
    private javax.swing.JTextField Mapel;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Nilai;
    private javax.swing.JButton Ok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
