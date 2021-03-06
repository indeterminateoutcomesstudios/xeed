/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * frmOptions.java
 *
 * Created on 2010-dec-05, 18:20:21
 */
package forms;

import xeed.XEED;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author Erik
 */
public class OptionsForm extends javax.swing.JFrame {

    /**
     * Creates new form frmOptions
     */
    public OptionsForm() {
        initComponents();

        try {
            ArrayList<Image> images = new ArrayList(0);
            images.add(ImageIO.read(this.getClass().getResource("/icon.png")));
            images.add(ImageIO.read(this.getClass().getResource("/wrench.png")));
            this.setIconImages(images);
        } catch (IOException e) {
        }
        chkBackup.setSelected(XEED.boolBackup);
        chkUpdate.setSelected(XEED.boolUpdate);
        tglbtnAssociate.setSelected(XEED.Associated);
        chkResizeImages.setSelected(XEED.boolResize);
        chkUseCustomRepository.setSelected(XEED.boolCustomRepository);
        txtRepository.setEnabled(XEED.boolCustomRepository);
        txtRepository.setText(XEED.szCustomReposityURL);
        chkUpdateToBeta.setSelected(XEED.boolUpdateToBeta);
        chkCustomTemplateFolder.setSelected(XEED.boolCustomTemplateFolder);
        if (XEED.boolCustomTemplateFolder) {
            txtCustomTemplateFolder.setText(XEED.szTemplateFolder);
        }

        if (XEED.Associated) {
            chkReassociate.setSelected(XEED.ReAssociate);
            chkReassociate.setEnabled(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jTabbedPane1 = new javax.swing.JTabbedPane();
      jPanel3 = new javax.swing.JPanel();
      chkReassociate = new javax.swing.JCheckBox();
      chkBackup = new javax.swing.JCheckBox();
      tglbtnAssociate = new javax.swing.JToggleButton();
      jPanel1 = new javax.swing.JPanel();
      chkUseCustomRepository = new javax.swing.JCheckBox();
      chkResizeImages = new javax.swing.JCheckBox();
      txtRepository = new javax.swing.JTextField();
      lblCheckRepository = new javax.swing.JLabel();
      chkCustomTemplateFolder = new javax.swing.JCheckBox();
      txtCustomTemplateFolder = new javax.swing.JTextField();
      jPanel2 = new javax.swing.JPanel();
      btnUpdate = new javax.swing.JButton();
      chkUpdate = new javax.swing.JCheckBox();
      chkUpdateToBeta = new javax.swing.JCheckBox();

      setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
      setTitle("Options");
      setLocationByPlatform(true);
      setResizable(false);
      addWindowListener(new java.awt.event.WindowAdapter() {
         public void windowClosing(java.awt.event.WindowEvent evt) {
            formWindowClosing(evt);
         }
      });

      chkReassociate.setText("Reassociation on start-up (not recommended)");
      chkReassociate
            .setToolTipText("The file association is updated each time XEED is started. This is normally not needed.");
      chkReassociate.setEnabled(false);
      chkReassociate.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            chkReassociateActionPerformed(evt);
         }
      });

