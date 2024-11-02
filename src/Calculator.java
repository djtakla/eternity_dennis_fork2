import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame {
    //initialize
    double number;
    char op;
    final int FRAME_WIDTH = 700, FRAME_HEIGHT = 700;
    final int HEIGHT = 40, WIDTH = 40, SPACE = 10;
    final int TOPX = 30, TOPY = 50;

    //initialize calculator texts and variables
    final String[] digitButtonsText = { "7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "+/-", "." };
    final String[] operatorButtonsText = { "/", "sqrt", "x", "-", "1/x", "+", "=", "%" };
    final String[] specialButtonsText = { "Back", "C", "CE" };
    final String[] transcendentalButtonsText = { "st.dev", "x^y", "(ab)^x", "mad", "arccos(x)", "log_b(x)", "sinh(x)" };
    boolean setClear = true;

    //initialize labels
    Label displayLabel = new Label("0", Label.RIGHT);
    Label memLabel = new Label(" ", Label.RIGHT);

    //initialize custom classes
    DigitButton[] digitButtons = new DigitButton[digitButtonsText.length];
    OperatorButton[] operatorButtons = new OperatorButton[operatorButtonsText.length];
    SpecialButton[] specialButtons = new SpecialButton[specialButtonsText.length];
    TranscendentalButton[] transcendentalButtons = new TranscendentalButton[transcendentalButtonsText.length];
    Functions functions = new Functions();

    /**
     * parameterized constructor that initializes the calculator's graphical frame and sets up components.
     * @param frameText the title text displayed on the calculator frame.
     */
    public Calculator(String frameText) {
        super(frameText);
        int tempX = TOPX, tempY = TOPY;
        displayLabel.setBounds(tempX, tempY, 240, HEIGHT);
        displayLabel.setBackground(Color.BLACK);
        displayLabel.setForeground(Color.WHITE);
        add(displayLabel);

        //set the coordinates for digit buttons
        int digitX = TOPX + WIDTH + SPACE, digitY = TOPY + 2 * (HEIGHT + SPACE);
        tempX = digitX; tempY = digitY;
        for(int i = 0; i < digitButtons.length; i++) {
            digitButtons[i] = new DigitButton(tempX, tempY, WIDTH, HEIGHT, digitButtonsText[i], this);
            digitButtons[i].setForeground(Color.BLACK);
            tempX += WIDTH + SPACE;
            if((i + 1) % 3 == 0) {
                tempX = digitX;
                tempY += HEIGHT + SPACE;  //This goes from +2 * (h+v) to +5 * (h+v) therefore special buttons need to be +6 * (h+v) onwards. Comment by Dennis.
            }
        }

        //set the coordinates for operator buttons
        int opsX = digitX + 2 * (WIDTH + SPACE) + SPACE, opsY = digitY;
        tempX = opsX; tempY = opsY;
        for(int i = 0; i < operatorButtonsText.length; i++) {
            tempX += WIDTH + SPACE;
            operatorButtons[i] = new OperatorButton(tempX, tempY, WIDTH, HEIGHT, operatorButtonsText[i], this);
            operatorButtons[i].setForeground(Color.BLACK);
            if((i + 1) % 2 == 0) {
                tempX = opsX;
                tempY += HEIGHT + SPACE;
            }
        }

        //set the coordinates for special buttons
        tempX = TOPX + 1 * (WIDTH + SPACE); tempY = TOPY + 1 * (HEIGHT + SPACE);
        for(int i = 0; i < specialButtonsText.length; i++) {
            specialButtons[i] = new SpecialButton(tempX, tempY, WIDTH * 2, HEIGHT, specialButtonsText[i], this);
            specialButtons[i].setForeground(Color.BLACK);
            tempX = tempX + 2 * WIDTH + SPACE;
        }
        
        //set the coordinates for transcendental buttons
        tempX = TOPX + 1 * (WIDTH + SPACE); // +1 * (w+h) is the indentation from the left side??? not sure
        tempY = TOPY + 6 *(HEIGHT + SPACE); //Since the last set of buttons are at Y-coordinate  +5*(h+v) this must start at 6*(h+v)
        for(int i = 0; i < transcendentalButtonsText.length; i++) {
            transcendentalButtons[i] = new TranscendentalButton(tempX, tempY, WIDTH * 2, HEIGHT, transcendentalButtonsText[i], this);
            transcendentalButtons[i].setForeground(Color.BLACK);
            tempX=tempX+2*WIDTH+SPACE; //This is where you adjust the width of the button and the hspace I think...

            //Need to check if more than 3 buttons already if yes do this adjust tempY
            if((i + 1) % 3 == 0) {
                tempX = TOPX + 1 * (WIDTH + SPACE); // make sure first button of next row is also indented.
                tempY += HEIGHT + SPACE; // make sure you move to next row
            }
        }

        setLayout(null);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setVisible(true);
    }

    /**
     * this function formats a given double value as a string, removing any unnecessary decimal.
     * @param temp the double value to be formatted.
     * @return a string representation of the double value, without ".0" if it represents a whole number.
     */
    static String getFormattedText(double temp) {
        String resText = "" + temp;
        if(resText.lastIndexOf(".0") > 0) resText = resText.substring(0, resText.length() - 2);
        return resText;
    }
}