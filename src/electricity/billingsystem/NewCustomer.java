
package electricity.billingsystem;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
public class NewCustomer extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l11;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    NewCustomer(){
        setLocation(600,200);
        setSize(700,500);
        
        JPanel p=new JPanel();
        p.setLayout(null);
        p.setBackground(new Color(173,248,2));
        
        JLabel title=new JLabel("New Customer");
        title.setBounds(180,10,300,30);
        title.setFont(new Font("Tahoma",Font.PLAIN,24));
        p.add(title);
        
        l1=new JLabel("Customer Name");
        l1.setBounds(100,80,100,20);
        t1=new JTextField();
        t1.setBounds(200,80,200,20);
        p.add(l1);
        p.add(t1);
        
        l2=new JLabel("Meter No");
        l2.setBounds(100,120,100,20);
        l11=new JLabel();
        l11.setBounds(200,120,200,20);
        p.add(l2);
        p.add(l11);
        
          l3=new JLabel("Address");
        l3.setBounds(100,160,100,20);
        t2=new JTextField();
        t2.setBounds(200,160,200,20);
        p.add(l3);
        p.add(t2);
        
         l4=new JLabel("City");
        l4.setBounds(100,200,100,20);
        t3=new JTextField();
        t3.setBounds(200,200,200,20);
        p.add(l4);
        p.add(t3);
   
        l5=new JLabel("State");
        l5.setBounds(100,240,100,20);
        t4=new JTextField();
        t4.setBounds(200,240,200,20);
        p.add(l5);
        p.add(t4);
        
         l6=new JLabel("Email");
        l6.setBounds(100,280,100,20);
        t5=new JTextField();
        t5.setBounds(200,280,200,20);
        p.add(l6);
        p.add(t5);
        
         l7=new JLabel("Phone Number");
        l7.setBounds(100,320,100,20);
        t6=new JTextField();
        t6.setBounds(200,320,200,20);
        p.add(l7);
        p.add(t6);
        
         b1=new JButton("Next");
        b1.setBounds(120,390,100,25);
        b2=new JButton("Cancel");
        b2.setBounds(250,390,100,25);
        p.add(b1);
        p.add(b2);
        
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        p.add(b1);
        p.add(b2);
        setLayout(new BorderLayout());
        
        add(p,"Center");
        
        ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("icon/newcustomer.jpg"));
        Image i3 = ic1.getImage().getScaledInstance(170, 300,Image.SCALE_DEFAULT);
        ImageIcon ic2 = new ImageIcon(i3);
       
        l8 = new JLabel(ic2);
        
        add(l8,"West");
         
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        Random ran=new Random();
        long first=ran.nextLong()%100000;
        l11.setText(""+(Math.abs(first)));
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
      if( e.getSource()==b1){
             String name = t1.getText();
            String meter = l11.getText();
            String address = t2.getText();
            String city = t3.getText();
            String state = t4.getText();
            String email = t5.getText();
            String phone = t6.getText();
            
            String q1="insert into customer values ('"+name+"','"+meter+"','"+address+"','"+city+"','"+state+"','"+email+"','"+phone+"')";
          String q2="insert into login values('"+meter+"','','','','')";
         try{
                Conn c1 = new Conn();
                c1.s.executeUpdate(q1);
                c1.s.executeUpdate(q2);
                JOptionPane.showMessageDialog(null,"Customer Added Successfully");
                this.setVisible(false);
                new Meter_Info(meter).setVisible(true);


            }catch(Exception ex){
                 ex.printStackTrace();
            }
      
      
      }else if(e.getSource() == b2){
            this.setVisible(false);
        }
    }
    
     public static void main(String[] args){
        new NewCustomer().setVisible(true);
    } 
    
}
