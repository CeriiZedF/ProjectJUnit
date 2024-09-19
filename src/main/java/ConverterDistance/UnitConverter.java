package ConverterDistance;

public abstract class UnitConverter implements LengthConverter {
    protected static final double MM_TO_M = 0.001;
    protected static final double CM_TO_M = 0.01;
    protected static final double DM_TO_M = 0.1;
    protected static final double M_TO_M = 1.0;
    protected static final double KM_TO_M = 1000.0;
}
