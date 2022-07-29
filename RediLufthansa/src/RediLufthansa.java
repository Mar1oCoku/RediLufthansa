

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 

public class RediLufthansa extends JFrame implements ActionListener
{
	
    private JLabel labelQuestion;
    private JLabel labelWeight;
    private JTextField fieldWeight;
    private JButton buttonTellMe;
 
    public RediLufthansa() 
    {
        super("Welcome to Lufthansa");
 
        initComponents();
 
        setSize(240, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    private void initComponents() 
    {
        labelQuestion = new JLabel("Kur duhet te filloj?");
        labelWeight = new JLabel("Sa e deshironi pagen?:");
        fieldWeight = new JTextField(5);
        buttonTellMe = new JButton("Me thuaj");
 
        setLayout(new FlowLayout());
 
        add(labelQuestion);
        add(labelWeight);
        add(fieldWeight);
        add(buttonTellMe);
 
        buttonTellMe.addActionListener(this);
    }
 
    public void actionPerformed(ActionEvent event) 
    {
        String message = "Redi, Mire se erdhe ne Lufthansa, paga juaj do te jete %.1f $";
 
        float paga = Float.parseFloat(fieldWeight.getText());
        float sasia = calculatePagaAmount(paga);
 
        message = String.format(message, sasia);
 
        JOptionPane.showMessageDialog(this, message);
    }
 
    private float calculatePagaAmount(float paga) 
    {
        return (paga  * 2f);
    }
 
    public static void main(String[] args) {
        new RediLufthansa().setVisible(true);
    }
}
