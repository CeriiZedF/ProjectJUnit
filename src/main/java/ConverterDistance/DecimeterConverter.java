package ConverterDistance;

public class DecimeterConverter extends UnitConverter {
    @Override
    public double convert(double value) {
        return value * DM_TO_M;
    }
}
