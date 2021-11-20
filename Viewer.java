import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class Viewer {

    private JTextField textField;

    public Viewer() {

        textField = new JTextField();

        Font font = new Font("Arial", Font.BOLD, 20);

        textField.setBounds(7, 10, 320, 100);
        textField.setFont(font);

        Controller controllerObj = new Controller(this);

        JButton btnClear=new JButton("C");
        btnClear.setBounds(7, 120, 239, 50);
        btnClear.setBackground(Color.RED);
        btnClear.setForeground(Color.WHITE);
        btnClear.addActionListener(controllerObj); 
        btnClear.setActionCommand("Clear");

        // Division unicode - \u00F7
        JButton btnDivide=new JButton("\u00F7");
        btnDivide.setBounds(253, 120, 75, 50);
        btnDivide.setBackground(Color.DARK_GRAY);
        btnDivide.setForeground(Color.WHITE);
        btnDivide.setFont(font);
        btnDivide.addActionListener(controllerObj); 
        btnDivide.setActionCommand("Division");

        JButton btnSeven=new JButton("7");
        btnSeven.setBounds(7, 177, 75, 50);
        btnSeven.setBackground(Color.LIGHT_GRAY);
        btnSeven.setFont(font);
        btnSeven.addActionListener(controllerObj); 
        btnSeven.setActionCommand("Seven");

        JButton btnEight=new JButton("8");
        btnEight.setBounds(89, 177, 75, 50);
        btnEight.setBackground(Color.LIGHT_GRAY);
        btnEight.setFont(font);
        btnEight.addActionListener(controllerObj);
        btnEight.setActionCommand("Eight");

        JButton btnNine=new JButton("9");
        btnNine.setBounds(171, 177, 75, 50);
        btnNine.setBackground(Color.LIGHT_GRAY);
        btnNine.setFont(font);
        btnNine.addActionListener(controllerObj);
        btnNine.setActionCommand("Nine");


        // Multiply unicode - \u00D7
        JButton btnMultiply=new JButton("\u00D7");
        btnMultiply.setBounds(253, 177, 75, 50);
        btnMultiply.setBackground(Color.DARK_GRAY);
        btnMultiply.setForeground(Color.WHITE);
        btnMultiply.setFont(font);
        btnMultiply.addActionListener(controllerObj);
        btnMultiply.setActionCommand("Multiply");

        JButton btnFour=new JButton("4");
        btnFour.setBounds(7, 234, 75, 50);
        btnFour.setBackground(Color.LIGHT_GRAY);
        btnFour.setFont(font);
        btnFour.addActionListener(controllerObj) ;
        btnFour.setActionCommand("Four");

        JButton btnFive=new JButton("5");
        btnFive.setBounds(89, 234, 75, 50);
        btnFive.setBackground(Color.LIGHT_GRAY);
        btnFive.setFont(font);
        btnFive.addActionListener(controllerObj);
        btnFive.setActionCommand("Five");

        JButton btnSix=new JButton("6");
        btnSix.setBounds(171, 234, 75, 50);
        btnSix.setBackground(Color.LIGHT_GRAY);
        btnSix.setFont(font);
        btnSix.addActionListener(controllerObj);
        btnSix.setActionCommand("Six");

        JButton btnMinus=new JButton("-");
        btnMinus.setBounds(253, 234, 75, 50);
        btnMinus.setBackground(Color.DARK_GRAY);
        btnMinus.setForeground(Color.WHITE);
        btnMinus.setFont(font);
        btnMinus.addActionListener(controllerObj);
        btnMinus.setActionCommand("Minus");

        JButton btnOne=new JButton("1");
        btnOne.setBounds(7,291,75,50);
        btnOne.setBackground(Color.LIGHT_GRAY);
        btnOne.setFont(font); 
        btnOne.addActionListener(controllerObj);
        btnOne.setActionCommand("One");

        JButton btnTwo=new JButton("2");
        btnTwo.setBounds(89, 291, 75, 50);
        btnTwo.setBackground(Color.LIGHT_GRAY);
        btnTwo.setFont(font);
        btnTwo.addActionListener(controllerObj);
        btnTwo.setActionCommand("Two");

        JButton btnThree=new JButton("3");
        btnThree.setBounds(171, 291, 75, 50);
        btnThree.setBackground(Color.LIGHT_GRAY);
        btnThree.setFont(font);
        btnThree.addActionListener(controllerObj);
        btnThree.setActionCommand("Three");
 
        JButton btnPlus=new JButton("+");
        btnPlus.setBounds(253, 291, 75, 50);
        btnPlus.setBackground(Color.DARK_GRAY);
        btnPlus.setForeground(Color.WHITE);
        btnPlus.setFont(font);
        btnPlus.addActionListener(controllerObj);
        btnPlus.setActionCommand("Plus");

        JButton btnZero=new JButton("0");
        btnZero.setBounds(7, 348, 159, 50);
        btnZero.setBackground(Color.LIGHT_GRAY);
        btnZero.setFont(font);
        btnZero.addActionListener(controllerObj);
        btnZero.setActionCommand("Zero");    

        JButton btnDecimalPoint=new JButton(".");
        btnDecimalPoint.setBounds(171, 348, 75, 50);
        btnDecimalPoint.setBackground(Color.LIGHT_GRAY);
        btnDecimalPoint.setFont(font);
        btnDecimalPoint.addActionListener(controllerObj);
        btnDecimalPoint.setActionCommand("DcmlPoint");

        JButton btnEqual=new JButton("=");
        btnEqual.setBounds(253, 348, 75, 50);
        btnEqual.setBackground(Color.BLUE);
        btnEqual.setForeground(Color.WHITE);
        btnEqual.setFont(font);
        btnEqual.addActionListener(controllerObj);
        btnEqual.setActionCommand("Equal");
    
        JFrame jf=new JFrame("Calculator Frame");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;

        jf.setSize(350, 460);
        jf.getContentPane().setBackground(Color.BLACK);
        jf.setLayout(null);
        jf.add(textField);
        jf.add(btnClear);
        jf.add(btnDivide);

        jf.add(btnSeven);
        jf.add(btnEight);
        jf.add(btnNine);
        jf.add(btnMultiply);

        jf.add(btnFour);
        jf.add(btnFive);
        jf.add(btnSix);
        jf.add(btnMinus);

        jf.add(btnOne);
        jf.add(btnTwo);
        jf.add(btnThree);
        jf.add(btnPlus);

        jf.add(btnZero);
        jf.add(btnDecimalPoint);
        jf.add(btnEqual);

        jf.setVisible(true);
    }

    public void update(String text) {
        textField.setText(text);
    }

}