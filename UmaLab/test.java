import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JButton button = new JButton("Command");
        TextField text = new TextField();
        frame.add(button);
        frame.add(text);
        frame.setSize(300,300);
        button.setBounds(90,50,100,50);
        text.setBounds(90,100,75,50);
        frame.setLayout(null);
        frame.setVisible(true);
        

        button.addActionListener(new ActionListener()
        {
            int c = 0 ;
            public void actionPerformed(ActionEvent e)
            {
                c+=1;
                text.setText(Integer.toString(c));
            }
        });
  

       
    }
    
}


       
