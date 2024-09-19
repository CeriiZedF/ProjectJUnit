package WeightConverter;

public class CentnerUnit implements WeightUnit {
    @Override
    public double convertToBase(double value) {
        return value * 100;
    }

    @Override
    public double convertFromBase(double baseValue) {
        return baseValue / 100;
    }
}
