package event_management_system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author Himanshu Agarwal
 */
public class Event_Management_Systems extends JFrame {
    Event_Management_Systems(){
     setBounds(300,300,1366,768);
        
      
        ImageIcon i1 = new ImageIcon("C:/Users/Himanshu Agarwal/Documents/NetBeansProjects/Event_Management_System/src/event_management_system/images/Event-Management.jpg");
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0,1600,768);
        add(l1);
        
        JButton b1 = new JButton("Customer");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(800,300,150,50);
        l1.add(b1);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                new Login1("customer").setVisible(true);
                
                
        }
        });
            
        JButton b2 = new JButton("Admin");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(1000,300,150,50);
        l1.add(b2);
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                new Login1("admin").setVisible(true);
                
                
        }
        
        
        });
        setLayout(null);
        
        
        setVisible(true);
    }
    


    public static void main(String[] args) {
        Event_Management_Systems m = new Event_Management_Systems();
//        conn c = new conn();
        // TODO code application logic here
    }
    
}