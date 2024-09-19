package WeightConverter;

import java.util.HashMap;
import java.util.Map;

public class WeightConverter {
    private Map<String, WeightUnit> units = new HashMap<>();

    public WeightConverter() {
        units.put("mg", new MilligramUnit());
        units.put("g", new GramUnit());
        units.put("kg", new KilogramUnit());
        units.put("centner", new CentnerUnit());
        units.put("tonne", new TonneUnit());
    }

    public double convert(double value, String fromUnit, String toUnit) {
        WeightUnit from = units.get(fromUnit);
        WeightUnit to = units.get(toUnit);

        if (from == null || to == null) {
            throw new IllegalArgumentException("Unknown unit: " + fromUnit + " or " + toUnit);
        }

        double baseValue = from.convertToBase(value);
        return to.convertFromBase(baseValue);
    }
}
