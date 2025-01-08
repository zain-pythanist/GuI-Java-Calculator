import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
public class ali {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(400,550);
        frame.setTitle("Calculator");
        
        JLabel label1=new JLabel("Standard");
        label1.setBounds(50,5,130,50);

        JTextField field1=new JTextField();
        field1.setBounds(50,50,280,130);

        JButton button11=new JButton("1/x");
        button11.setBounds(50,200,75,50);
        JButton button22=new JButton("^");
        button22.setBounds(120,200,75,50);
        JButton button33=new JButton("%"); 
        button33.setBounds(190,200,75,50);
        JButton button44=new JButton("/");
        button44.setBounds(260,200,75,50);

        JButton button111=new JButton("7");
        button111.setBounds(50,260,75,50);
        JButton button222=new JButton("8");
        button222.setBounds(120,260,75,50);
        JButton button333=new JButton("9");
        button333.setBounds(190,260,75,50);
        JButton button444=new JButton("*");
        button444.setBounds(260,260,75,50);

        JButton button1111=new JButton("4");
        button1111.setBounds(50,320,75,50);
        JButton button2222=new JButton("5");
        button2222.setBounds(120,320,75,50);
        JButton button3333=new JButton("6");
        button3333.setBounds(190,320,75,50);
        JButton button4444=new JButton("*");
        button4444.setBounds(260,320,75,50);

        JButton buttonone=new JButton("1");
        buttonone.setBounds(50,380,75,50);
        JButton buttontwo=new JButton("2");
        buttontwo.setBounds(120,380,75,50);
        JButton buttontree=new JButton("3");
        buttontree.setBounds(190,380,75,50);
        JButton buttonfour=new JButton("-");
        buttonfour.setBounds(260,380,75,50);

     

        JButton button1=new JButton("+/-");
        button1.setBounds(50,440,75,50);
        JButton button2=new JButton("0");
        button2.setBounds(120,440,75,50);
        JButton button3=new JButton(".");
        button3.setBounds(190,440,75,50);
        JButton button4=new JButton("=");
        button4.setBounds(260,440,75,50);

        frame.setLayout(null);
        frame.add(field1);
        frame.add(label1);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button11);
        frame.add(button22);
        frame.add(button33);
        frame.add(button44);
        frame.add(button111);
        frame.add(button222);
        frame.add(button333);
        frame.add(button444);
        frame.add(button1111);
        frame.add(button2222);
        frame.add(button3333);
        frame.add(button4444);
        frame.add(buttonone);
        frame.add(buttontwo);
        frame.add(buttontree);
        frame.add(buttonfour);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    }
}