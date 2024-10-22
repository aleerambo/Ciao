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

        // Test toString()
        System.out.println(new ComplexNumber(4, 8).toString());
        
        ComplexNumber num1 = new ComplexNumber(2, 4);
        ComplexNumber num2  = new ComplexNumber(3, 8);

        // Test sum()
        ComplexNumber expectedSum = new ComplexNumber(5, 12);
        ComplexNumber resultSum = num1.plus(num2);
        if (expectedSum.getReal() == resultSum.getReal() && expectedSum.getImaginary() == resultSum.getImaginary()) {
            System.out.println("Sum Test PASSED");
        }else{
            System.out.println("Sum Test FAILED");
        }

        // Test sub()
        ComplexNumber expectedSub = new ComplexNumber(-1, -4);
        ComplexNumber resultSub = num1.sub(num2);
        if(expectedSub.getReal() == resultSub.getReal() && expectedSub.getImaginary() == resultSub.getImaginary()){
            System.out.println("Sub Test PASSED");
        }else{
            System.out.println("Sub Test FAILED");
        }

        // Test times()
        ComplexNumber expectedTimes = new ComplexNumber(-26, 28);
        ComplexNumber resultTimes = num1.times(num2);
        if(expectedTimes.getReal() == resultTimes.getReal() && expectedTimes.getImaginary() == resultTimes.getImaginary()){
            System.out.println("Times Test: PASSED");
        }else{
            System.out.println("Times test: FAILED");
        }
    }
}


