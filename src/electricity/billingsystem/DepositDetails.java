
package electricity.billingsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;


public class DepositDetails extends JFrame implements ActionListener {
    
    JTable t1;
    JButton b1,b2;
    JLabel l1,l2;
    Choice c1,c2;
    String x[]={"meter","month","units","total_bill","status"};
    String y[][]=new String[40][8];
    int i=0,j=0;
    DepositDetails(){
         super("Deposit Details");
         getContentPane().setBackground(Color.WHITE);
         setLayout(null);
        setSize(700,750);
        setLocation(600,150);
        
        l1=new JLabel("Sort By Meter Number");
        l1.setBounds(20,20,150,20);
        add(l1);
        
        c1=new Choice();
        
        l2=new JLabel("Sort By Month");
        l2.setBounds(400,20,100,20);
        add(l2);
        c2=new Choice();
        t1=new JTable(y,x);
        
        try{
            Conn con=new Conn();
            String s1= "select * from bill";
            ResultSet rs=con.s.executeQuery(s1);
              t1.setModel(DbUtils.resultSetToTableModel(rs));
              String s2="select * from customer";
              rs=con.s.executeQuery(s2);
              while(rs.next()){
                  c1.add(rs.getString("meter"));
                  
              }
              
       }catch(Exception e){
            e.printStackTrace();
            
        }
        c1.setBounds(180,20,120,20);
        add(c1);
        
        c2.setBounds(520,20,120,20);
        c2.add("January");
        c2.add("February");
        c2.add("March");
        c2.add("April");
        c2.add("May");
        c2.add("June");
        c2.add("July");
        c2.add("August");
        c2.add("September");
        c2.add("October");
        c2.add("November");
        c2.add("December");
        add(c2);
        
        b1=new JButton("Search");
        b1.addActionListener(this);
        b1.setBounds(20, 70, 80, 20);
        add(b1);
        
        b2=new JButton("Print");
        b1.addActionListener(this);
        b1.setBounds(20, 70, 80, 20);
        add(b2);
        
        JScrollPane sp=new JScrollPane(t1);
        sp.setBounds(0,100,700,650);
        add(sp);
       
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            String sql="select * from bill where meter='"+c1.getSelectedItem()+"' AND month='"+c2.getSelectedItem()+"'";
            try{
                
                Conn con=new Conn();
                ResultSet rs=con.s.executeQuery(sql);
                t1.setModel(DbUtils.resultSetToTableModel(rs));
          }catch(Exception e){}
        }else if(ae.getSource()==b2){
            try{
               t1.print(); 
            }catch(Exception e){}
            
        }
      
    }
    
    public static void main(String[]args){
        new DepositDetails().setVisible(true);
    }
    
}
