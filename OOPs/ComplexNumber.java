import java.util.*;

public class ComplexNumber {

    public static class Complex{
        int x; //real
        int y; //imaginary

    Complex(int x,int y){
        this.x = x;
        this.y = y;
    }

    void print(){
        System.out.println(x + " + " + y + "i");
    }
    Complex add(Complex c) {
        int real = this.x + c.x;
        int imag = this.y + c.y;
        return new Complex(real, imag);
    }
    Complex multiply(Complex c) {
        int real = (this.x * c.x) - (this.y * c.y);
        int imag = (this.x * c.y) + (this.y * c.x);
        return new Complex(real, imag);
    }
}
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 5);

        System.out.print("C1: ");
        c1.print();

        System.out.print("C2: ");
        c2.print();

        // Addition
        Complex sum = c1.add(c2);
        System.out.print("Addition: ");
        sum.print();

        // Multiplication
        Complex product = c1.multiply(c2);
        System.out.print("Multiplication: ");
        product.print();
    }
}
