/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author surendra
 */
public class GadgetsInfo extends javax.swing.JFrame {

    /**
     * Creates new form GadgetsInfo
     */
    public GadgetsInfo() {
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

        jTextField1 = new javax.swing.JTextField();
        review = new javax.swing.JLabel();
        lblrating = new javax.swing.JLabel();
        rating = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        yes = new javax.swing.JRadioButton();
        NO = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        submit1 = new javax.swing.JButton();
        txtreview = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        price = new javax.swing.JLabel();
        txtcomp = new javax.swing.JTextField();
        txtspecs = new javax.swing.JTextField();
        txtweight = new javax.swing.JTextField();
        info = new javax.swing.JLabel();
        size = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        txttype = new javax.swing.JTextField();
        specs = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        company = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtpid = new javax.swing.JTextField();
        txtpower = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        review1 = new javax.swing.JLabel();
        lblrating1 = new javax.swing.JLabel();
        rating1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        yes1 = new javax.swing.JRadioButton();
        NO1 = new javax.swing.JRadioButton();
        txtreview1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        review.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        review.setText("Review");

        lblrating.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblrating.setText("Rating in star");

        rating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "4", "3", "2", "1" }));
        rating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Gadgets review");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Value for money");

        yes.setText("YES");

        NO.setText("NO");
        NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("FINISH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        submit1.setBackground(new java.awt.Color(204, 255, 255));
        submit1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        submit1.setText("Submit");
        submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit1ActionPerformed(evt);
            }
        });

        txtreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreviewActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        price.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        price.setText("Price");

        txtcomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcompActionPerformed(evt);
            }
        });

        info.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        info.setForeground(new java.awt.Color(204, 0, 0));
        info.setText("GADGETS INFO");

        size.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        size.setText("Weight (in gms)");

        gender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        gender.setText("Power (in W)");

        txttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttypeActionPerformed(evt);
            }
        });

        specs.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        specs.setText("Specs");

        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });

        company.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        company.setText("Company");

        type.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        type.setText("Type");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Product ID");

        submit.setBackground(new java.awt.Color(204, 255, 255));
        submit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Name");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        review1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        review1.setText("Review");

        lblrating1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblrating1.setText("Rating in star");

        rating1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "4", "3", "2", "1" }));
        rating1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rating1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Gadgets review");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Value for money");

        buttonGroup1.add(yes1);
        yes1.setText("YES");

        buttonGroup1.add(NO1);
        NO1.setText("NO");
        NO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO1ActionPerformed(evt);
            }
        });

        txtreview1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreview1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Finish");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(specs)
                                    .addComponent(company)
                                    .addComponent(size)
                                    .addComponent(gender)
                                    .addComponent(price)
                                    .addComponent(type)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtprice, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(txtcomp)
                                    .addComponent(txtspecs)
                                    .addComponent(txtweight)
                                    .addComponent(txttype)
                                    .addComponent(txtpid)
                                    .addComponent(txtpower)
                                    .addComponent(txtname))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(33, 33, 33)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblrating1)
                            .addComponent(review1)
                            .addComponent(jLabel6)
                            .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rating1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtreview1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(yes1)
                                .addGap(18, 18, 18)
                                .addComponent(NO1))
                            .addComponent(jButton4))))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(info)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(type)
                                .addGap(17, 17, 17)
                                .addComponent(price)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txttype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(company)
                            .addComponent(txtcomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(specs, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtspecs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(size)
                            .addComponent(txtweight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gender)
                            .addComponent(txtpower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(yes1)
                            .addComponent(NO1))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtreview1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(review1))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rating1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblrating1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtcompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcompActionPerformed

    private void txttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttypeActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        ////        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
      /* String p_id=txtpid.getText();
          String b=txtcomp.getText();
          String c=txtspecs.getText();
          String d=txtprice.getText();
          String e=txtweight.getText();
          String f=txttype.getText();
          String g=txtpower.getText();
          JOptionPane.showConfirmDialog(this,""+p_id+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f+"\n"+g);
          GadgetsReview gl=new GadgetsReview();
          gl.setVisible(true);
          this.dispose();*/
       try{
            Class<?> forName = Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/review?zeroDateTimeBehavior=convertToNull ","root","")) {
                String sql1="insert into product(P_Id,Name,Price,Company,Type) values (?,?,?,?,?)";
                String sql2="insert into gadgets(P_Id,Specifications,Weight,Power) values (?,?,?,?)";
                String sql="insert into reviews(Rating,Comment,Value_for_money,P_Id) values (?,?,?,?)";
                PreparedStatement pst1=con.prepareStatement(sql1);
                PreparedStatement pst2=con.prepareStatement(sql2);
                PreparedStatement pst3=con.prepareStatement(sql);
                pst1.setInt(1,Integer.parseInt(txtpid.getText()));
                pst2.setInt(1,Integer.parseInt(txtpid.getText()));
                pst3.setInt(4,Integer.parseInt(txtpid.getText()));
                pst1.setString(2,txtname.getText());
                pst1.setInt(3,Integer.parseInt(txtprice.getText()));
                pst1.setString(4,txtcomp.getText());
                pst1.setString(5,txttype.getText());
                pst2.setString(2,txtspecs.getText());
                pst2.setString(3,txtweight.getText());
                pst2.setInt(4,Integer.parseInt(txtpower.getText()));
                
                pst3.setString(2,txtreview1.getText());

                String value;
                if(NO.isSelected()){
                    value=NO.getText();
                }
                else{
                    value=yes.getText();
                }
                pst3.setString(3, value);

                String rate;
                rate=rating.getSelectedItem().toString();
                pst3.setString(1,rate);
                
                pst1.executeUpdate();
                pst2.executeUpdate();
                 pst3.executeUpdate();
                JOptionPane.showMessageDialog(null,"INSERTION SUCCESSFUL");
               
            } catch (java.sql.SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null,"Data Already Preasent") ;
             txtpid.setText("");
                txtname.setText("");
                txtcomp.setText("");
                txtprice.setText("");    
                txttype.setText("");
                txtspecs.setText("");
                txtweight.setText("");
                txtpower.setText("");
            } catch (SQLException ex) { 
               Logger.getLogger(GadgetsInfo.class.getName()).log(Level.SEVERE, null, ex);
           } 
         } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClothesInfo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
         }
      
          
    }//GEN-LAST:event_submitActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new Options().setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ratingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ratingActionPerformed

    private void NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new GadgetsInfo().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Options().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit1ActionPerformed
        /*    String review=txtreview.getText();
        String rat=rating.getSelectedItem().toString();
        JOptionPane.showConfirmDialog(this,""+r_id+"\n"+review+"\n"+rat);
        this.dispose();*/

        

    }//GEN-LAST:event_submit1ActionPerformed

    private void txtreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreviewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreviewActionPerformed

    private void rating1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rating1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rating1ActionPerformed

    private void NO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NO1ActionPerformed

    private void txtreview1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreview1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreview1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       new Options().setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GadgetsInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GadgetsInfo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton NO;
    private javax.swing.JRadioButton NO1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel company;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel info;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblrating;
    private javax.swing.JLabel lblrating1;
    private javax.swing.JLabel price;
    private javax.swing.JComboBox<String> rating;
    private javax.swing.JComboBox<String> rating1;
    private javax.swing.JLabel review;
    private javax.swing.JLabel review1;
    private javax.swing.JLabel size;
    private javax.swing.JLabel specs;
    private javax.swing.JButton submit;
    private javax.swing.JButton submit1;
    private javax.swing.JTextField txtcomp;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpid;
    private javax.swing.JTextField txtpower;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtreview;
    private javax.swing.JTextField txtreview1;
    private javax.swing.JTextField txtspecs;
    private javax.swing.JTextField txttype;
    private javax.swing.JTextField txtweight;
    private javax.swing.JLabel type;
    private javax.swing.JRadioButton yes;
    private javax.swing.JRadioButton yes1;
    // End of variables declaration//GEN-END:variables
}