      chkBackup.setText("Back-up when overwriting a setting file");
      chkBackup.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            chkBackupActionPerformed(evt);
         }
      });

      tglbtnAssociate.setText("Associate with .xdf files");
      tglbtnAssociate.setToolTipText("When enabled .xdf files are clickable.");
      tglbtnAssociate.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            tglbtnAssociateActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout
            .setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(
                        jPanel3Layout
                              .createSequentialGroup()
                              .addContainerGap()
                              .addGroup(
                                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(chkBackup).addComponent(chkReassociate)
                                          .addComponent(tglbtnAssociate)).addContainerGap(24, Short.MAX_VALUE)));
      jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                  jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(tglbtnAssociate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkReassociate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(chkBackup)
                        .addContainerGap(75, Short.MAX_VALUE)));

      jTabbedPane1.addTab("General", jPanel3);

      chkUseCustomRepository.setText("Use custom template repository");
      chkUseCustomRepository
            .setToolTipText("If yes, XEED will not check for templates from the official source but rather an alterative one.");
      chkUseCustomRepository.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            chkUseCustomRepositoryActionPerformed(evt);
         }
      });

      chkResizeImages.setSelected(true);
      chkResizeImages.setText("Resize images");
      chkResizeImages
            .setToolTipText("If no, then XEED will save images in character sheets in their origianl size and resize on the fly. This is good if you intend to export images from xeed. However saving and loading will be slower.");
      chkResizeImages.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            chkResizeImagesActionPerformed(evt);
         }
      });

      txtRepository.setToolTipText("An URL to a list of XEED templates.");
      txtRepository.setEnabled(false);
      txtRepository.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusLost(java.awt.event.FocusEvent evt) {
            txtRepositoryFocusLost(evt);
         }
      });
      txtRepository.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyReleased(java.awt.event.KeyEvent evt) {
            txtRepositoryKeyReleased(evt);
         }
      });

      chkCustomTemplateFolder.setText("Use custom template folder");
      chkCustomTemplateFolder
            .setToolTipText("If checked you will be able to change the template folder. The default one is \\Templates\\");
      chkCustomTemplateFolder.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            chkCustomTemplateFolderActionPerformed(evt);
         }
      });

      txtCustomTemplateFolder
            .setToolTipText("The path to the folder were downloaded templates will be saved and XEED will also detect the templates in the folder automaticly.");
      txtCustomTemplateFolder.setEnabled(false);
      txtCustomTemplateFolder.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyReleased(java.awt.event.KeyEvent evt) {
            txtCustomTemplateFolderKeyReleased(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                  jPanel1Layout
                        .createSequentialGroup()
                        .addContainerGap()
                        .addGroup(
                              jPanel1Layout
                                    .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(
                                          jPanel1Layout
                                                .createSequentialGroup()
                                                .addGroup(
                                                      jPanel1Layout
                                                            .createParallelGroup(
                                                                  javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(chkCustomTemplateFolder)
                                                            .addComponent(chkResizeImages)
                                                            .addComponent(chkUseCustomRepository))
                                                .addGap(0, 82, Short.MAX_VALUE))
                                    .addGroup(
                                          jPanel1Layout
                                                .createSequentialGroup()
                                                .addGroup(
                                                      jPanel1Layout
                                                            .createParallelGroup(
                                                                  javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(txtCustomTemplateFolder,
                                                                  javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtRepository))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblCheckRepository))).addContainerGap()));
      jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  jPanel1Layout
                        .createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chkResizeImages)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkUseCustomRepository)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(
                              jPanel1Layout
                                    .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRepository, javax.swing.GroupLayout.PREFERRED_SIZE,
                                          javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCheckRepository, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                                          javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkCustomTemplateFolder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCustomTemplateFolder, javax.swing.GroupLayout.PREFERRED_SIZE,
                              javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(38, Short.MAX_VALUE)));

      jTabbedPane1.addTab("Templates", jPanel1);

      btnUpdate.setText("Check for updates now");
      btnUpdate.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnUpdateActionPerformed(evt);
         }
      });

      chkUpdate.setText("Check for updates on start-up");
      chkUpdate.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            chkUpdateActionPerformed(evt);
         }
      });

      chkUpdateToBeta.setText("Update to beta versions");
      chkUpdateToBeta
            .setToolTipText("Update to the latest version even if it is a beta, i.e. an unfinished testing version.");
      chkUpdateToBeta.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            chkUpdateToBetaActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                  jPanel2Layout
                        .createSequentialGroup()
                        .addContainerGap()
                        .addGroup(
                              jPanel2Layout
                                    .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUpdate)
                                    .addGroup(
                                          jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(chkUpdateToBeta,
                                                      javax.swing.GroupLayout.Alignment.LEADING,
                                                      javax.swing.GroupLayout.DEFAULT_SIZE,
                                                      javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(chkUpdate, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(98, Short.MAX_VALUE)));
      jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                  jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(chkUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkUpdateToBeta).addContainerGap(78, Short.MAX_VALUE)));

      jTabbedPane1.addTab("Updates", jPanel2);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
            jTabbedPane1));
      layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
            jTabbedPane1));

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

       XEED.ReadWriteOptions(true);
       XEED.hwndOption = null;
       dispose();
   }//GEN-LAST:event_formWindowClosing

   private void chkUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkUpdateActionPerformed
       XEED.boolUpdate = chkUpdate.isSelected();
   }//GEN-LAST:event_chkUpdateActionPerformed

   private void tglbtnAssociateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglbtnAssociateActionPerformed

       String os = System.getProperty("os.name");
       if (!os.toLowerCase().contains("windows")) {
           JOptionPane.showMessageDialog(null, "The file association feature only works on windows.",
                   "Unsupported platform!", JOptionPane.WARNING_MESSAGE);
           tglbtnAssociate.setSelected(false);
           return;
       }

       if (tglbtnAssociate.isSelected()) {
           int intRet = JOptionPane
                   .showOptionDialog(
                           null,
                           "Creating a file association will make the .xdf files runnable.\nHowever they will be associated with this xeed file. If it moved or deleted the association will be invalid.\nPrevious .xdf associations will be overwritten.\nDo you want to proceed?",
                           "Associate with .xdf?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
           if (intRet == 0) {
               if (!XEED.UpdateAssociation(true)) {
                   tglbtnAssociate.setSelected(false);
                   chkReassociate.setSelected(false);
               }
               chkReassociate.setEnabled(true);
           } else {
               tglbtnAssociate.setSelected(false);
               chkReassociate.setSelected(false);
               chkReassociate.setEnabled(false);
               return;
           }
       } else {
           XEED.UpdateAssociation(false);
           chkReassociate.setSelected(false);
           chkReassociate.setEnabled(false);
       }

       XEED.Associated = tglbtnAssociate.isSelected();

   }//GEN-LAST:event_tglbtnAssociateActionPerformed

   private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

       UpdateForm u = new UpdateForm();
       u.CheckForUpdates(true);

   }//GEN-LAST:event_btnUpdateActionPerformed

   private void chkUseCustomRepositoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkUseCustomRepositoryActionPerformed
       XEED.boolCustomRepository = chkUseCustomRepository.isSelected();
       if (XEED.boolCustomRepository) {
           txtRepository.setEnabled(true);
       } else {
           txtRepository.setEnabled(false);
           txtRepository.setText("");
           XEED.szCustomReposityURL = "";
       }
   }//GEN-LAST:event_chkUseCustomRepositoryActionPerformed

   private void chkReassociateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkReassociateActionPerformed
       XEED.ReAssociate = chkReassociate.isSelected();
   }//GEN-LAST:event_chkReassociateActionPerformed

   private void chkBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBackupActionPerformed
       XEED.boolBackup = chkBackup.isSelected();
   }//GEN-LAST:event_chkBackupActionPerformed

   private void chkResizeImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkResizeImagesActionPerformed
       XEED.boolResize = chkResizeImages.isSelected();
       if (!XEED.boolResize) {
           JOptionPane
                   .showMessageDialog(
                           null,
                           "Warning! Saving large images in XEED makes loading and saving slower and may lead to unexpected consequences.\nTo reiterate, it is HIGHLY recommended that you leave it checked.",
                           "Warning", JOptionPane.WARNING_MESSAGE);
       }
   }//GEN-LAST:event_chkResizeImagesActionPerformed

   private void chkUpdateToBetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkUpdateToBetaActionPerformed
       XEED.boolUpdateToBeta = chkUpdateToBeta.isSelected();
   }//GEN-LAST:event_chkUpdateToBetaActionPerformed

   private void txtRepositoryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRepositoryKeyReleased
       if (XEED.boolCustomRepository) {
           XEED.szCustomReposityURL = txtRepository.getText();
       }
   }//GEN-LAST:event_txtRepositoryKeyReleased

   private void txtRepositoryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRepositoryFocusLost
       if (XEED.TestRepository(txtRepository.getText())) {
           lblCheckRepository.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accept.png")));
       } else {
           lblCheckRepository.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png")));
       }
   }//GEN-LAST:event_txtRepositoryFocusLost

   private void chkCustomTemplateFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCustomTemplateFolderActionPerformed

       XEED.boolCustomTemplateFolder = chkCustomTemplateFolder.isSelected();
       if (XEED.boolCustomTemplateFolder) {
           txtCustomTemplateFolder.setEnabled(true);
       } else {
           txtCustomTemplateFolder.setEnabled(false);
           txtCustomTemplateFolder.setText("");
           XEED.szTemplateFolder = XEED.GetCurrentDirectory() + File.separator + "Templates";
       }

   }//GEN-LAST:event_chkCustomTemplateFolderActionPerformed

   private void txtCustomTemplateFolderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomTemplateFolderKeyReleased
       if (XEED.boolCustomTemplateFolder) {
           XEED.szTemplateFolder = txtCustomTemplateFolder.getText();
       }
   }//GEN-LAST:event_txtCustomTemplateFolderKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables

   private javax.swing.JButton btnUpdate;
   private javax.swing.JCheckBox chkBackup;
   private javax.swing.JCheckBox chkCustomTemplateFolder;
   private javax.swing.JCheckBox chkReassociate;
   private javax.swing.JCheckBox chkResizeImages;
   private javax.swing.JCheckBox chkUpdate;
   private javax.swing.JCheckBox chkUpdateToBeta;
   private javax.swing.JCheckBox chkUseCustomRepository;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JTabbedPane jTabbedPane1;
   private javax.swing.JLabel lblCheckRepository;
   private javax.swing.JToggleButton tglbtnAssociate;
   private javax.swing.JTextField txtCustomTemplateFolder;
   private javax.swing.JTextField txtRepository;
   // End of variables declaration//GEN-END:variables
}
