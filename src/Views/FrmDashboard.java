/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Factory.Factory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rahmat Subekti
 */
public class FrmDashboard extends javax.swing.JFrame {
    protected Factory data = new Factory();

    /**
     * Creates new form FrmDashboars
     */
    public FrmDashboard() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    private void showFrmPelanggan(){
        FrmPelanggan p = new FrmPelanggan();
        p.dash=this;
        p.setVisible(true);
        
    }
    private void showFrmPaket(){
        FrmPaket p = new FrmPaket();
        p.dash=this;
        p.setVisible(true);
        
    }
    private void showFrmTransaksi(){
        FrmTransaksi t= new FrmTransaksi();
        t.dash=this;
        t.setVisible(true);
        
    }
    private void showFrmLaporan(){
        FrmLaporan l= new FrmLaporan(null,true);
        l.dash=this;
        l.setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPelanggan = new javax.swing.JLabel();
        frmPaket = new javax.swing.JLabel();
        lblTransaksi = new javax.swing.JLabel();
        frmLaporan = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnMaster = new javax.swing.JMenu();
        mnPelanggan = new javax.swing.JMenuItem();
        mnPaket = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnExit = new javax.swing.JMenuItem();
        mnTransaksi = new javax.swing.JMenu();
        mnLaporan = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblPelanggan.setText("Pelanggan");
        lblPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPelangganMouseClicked(evt);
            }
        });

        frmPaket.setText("Paket");
        frmPaket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frmPaketMouseClicked(evt);
            }
        });

        lblTransaksi.setText("Transaksi");
        lblTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTransaksiMouseClicked(evt);
            }
        });

        frmLaporan.setText("Laporan");
        frmLaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frmLaporanMouseClicked(evt);
            }
        });

        mnMaster.setText("Master");

        mnPelanggan.setText("Pelanggan");
        mnPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPelangganActionPerformed(evt);
            }
        });
        mnMaster.add(mnPelanggan);

        mnPaket.setText("Paket");
        mnPaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPaketActionPerformed(evt);
            }
        });
        mnMaster.add(mnPaket);
        mnMaster.add(jSeparator1);

        mnExit.setText("Exit");
        mnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExitActionPerformed(evt);
            }
        });
        mnMaster.add(mnExit);

        jMenuBar1.add(mnMaster);

        mnTransaksi.setText("Transaksi");
        mnTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnTransaksiMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnTransaksi);

        mnLaporan.setText("Laporan");
        mnLaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnLaporanMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnLaporan);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPelanggan)
                    .addComponent(lblTransaksi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frmLaporan)
                    .addComponent(frmPaket))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frmPaket)
                    .addComponent(lblPelanggan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frmLaporan)
                    .addComponent(lblTransaksi))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnTransaksiMouseClicked
        // TODO add your handling code here:
        showFrmTransaksi();
    }//GEN-LAST:event_mnTransaksiMouseClicked

    private void lblPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPelangganMouseClicked
        // TODO add your handling code here:
        showFrmPelanggan();
    }//GEN-LAST:event_lblPelangganMouseClicked

    private void mnLaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnLaporanMouseClicked
        // TODO add your handling code here:
        showFrmLaporan();
    }//GEN-LAST:event_mnLaporanMouseClicked

    private void lblTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTransaksiMouseClicked
        // TODO add your handling code here:
        showFrmTransaksi();
    }//GEN-LAST:event_lblTransaksiMouseClicked

    private void frmPaketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frmPaketMouseClicked
        // TODO add your handling code here:
        showFrmPaket();
    }//GEN-LAST:event_frmPaketMouseClicked

    private void frmLaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frmLaporanMouseClicked
        // TODO add your handling code here:
        showFrmLaporan();
    }//GEN-LAST:event_frmLaporanMouseClicked

    private void mnPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPelangganActionPerformed
        // TODO add your handling code here:
        showFrmPelanggan();
    }//GEN-LAST:event_mnPelangganActionPerformed

    private void mnPaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPaketActionPerformed
        // TODO add your handling code here:
        showFrmPaket();
    }//GEN-LAST:event_mnPaketActionPerformed

    private void mnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExitActionPerformed
        // TODO add your handling code here:    
        FrmLogin l= new FrmLogin();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnExitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            // write object to file
            FileOutputStream fos = new FileOutputStream("data.laundry");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(data);
            oos.close();
	} catch (FileNotFoundException e) {
            e.printStackTrace();
	} catch (IOException e) {
            e.printStackTrace();
	}
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        if (new File("data.laundry").isFile()) {
            try {
                // read object from file
                FileInputStream fis = new FileInputStream("data.laundry");
                ObjectInputStream ois = new ObjectInputStream(fis);
                this.data = (Factory) ois.readObject();
                ois.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Selamat bekerja dengan laundry anda\n"
                    + "dan kami akan menyimpan semua data\n"
                    + "yang berguna bagi anda", "Selamat Datang", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FrmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel frmLaporan;
    private javax.swing.JLabel frmPaket;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblPelanggan;
    private javax.swing.JLabel lblTransaksi;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JMenu mnLaporan;
    private javax.swing.JMenu mnMaster;
    private javax.swing.JMenuItem mnPaket;
    private javax.swing.JMenuItem mnPelanggan;
    private javax.swing.JMenu mnTransaksi;
    // End of variables declaration//GEN-END:variables
}
