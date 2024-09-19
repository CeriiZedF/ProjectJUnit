package ConverterDistance;

public class MeterConverter extends UnitConverter {
    @Override
    public double convert(double value) {
        return value * M_TO_M;
    }
}
