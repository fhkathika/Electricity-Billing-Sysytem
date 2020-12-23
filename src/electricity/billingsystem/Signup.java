
package electricity.billingsystem;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.border.*;
public class Signup extends JFrame implements ActionListener{
    JPanel panel;
    JTextField t1,t2,t3,t4;
    Choice c1;
    JButton b1,b2;
     public static void main(String[]args){
       new Signup().setVisible(true);
   }
    public Signup(){

       setBounds(600,250,700,406);
       panel=new JPanel();
       panel.setBounds(30,30,650,300);
     panel.setBackground(Color.WHITE);
        panel.setLayout(null);
       panel.setBorder(new TitledBorder(new LineBorder(new Color(173, 216, 230), 2), "Create-Account",
			TitledBorder.LEADING, TitledBorder.TOP, null, new Color(173, 216, 230)));
    
       add(panel);
       
       JLabel l1=new JLabel("Username: ");
       l1.setForeground(Color.DARK_GRAY);
       l1.setFont( new Font("Tahcma",Font.BOLD,14));
       l1. setBounds(99, 86, 92, 26);
        panel.add(l1);
//        
        t1=new JTextField();
        t1.setBounds(250, 50, 150, 20);
        panel.add(t1);
        
        JLabel l2=new JLabel("Name: ");
       l2.setForeground(Color.DARK_GRAY);
       l2.setFont( new Font("Tahcma",Font.BOLD,14));
        l2.setBounds(100,50, 100, 20);
        panel.add(l2);
        
        t2=new JTextField();
        t2.setBounds(250, 90, 150, 20);
        panel.add(t2);
        
        JLabel l3=new JLabel("Password: ");
       l3.setForeground(Color.DARK_GRAY);
       l3.setFont( new Font("Tahcma",Font.BOLD,14));
        l3.setBounds(100,130,100,20);
        panel.add(l3);
        
        t3=new JTextField();
        t3.setBounds(250, 130, 150, 20);
        panel.add(t3);
        
        JLabel l4=new JLabel("Create account as ");
       l4.setForeground(Color.DARK_GRAY);
       l4.setFont( new Font("Tahcma",Font.BOLD,14));
        l4.setBounds(100,160,140,20);
        panel.add(l4);
          JLabel l5=new JLabel("Meter Number ");
       l5.setForeground(Color.DARK_GRAY);
       l5.setFont( new Font("Tahcma",Font.BOLD,14));
        l5.setBounds(100,197,170,20);
        l5.setVisible(false);
        panel.add(l5);
        
        t4=new JTextField();
        t4.setBounds(250, 200, 150, 20);
        t4.setVisible(false);
        panel.add(t4);
        
       c1=new Choice();
       c1.add("Admin");
       c1.add("Customer");
       c1.setBounds(250,160,150,20);
       panel.add(c1);
       
       c1.addItemListener(new ItemListener() {
           @Override
           public void itemStateChanged(ItemEvent e) {
       String user=c1.getSelectedItem();
       if(user.equals(("Customer"))){
           l5.setVisible(true);
           t4.setVisible(true);
           
       }else{
           l5.setVisible(false);
           t4.setVisible(false);
       }
           }
       });
       
     
        
        b1=new JButton("Create");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(140,290,120,30);
        b1.addActionListener(this);
        panel.add(b1);
        
         b2=new JButton("Back");
         b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300,290,120,30);
        b2.addActionListener(this);
        panel.add(b2);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/loginpage.jpg"));
        Image i2=i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l6=new JLabel(i3);
        l6.setBounds(450,30,250,250);
        panel.add(l6);
        
        
   } 

    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
         Conn c=new Conn();   
     if(ae.getSource()==b1){
         String username=t1.getText();
          String name=t2.getText();
           String password=t3.getText();
            String meter_no=t4.getText();
             String user=c1.getSelectedItem();
           
                 
                 String str="";
                 if(user.equals("Admin")){
                     str= "insert into login values('"+meter_no+"','"+username+"', '"+name+"', '"+password+"', '"+user+"')";
                     
                 }else{
                     str="update login set username = '"+username+"', name = '"+name+"', password = '"+password+"', user = '"+user+"' where meter_no = " + t1.getText();
                
                 }
                c.s.executeUpdate(str);
                 JOptionPane.showMessageDialog(null,"Account Created Successfully");
                new Login().setVisible(true);
                  this.setVisible(false);
         
         }else if(ae.getSource()==b2){
        this.setVisible(false);
        new Login().setVisible(true);
       
    }
    }catch(Exception e){}
    }
  
}
