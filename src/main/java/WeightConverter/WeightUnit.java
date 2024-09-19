package WeightConverter;

public interface WeightUnit {
    double convertToBase(double value); // По умолчанию -  килограмы
    double convertFromBase(double baseValue);
}
