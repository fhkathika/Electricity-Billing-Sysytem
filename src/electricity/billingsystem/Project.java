
package electricity.billingsystem;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Project  extends JFrame implements ActionListener{
    String person;
    String meter;
    Project(String p,String m){
        
        super("Electricity Billing Sytem");
        setSize(1920,1030);
        //Adding bacground image//
        ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("icon/project2.jpg"));
        Image i3=ic.getImage().getScaledInstance(1900, 950, Image.SCALE_DEFAULT);
        ImageIcon icc3=new ImageIcon(i3);
        JLabel l1=new JLabel(icc3);
        add(l1);
       //First Column//
       JMenuBar mb=new JMenuBar();
       JMenu master=new JMenu("Master");
       JMenuItem m1=new JMenuItem("New Customer");
       JMenuItem m2=new JMenuItem("Customer Details");
       JMenuItem m3=new JMenuItem("Deposit Details");
       JMenuItem u1=new JMenuItem("Pay Bill");
       master.setForeground(Color.GRAY);
       
        //Pay bill//
        u1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon4=new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
         Image image4=icon4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image4));
        u1.setMnemonic('P');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);
        
        //Customer Details//
        
        m1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon1=new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
         Image image1=icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        m1.setIcon(new ImageIcon(image1));
        m1.setMnemonic('D');
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        m1.setBackground(Color.WHITE);
        
        //Material details//
        
        m2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon2=new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
         Image image2=icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        m2.setIcon(new ImageIcon(image2));
        m2.setMnemonic('M');
        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        m2.setBackground(Color.WHITE);
        
        //Deposite Details//
        
        m3.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon3=new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image image3=icon3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        m3.setIcon(new ImageIcon(image3));
        m3.setMnemonic('N');
        m3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        m3.setBackground(Color.WHITE);
        
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        u1.addActionListener(this);
        
        
        //2nd column//
        JMenu info=new JMenu("Information");
        JMenuItem iu2=new JMenuItem("Update INformation");
         JMenuItem iu3=new JMenuItem("View Information");
         info.setForeground(Color.red);
         
         //bill details//
        iu2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon12=new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image image12=icon12.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        iu2.setIcon(new ImageIcon(image12));
        iu2.setMnemonic('B');
        iu2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        iu2.setBackground(Color.WHITE);
         
        //last bill//
        
        iu3.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon13=new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image image13=icon13.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        iu3.setIcon(new ImageIcon(image13));
        iu3.setMnemonic('L');
        iu3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
        iu3.setBackground(Color.WHITE);
        
        iu2.addActionListener(this);
        iu3.addActionListener(this);
        
        ///---------------------------------------------------------------
        
        //second column//
        
        JMenu user=new JMenu("User");
        JMenuItem u2=new JMenuItem("Calculate Bill");
        JMenuItem u3=new JMenuItem("Bill Details");
        user.setForeground(Color.RED);
        
        //Bill details//
        
        u2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon5=new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image image5=icon5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        u2.setIcon(new ImageIcon(image5));
        u2.setMnemonic('B');
        u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        u2.setBackground(Color.WHITE);
     
        
        //Last Bill//
        
        u3.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon6=new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image image6=icon6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        u3.setIcon(new ImageIcon(image6));
        u3.setMnemonic('L');
        u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
        u3.setBackground(Color.WHITE);
        
        u2.addActionListener(this);
        u3.addActionListener(this);
        
        //3rd column//
        
        JMenu report=new JMenu("Report");
        JMenuItem r1=new JMenuItem("General Bill");
        report.setForeground(Color.red);
        
        //report////
        r1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon7=new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image image7=icon7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image7));
        r1.setMnemonic('R');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
        r1.setBackground(Color.WHITE);
        
        r1.addActionListener(this);
        
        //-------------------------------------------------------
        
        //4rth column//
        
         
        JMenu utility=new JMenu("Utility");
        JMenuItem ut1=new JMenuItem("Notpad");
        JMenuItem ut2=new JMenuItem("Calculator");
        JMenuItem ut3=new JMenuItem("Web Browser");
        utility.setForeground(Color.red);
        
       ///Calender//
        ut1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon8=new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image image8=icon8.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ut1.setIcon(new ImageIcon(image8));
        ut1.setMnemonic('C');
        ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
        ut1.setBackground(Color.WHITE);
        
        
        //Calculator//
        
         ut2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon9=new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image image9=icon9.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ut2.setIcon(new ImageIcon(image9));
        ut2.setMnemonic('X');
        ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
        ut2.setBackground(Color.WHITE);
        
        //Web Browser//
        
         ut3.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon10=new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image image10=icon10.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ut3.setIcon(new ImageIcon(image10));
        ut3.setMnemonic('W');
        ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,ActionEvent.CTRL_MASK));
        ut3.setBackground(Color.WHITE);
        
        ut1.addActionListener(this);
        ut2.addActionListener(this);
        ut3.addActionListener(this);
        
        
        //-----------------------------------------------------------
        
        //5th column//
        
        
        JMenu about=new JMenu("About");
        JMenuItem eabout=new JMenuItem("About");
     
        about.setForeground(Color.red);
        add(about);
        
       ///Calender//
        eabout.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon31=new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image image31=icon31.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        eabout.setIcon(new ImageIcon(image31));
        eabout.setMnemonic('Z');
        eabout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,ActionEvent.CTRL_MASK));
        eabout.setBackground(Color.WHITE);
        
        eabout.addActionListener(this);
        
        //fifth column//
        JMenu exit=new JMenu("Logout");
        JMenuItem ex=new JMenuItem("Logout");
       
        exit.setForeground(Color.red);
        
       ///Calender//
        ex.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon11=new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image image11=icon11.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setMnemonic('Z');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        
        master.add(m1);
        master.add(m2);
        master.add(m3);
        master.add(u2);
        
        info.add(iu2);
        info.add(iu3);
        
        user.add(u1);
        user.add(u3);
        
        report.add(r1);
        
        utility.add(ut1);
        utility.add(ut2);
        utility.add(ut3);
        
        about.add(eabout);
        exit.add(ex);
        if(p.equals("Admin")){
            mb.add(master);
        }else{
        mb.add(info);
        mb.add(user);
        mb.add(report);
        }
        
        mb.add(info);
        mb.add(user);
        mb.add(report);
        
        setJMenuBar(mb);
        
        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String msg=ae.getActionCommand();
        if(msg.equals("Customer Details")){
            new CustomerDetails().setVisible(true);
  
        }else if(msg.equals("New Customer")){
         new NewCustomer().setVisible(true);
         
        }else if(msg.equals("Calculate Bill")){
         new CalculateBill().setVisible(true);
         
        }else if(msg.equals("Pay Bill")){
         new PayBill(meter).setVisible(true);
         
        }else if(msg.equals("Notepad")){
         try{
             Runtime.getRuntime().exec("notepad.exe");
         }catch(Exception e){}
        }else if(msg.equals("Calculator")){
         try{
              Runtime.getRuntime().exec("calc.exe");
                 }catch(Exception e){}
         
        }else if(msg.equals("Web Browser")){
         try{
          Runtime.getRuntime().exec("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
          
         
        }catch(Exception e){}
        }else if(msg.equals("Log Out")){
        this.setVisible(false);
        new Login().setVisible(true);
        
        }else if(msg.equals("GenerateBill")){
         new GenerateBill(meter).setVisible(true);
         
        }else if(msg.equals("Bill Details")){
         new BillDetails(meter).setVisible(true);
         
        }else if(msg.equals("Update Information")){
         new UpdateInfo(meter).setVisible(true);
         
        }else if(msg.equals("View Information")){
         new ViewInfo(meter).setVisible(true);
         
        }else if(msg.equals("Deposit Details")){
         new DepositDetails().setVisible(true);
         
        }
else if(msg.equals("About")){
//         new About().setVisible(true);
//        
        }
//    
    }
    
    public static void main(String[]args){
        new Project("","").setVisible(true);
    }
    
}
