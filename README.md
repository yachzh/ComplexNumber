# Complex Number
---------------

## Introduction
---------------

This Maven project provides a Java library for working with complex numbers. The `ComplexNumber` class represents a complex number with real and imaginary parts, and provides methods for performing various operations on complex numbers.

## Features
---------------

* Create complex numbers with real and imaginary parts
* Perform basic arithmetic operations (addition, subtraction, multiplication, division)
* Calculate the magnitude (modulus) and phase (argument) of a complex number
* Create complex numbers from polar coordinates
* Raise a complex number to an integer power using the `pow(int n)` method

## Getting Started
---------------

### Building the Project

To build the project, run the following command in the terminal:

```bash
mvn clean package
mvn install
```

This will compile the source code, run the tests, and package the JAR file.

### Using the Library

To use the `ComplexNumber` library in your own Maven project, add the following dependency to your `pom.xml` file:
```xml
<dependency>
    <groupId>zr.yach</groupId>
    <artifactId>ComplexNumber</artifactId>
    <version>1.0.0</version>
</dependency>
```

Alternatively, you can add the generated `ComplexNumber-1.0.0.jar` to your Java classpath manually. 
You can do this by running the following command:
```bash
export CLASSPATH=/path/to/ComplexNumber-1.0.0.jar:$CLASSPATH
```

Replace `/path/to/ComplexNumber-1.0.0.jar` with the actual path to the JAR file on your system.

Then, import the `ComplexNumber` class in your Java code:
```java
import zr.yach.ComplexNumber;
```

Create a new `ComplexNumber` object and start using its methods:
```java
ComplexNumber z = new ComplexNumber(3, 4); // create a complex number with real part 3 and imaginary part 4
double magnitude = z.abs(); // calculate the magnitude of the complex number
ComplexNumber zSquared = z.pow(2); // raise z to the power of 2
```

