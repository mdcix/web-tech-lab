import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingWriteFile implements ActionListener{

    JFrame frame;

    JLabel nameLabel;
    JLabel contentLabel;

    JTextField nameField;
    JTextArea contentArea;

    JButton writeButton; 

    SwingWriteFile(){
        frame = new JFrame("Hello");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(550,650);
		frame.setLayout(null);
        

        nameField = new JTextField();
        contentArea = new JTextArea();
        
        nameLabel = new JLabel("Enter File Name(including .txt)");
        contentLabel = new JLabel("Enter File Content");
        
        writeButton = new JButton("Write");


        writeButton.addActionListener(this);


        nameLabel.setBounds(10, 50, 230, 40);
        contentLabel.setBounds(10, 100, 150, 40);

        nameField.setBounds(250, 50, 200, 40);
        contentArea.setBounds(250,100,200,300);

        writeButton.setBounds(200, 500, 150, 35);

        writeButton.addActionListener(this);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(contentLabel);
        frame.add(contentArea);
        frame.add(writeButton);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==writeButton){
            if(nameField.getText().isEmpty()){
                System.out.println("Enter valid filename ");
            }
            else{
                FileWriter Writer;
                try {
                    Writer = new FileWriter(nameField.getText()); //filename
                    Writer.write(contentArea.getText());    //filecontent
                    Writer.close();
                    System.out.println("New file created and Successfully wrote to the file.");
                } 
                catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        
    }
    public static void main(String args[]){
        SwingWriteFile obj = new SwingWriteFile();
    }
}
