package ConverterDistance;

public class CentimeterConverter extends UnitConverter {
    @Override
    public double convert(double value) {
        return value * CM_TO_M;
    }
}
