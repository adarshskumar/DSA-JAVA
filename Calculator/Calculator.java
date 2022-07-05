package Calculator;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import inheritance.constructorVsInheritance.C;

public class Calculator implements ActionListener{
    JFrame jf; //to make this global (to acces in below class @override)
    JLabel displayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divideButton;
    JButton multiplyButton;
    JButton subButton;
    JButton addButton;
    JButton clearButton;

    boolean isOperatorClicked= false;

    String oldValue;

    public Calculator(){
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(300,150);


        displayLabel = new JLabel("", SwingConstants.RIGHT);
        displayLabel.setBounds(30,50,540,40); 
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setForeground(Color.white);
        //Label --> can't enter throuh keyboard
        //TextField --> textfield-can enter data through keyboard 
        jf.add(displayLabel);

        sevenButton = new JButton("7");
        sevenButton.setBounds(30,130,80,80);
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(130,130,80,80);
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(230,130,80,80);
        nineButton.addActionListener(this);
        jf.add(nineButton);

        fourButton = new JButton("4");
        fourButton.setBounds(30,230,80,80);
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(130,230,80,80);
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(230,230,80,80);
        sixButton.addActionListener(this);
        jf.add(sixButton);

        oneButton = new JButton("1");
        oneButton.setBounds(30,330,80,80);
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(130,330,80,80);
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(230,330,80,80);
        threeButton.addActionListener(this);
        jf.add(threeButton);

        dotButton = new JButton(".");
        dotButton.setBounds(30,430,80,80);
        dotButton.addActionListener(this);
        jf.add(dotButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(130,430,80,80);
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        equalButton = new JButton("=");
        equalButton.setBounds(230,430,80,80);
        equalButton.setForeground(Color.GREEN);
        equalButton.setFont(new Font("Arial", Font.BOLD,26));
        equalButton.addActionListener(this);
        jf.add(equalButton);

        divideButton = new JButton("/");
        divideButton.setBounds(330,130,80,80);
        divideButton.setForeground(Color.RED);
        divideButton.setFont(new Font("Arial", Font.BOLD,23));
        divideButton.addActionListener(this);
        jf.add(divideButton);

        multiplyButton = new JButton("x");
        multiplyButton.setBounds(330,230,80,80);
        multiplyButton.setForeground(Color.RED);
        multiplyButton.setFont(new Font("Arial", Font.BOLD,23));
        multiplyButton.addActionListener(this);
        jf.add(multiplyButton);

        subButton = new JButton("-");
        subButton.setBounds(330,330,80,80);
        subButton.setForeground(Color.RED);
        subButton.setFont(new Font("Arial", Font.BOLD,26));
        subButton.addActionListener(this);
        jf.add(subButton);

        addButton = new JButton("+");
        addButton.setBounds(330,430,80,80);
        addButton.setForeground(Color.RED);
        addButton.setFont(new Font("Arial", Font.BOLD,26));
        addButton.addActionListener(this);
        jf.add(addButton);

        clearButton = new JButton("C");
        clearButton.setBounds(430,130,80,80);
        clearButton.setForeground(Color.BLACK);
        clearButton.setBackground(Color.YELLOW);
        clearButton.setOpaque(true);
        clearButton.setBorderPainted(false);
        clearButton.setFocusPainted(false);
        clearButton.setFont(new Font("Arial", Font.BOLD,26));
        clearButton.addActionListener(this);
        jf.add(clearButton);
        
 
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // displayLabel.setText("7");
        // jf.getContentPane().setBackground(Color.blue);

        if(e.getSource()==sevenButton){
            if(isOperatorClicked){
                displayLabel.setText("7");
                isOperatorClicked=false;
            } else {
                displayLabel.setText(displayLabel.getText()+"7");
            }
            
        } else if(e.getSource()==eightButton){
            if(isOperatorClicked){
                displayLabel.setText("8");
                isOperatorClicked=false;
            } else {
                displayLabel.setText(displayLabel.getText()+"8");
            }
        }
        else if(e.getSource()==nineButton){
            if(isOperatorClicked){
                displayLabel.setText("9");
                isOperatorClicked=false;
            } else {
                displayLabel.setText(displayLabel.getText()+"9");
            }
        }
        else if(e.getSource()==fourButton){
            if(isOperatorClicked){
                displayLabel.setText("4");
                isOperatorClicked=false;
            } else {
                displayLabel.setText(displayLabel.getText()+"4");
            }
        }
        else if(e.getSource()==fiveButton){
            if(isOperatorClicked){
                displayLabel.setText("5");
                isOperatorClicked=false;
            } else {
                displayLabel.setText(displayLabel.getText()+"5");
            }
        }
        else if(e.getSource()==sixButton){
            if(isOperatorClicked){
                displayLabel.setText("6");
                isOperatorClicked=false;
            } else {
                displayLabel.setText(displayLabel.getText()+"6");
            }
        }
        else if(e.getSource()==oneButton){
            if(isOperatorClicked){
                displayLabel.setText("1");
                isOperatorClicked=false;
            } else {
                displayLabel.setText(displayLabel.getText()+"1");
            }
        }
        else if(e.getSource()==twoButton){
            if(isOperatorClicked){
                displayLabel.setText("2");
                isOperatorClicked=false;
            } else {
                displayLabel.setText(displayLabel.getText()+"2");
            }
        }
        else if(e.getSource()==threeButton){
            if(isOperatorClicked){
                displayLabel.setText("3");
                isOperatorClicked=false;
            } else {
                displayLabel.setText(displayLabel.getText()+"3");
            }
        }
        else if(e.getSource()==dotButton){
            if(isOperatorClicked){
                displayLabel.setText(".");
                isOperatorClicked=false;
            } else {
                displayLabel.setText(displayLabel.getText()+".");
            }
        }
        else if(e.getSource()==zeroButton){
            if(isOperatorClicked){
                displayLabel.setText("0");
                isOperatorClicked=false;
            } else {
                displayLabel.setText(displayLabel.getText()+"0");
            }
        }

        //Equal Button
        else if(e.getSource()==equalButton){


            String newValue=displayLabel.getText();

            float oldValueF = Float.parseFloat(oldValue);
            float newValueF = Float.parseFloat(newValue);

            float result= oldValueF + newValueF;

            displayLabel.setText(result+"");


        }

        //Operator Buttons
        else if(e.getSource()==divideButton){

        }
        else if(e.getSource()==multiplyButton){

        }
        else if(e.getSource()==subButton){
            
        }
        else if(e.getSource()==addButton){
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
        }
        else if(e.getSource()==clearButton){
            displayLabel.setText("");
        }
        
    }



}
