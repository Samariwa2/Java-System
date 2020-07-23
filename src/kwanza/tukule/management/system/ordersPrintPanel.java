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
public class ordersPrintPanel extends javax.swing.JPanel {
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
Queries print;
Connection connect = databaseConnection.connection();
public Icon icon = new javax.swing.ImageIcon(getClass().getResource("/kwanza/tukule/management/system/images/kwanza tukule icon.png"));
    /** Creates new form ordersPrintPanel */
    public ordersPrintPanel() {
        initComponents();
        print = new Queries();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ordersPageTitle2 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        ordersTable2 = new javax.swing.JTable(){
            public Component prepareRenderer(TableCellRenderer r, int rw ,int col )
            {
                Component c = super.prepareRenderer(r, rw, col);
                c.setBackground(Color.WHITE);
                c.setForeground(Color.BLACK);
                int rows=(Integer)ordersTable2.getRowCount();
                for(int row = 0; row<rows; row++)
                {
                    DefaultTableModel model = (DefaultTableModel)ordersTable2.getModel();
                    double debt = Double.parseDouble(ordersTable2.getValueAt(rw, 7).toString());
                    if(debt == 0.0 && col==0 )
                    {
                        c.setBackground(Color.GREEN);
                        c.setForeground(Color.BLACK);
                    }
                    else if(debt > 0.0 && col==0)
                    {
                        c.setBackground(Color.ORANGE);
                        c.setForeground(Color.BLACK);
                    }
                    else if(debt < 0.0 && debt >= -100.0 && col==0)
                    {
                        c.setBackground(Color.LIGHT_GRAY);
                        c.setForeground(Color.BLACK);
                    }
                    else if(debt < -100.0 && col==0)
                    {
                        c.setBackground(Color.RED);
                        c.setForeground(Color.BLACK);
                    }
                }
                return c;
            }
        }
        ;

        ordersPageTitle2.setFont(new java.awt.Font("Lucida Grande", 1, 30)); // NOI18N
        ordersPageTitle2.setText("Orders Print");

        ordersTable2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        ordersTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Mobile No.", "Item", "Qty", "Cost", "M-Pesa", "Cash", "Balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ordersTable2.setRowHeight(17);
        jScrollPane17.setViewportView(ordersTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(ordersPageTitle2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(ordersPageTitle2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JLabel ordersPageTitle2;
    private javax.swing.JTable ordersTable2;
    // End of variables declaration//GEN-END:variables
    public void ordersPrinting() {
       double price;
        int quantity;
        double cost;
        double debt;
        double mpesa;
        double cash;
        double balance;
        double Debt;
        double fine;
        int returned;
        String delivery;

     
            String query2 = "select * from orders INNER JOIN customers ON orders.Customer_id=customers.id INNER JOIN stock ON orders.Stock_id=stock.id WHERE DATE(orders.Late_Order) = CURRENT_DATE()+1 order by orders.id ASC ;";
            try {               
                pst = connect.prepareStatement(query2);
                rs=pst.executeQuery();
                DefaultTableModel tm=(DefaultTableModel)ordersTable2.getModel();
                tm.setRowCount(0);
                while(rs.next()){
                    price=rs.getDouble("stock.price");
                    quantity=rs.getInt("orders.Quantity");
                    cost=price*quantity;
                    debt=rs.getDouble("Debt");
                    mpesa=rs.getDouble("Mpesa");
                    cash=rs.getDouble("Cash");
                    fine=rs.getDouble("Fine");
                    returned=rs.getInt("Returned");
                    delivery = rs.getString("Late_Order");
                    balance=(mpesa+cash)+debt-cost+fine;
                    Object o[]={
                                rs.getString("customers.Name"),
                                rs.getString("customers.Number"),
                                rs.getString("stock.Name"),
                                rs.getInt("orders.Quantity"),
                                cost,              
                                mpesa,
                                cash,
                                balance
                    };
                    tm.addRow(o);         
                }
              } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
              }
        }

    public void print() {
        ordersPrinting();
        print.print(ordersTable2);
    }
}
