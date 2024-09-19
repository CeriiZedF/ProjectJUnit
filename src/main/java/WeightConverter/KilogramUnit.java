package WeightConverter;

public class KilogramUnit implements WeightUnit {
    @Override
    public double convertToBase(double value) {
        return value;
    }

    @Override
    public double convertFromBase(double baseValue) {
        return baseValue;
    }
}
