import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The ConversionActionListener class handles the action of converting units.
public class ConversionActionListener implements ActionListener {
    private UnitConverter unitConverter;
    private JComboBox<String> unit1;
    private JComboBox<String> unit2;
    private JTextField value1;
    private JTextField value2;

    public ConversionActionListener(UnitConverter unitConverter, JComboBox<String> unit1, JTextField value1, 
                                    JComboBox<String> unit2, JTextField value2) {
        this.unitConverter = unitConverter;
        this.unit1 = unit1;
        this.unit2 = unit2;
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Fetch the input value and the selected units
        double inputValue = Double.parseDouble(value1.getText());
        int unit1Index = unit1.getSelectedIndex();
        int unit2Index = unit2.getSelectedIndex();

        // Use the UnitConverter to calculate the output value
        double outputValue = unitConverter.convert(inputValue, unit1Index, unit2Index);

        // Display the output value
        value2.setText(Double.toString(outputValue));
    }
}
