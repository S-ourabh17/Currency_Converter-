package model;

public class DefaultConversionStrategy implements ConversionStrategy {

    @Override
    public double convert(double amount, double rate) {
        return amount * rate;
    }
}
