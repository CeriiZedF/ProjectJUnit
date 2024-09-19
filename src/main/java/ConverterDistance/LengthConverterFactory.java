package ConverterDistance;

public class LengthConverterFactory {
    public static LengthConverter getConverter(String unit) {
        switch (unit.toLowerCase()) {
            case "mm":
                return new MillimeterConverter();
            case "cm":
                return new CentimeterConverter();
            case "dm":
                return new DecimeterConverter();
            case "m":
                return new MeterConverter();
            case "km":
                return new KilometerConverter();
            default:
                throw new IllegalArgumentException("Unknown unit: " + unit);
        }
    }
}
