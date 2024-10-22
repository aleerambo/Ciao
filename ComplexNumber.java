class ComplexNumber {
    private final double real;
    private final double imaginary;

    public ComplexNumber(final double real, final double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getImaginary() {
        return 0;
    }

    public double getReal() {
        return 0;
    }
    
    public ComplexNumber plus(final ComplexNumber other) {
        return null;
    }
    
    public ComplexNumber sub(final ComplexNumber other) {
        return null;
    }

    public ComplexNumber times(final ComplexNumber other) {
        return null;
    }

    public ComplexNumber div(final ComplexNumber other) {
        final double commonDenominator = other.getReal() * other.getReal() + other.getImaginary() * other.getImaginary();
        final double realNumerator = this.getReal() * other.getReal() + this.getImaginary() * other.getImaginary();
        final double imaginaryNumerator = other.getReal() * this.getImaginary() - this.getReal() * other.getImaginary();
        return new ComplexNumber(realNumerator / commonDenominator, imaginaryNumerator / commonDenominator);
    }

    public String toString(){
        return "Numero complesso: " + this.getReal() + " " + this.getImaginary() + "j";
    }

    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(3, 2);
        ComplexNumber z2 = new ComplexNumber(1, 4);

        ComplexNumber result = z1.times(z2);

        System.out.println("test times: " + result);
        System.out.println("Risultato atteso: -5 + 14j");
    }
}