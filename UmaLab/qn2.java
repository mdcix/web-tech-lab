import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class qn2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Test1");
        JLabel l1 = new JLabel("The");
        l1.setBounds(50,20, 100,30); 

        JLabel l2 = new JLabel("last");
        l2.setFont(new Font("Arial",Font.ITALIC, 12));
        l2.setBounds(75,20, 100,30);

        JLabel l3 = new JLabel("word is");
        l3.setBounds(100,20, 100,30); 

        JLabel l4 = new JLabel("big");
        l4.setFont(new Font("Arial",Font.BOLD, 22));
        l4.setBounds(150,20, 100,30);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.setSize(300,100); 
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}