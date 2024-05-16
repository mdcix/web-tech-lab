import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test_modified implements ActionListener{

    JFrame frame;
    JButton button;
    TextField text;
    int c=0;
    

    public test_modified(){

        frame = new JFrame();
        button = new JButton("Command");
        text = new TextField();

        frame.add(button);
        frame.add(text);

        button.addActionListener(this);

        frame.setSize(300,300);
        button.setBounds(90,50,100,50);
        text.setBounds(90,100,75,50);

        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            c+=1;
            text.setText(Integer.toString(c));
        }
        
    }
    
    public static void main(String[] args)
    {
        test_modified obj = new test_modified();
    }

   
    
}


       
