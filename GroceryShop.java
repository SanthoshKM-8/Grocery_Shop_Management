import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class GroceryShop implements ActionListener{
    
    JFrame f;
    JPanel p;
    JLabel list,icon,title,total;
    JCheckBox ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    JComboBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
    JButton b;
    JTable table;
    JScrollPane sp;
    String[] unit = {"kg","grm"};
    DefaultTableModel model = new DefaultTableModel();
    
    public GroceryShop() {
        f = new JFrame("GroceryShop");
        p = new JPanel(null);
        list = new JLabel("GROCERY LIST");
        icon = new JLabel();
        icon.setIcon(new ImageIcon(getClass().getResource("Icon.png")));
        title = new JLabel("GROCERY SHOP");
        total = new JLabel("TOTAL AMOUNT : 0");
        ch1 = new JCheckBox("ALMONDS"); 
        ch2 = new JCheckBox("APPLE");
        ch3 = new JCheckBox("BEANS");
        ch4 = new JCheckBox("BUTTER");
        ch5 = new JCheckBox("CARROT");
        ch6 = new JCheckBox("KIWI");
        ch7 = new JCheckBox("RICE");
        ch8 = new JCheckBox("SUGAR");
        ch9 = new JCheckBox("TOMATO");
        ch10 = new JCheckBox("WALNUTS");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();
        t7 = new JTextField();
        t8 = new JTextField();
        t9 = new JTextField();
        t10 = new JTextField();
        c1 = new JComboBox(unit);
        c2 = new JComboBox(unit);
        c3 = new JComboBox(unit);
        c4 = new JComboBox(unit);
        c5 = new JComboBox(unit);
        c6 = new JComboBox(unit);
        c7 = new JComboBox(unit);
        c8 = new JComboBox(unit);
        c9 = new JComboBox(unit);
        c10 = new JComboBox(unit);
        b = new JButton("OK");
        table = new JTable(model);
        sp = new JScrollPane(table);
        model.addColumn("Item");
        model.addColumn("Price (per Kg)");
        model.addColumn("Qty");
        model.addColumn("Total");
        list.setFont(new Font("ALGERIAN",Font.PLAIN,24));
        list.setForeground(Color.red);
        list.setBounds(60,30,160,20);
        ch1.setBounds(30,80,90,20);
        ch2.setBounds(30,120,90,20);
        ch3.setBounds(30,160,90,20);
        ch4.setBounds(30,200,90,20);
        ch5.setBounds(30,240,90,20);
        ch6.setBounds(30,280,90,20);
        ch7.setBounds(30,320,90,20);
        ch8.setBounds(30,360,90,20);
        ch9.setBounds(30,400,90,20);
        ch10.setBounds(30,440,90,20);
        t1.setBounds(140,80,40,20);
        t2.setBounds(140,120,40,20);
        t3.setBounds(140,160,40,20);
        t4.setBounds(140,200,40,20);
        t5.setBounds(140,240,40,20);
        t6.setBounds(140,280,40,20);
        t7.setBounds(140,320,40,20);
        t8.setBounds(140,360,40,20);
        t9.setBounds(140,400,40,20);
        t10.setBounds(140,440,40,20);
        c1.setBounds(200,80,50,20);
        c2.setBounds(200,120,50,20);
        c3.setBounds(200,160,50,20);
        c4.setBounds(200,200,50,20);
        c5.setBounds(200,240,50,20);
        c6.setBounds(200,280,50,20);
        c7.setBounds(200,320,50,20);
        c8.setBounds(200,360,50,20);
        c9.setBounds(200,400,50,20);
        c10.setBounds(200,440,50,20);
        b.setBounds(100,490,80,30);
        icon.setBounds(350,15,60,60);
        title.setFont(new Font("ALGERIAN",Font.PLAIN,32));
        title.setForeground(Color.red);
        title.setBounds(400,30,250,40);
        table.setBounds(280,80,470,380);
        sp.setBounds(280,80,470,380);
        total.setFont(new Font("ALGERIAN",Font.PLAIN,24));
        total.setForeground(Color.green);
        total.setBounds(420,490,300,40);
        p.add(list);p.add(icon);p.add(title);p.add(total);
        p.add(ch1);p.add(ch2);p.add(ch3);p.add(ch4);p.add(ch5);p.add(ch6);p.add(ch7);p.add(ch8);p.add(ch9);p.add(ch10);
        p.add(t1);p.add(t2);p.add(t3);p.add(t4);p.add(t5);p.add(t6);p.add(t7);p.add(t8);p.add(t9);p.add(t10);
        p.add(c1);p.add(c2);p.add(c3);p.add(c4);p.add(c5);p.add(c6);p.add(c7);p.add(c8);p.add(c9);p.add(c10);
        p.add(b);
        p.add(table);
        sp.setViewportView(table);
        p.add(sp);
        f.add(p);
        b.addActionListener(this);
        f.setSize(800,600);
        f.show();
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        double sum=0,price,qty,cal=0;
	if(ch1.isSelected()){
	    String Almonds = ch1.getText();
	    String mes= c1.getSelectedItem().toString();
	    price = 1800.0;
	    qty = Integer.parseInt(t1.getText());
	    if(mes.equals("kg")){
	        cal = (qty * price) ;
	        model = (DefaultTableModel)table.getModel();
	        model.addRow(new Object[]{Almonds,price,qty,cal});  
	    }
	    else{
	        cal = (qty/1000 * price) ;
	        model = (DefaultTableModel)table.getModel();
	        model.addRow(new Object[]{Almonds,price,qty,cal});        
	    }
        }      
	if(ch2.isSelected()){
	    String Apple = ch2.getText();
	    String mes3= c2.getSelectedItem().toString();
	    price = 100.0;
	    qty = Integer.parseInt(t2.getText());
            if(mes3.equals("kg")){
		cal = (qty * price) ;
		model = (DefaultTableModel)table.getModel();
		model.addRow(new Object[]{Apple,price,qty,cal});  
            }
            else{
		cal = (qty/1000 * price) ;
		model = (DefaultTableModel)table.getModel();          
                model.addRow(new Object[]{Apple,price,qty,cal});        
            }
	}
        if(ch3.isSelected()){
	    String Beans = ch3.getText();
	    String mes4= c3.getSelectedItem().toString();
	    price = 40.0;
	    qty = Integer.parseInt(t3.getText());
            if(mes4.equals("kg")){
		cal = (qty * price) ;
		model = (DefaultTableModel)table.getModel();
		model.addRow(new Object[]{Beans,price,qty,cal});  
            }
            else{
		cal = (qty/1000 * price) ;
		model = (DefaultTableModel)table.getModel();          
		model.addRow(new Object[]{Beans,price,qty,cal});        
            }
        }
	if(ch4.isSelected()){
	    String Butter = ch4.getText();
	    String mes1= c4.getSelectedItem().toString();
	    price = 450.0;
	    qty = Integer.parseInt(t4.getText());
	    if(mes1.equals("kg")){
	        cal = (qty * price) ;
	        model = (DefaultTableModel)table.getModel();
	        model.addRow(new Object[]{Butter,price,qty,cal});  
	    }
	    else{
	        cal = (qty/1000 * price) ;
	        model = (DefaultTableModel)table.getModel();          
	        model.addRow(new Object[]{Butter,price,qty,cal});        
	    }
	}
	if(ch5.isSelected()){
	    String Carrot = ch5.getText();
	    String mes2= c5.getSelectedItem().toString();
	    price = 50.0;
            qty = Integer.parseInt(t5.getText());
	    if(mes2.equals("kg")){
		cal = (qty * price) ;
		model = (DefaultTableModel)table.getModel();
		model.addRow(new Object[]{Carrot,price,qty,cal});  
            }
            else{
	        cal = (qty/1000 * price) ;
	        model = (DefaultTableModel)table.getModel();          
	        model.addRow(new Object[]{Carrot,price,qty,cal});        
            }
	}
	if(ch6.isSelected()){
	    String Kiwi = ch6.getText();
	    String mes4= c6.getSelectedItem().toString();
	    price = 400.0;
	    qty = Integer.parseInt(t6.getText());
	    if(mes4.equals("kg")){
	        cal = (qty * price) ;
	        model = (DefaultTableModel)table.getModel();
                model.addRow(new Object[]{Kiwi,price,qty,cal});  
	    }
	    else{
	        cal = (qty/1000 * price) ;
	        model = (DefaultTableModel)table.getModel();          
	        model.addRow(new Object[]{Kiwi,price,qty,cal});        
	    }
	}
	if(ch7.isSelected()){
	    String Rice= ch7.getText();
	    String mes4= c7.getSelectedItem().toString();
	    price = 60.0;
	    qty = Integer.parseInt(t7.getText());
	    if(mes4.equals("kg")){
		cal = (qty * price) ;
		model = (DefaultTableModel)table.getModel();
		model.addRow(new Object[]{Rice,price,qty,cal});  
	    }
	    else{
	        cal = (qty/1000 * price) ;
	        model = (DefaultTableModel)table.getModel();          
	        model.addRow(new Object[]{Rice,price,qty,cal});        
	    }
	}
	if(ch8.isSelected()){
	    String Sugar = ch8.getText();
	    String mes4= c8.getSelectedItem().toString();
	    price = 70.0;
	    qty = Integer.parseInt(t8.getText());
	    if(mes4.equals("kg")){
	        cal = (qty * price) ;
	        model = (DefaultTableModel)table.getModel();
	        model.addRow(new Object[]{Sugar,price,qty,cal});  
	    }
	    else{
	        cal = (qty/1000 * price) ;
	        model = (DefaultTableModel)table.getModel();          
	        model.addRow(new Object[]{Sugar,price,qty,cal});        
	    }
	}
	if(ch9.isSelected()){
	    String Tomato = ch9.getText();
	    String mes4= c9.getSelectedItem().toString();
	    price = 60.0;
	    qty = Integer.parseInt(t9.getText());
	    if(mes4.equals("kg")){
		cal = (qty * price) ;
		model = (DefaultTableModel)table.getModel();
		model.addRow(new Object[]{Tomato,price,qty,cal });  
            }
            else{
		cal = (qty/1000 * price) ;
		model = (DefaultTableModel)table.getModel();          
		model.addRow(new Object[]{Tomato,price,qty,cal});        
            }
        }
	if(ch10.isSelected()){
	    String Walnuts = ch10.getText();
	    String mes4= c10.getSelectedItem().toString();
	    price = 1430.0;
	    qty = Integer.parseInt(t10.getText());
	    if(mes4.equals("kg")){
		cal = (qty * price) ;
		model = (DefaultTableModel)table.getModel();
		model.addRow(new Object[]{Walnuts,price,qty,cal});  
            }
            else{
		cal = (qty/1000 * price) ;
		model = (DefaultTableModel)table.getModel();          
		model.addRow(new Object[]{Walnuts,price,qty,cal});        
            }
	}
	for(double i=0; i<table.getRowCount(); i++)
	    sum = sum + Double.parseDouble(table.getValueAt((int) i, 3).toString());
	total.setText("TOTAL AMOUNT : "+Double.toString(sum));
    }
    
    public static void main(String[] args) {
        GroceryShop gs = new GroceryShop();
    }

}