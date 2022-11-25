public class Complex {
    private int real,imaginar;
    public Complex(int real, int imaginar)
    {
        this.real = real;
        this.imaginar = imaginar;
    }

    public Complex() {
        this(0, 0);
    }

    public Complex addNumbers(Complex a, Complex b)
    {
        return new Complex(a.real+b.real, b.imaginar+a.imaginar);
    }
    public Complex subNumbers(Complex a, Complex b)
    {
        Complex temp = new Complex(0, 0);
        temp.real = a.real - b.real;
        temp.imaginar = a.imaginar - b.imaginar;
        return temp;
    }
    public Complex multiplyNumbers(Complex a, Complex b)
    {
        Complex temp = new Complex(0,0);
        temp.real = ((a.real*b.real)-(a.imaginar*b.imaginar));
        temp.imaginar = (a.real*b.imaginar+(a.imaginar*b.real));
        return temp;
    }

    public Complex multiplyScalar(Complex a, int nr)
    {
        Complex temp = new Complex(0,0);
        temp.real = a.real*nr;
        temp.imaginar = a.imaginar*nr;
        return temp;
    }
    public String toString()
    {
        return (this.real + " + " + this.imaginar + "i");
    }

}
