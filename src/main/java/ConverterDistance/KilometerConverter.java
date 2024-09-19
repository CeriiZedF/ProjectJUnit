package ConverterDistance;

public class KilometerConverter extends UnitConverter {
    @Override
    public double convert(double value) {
        return value * KM_TO_M;
    }
}
