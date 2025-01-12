package zr.yach;

public class ComplexNumberDemo {
   public static void main(String[] args) {
      ComplexNumber z = new ComplexNumber(1, Math.sqrt(3));
      ComplexNumber result = z.pow(4);
      System.out.println("z = " + z);
      System.out.println("z**4 = " + result); // answer: -8 - 13.856i
      System.out.println("argz = " + z.arg());
      System.out.println("Modulus of z: " + z.abs());
      ComplexNumber zzbar = z.multiply(z.conj());
      System.out.println("z * conj_z = " + zzbar);
      ComplexNumber a = new ComplexNumber(2, -3);
      ComplexNumber b = new ComplexNumber(-5, 1);
      ComplexNumber c = a.add(b);
      ComplexNumber d = a.subtract(b);
      ComplexNumber e = a.multiply(b);
      ComplexNumber f = a.multiply(a);
      ComplexNumber g = b.multiply(b);
      ComplexNumber h = a.divide(b);
      System.out.println("a = " + a);
      System.out.println("b = " + b);
      System.out.println("Real part of a: " + a.real());
      System.out.println("Imaginary part of a: " + a.imag());
      System.out.println("Modulus of a: " + a.abs());
      System.out.println("Conjugate of a: " + a.conj());
      System.out.println("a + b = " + c);
      System.out.println("a - b = " + d);
      System.out.println("a * b = " + e);
      System.out.println("a * a = " + f);
      System.out.println("b * b = " + g);
      System.out.println("a / b = " + h);
      System.out.println("a + conj_a = " + a.add(a.conj()));
      ComplexNumber zr = ComplexNumber.polar(1, 3.14159 / 3);
      System.out.println(zr);
   }
}
