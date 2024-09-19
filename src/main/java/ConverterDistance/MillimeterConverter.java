package ConverterDistance;

public class MillimeterConverter extends UnitConverter {
    @Override
    public double convert(double value) {
        return value * MM_TO_M;
    }
}
