package swingCal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.sqrt;


public class Calculator extends JFrame implements ActionListener {

    public Integer result = 0;
    public Integer currentNum = 0;
    public boolean isPlus = false,
            isTimes = false,
            isMinus = false,
            isDivide = false,
            isMod = false,
            isOver = false,
            isSqrt = false;


    JPanel topPanel = new JPanel();
    JPanel middlePanel = new JPanel();
    JPanel bottomPanel = new JPanel();
    JTextField number = new JTextField();

    JButton backspace = new JButton("Backspace");
    JLabel temp = new JLabel("    ");
    JButton CE = new JButton("CE");
    JButton C = new JButton("C");

    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenu helpMenu = new JMenu("Help");
    JMenuItem exitMenuItem = new JMenuItem("Exit");

    public Calculator(){
        super("Java Swing Calculator");
        setSize(800,600);
        setLayout(new GridLayout(3,1));

        add(topPanel);
        add(middlePanel);
        add(bottomPanel);

        topPanel.setLayout(new FlowLayout());
        number.setColumns(30);
        number.setEditable(false);
        topPanel.add(number);

        middlePanel.setLayout(new GridLayout(1,4));
        middlePanel.add(backspace);
        middlePanel.add(temp);
        middlePanel.add(CE);
        middlePanel.add(C);

        bottomPanel.setLayout(new GridLayout(4,5));
        JButton num7 = new JButton("7");
        bottomPanel.add(num7);
        JButton num8 = new JButton("8");
        bottomPanel.add(num8);
        JButton num9 = new JButton("9");
        bottomPanel.add(num9);
        JButton divide = new JButton("/");
        bottomPanel.add(divide);
        JButton sqrt = new JButton("sqrt");
        bottomPanel.add(sqrt);
        JButton num4 = new JButton("4");
        bottomPanel.add(num4);
        JButton num5 = new JButton("5");
        bottomPanel.add(num5);
        JButton num6 = new JButton("6");
        bottomPanel.add(num6);
        JButton times = new JButton("*");
        bottomPanel.add(times);
        JButton over = new JButton("1/x");
        bottomPanel.add(over);
        JButton num1 = new JButton("1");
        bottomPanel.add(num1);
        JButton num2 = new JButton("2");
        bottomPanel.add(num2);
        JButton num3 = new JButton("3");
        bottomPanel.add(num3);
        JButton minus = new JButton("-");
        bottomPanel.add(minus);
        JButton mod = new JButton("%");
        bottomPanel.add(mod);
        JButton num0 = new JButton("0");
        bottomPanel.add(num0);
        JButton reverse = new JButton("+/-");
        bottomPanel.add(reverse);
        JButton dot = new JButton(".");
        bottomPanel.add(dot);
        JButton plus = new JButton("+");
        bottomPanel.add(plus);
        JButton equal = new JButton("=");
        bottomPanel.add(equal);

        exitMenuItem.addActionListener(this);
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        fileMenu.add(exitMenuItem);
        setJMenuBar(menuBar);

        backspace.addActionListener(this);
        CE.addActionListener(this);
        C.addActionListener(this);
        num0.addActionListener(this);
        num1.addActionListener(this);
        num2.addActionListener(this);
        num3.addActionListener(this);
        num4.addActionListener(this);
        num5.addActionListener(this);
        num6.addActionListener(this);
        num7.addActionListener(this);
        num8.addActionListener(this);
        num9.addActionListener(this);
        divide.addActionListener(this);
        sqrt.addActionListener(this);
        times.addActionListener(this);
        over.addActionListener(this);
        minus.addActionListener(this);
        mod.addActionListener(this);
        reverse.addActionListener(this);
        dot.addActionListener(this);
        plus.addActionListener(this);
        equal.addActionListener(this);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "Exit":
                System.exit(0);
                break;
            case "0":
                currentNum = currentNum*10 + 0;
                number.setText(currentNum.toString());
                break;
            case "1":
                currentNum = currentNum*10 + 1;
                number.setText(currentNum.toString());
                break;
            case "2":
                currentNum = currentNum*10 + 2;
                number.setText(currentNum.toString());
                break;
            case "3":
                currentNum = currentNum*10 + 3;
                number.setText(currentNum.toString());
                break;
            case "4":
                currentNum = currentNum*10 + 4;
                number.setText(currentNum.toString());
                break;
            case "5":
                currentNum = currentNum*10 + 5;
                number.setText(currentNum.toString());
                break;
            case "6":
                currentNum = currentNum*10 + 6;
                number.setText(currentNum.toString());
                break;
            case "7":
                currentNum = currentNum*10 + 7;
                number.setText(currentNum.toString());
                break;
            case "8":
                currentNum = currentNum*10 + 8;
                number.setText(currentNum.toString());
                break;
            case "9":
                currentNum = currentNum*10 + 9;
                number.setText(currentNum.toString());
                break;
            case "=":
                //show result on screen
                if(isPlus){
                    Double finalAnswer = currentNum.doubleValue() + result.doubleValue();
                    number.setText((finalAnswer).toString());
                }else if(isTimes){
                    Double finalAnswer = currentNum.doubleValue() * result.doubleValue();
                    number.setText((finalAnswer).toString());
                }else if(isMinus){
                    Double finalAnswer = result.doubleValue() - currentNum.doubleValue();
                    number.setText((finalAnswer).toString());
                }else if(isDivide){
                    Double finalAnswer = result.doubleValue() / currentNum.doubleValue();
                    number.setText((finalAnswer).toString());
                }else if(isMod){
                    Double finalAnswer = result.doubleValue() % currentNum.doubleValue();
                    number.setText((finalAnswer).toString());
                }else if(isOver){
                    Double finalAnswer = 1 / result.doubleValue();
                    number.setText((finalAnswer).toString());
                }else if(isSqrt){
                    Double finalAnswer = sqrt(result.doubleValue());
                    number.setText((finalAnswer).toString());
                }
                break;
            case "+":
                result = currentNum;
                currentNum = 0;
                number.setText(currentNum.toString());
                isPlus = true;
                break;
            case "-":
                result = currentNum;
                currentNum = 0;
                number.setText(currentNum.toString());
                isMinus = true;
                break;
            case "*":
                result = currentNum;
                currentNum = 0;
                number.setText(currentNum.toString());
                isTimes = true;
                break;
            case "/":
                result = currentNum;
                currentNum = 0;
                number.setText(currentNum.toString());
                isDivide = true;
                break;
            case "+/-":
                currentNum = 0 - currentNum;
                number.setText(currentNum.toString());
                break;
            case "%":
                result = currentNum;
                currentNum = 0;
                number.setText(currentNum.toString());
                isMod = true;
                break;
            case "1/x":
                result = currentNum;
                currentNum = 0;
                number.setText(currentNum.toString());
                isOver = true;
                break;
            case "sqrt":
                result = currentNum;
                currentNum = 0;
                number.setText(currentNum.toString());
                isSqrt = true;
                break;
            case "C":
                currentNum = 0;
                number.setText(currentNum.toString());
                break;
            case "CE":
                currentNum = 0;
                result = 0;
                isPlus = false;
                isTimes = false;
                isMinus = false;
                isDivide = false;
                isMod = false;
                isOver = false;
                isSqrt = false;
                number.setText("");
                break;
            case "Backspace":
                currentNum = currentNum / 10;
                number.setText(currentNum.toString());
                break;
        }
    }
}
