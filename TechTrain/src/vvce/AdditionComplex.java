package vvce;

class AdditionComplex {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3 = new Complex();
        c1.getData(3.0f, 4.0f); //Java uses double as default so we need to convert it to floating point number 
        c2.getData(5.0f, 2.0f);
        c3.addComplex(c1, c2);
        c3.printData();
    }
}

class Complex {
    float real; float imag;
    public void getData(float x, float y) { 
        real = x;
        imag = y;
    }

    public void addComplex(Complex c1, Complex c2) {  
        real = c1.real + c2.real;
        imag = c1.imag + c2.imag;
    }

    public void printData() {
        System.out.println(real + "+" + imag + "i");
    }
} 

/*class Main {
public static void main(String[] args) {
    Complex c1 = new Complex();
    Complex c2 = new Complex();
    Complex c3 = new Complex();
    c1.getData(3.0f, 4.0f);
    c2.getData(5.0f, 2.0f);
    c3 = c2.addComplex(c1); //c3 = c1.addComplex(c2);
    c3.printData();
}
}

class Complex {
float real; float imag;
public void getData(float x, float y) { 
    real = x;
    imag = y;
}
Complex addComplex(Complex c) {
    Complex ct = new Complex();
    ct.real = real + c.real;
    ct.imag = imag + c.imag;
    return ct;
}

public void printData() {
    System.out.println(real + "+" + imag + "i");
}
}*/


