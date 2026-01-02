/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medical.store.management.system.D;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author PRINCE
 */
public class Tables {
    public static void main(String[] args) {
        try {
            ConnectionProvider connectionProvider = new ConnectionProvider();
            Connection con = connectionProvider.getCon();

            Statement st = con.createStatement();
      
         //  st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(200),name varchar(200),doj varchar(50),mobileNumber varchar(50),username varchar(200),password varchar(50),address varchar(200),salary varchar(50))");
        // st.executeUpdate("insert into appuser(userRole,name,doj,mobileNumber,username,password,address,salary) values('Admin','Piyush','06/06/2015','9321508792','piyush','123456','Thane','15000')");
        //st.executeUpdate("create table supplier(Id int,supplierName varchar(100),mobileNumber varchar(15),address varchar(100))");
       //8[
       st.executeUpdate("create table stock(stock_id int AUTO_INCREMENT primary key,Id int,medicineName varchar(50),supplierName varchar (50),dom varchar(11),doe varchar(11),purchasedate varchar(11),quantity int,price double,totalPrice double  GENERATED ALWAYS AS (quantity * price) STORED)"); 
        st.executeUpdate("create table inventory(stock_id int,Id int,medicineName varchar(100),dom varchar(11),doe varchar(11),quantity int,price double,totalPrice double,FOREIGN KEY (stock_id) REFERENCES stock(stock_id))");
       // st.executeUpdate("create table bill(bill int AUTO_INCREMENT primary key,bill_id varchar(200),billdate varchar(50),totalamount double)");
        JOptionPane.showMessageDialog(null, "Table Created Successfully");
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
