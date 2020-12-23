
package electricity.billingsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class ViewInfo extends JFrame implements ActionListener {
    
 JButton b1;
        ViewInfo(String meter){
        setBounds(600,250, 850, 650);
        getContentPane().setBackground(new Color(255,206,43));
        setLayout(null);
        
        JLabel title = new JLabel("VIEW CUSTOMER INFORMATION");
        title.setBounds(250, 0, 500, 40);
        title.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(title);
        
        JLabel l1=new JLabel("Name");
        l1.setBounds(70,80,100,20);
        add(l1);
        
         JLabel l2=new JLabel();
        l2.setBounds(250,80,100,20);
        add(l2);
        
         JLabel l3=new JLabel("Meter Number");
        l3.setBounds(70,140,100,20);
        add(l3);
        
         JLabel l4=new JLabel();
        l4.setBounds(250,140,100,20);
        add(l4);
        
         JLabel l5=new JLabel("Address");
        l5.setBounds(70,200,100,20);
        add(l5);
        
         JLabel l6=new JLabel();
        l6.setBounds(250,200,100,20);
        add(l6);
        
         JLabel l7=new JLabel("City");
        l7.setBounds(70,260,100,20);
        add(l7);
        
         JLabel l8=new JLabel();
        l8.setBounds(250,260,100,20);
        add(l8);
        
         JLabel l9=new JLabel("State");
        l9.setBounds(500,80,100,20);
        add(l9);
        
        
         JLabel l10=new JLabel();
        l10.setBounds(650,80,100,20);
        add(l10);
        
        
         JLabel l11=new JLabel("Email");
        l11.setBounds(500,140,100,20);
        add(l11);
        
        
         JLabel l12=new JLabel();
        l12.setBounds(650,140,150,20);
        add(l12);
        
        
         JLabel l13=new JLabel("Name");
        l13.setBounds(500,200,100,20);
        add(l13);
        
        
         JLabel l14=new JLabel();
        l14.setBounds(650,200,100,20);
        add(l14);
        
        try{
            Conn con= new Conn();
            ResultSet rs=con.s.executeQuery("select * from customer where meter ='"+meter+"'");
            while(rs.next()){
                l2.setText(rs.getString(1));
                l4.setText(rs.getString(2));
                l6.setText(rs.getString(3));
                l8.setText(rs.getString(4));
                l10.setText(rs.getString(5));
                l12.setText(rs.getString(6));
                l14.setText(rs.getString(7));
                
            }
            
        }catch(Exception e){}
        b1=new JButton("Back");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b1.setBounds(350, 300, 100, 25);
        b1.addActionListener(this);
        add(b1);
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/customerinfo.png"));
        Image i2 = i1.getImage().getScaledInstance(268, 188, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l15  = new JLabel(i3);
        l15.setBounds(20, 315, 600, 300);
        add(l15);
        
   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }
    
    public static void main(String[]args){
        new ViewInfo("").setVisible(true);
    }
    
    
}
