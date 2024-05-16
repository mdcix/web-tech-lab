import javax.swing.*;
import java.awt.event.*;

public class UpdateLabel implements ActionListener{

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

    JLabel showNameLabel;
    JLabel showRollLabel;
    JLabel showGpaLabel;

    UpdateLabel(){
        
        frame = new JFrame("Hello");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450,550);
		frame.setLayout(null);
        

        nameField = new JTextField();
        rollField = new JTextField();
        gpaField = new JTextField();
        
        nameLabel = new JLabel("Name");
        rollLabel = new JLabel("Roll Number");
        gpaLabel = new JLabel("GPA");
        
        printButton = new JButton("Show All");
        nameButton = new JButton("Show Name");
        rollButton = new JButton("Show Roll No");
        gpaButton = new JButton("Show GPA");

        showNameLabel = new JLabel("Given Name");
        showRollLabel = new JLabel("Given Roll Number");
        showGpaLabel = new JLabel("Given GPA");

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
        gpaButton.setBounds(20, 250, 150, 35);
        printButton.setBounds(200, 250, 150, 35);

        showNameLabel.setBounds(20, 350, 200, 40);
        showRollLabel.setBounds(20, 400, 200, 40);
        showGpaLabel.setBounds(20, 450, 200, 40);

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
        frame.add(showNameLabel);
        frame.add(showRollLabel);
        frame.add(showGpaLabel);
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
                showNameLabel.setText("Given Name : "+n);
                showRollLabel.setText("Given Roll Number : "+r);
                showGpaLabel.setText("Given GPA : "+g);
            }
        }
        if(e.getSource() == nameButton){
            String n = nameField.getText();
            if(n.isEmpty()){
                System.out.println("Please enter name");
            }
            else{
                System.out.println("\nName is "+n);
                showNameLabel.setText("Given Name : "+n);
            }
        }
        if(e.getSource() == rollButton){
            String r = rollField.getText();
            if(r.isEmpty()){
                System.out.println("Please enter roll number");
            }
            else{
                System.out.println("\nRoll Number is "+r);
                showRollLabel.setText("Given Roll Number : "+r);
            }
        }
        if(e.getSource() == gpaButton){
            String g = gpaField.getText();
            if(g.isEmpty()){
                System.out.println("Please enter gpa");
            }
            else{
                System.out.println("\nGPA is "+g);
                showGpaLabel.setText("Given GPA : "+g);
            }
        }
    }

    public static void main(String args[]){
        UpdateLabel obj = new UpdateLabel();
    }
    
}
