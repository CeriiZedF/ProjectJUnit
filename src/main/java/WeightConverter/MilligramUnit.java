package WeightConverter;

public class MilligramUnit implements WeightUnit {
    @Override
    public double convertToBase(double value) {
        return value / 1000000;
    }

    @Override
    public double convertFromBase(double baseValue) {
        return baseValue * 1000000;
    }
}
