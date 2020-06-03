public class ComplexNumber {

    private double real;
    private double imaginary;

    /*constructor*/

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /*getters*/

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    /*others*/

    public void add(double real, double imaginary){

        ComplexNumber temp = new ComplexNumber(real, imaginary);
         add(temp);
    }

    public void add(ComplexNumber number){

        ComplexNumber temp = number;
        ComplexNumber tempThis = this;

        tempThis.real = temp.getReal() + tempThis.getReal();
        tempThis.imaginary = temp.getImaginary() + tempThis.getImaginary();
    }

    public void subtract(double real, double imaginary){

        ComplexNumber temp = new ComplexNumber(real, imaginary);
        subtract(temp);
    }

    public void subtract(ComplexNumber number){

        ComplexNumber temp = number;
        ComplexNumber tempThis = this;

        tempThis.real = tempThis.getReal() - temp.getReal();
        tempThis.imaginary = tempThis.getImaginary() - temp.getImaginary();
    }
}
