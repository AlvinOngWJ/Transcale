import javax.swing.*;
import java.awt.*;

// Main class
public class UnitConversionCalculator {
    // Declare components at class level
    private JComboBox<String> unit1;
    private JComboBox<String> unit2;
    private JTextField value1;
    private JTextField value2;

    // Start of the program
    public static void main(String[] args) {
        new UnitConversionCalculator();
    }

    // Constructor
    public UnitConversionCalculator() {
        // Create the frame
        JFrame frame = new JFrame("Unit Conversion Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);

        // Create panel and layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 3));

        // Create and populate combo boxes
        unit1 = new JComboBox<>(new String[]{"Meter", "Centimeter", "Millimeter", "Miles", "Nautical miles"});
        unit2 = new JComboBox<>(new String[]{"Meter", "Centimeter", "Millimeter", "Miles", "Nautical miles"});

        // Create text fields
        value1 = new JTextField(10);
        value2 = new JTextField(10);
        value2.setEditable(false);

        // Create the UnitConverter object
        UnitConverter unitConverter = new UnitConverter();

        // Create and add button
        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(new ConversionActionListener(unitConverter, unit1, value1, unit2, value2));

        // Add components to panel
        panel.add(unit1);
        panel.add(value1);
        panel.add(convertButton);
        panel.add(unit2);
        panel.add(value2);

        // Add panel to frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
