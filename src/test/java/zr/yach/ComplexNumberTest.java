package zr.yach;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.apache.commons.math3.complex.Complex;

public class ComplexNumberTest {
   private static final double DELTA = 1.e-15;
   private double real = 3.0;
   private double imaginary = 4.0;
   private ComplexNumber myComplex = new ComplexNumber(real, imaginary);
   private Complex apacheComplex = new Complex(real, imaginary);

   @Test
   public void testComplexNumberCreation() {
      Assertions.assertEquals(apacheComplex.getReal(), myComplex.real(), DELTA);
      Assertions.assertEquals(apacheComplex.getImaginary(), myComplex.imag(), DELTA);
   }

   @Test
   public void testComplexNumberAbs() {
      double myAbs = myComplex.abs();
      double apacheAbs = apacheComplex.abs();

      Assertions.assertEquals(apacheAbs, myAbs, DELTA);
   }

   @Test
   public void testComplexNumberArg() {
      double myArg = myComplex.arg();
      double apacheArg = apacheComplex.getArgument();

      Assertions.assertEquals(apacheArg, myArg, DELTA);
   }

   @Test
   public void testComplexNumberConjugate() {
      ComplexNumber myConjugate = myComplex.conj();
      Complex apacheConjugate = apacheComplex.conjugate();

      Assertions.assertEquals(apacheConjugate.getReal(), myConjugate.real(), DELTA);
      Assertions.assertEquals(apacheConjugate.getImaginary(), myConjugate.imag(), DELTA);
   }

   @Test
   public void testComplexNumberAdd() {
      ComplexNumber myAdd = myComplex.add(new ComplexNumber(1.0, 2.0));
      Complex apacheAdd = apacheComplex.add(new Complex(1.0, 2.0));

      Assertions.assertEquals(apacheAdd.getReal(), myAdd.real(), DELTA);
      Assertions.assertEquals(apacheAdd.getImaginary(), myAdd.imag(), DELTA);
   }

   @Test
   public void testComplexNumberSubtract() {
      ComplexNumber mySubtract = myComplex.subtract(new ComplexNumber(1.0, 2.0));
      Complex apacheSubtract = apacheComplex.subtract(new Complex(1.0, 2.0));

      Assertions.assertEquals(apacheSubtract.getReal(), mySubtract.real(), DELTA);
      Assertions.assertEquals(apacheSubtract.getImaginary(), mySubtract.imag(), DELTA);
   }

   @Test
   public void testComplexNumberMultiply() {
      ComplexNumber myMultiply = myComplex.multiply(new ComplexNumber(2.0, 3.0));
      Complex apacheMultiply = apacheComplex.multiply(new Complex(2.0, 3.0));

      Assertions.assertEquals(apacheMultiply.getReal(), myMultiply.real(), DELTA);
      Assertions.assertEquals(apacheMultiply.getImaginary(), myMultiply.imag(), DELTA);
   }

   @Test
   public void testComplexNumberDivide() {
      ComplexNumber myDivide = myComplex.divide(new ComplexNumber(2.0, 3.0));
      Complex apacheDivide = apacheComplex.divide(new Complex(2.0, 3.0));

      Assertions.assertEquals(apacheDivide.getReal(), myDivide.real(), DELTA);
      Assertions.assertEquals(apacheDivide.getImaginary(), myDivide.imag(), DELTA);
   }

   @Test
   public void testComplexNumberPow() {
      int exponent = 7;
      ComplexNumber myResult = myComplex.pow(exponent);
      Complex apacheResult = apacheComplex.pow(exponent);

      Assertions.assertEquals(apacheResult.getReal(), myResult.real(), DELTA);
      Assertions.assertEquals(apacheResult.getImaginary(), myResult.imag(), DELTA);
   }

   @Test
   public void testComplexNumberToString() {
      ComplexNumber complex = new ComplexNumber(3.0, 4.0);
      String expected = "3.0 + 4.0i";
      String actual = complex.toString();

      Assertions.assertEquals(expected, actual);
   }
}
