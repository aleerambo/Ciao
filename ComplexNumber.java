class ComplexNumber {
    private final double real;
    private final double imaginary;

    public ComplexNumber(final double real, final double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public ComplexNumber plus(final ComplexNumber other) {
        return new ComplexNumber(this.getReal() + other.getReal(), this.getImaginary() + other.getImaginary());
    }

    public ComplexNumber sub(final ComplexNumber other) {
        return new ComplexNumber(this.getReal() - other.getReal(), this.getImaginary() - other.getImaginary());
    }

    public ComplexNumber times(final ComplexNumber other) {
        return new ComplexNumber(this.getReal() * other.getReal() - this.getImaginary() * other.getImaginary(),
                this.getReal() * other.getImaginary() + this.getImaginary() * other.getReal());
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
        System.out.println(new ComplexNumber(4, 8).toString());
        ComplexNumber num1 = new ComplexNumber(2, 4);
        ComplexNumber num2  = new ComplexNumber(3, 8);

        if (num1.plus(num2) == new ComplexNumber(5, 12)) {
            System.out.println("Sum Test Passed");
        }else{
            System.out.println("Sum Test Failed");
        }

        if(num1.sub(num2) == new ComplexNumber(-1, -4)){
            System.out.println("Sub Test Passed");
        }else{
            System.out.println("Sub Test Failed");
        }

        ComplexNumber z1 = new ComplexNumber(3, 2);
        ComplexNumber z2 = new ComplexNumber(1, 4);

        ComplexNumber result = z1.times(z2);

        if(result == new ComplexNumber(-5, 14)){
            System.out.println("test times: true");
        }else{
            System.out.println("test times: false");
        }
    }
}


