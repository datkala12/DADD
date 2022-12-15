/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIAdmin;

import Utils.Auth;
import Utils.MsgBox;
import Utils.ShareHelper;
import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author dantr
 */
public class MainJFrame extends javax.swing.JFrame {

	/**
	 * Creates new form MainJFame
	 */
	public MainJFrame() {
		initComponents();
		init(true, true);
	}

	public MainJFrame(JFrame aThis, boolean b) {
		initComponents();
		initBack();
	}

	public MainJFrame(boolean b) {
		initComponents();
		initLogin();
	}
	public MainJFrame(JDialog aThis, boolean b) {
		initComponents();
		initLogin();
	}
	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                lblUser = new javax.swing.JLabel();
                btnOrder = new javax.swing.JButton();
                btnSales = new javax.swing.JButton();
                btnMenu = new javax.swing.JButton();
                btnPromo = new javax.swing.JButton();
                btnUser = new javax.swing.JButton();
                btnlogout = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Diamonds Place - Main");
                setBackground(new java.awt.Color(255, 255, 255));
                addWindowListener(new java.awt.event.WindowAdapter() {
                        public void windowOpened(java.awt.event.WindowEvent evt) {
                                formWindowOpened(evt);
                        }
                });

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logoAppMain.png"))); // NOI18N

                lblUser.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
                lblUser.setForeground(new java.awt.Color(255, 153, 255));
                lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblUser.setText("jLabel2");
                lblUser.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                lblUserMouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(23, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                btnOrder.setBackground(new java.awt.Color(255, 153, 255));
                btnOrder.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                btnOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/List (2).png"))); // NOI18N
                btnOrder.setText("ORDER");
                btnOrder.setMaximumSize(new java.awt.Dimension(400, 80));
                btnOrder.setMinimumSize(new java.awt.Dimension(400, 80));
                btnOrder.setPreferredSize(new java.awt.Dimension(400, 150));
                btnOrder.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnOrderActionPerformed(evt);
                        }
                });

                btnSales.setBackground(new java.awt.Color(255, 153, 255));
                btnSales.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                btnSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Sale (2).png"))); // NOI18N
                btnSales.setText("SALES");
                btnSales.setMaximumSize(new java.awt.Dimension(400, 80));
                btnSales.setMinimumSize(new java.awt.Dimension(400, 80));
                btnSales.setPreferredSize(new java.awt.Dimension(400, 150));
                btnSales.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSalesActionPerformed(evt);
                        }
                });

                btnMenu.setBackground(new java.awt.Color(255, 153, 255));
                btnMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Search.png"))); // NOI18N
                btnMenu.setText("MENU");
                btnMenu.setMaximumSize(new java.awt.Dimension(400, 80));
                btnMenu.setMinimumSize(new java.awt.Dimension(400, 80));
                btnMenu.setPreferredSize(new java.awt.Dimension(400, 150));
                btnMenu.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnMenuActionPerformed(evt);
                        }
                });

                btnPromo.setBackground(new java.awt.Color(255, 153, 255));
                btnPromo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                btnPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/promo (1).png"))); // NOI18N
                btnPromo.setText("PROMO");
                btnPromo.setMaximumSize(new java.awt.Dimension(400, 80));
                btnPromo.setMinimumSize(new java.awt.Dimension(400, 80));
                btnPromo.setPreferredSize(new java.awt.Dimension(400, 150));
                btnPromo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnPromoActionPerformed(evt);
                        }
                });

                btnUser.setBackground(new java.awt.Color(255, 153, 255));
                btnUser.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/User (1).png"))); // NOI18N
                btnUser.setText("USER");
                btnUser.setMaximumSize(new java.awt.Dimension(400, 80));
                btnUser.setMinimumSize(new java.awt.Dimension(400, 80));
                btnUser.setPreferredSize(new java.awt.Dimension(400, 150));
                btnUser.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnUserActionPerformed(evt);
                        }
                });

                btnlogout.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                btnlogout.setForeground(new java.awt.Color(255, 153, 255));
                btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout (1).png"))); // NOI18N
                btnlogout.setText("LOGOUT");
                btnlogout.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnlogoutActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnlogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btnSales, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                                                                        .addComponent(btnPromo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btnMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                                                                        .addComponent(btnUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addContainerGap())))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnPromo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
	    // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

        private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
		// TODO add your handling code here:
		openOrder();
        }//GEN-LAST:event_btnOrderActionPerformed

        private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
		// TODO add your handling code here:
		openMenu();
        }//GEN-LAST:event_btnMenuActionPerformed

        private void btnSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesActionPerformed
		// TODO add your handling code here:
		openDoanhThu();
        }//GEN-LAST:event_btnSalesActionPerformed

        private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
		// TODO add your handling code here:
		openUser();
        }//GEN-LAST:event_btnUserActionPerformed

        private void btnPromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromoActionPerformed
		// TODO add your handling code here:
		openPromo();
        }//GEN-LAST:event_btnPromoActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
	    // TODO add your handling code here:
	    logout();
    }//GEN-LAST:event_btnlogoutActionPerformed

        private void lblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserMouseClicked
		// TODO add your handling code here:
		changePassword();
        }//GEN-LAST:event_lblUserMouseClicked

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
			java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainJFrame().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnMenu;
        private javax.swing.JButton btnOrder;
        private javax.swing.JButton btnPromo;
        private javax.swing.JButton btnSales;
        private javax.swing.JButton btnUser;
        private javax.swing.JButton btnlogout;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JLabel lblUser;
        // End of variables declaration//GEN-END:variables

	private void init(boolean a, boolean b) {

		this.getContentPane().setBackground(Color.WHITE);
		new ChaoJDialog(this, true).setVisible(a);
		new DangNhapJDialog(this, true).setVisible(a);
		lblUser.setText(String.valueOf(Auth.userName));
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		if (!Auth.isAdmin()) {
			btnUser.setEnabled(false);
		}
		setIconImage(ShareHelper.APP_ICON);

	}

	private void initBack() {
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);

		lblUser.setText(String.valueOf(Auth.userName));
		this.getContentPane().setBackground(Color.WHITE);
		if (!Auth.isAdmin()) {
			btnUser.setEnabled(false);
		}
		setIconImage(ShareHelper.APP_ICON);

	}

	private void initLogin() {
		this.getContentPane().setBackground(Color.WHITE);
		new DangNhapJDialog(this, true).setVisible(true);
		lblUser.setText(String.valueOf(Auth.userName));
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		if (!Auth.isAdmin()) {
			btnUser.setEnabled(false);
		}
		setIconImage(ShareHelper.APP_ICON);

	}

	private void openOrder() {
		new OderTableJFrame().setVisible(true);
		this.dispose();
	}

	private void PhamGiaHao() {

	}

	private void openMenu() {
		new ProductSearchJFrame(this, true).setVisible(true);
		this.dispose();
	}

	private void openDoanhThu() {
		new ProductSaleJFrame(this, true).setVisible(true);
		this.dispose();
	}

	private void openUser() {
		new UserJFrame(this, true).setVisible(true);
		this.dispose();
	}

	private void openPromo() {
		new PromoJFrame(this, true).setVisible(true);
		this.dispose();
	}

	private void logout() {
		this.dispose();
		new MainJFrame(false).setVisible(true);

	}

	private void changePassword() {
		new DoiMatKhauJDialog(this, true).setVisible(true);
	}

}
