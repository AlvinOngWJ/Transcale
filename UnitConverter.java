// The UnitConverter class is responsible for the actual conversion of units.
public class UnitConverter {
    // Declare and initialize unit conversion factors
    private final double[] conversionFactors = {1.0, 0.01, 0.001, 0.000621371, 0.000539957};

    public double convert(double inputValue, int unit1Index, int unit2Index) {
        // Calculate the output value
        double outputValue = inputValue * conversionFactors[unit1Index] / conversionFactors[unit2Index];
        return outputValue;
    }
}
