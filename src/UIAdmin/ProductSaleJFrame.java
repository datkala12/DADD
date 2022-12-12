/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIAdmin;

import DAO.StatisticalDAO;
import Entity.ChartTurnover;
import Entity.Turnover;
import Utils.MoneyFormater;
import Utils.MsgBox;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author dantr
 */
public class ProductSaleJFrame extends javax.swing.JFrame {

    StatisticalDAO dao = new StatisticalDAO();
    int check = 0;
    String text;

    /**
     * Creates new form ProductSaleJFrame
     */
    public ProductSaleJFrame() {
        initComponents();
        init();
    }

    ProductSaleJFrame(MainJFrame aThis, boolean b) {
        initComponents();
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
                jTabbedPane1 = new javax.swing.JTabbedPane();
                jPanel2 = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                tblProSale = new javax.swing.JTable();
                lbltotal = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                btnPrint = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                jdtMonth = new com.toedter.calendar.JMonthChooser();
                jLabel3 = new javax.swing.JLabel();
                jdtYears = new com.toedter.calendar.JYearChooser();
                lblstatus = new javax.swing.JLabel();
                btnShowAll = new javax.swing.JButton();
                btnTim = new javax.swing.JButton();
                jPanel3 = new javax.swing.JPanel();
                jLabel4 = new javax.swing.JLabel();
                jdtyearchart = new com.toedter.calendar.JYearChooser();
                jpnchart = new javax.swing.JPanel();
                lbltextjpn2 = new javax.swing.JLabel();
                btnseatch2 = new javax.swing.JButton();
                btnBack = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
                jTabbedPane1.setOpaque(true);

                tblProSale.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                tblProSale.setForeground(new java.awt.Color(255, 102, 255));
                tblProSale.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null}
                        },
                        new String [] {
                                "IDProduct", "ProductName", "Quantity Sold", "Turnover"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tblProSale.setOpaque(false);
                tblProSale.setRowHeight(35);
                jScrollPane1.setViewportView(tblProSale);

                lbltotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                lbltotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel1.setText("Total turnover:");

                btnPrint.setBackground(new java.awt.Color(255, 153, 255));
                btnPrint.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                btnPrint.setText("Print excel");
                btnPrint.setMaximumSize(new java.awt.Dimension(111, 51));
                btnPrint.setMinimumSize(new java.awt.Dimension(111, 51));
                btnPrint.setPreferredSize(new java.awt.Dimension(111, 51));
                btnPrint.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnPrintActionPerformed(evt);
                        }
                });

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 0, 255));
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("Month:");

                jdtMonth.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 0, 255));
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setText("Years:");

                lblstatus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                lblstatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

                btnShowAll.setBackground(new java.awt.Color(255, 153, 255));
                btnShowAll.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                btnShowAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/List (2).png"))); // NOI18N
                btnShowAll.setText("SHOW ALL");
                btnShowAll.setMaximumSize(new java.awt.Dimension(111, 51));
                btnShowAll.setMinimumSize(new java.awt.Dimension(111, 51));
                btnShowAll.setPreferredSize(new java.awt.Dimension(111, 51));
                btnShowAll.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnShowAllActionPerformed(evt);
                        }
                });

                btnTim.setBackground(new java.awt.Color(255, 153, 255));
                btnTim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Search.png"))); // NOI18N
                btnTim.setText("SEARCH");
                btnTim.setMaximumSize(new java.awt.Dimension(111, 51));
                btnTim.setMinimumSize(new java.awt.Dimension(111, 51));
                btnTim.setPreferredSize(new java.awt.Dimension(111, 51));
                btnTim.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnTimActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jdtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jdtYears, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblstatus, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(btnShowAll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnTim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblstatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnPrint, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jdtMonth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jdtYears, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77))
                );

                jTabbedPane1.addTab("List", jPanel2);

                jLabel4.setBackground(new java.awt.Color(255, 255, 255));
                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 0, 255));
                jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel4.setText("Year:");

                javax.swing.GroupLayout jpnchartLayout = new javax.swing.GroupLayout(jpnchart);
                jpnchart.setLayout(jpnchartLayout);
                jpnchartLayout.setHorizontalGroup(
                        jpnchartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                );
                jpnchartLayout.setVerticalGroup(
                        jpnchartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 533, Short.MAX_VALUE)
                );

                lbltextjpn2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

                btnseatch2.setBackground(new java.awt.Color(255, 0, 255));
                btnseatch2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                btnseatch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Search.png"))); // NOI18N
                btnseatch2.setText("Search");
                btnseatch2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnseatch2ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jpnchart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(394, 394, 394)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jdtyearchart, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbltextjpn2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnseatch2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 338, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jdtyearchart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbltextjpn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnseatch2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jpnchart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );

                jTabbedPane1.addTab("Charts", jPanel3);

                btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                btnBack.setForeground(new java.awt.Color(255, 153, 255));
                btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Back.png"))); // NOI18N
                btnBack.setText("BACK");
                btnBack.setMaximumSize(new java.awt.Dimension(111, 51));
                btnBack.setMinimumSize(new java.awt.Dimension(111, 51));
                btnBack.setPreferredSize(new java.awt.Dimension(111, 51));
                btnBack.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnBackActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTabbedPane1)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
            // TODO add your handling code here:
            fillTableTurnover();
            check = 1;
        }//GEN-LAST:event_btnTimActionPerformed

        private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
            // TODO add your handling code here:
            fillTableTurnoverAll();
            check = 0;
        }//GEN-LAST:event_btnShowAllActionPerformed

        private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
            // TODO add your handling code here:
            btnBack();
        }//GEN-LAST:event_btnBackActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        PrintFileExcel();
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnseatch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseatch2ActionPerformed
        // TODO add your handling code here:
        setDateToChart();
    }//GEN-LAST:event_btnseatch2ActionPerformed

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
            java.util.logging.Logger.getLogger(ProductSaleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductSaleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductSaleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductSaleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductSaleJFrame().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnBack;
        private javax.swing.JButton btnPrint;
        private javax.swing.JButton btnShowAll;
        private javax.swing.JButton btnTim;
        private javax.swing.JButton btnseatch2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTabbedPane jTabbedPane1;
        private com.toedter.calendar.JMonthChooser jdtMonth;
        private com.toedter.calendar.JYearChooser jdtYears;
        private com.toedter.calendar.JYearChooser jdtyearchart;
        private javax.swing.JPanel jpnchart;
        private javax.swing.JLabel lblstatus;
        private javax.swing.JLabel lbltextjpn2;
        private javax.swing.JLabel lbltotal;
        private javax.swing.JTable tblProSale;
        // End of variables declaration//GEN-END:variables

    private void init() {
        fillTableTurnoverAll();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDateToChart();
    }

    //Dữ liệu doanh thu theo tháng và năm lên table
    private void fillTableTurnover() {
        int Month;
        int Years;
//		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        DefaultTableModel model = (DefaultTableModel) tblProSale.getModel();
        model.setRowCount(0);
        try {
            Month = jdtMonth.getMonth() + 1;
            Years = jdtYears.getYear();
//			Month = new SimpleDateFormat("M").parse(a);
            lblstatus.setText("Turnover of month: " + Month + " Year: " + Years);
            List<Turnover> list = dao.getTurnover(Month, Years);
            for (Turnover dt : list) {
                Object[] row = {
                    dt.getIDProduct(),
                    dt.getProductName(),
                    dt.getQuantitySold(),
                    MoneyFormater.VNDFormat(dt.getTurnover())
                };
                model.addRow(row);
            }
            Double tong = 0.0;
            for (int i = 0; i < tblProSale.getRowCount(); i++) {
                tong += MoneyFormater.DoubleFormat((String) tblProSale.getValueAt(i, 3));
            }
            lbltotal.setText(MoneyFormater.VNDFormat(tong));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void fillTableTurnoverAll() {
        lblstatus.setText("All turnover");
        DefaultTableModel model = (DefaultTableModel) tblProSale.getModel();
        model.setRowCount(0);
        try {
            List<Turnover> list = dao.selectALL();
            for (Turnover dt : list) {
                Object[] row = {
                    dt.getIDProduct(),
                    dt.getProductName(),
                    dt.getQuantitySold(),
                    MoneyFormater.VNDFormat(dt.getTurnover())
                };
                model.addRow(row);
            }
            Double tong = 0.0;
            for (int i = 0; i < tblProSale.getRowCount(); i++) {
                tong += MoneyFormater.DoubleFormat((String) tblProSale.getValueAt(i, 3));
            }
            lbltotal.setText(MoneyFormater.VNDFormat(tong));
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    private void btnBack() {
        this.dispose();
        new MainJFrame(this, true).setVisible(true);
    }

    private void PrintFileExcel() {
        List<Turnover> list = null;
        if (check == 0) {
            list = dao.selectALL();
            text = "Total Turnover";
        } else {

            int Month;
            int Years;
            try {
                Month = jdtMonth.getMonth() + 1;
                Years = jdtYears.getYear();
                list = dao.getTurnover(Month, Years);
                text = "Total Turnover of Month " + String.valueOf(Month) + " Year " + String.valueOf(Years);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String vaitro;
        try {
            XSSFWorkbook workBook = new XSSFWorkbook();
            XSSFSheet sheet = workBook.createSheet("Turnover");
            XSSFRow row = null;
            XSSFRow row2 = null;
            Cell cell = null;
            CellStyle style = workBook.createCellStyle();
            style.setBorderBottom(BorderStyle.THIN);
            style.setBorderRight(BorderStyle.THIN);
            style.setBorderLeft(BorderStyle.THIN);
            style.setBorderTop(BorderStyle.THIN);

            DataFormat format = workBook.createDataFormat();
            style.setDataFormat(format.getFormat("0.0"));

            //Độ rộng của cột
            sheet.setColumnWidth(0, 3000);
            sheet.setColumnWidth(1, 6000);
            sheet.setColumnWidth(2, 6000);
            sheet.setColumnWidth(3, 5000);
            sheet.setColumnWidth(4, 3500);
            sheet.setColumnWidth(5, 3500);

            sheet.addMergedRegion(new CellRangeAddress(1, 1, 0, 5));

            //Font chữ của header
            XSSFFont headerFont = workBook.createFont();
            headerFont.setColor(IndexedColors.WHITE.index);
            headerFont.setFontHeightInPoints((short) 15);
            headerFont.setBold(true);

            //thêm border vào dữ liệu
            CellStyle cellStyle1 = workBook.createCellStyle();
            cellStyle1.setAlignment(HorizontalAlignment.CENTER);
            cellStyle1.setBorderBottom(BorderStyle.THIN);
            cellStyle1.setBorderRight(BorderStyle.THIN);
            cellStyle1.setBorderLeft(BorderStyle.THIN);
            cellStyle1.setBorderTop(BorderStyle.THIN);
            cellStyle1.setFillForegroundColor(IndexedColors.BLUE_GREY.getIndex());
            cellStyle1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cellStyle1.setFont(headerFont);

            CellStyle cellStyle2 = workBook.createCellStyle();
            cellStyle2.setAlignment(HorizontalAlignment.CENTER);
            cellStyle2.setBorderBottom(BorderStyle.THIN);
            cellStyle2.setBorderRight(BorderStyle.THIN);
            cellStyle2.setBorderLeft(BorderStyle.THIN);
            cellStyle2.setBorderTop(BorderStyle.THIN);
            cellStyle2.setFillForegroundColor(IndexedColors.BLUE_GREY.getIndex());
            cellStyle2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cellStyle2.setFont(headerFont);

            //Font chữ của Title
            XSSFFont titleFont = workBook.createFont();
            titleFont.setColor(IndexedColors.BLUE1.index);
            titleFont.setFontHeightInPoints((short) 25);
            titleFont.setBold(true);
            titleFont.setItalic(true);

            CellStyle cellTitle = workBook.createCellStyle();
            cellTitle.setAlignment(HorizontalAlignment.CENTER);
            cellTitle.setFont(titleFont);

            row2 = sheet.createRow(1);
            cell = row2.createCell(0, CellType.STRING);
            cell.setCellValue(text);
            cell.setCellStyle(cellTitle);

            row = sheet.createRow(3);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("IDProduct");
            cell.setCellStyle(cellStyle1);

            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("ProductName");
            cell.setCellStyle(cellStyle1);

            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Quantity Sold");
            cell.setCellStyle(cellStyle1);

            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Turnover");
            cell.setCellStyle(cellStyle1);

            for (int i = 0; i < list.size(); i++) {
                row = sheet.createRow(4 + i);

                cell = row.createCell(0, CellType.STRING);
                cell.setCellValue(list.get(i).getIDProduct());
                cell.setCellStyle(style);

                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue(list.get(i).getProductName());
                cell.setCellStyle(style);

                cell = row.createCell(2, CellType.NUMERIC);
                cell.setCellValue(list.get(i).getQuantitySold());
                cell.setCellStyle(style);

                cell = row.createCell(3, CellType.NUMERIC);
                cell.setCellValue(MoneyFormater.VNDFormat(list.get(i).getTurnover()));
                cell.setCellStyle(style);
            }
            row = sheet.createRow(list.size() + 4);
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Total");
            cell.setCellStyle(cellStyle2);

            cell = row.createCell(3, CellType.NUMERIC);
            cell.setCellValue(lbltotal.getText());
            cell.setCellStyle(style);

            JFileChooser fc = new JFileChooser();
            int check = fc.showSaveDialog(this);
            if (check == JFileChooser.APPROVE_OPTION) {
                File f = fc.getSelectedFile();
//            File f = new File("listnhanvien.xlsx");
                try {
                    FileOutputStream fos = new FileOutputStream(f);
                    workBook.write(fos);
                    fos.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                try {
                    Desktop.getDesktop().open(f);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else{
                MsgBox.alert(this, "file not saved!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Chỉnh sửa biểu đồ doanh thu theo năm
    private void setDateToChart() {
        String year = String.valueOf(jdtyearchart.getYear());
        lbltextjpn2.setText("Revenue chart of the year: " + year);
        List<ChartTurnover> listItem = dao.getTurnoverChart(year);
        if (listItem != null) {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            for (ChartTurnover Ctu : listItem) {
                dataset.addValue(Ctu.getTotalTurnoverMonth(), "Total turnover of Month", Ctu.getMonth());
            }
            JFreeChart chart = ChartFactory.createBarChart("revenue statistics", "Month", "Total Turnover", dataset);
            ChartPanel cpn = new ChartPanel(chart);
            cpn.setPreferredSize(new Dimension(jpnchart.getWidth(), 300));

            jpnchart.removeAll();
            jpnchart.setLayout(new CardLayout());
            jpnchart.add(cpn);
            jpnchart.validate();
            jpnchart.repaint();
        }
    }

}
