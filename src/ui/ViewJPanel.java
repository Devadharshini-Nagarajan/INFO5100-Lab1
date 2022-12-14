/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import model.User;

/**
 *
 * @author deva
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    User user;
    public ViewJPanel(User user) {
        this.user = user;
        initComponents();
        displayUser();
    }
    
    public void displayUser () {
        jTextfirstName.setText(user.getFirstName());
        jTextlastName.setText(user.getLastName());
        jTextdob.setText(user.getDob());
        jTextage.setText(user.getAge());
        jTexttelephoneNo.setText(user.getTelephoneNo());
        jTextemail.setText(user.getEmail());
        jTextstreetLine1.setText(user.getStreetLine1());
        jTextstreetLine2.setText(user.getStreetLine2());
        jTextcity.setText(user.getCity());
        jTextcountry.setText(user.getCountry());
        jTextaffiliation.setText(user.getAffiliation());
        jTextmajor.setText(user.getMajor());
        jTextcareer.setText(user.getCareer());
        jTextdegree1.setText(user.getDegree1());
        jTextdegree1Start.setText(user.getDegree1Start());
        jTextdegree1End.setText(user.getDegree1End());
        jTextdegree2.setText(user.getDegree2());
        jTextdegree2Start.setText(user.getDegree2Start());
        jTextdegree2End.setText(user.getDegree2End());
        if(user.getPhoto() != null) {
            ImageIcon icon = new ImageIcon(user.getPhoto().toString());
            Image img = icon.getImage();
            Image imgScale = img.getScaledInstance(jTextPhoto.getWidth(),jTextPhoto.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(imgScale);
            jTextPhoto.setIcon(scaledIcon);
            
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

        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextcountry = new javax.swing.JTextField();
        jTextdegree2Start = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextdob = new javax.swing.JTextField();
        jTextaffiliation = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextage = new javax.swing.JTextField();
        jTextmajor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTexttelephoneNo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextdegree2End = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextcareer = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextemail = new javax.swing.JTextField();
        jTextdegree1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextfirstName = new javax.swing.JTextField();
        jTextstreetLine1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextlastName = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextdegree1Start = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextstreetLine2 = new javax.swing.JTextField();
        jTextdegree1End = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextcity = new javax.swing.JTextField();
        jTextdegree2 = new javax.swing.JTextField();
        jTextPhoto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel14.setText("Country");

        jLabel22.setText("Degree 2 Start");

        jTextcountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextcountryActionPerformed(evt);
            }
        });

        jTextdegree2Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextdegree2StartActionPerformed(evt);
            }
        });

        jLabel5.setText("DOB");

        jLabel15.setText("Affiliation");

        jTextdob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextdobActionPerformed(evt);
            }
        });

        jTextaffiliation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextaffiliationActionPerformed(evt);
            }
        });

        jLabel6.setText("Age");

        jLabel16.setText("Major");

        jTextage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextageActionPerformed(evt);
            }
        });

        jTextmajor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextmajorActionPerformed(evt);
            }
        });

        jLabel7.setText("Telephone Number");

        jTexttelephoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexttelephoneNoActionPerformed(evt);
            }
        });

        jLabel23.setText("Degree 2 End");

        jTextdegree2End.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextdegree2EndActionPerformed(evt);
            }
        });

        jLabel24.setText("Photo");

        jLabel17.setText("Career");

        jTextcareer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextcareerActionPerformed(evt);
            }
        });

        jLabel8.setText("Email");

        jLabel18.setText("Degree 1");

        jTextemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextemailActionPerformed(evt);
            }
        });

        jTextdegree1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextdegree1ActionPerformed(evt);
            }
        });

        jLabel3.setText("First Name");

        jLabel10.setText("Street Line 1");

        jTextfirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextfirstNameActionPerformed(evt);
            }
        });

        jTextstreetLine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextstreetLine1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Last Name");

        jTextlastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextlastNameActionPerformed(evt);
            }
        });

        jLabel19.setText("Degree 1 Start");

        jTextdegree1Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextdegree1StartActionPerformed(evt);
            }
        });

        jLabel12.setText("Street Line 2");

        jLabel20.setText("Degree 1 End");

        jTextstreetLine2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextstreetLine2ActionPerformed(evt);
            }
        });

        jTextdegree1End.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextdegree1EndActionPerformed(evt);
            }
        });

        jLabel13.setText("City");

        jLabel21.setText("Degree 2");

        jTextcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextcityActionPerformed(evt);
            }
        });

        jTextdegree2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextdegree2ActionPerformed(evt);
            }
        });

        jTextPhoto.setMaximumSize(new java.awt.Dimension(130, 130));
        jTextPhoto.setMinimumSize(new java.awt.Dimension(130, 130));
        jTextPhoto.setSize(new java.awt.Dimension(130, 130));

        jPanel1.setBackground(new java.awt.Color(63, 81, 181));

        jLabel1.setBackground(new java.awt.Color(63, 81, 181));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextfirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextdob, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTexttelephoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextstreetLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jTextcity, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jTextaffiliation, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jTextcareer, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jTextdegree1Start, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jTextdegree2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jTextdegree2End, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextlastName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jTextage, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jTextemail, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jTextstreetLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jTextcountry, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jTextmajor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(jTextdegree1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(jTextdegree1End, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(jTextdegree2Start, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jTextPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextfirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTexttelephoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextstreetLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextaffiliation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextcareer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextdegree1Start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextdegree2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextlastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextstreetLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextcountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextmajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextdegree1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextdegree1End, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextdegree2Start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextdegree2End, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 107, Short.MAX_VALUE))
                    .addComponent(jTextPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextcountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextcountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextcountryActionPerformed

    private void jTextdegree2StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextdegree2StartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextdegree2StartActionPerformed

    private void jTextdobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextdobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextdobActionPerformed

    private void jTextaffiliationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextaffiliationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextaffiliationActionPerformed

    private void jTextageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextageActionPerformed

    private void jTextmajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextmajorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextmajorActionPerformed

    private void jTexttelephoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexttelephoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexttelephoneNoActionPerformed

    private void jTextdegree2EndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextdegree2EndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextdegree2EndActionPerformed

    private void jTextcareerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextcareerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextcareerActionPerformed

    private void jTextemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextemailActionPerformed

    private void jTextdegree1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextdegree1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextdegree1ActionPerformed

    private void jTextfirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextfirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextfirstNameActionPerformed

    private void jTextstreetLine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextstreetLine1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextstreetLine1ActionPerformed

    private void jTextlastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextlastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextlastNameActionPerformed

    private void jTextdegree1StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextdegree1StartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextdegree1StartActionPerformed

    private void jTextstreetLine2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextstreetLine2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextstreetLine2ActionPerformed

    private void jTextdegree1EndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextdegree1EndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextdegree1EndActionPerformed

    private void jTextcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextcityActionPerformed

    private void jTextdegree2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextdegree2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextdegree2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jTextPhoto;
    private javax.swing.JTextField jTextaffiliation;
    private javax.swing.JTextField jTextage;
    private javax.swing.JTextField jTextcareer;
    private javax.swing.JTextField jTextcity;
    private javax.swing.JTextField jTextcountry;
    private javax.swing.JTextField jTextdegree1;
    private javax.swing.JTextField jTextdegree1End;
    private javax.swing.JTextField jTextdegree1Start;
    private javax.swing.JTextField jTextdegree2;
    private javax.swing.JTextField jTextdegree2End;
    private javax.swing.JTextField jTextdegree2Start;
    private javax.swing.JTextField jTextdob;
    private javax.swing.JTextField jTextemail;
    private javax.swing.JTextField jTextfirstName;
    private javax.swing.JTextField jTextlastName;
    private javax.swing.JTextField jTextmajor;
    private javax.swing.JTextField jTextstreetLine1;
    private javax.swing.JTextField jTextstreetLine2;
    private javax.swing.JTextField jTexttelephoneNo;
    // End of variables declaration//GEN-END:variables
}
