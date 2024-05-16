import javax.swing.*;
import java.awt.event.*;

public class BasicFormat implements ActionListener{

    JFrame frame;
    //Declare all the required buttons,textfields etc 

    BasicFormat(){  //constructor
        
        frame = new JFrame("Hello");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(450,350);
	frame.setLayout(null);
        
        //define all the componets and add to frame
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // if(e.getSource() == buttonName){
        //     // write what to do if this button is pressed
        // }
    }

    public static void main(String args[]){
        BasicFormat obj = new BasicFormat();
    }
    
}
