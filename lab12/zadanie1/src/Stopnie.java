import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Stopnie extends JFrame {
    private JTextField celsiusField, fahrenheitField;
    private JButton clearButton;
    private JLabel celsiusLabel, fahrenheitLabel;

    public static void main(String[] args) {
        Stopnie panel = new Stopnie();
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setSize(400, 100);
        panel.setVisible(true);
    }

    public Stopnie() {
        super("Konwerter Temperatury");
        setLayout(new GridLayout(3, 2));

        celsiusLabel = new JLabel("Celsjusz: ");
        add(celsiusLabel);

        celsiusField = new JTextField();
        add(celsiusField);
        celsiusField.addActionListener(new CelsiusListener());

        fahrenheitLabel = new JLabel("Fahrenheit: ");
        add(fahrenheitLabel);

        fahrenheitField = new JTextField();
        add(fahrenheitField);
        fahrenheitField.addActionListener(new FahrenheitListener());


        clearButton = new JButton("Wyczyść pola");
        add(clearButton);
        clearButton.addActionListener(new ClearListener());
    }

    private class CelsiusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double celsius = Double.parseDouble(celsiusField.getText());
                fahrenheitField.setText(String.format("%.2f", Konwerter.convertToFahrenheit(celsius)));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Nieprawidłowy format liczby", "", JOptionPane.ERROR_MESSAGE);
                celsiusField.setText("");
                fahrenheitField.setText("");
            }
        }
    }

    private class FahrenheitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double fahrenheit = Double.parseDouble(fahrenheitField.getText());
                celsiusField.setText(String.format("%.2f", Konwerter.convertToCelsius(fahrenheit)));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Nieprawidłowy format liczby", "", JOptionPane.ERROR_MESSAGE);
                celsiusField.setText("");
                fahrenheitField.setText("");
            }
        }
    }


    private class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            celsiusField.setText("");
            fahrenheitField.setText("");
        }
    }
}