/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwanza.tukule.management.system;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.print.Printer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Mariwa
 */
public class SummaryPanel extends javax.swing.JPanel {
Connection con = null;
ResultSet rs = null;
PreparedStatement pst = null;
PreparedStatement pst2 = null;
PreparedStatement pst3 = null;
public String user;
public String role;
public String CustomerId;
public String CustomerName;
public String CustomerNumber;
public String CustomerDeliverer;
public String CustomerLocation;
public String CustomerStatus;
Connection connect = databaseConnection.connection();
Dashboard dashboard;
NullPanel nullpanel;
public Icon icon = new javax.swing.ImageIcon(getClass().getResource("/kwanza/tukule/management/system/images/kwanza tukule icon.png"));
    /**
     * Creates new form SummaryPanel
     */
    public SummaryPanel() {
        initComponents();
        nullpanel = new NullPanel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalPaidViaMpesaTodayLabel = new javax.swing.JLabel();
        totalPaidInCashYesterdayLabel = new javax.swing.JLabel();
        totalDebtPaidInMpesaLabel = new javax.swing.JLabel();
        totalDebtPaidInCashLabel = new javax.swing.JLabel();
        refreshButton1 = new javax.swing.JButton();
        totalBankedYesterdayLabel = new javax.swing.JLabel();
        summaryDate = new javax.swing.JLabel();
        expensesYesterdayLabel = new javax.swing.JLabel();
        summaryPageTitle = new javax.swing.JLabel();
        totalSalesYesterdayLabel = new javax.swing.JLabel();
        revenueRealizedYesterdayLabel = new javax.swing.JLabel();
        salesYesterdayLabel = new javax.swing.JLabel();
        mpesaYesterdayLabel = new javax.swing.JLabel();
        revenueYesterdayLabel = new javax.swing.JLabel();
        cashYesterdayLabel = new javax.swing.JLabel();
        bankedYesterdayLabel = new javax.swing.JLabel();
        expensesLabel = new javax.swing.JLabel();
        debtCashLabel = new javax.swing.JLabel();
        debtMpesaLabel = new javax.swing.JLabel();

        totalPaidViaMpesaTodayLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        totalPaidViaMpesaTodayLabel.setText("Total Paid via M-Pesa for Yesterday:");

        totalPaidInCashYesterdayLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        totalPaidInCashYesterdayLabel.setText("Total Paid in Cash for Yesterday:");

        totalDebtPaidInMpesaLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        totalDebtPaidInMpesaLabel.setText("Total Debt Paid in M-Pesa Yesterday:");

        totalDebtPaidInCashLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        totalDebtPaidInCashLabel.setText("Total Debt Paid in Cash Yesterday:");

        refreshButton1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        refreshButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kwanza/tukule/management/system/images/refresher.png"))); // NOI18N
        refreshButton1.setText("Refresh");
        refreshButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButton1ActionPerformed(evt);
            }
        });

        totalBankedYesterdayLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        totalBankedYesterdayLabel.setText("Total Banked Yesterday:");

        summaryDate.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        expensesYesterdayLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        expensesYesterdayLabel.setText("Average Fixed Expenditure:");

        summaryPageTitle.setFont(new java.awt.Font("Lucida Grande", 1, 30)); // NOI18N
        summaryPageTitle.setText("Summary");

        totalSalesYesterdayLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        totalSalesYesterdayLabel.setText("Total Sales Yesterday:");

        revenueRealizedYesterdayLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        revenueRealizedYesterdayLabel.setText("Revenue Realized from Yesterday:");

        salesYesterdayLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N

        mpesaYesterdayLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N

        revenueYesterdayLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N

        cashYesterdayLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N

        bankedYesterdayLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N

        expensesLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N

        debtCashLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N

        debtMpesaLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(totalSalesYesterdayLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salesYesterdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                .addComponent(refreshButton1)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(mpesaYesterdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cashYesterdayLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(debtMpesaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(355, 355, 355)
                            .addComponent(debtCashLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(revenueYesterdayLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bankedYesterdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(expensesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(totalBankedYesterdayLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(expensesYesterdayLabel)
                                            .addComponent(totalDebtPaidInCashLabel)
                                            .addComponent(revenueRealizedYesterdayLabel)
                                            .addComponent(totalPaidViaMpesaTodayLabel))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(totalPaidInCashYesterdayLabel)
                                        .addComponent(totalDebtPaidInMpesaLabel))))
                            .addContainerGap(561, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(summaryPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(summaryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(refreshButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(totalSalesYesterdayLabel)
                        .addComponent(salesYesterdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(revenueYesterdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(mpesaYesterdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(cashYesterdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(debtMpesaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(debtCashLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(bankedYesterdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(expensesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(summaryPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(summaryDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(68, 68, 68)
                    .addComponent(revenueRealizedYesterdayLabel)
                    .addGap(40, 40, 40)
                    .addComponent(totalPaidViaMpesaTodayLabel)
                    .addGap(49, 49, 49)
                    .addComponent(totalPaidInCashYesterdayLabel)
                    .addGap(46, 46, 46)
                    .addComponent(totalDebtPaidInMpesaLabel)
                    .addGap(53, 53, 53)
                    .addComponent(totalDebtPaidInCashLabel)
                    .addGap(48, 48, 48)
                    .addComponent(totalBankedYesterdayLabel)
                    .addGap(44, 44, 44)
                    .addComponent(expensesYesterdayLabel)
                    .addContainerGap(73, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButton1ActionPerformed
        summaryQuery();
    }//GEN-LAST:event_refreshButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bankedYesterdayLabel;
    private javax.swing.JLabel cashYesterdayLabel;
    private javax.swing.JLabel debtCashLabel;
    private javax.swing.JLabel debtMpesaLabel;
    private javax.swing.JLabel expensesLabel;
    private javax.swing.JLabel expensesYesterdayLabel;
    private javax.swing.JLabel mpesaYesterdayLabel;
    private javax.swing.JButton refreshButton1;
    private javax.swing.JLabel revenueRealizedYesterdayLabel;
    private javax.swing.JLabel revenueYesterdayLabel;
    private javax.swing.JLabel salesYesterdayLabel;
    private javax.swing.JLabel summaryDate;
    private javax.swing.JLabel summaryPageTitle;
    private javax.swing.JLabel totalBankedYesterdayLabel;
    private javax.swing.JLabel totalDebtPaidInCashLabel;
    private javax.swing.JLabel totalDebtPaidInMpesaLabel;
    private javax.swing.JLabel totalPaidInCashYesterdayLabel;
    private javax.swing.JLabel totalPaidViaMpesaTodayLabel;
    private javax.swing.JLabel totalSalesYesterdayLabel;
    // End of variables declaration//GEN-END:variables
  public void summaryQuery() {
        String sql = "SELECT CURRENT_DATE() - INTERVAL 1 DAY AS yesterday;";
        try{
           pst = connect.prepareStatement(sql);
                rs=pst.executeQuery();
                rs.next();
                String day = rs.getString("yesterday");
                summaryDate.setText("for Yesterday ("+day+")");
        } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
         String query0 = "SELECT SUM(MPesa) as 'Mpesa_yesterday' FROM `orders` WHERE DATE(Late_Order) = CURRENT_DATE()-1 ";
        try {
                pst = connect.prepareStatement(query0);
                rs=pst.executeQuery();
                while(rs.next())
                {
                    if(rs.getInt("Mpesa_yesterday") > 0)
                    {
                    mpesaYesterdayLabel.setText("Ksh. "+rs.getString("Mpesa_yesterday")+"");
                    }
                    else{ 
                    mpesaYesterdayLabel.setText("Ksh. 0.0 "); 
                    }
                }
                } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        String query1 = "SELECT SUM(Cash) as 'Cash_yesterday' FROM `orders` WHERE DATE(Late_Order) = CURRENT_DATE()-1";
        try {
                pst = connect.prepareStatement(query1);
                rs=pst.executeQuery();
                while(rs.next())
                {
                    if(rs.getInt("Cash_yesterday") > 0)
                    {
                    cashYesterdayLabel.setText("Ksh. "+rs.getString("Cash_yesterday")+"");
                    }
                    else{ 
                    cashYesterdayLabel.setText("Ksh. 0.0 "); 
                    }
                }
                } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
         String query2 = "select SUM(stock.Price*orders.Quantity) as 'Sales_yesterday' from orders INNER JOIN stock ON orders.Stock_id=stock.id WHERE DATE(Late_Order) = CURRENT_DATE()-1";
        try {
                pst = connect.prepareStatement(query2);
                rs=pst.executeQuery();
                while(rs.next()){
                    if(rs.getInt("Sales_yesterday") > 0)
                    {
                       salesYesterdayLabel.setText("Ksh. "+rs.getString("Sales_yesterday")+""); 
                    }
                    else{ 
                    salesYesterdayLabel.setText("Ksh. 0.0 "); 
                    }
                }
              } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        String query3 = "select (SUM(orders.Cash)+SUM(orders.MPesa)) as 'Revenue_yesterday' from orders INNER JOIN stock ON orders.Stock_id=stock.id WHERE DATE(Late_Order) = CURRENT_DATE()-1 ";
        try {
                pst = connect.prepareStatement(query3);
                rs=pst.executeQuery();
                while(rs.next()){
                    if(rs.getInt("Revenue_yesterday") > 0)
                    {
                       revenueYesterdayLabel.setText("Ksh. "+rs.getString("Revenue_yesterday")+""); 
                    }
                    else{ 
                    revenueYesterdayLabel.setText("Ksh. 0.0 "); 
                    }
                }
              } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        String query4 = "SELECT SUM(MPesa) as 'Mpesa_debt' FROM `orders` WHERE DATE(Updated_at) = CURRENT_DATE()-1 AND DATE(Late_Order) < CURRENT_DATE()-1";
        try {
                pst = connect.prepareStatement(query4);
                rs=pst.executeQuery();
                while(rs.next()){
                    if(rs.getInt("Mpesa_debt") > 0)
                    {
                       debtMpesaLabel.setText("Ksh. "+rs.getString("Mpesa_debt")+"");  
                       }
                    else{ 
                    debtMpesaLabel.setText("Ksh. 0.0 "); 
                    }
                }
              } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        String query5 = "SELECT SUM(Cash) as 'Cash_debt' FROM `orders` WHERE DATE(`Updated_at`) = CURRENT_DATE()-1 AND DATE(Late_Order) < CURRENT_DATE()-1";
        try {
                pst = connect.prepareStatement(query5);
                rs=pst.executeQuery();
                while(rs.next()){
                     if(rs.getInt("Cash_debt") > 0)
                    {
                       debtCashLabel.setText("Ksh. "+rs.getString("Cash_debt")+""); 
                       }
                    else{ 
                    debtCashLabel.setText("Ksh. 0.0 "); 
                    }
                }
              } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
         String query6 = "SELECT SUM(Banked) as 'Banked_yesterday' FROM `orders` WHERE DATE(`Updated_at`) >= CURRENT_DATE()-1 ";
        try {
                pst = connect.prepareStatement(query6);
                rs=pst.executeQuery();
                while(rs.next())
                {
                    if(rs.getInt("Banked_yesterday") > 0)
                    {
                    bankedYesterdayLabel.setText("Ksh. "+rs.getString("Banked_yesterday")+"");
                    }
                    else{ 
                    bankedYesterdayLabel.setText("Ksh. 0.0 "); 
                    }
                }
                } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        expensesLabel.setText("Ksh. 1242.0");     
        //String query8 = "SELECT SUM(Cash) as 'Cash_today' FROM `orders` WHERE DATE(`Updated_at`) = CURRENT_DATE() ";
        //try {
                //con = DriverManager.getConnection("jdbc:mysql://41.190.141.49:3306/tukule_kwanza?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","tukule","tIlNEYbuBHuhE5hs");
               // pst = con.prepareStatement(query1);
                //rs=pst.executeQuery();
                //while(rs.next())
                //{
                   // double Cash = rs.getDouble("Cash_today");
                   // String query7 = "SELECT SUM(Banked) as 'Banked_today' FROM `orders` WHERE DATE(`Updated_at`) = CURRENT_DATE() ";
                   // try {
               // con = DriverManager.getConnection("jdbc:mysql://41.190.141.49:3306/tukule_kwanza?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","tukule","tIlNEYbuBHuhE5hs");
                //pst = con.prepareStatement(query7);
                //rs=pst.executeQuery();
                //while(rs.next())
                //{
                   //double Banked = rs.getDouble("Banked_today");
                  // double cash_hand = Cash - Banked - 1242.0;
                  // cashLabel.setText("Ksh." +cash_hand);
                //}
                //} catch (SQLException ex) {
                //Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            //}
               // }
               // } catch (SQLException ex) {
               // Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
   // }
    
}
}
