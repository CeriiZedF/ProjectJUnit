package WeightConverter;

public class GramUnit implements WeightUnit {
    @Override
    public double convertToBase(double value) {
        return value / 1000;
    }

    @Override
    public double convertFromBase(double baseValue) {
        return baseValue * 1000;
    }
}
