import javax.swing.*;
import java.awt.event.*;

public class MultipleButtons implements ActionListener{

    JFrame frame;

    JLabel nameLabel;
    JLabel rollLabel;
    JLabel gpaLabel;

    JTextField nameField;
    JTextField rollField;
    JTextField gpaField;

    JButton printButton; 
    JButton nameButton; 
    JButton rollButton; 
    JButton gpaButton; 

    MultipleButtons(){
        
        frame = new JFrame("Hello");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450,450);
		frame.setLayout(null);
        

        nameField = new JTextField();
        rollField = new JTextField();
        gpaField = new JTextField();
        
        nameLabel = new JLabel("Name");
        rollLabel = new JLabel("Roll Number");
        gpaLabel = new JLabel("GPA");
        
        printButton = new JButton("Print All");
        nameButton = new JButton("Print Name");
        rollButton = new JButton("Print Roll No");
        gpaButton = new JButton("Print GPA");


        printButton.addActionListener(this);
        nameButton.addActionListener(this);
        rollButton.addActionListener(this);
        gpaButton.addActionListener(this);


        nameLabel.setBounds(30, 50, 100, 40);
        rollLabel.setBounds(30, 100, 100, 40);
        gpaLabel.setBounds(30, 150, 100, 40);

        nameField.setBounds(150, 50, 200, 40);
        rollField.setBounds(150, 100, 200, 40);
        gpaField.setBounds(150, 150, 200, 40);

        nameButton.setBounds(20, 200, 150, 35);
        rollButton.setBounds(200, 200, 150, 35);
        gpaButton.setBounds(20, 300, 150, 35);
        printButton.setBounds(200, 300, 150, 35);

        frame.add(nameLabel);
        frame.add(rollLabel);
        frame.add(gpaLabel);
        frame.add(nameField);
        frame.add(rollField);
        frame.add(gpaField);
        frame.add(nameButton);
        frame.add(rollButton);
        frame.add(gpaButton);
        frame.add(printButton);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == printButton){
            String n = nameField.getText();
            String r = rollField.getText();
            String g = gpaField.getText();
            if(n.isEmpty() || r.isEmpty() || g.isEmpty()){
                System.out.println("Please enter all values");
            }
            else{
                System.out.println("\nHello, "+n+"\nYour roll number is "+r+"\nYour gpa = "+g);
            }
        }
        if(e.getSource() == nameButton){
            String n = nameField.getText();
            if(n.isEmpty()){
                System.out.println("Please enter name");
            }
            else{
                System.out.println("\nName is "+n);
            }
        }
        if(e.getSource() == rollButton){
            String r = rollField.getText();
            if(r.isEmpty()){
                System.out.println("Please enter roll number");
            }
            else{
                System.out.println("\nRoll Number is "+r);
            }
        }
        if(e.getSource() == gpaButton){
            String g = gpaField.getText();
            if(g.isEmpty()){
                System.out.println("Please enter gpa");
            }
            else{
                System.out.println("\nGPA is "+g);
            }
        }
    }

    public static void main(String args[]){
        MultipleButtons obj = new MultipleButtons();
    }
    
}
