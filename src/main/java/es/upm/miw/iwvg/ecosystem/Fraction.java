package es.upm.miw.iwvg.ecosystem;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public boolean isPropia() {
        return this.numerator < this.denominator;
    }

    public double suma(Fraction fraction) {
        double numeratorFractionDenominator = (double) this.numerator * (double) fraction.getDenominator();
        double denominatorFractionNumerator = (double) this.denominator * (double) fraction.getNumerator();
        return (numeratorFractionDenominator + denominatorFractionNumerator) / (double) (this.denominator * fraction.getDenominator());
    }

    public double resta(Fraction fraction) {
        double numeratorFractionDenominator = (double) this.numerator * (double) fraction.getDenominator();
        double denominatorFractionNumerator = (double) this.denominator * (double) fraction.getNumerator();
        return (numeratorFractionDenominator - denominatorFractionNumerator) / (double) (this.denominator * fraction.getDenominator());
    }

}