import javax.swing.*;
import java.awt.event.*;

public class BasicInput implements ActionListener{

    JFrame frame;
    JLabel nameLabel;
    JLabel rollLabel;
    JLabel gpaLabel;
    JTextField name;
    JTextField roll;
    JTextField gpa;
    JButton printButton; 

    BasicInput(){
        
        frame = new JFrame("Hello");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450,350);
		frame.setLayout(null);
        

        name = new JTextField();
        roll = new JTextField();
        gpa = new JTextField();
        nameLabel = new JLabel("Name");
        rollLabel = new JLabel("Roll Number");
        gpaLabel = new JLabel("GPA");
        printButton = new JButton("PRINT");

        printButton.addActionListener(this);


        nameLabel.setBounds(30, 50, 100, 40);
        rollLabel.setBounds(30, 100, 100, 40);
        gpaLabel.setBounds(30, 150, 100, 40);
        name.setBounds(150, 50, 200, 40);
        roll.setBounds(150, 100, 200, 40);
        gpa.setBounds(150, 150, 200, 40);
        printButton.setBounds(125, 200, 150, 50);

        frame.add(nameLabel);
        frame.add(rollLabel);
        frame.add(gpaLabel);
        frame.add(name);
        frame.add(roll);
        frame.add(gpa);
        frame.add(printButton);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == printButton){
            String n = name.getText();
            String r = roll.getText();
            String g = gpa.getText();
            if(n.isEmpty() || r.isEmpty() || g.isEmpty()){
                System.out.println("Please enter all values");
            }
            else{
                System.out.println("\nHello, "+n+"\nYour roll number is "+r+"\nYour gpa = "+g);
            }
        }
    }

    public static void main(String args[]){
        BasicInput obj = new BasicInput();
    }
    
}
