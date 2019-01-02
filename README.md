## Chapter 1 - Java Fundamentals
The Origins of Java

- Java was conceived by James Goling, Patrick Naughton, Chris Warth, Ed Frank, and Mike Sheridan at **Sun Microsystems** in **1991**

- purpose is to create consumer electronic devices such as toasters, microwave oven and remote control.

- Problem is most computer languages were design into machine code that specific only in the target CPU.

- Attempt to find better solution, Gosling and the others worked on a portable, cross-platform language that could produce a code in any CPU's and Environments

- It was the Internet that ultimately led to Java's large-scale success.

Java's Lineage: C and C++

- Java's closest ancestor are C and C++.

- From C, Java inherits its syntax

- Java's Object model is adapted from C++.

## Java's Magic: The Bytecode
- The key that allowed Java to address both the security and the portability problems is that the output of a Java compiler is not executable, rather its a bytecode.

- **Bytecode** is a highly optimized set of instructions that can be executed via *Java Virtual Machine*, which is a part of Java Runtime Environment(JRE).

- JVM was designed as an interpreted of bytecodes.

Java servlet  is a program that executes on a server.

## The Java Buzzwords
Title | Description
--- | ---
Simple | Java is easy to learn and use
Secure | Java provides security
Portable | Java programs can be execute in any environment
Object-Oriented | Java embodies mordern Object-Oriented

### Object-Oriented Programming
At the center of Java is object-oriented programming(OOP). The object-oriented methodology is inseparable from Java.

## Java's
- Encapsulation (Black Box) - is a programming mechanism that binds together and the data it manipulates, and that keeps both safe from outside interference and misuse.

> The code and data consitute a class are called members or member variables/instance variables.

- Polymorphism - *from Greek, meaning "Many Forms"* is the quality that allows on interface to access a general class of actions.

- Inheritance - is the process by which one object can acquire the propertiesof another object.

## The Java Development Kit
Before we can compile and run Java programs, we need a Java Development Kit(JDK). The JDK supplies two primary program. The first is **javac**, which is the Java compiler. The second is **java**, which is the standard Java Interpreter and is also referred to as the *application launcher*. JDK runs in Command-prompt.

### The First Simple Program
- In Java, a source file is officially called a **compilation unit**. It requires **.java** filename extension.

## Compiling the Program
To compile the **Example** program, execute the compiler, **javac**, specifying the name of the source file on the command line.

> javac Example.java

The javac compiler creates a file called **Example.class** that contains the *bytecode*. Bytecode must be executed by a *Java Virtual Machine*. Thus the output of **javac** is not a code that can be directly executed.

To actually run the program, we must use Java Interpreter, **java**. To do so, pass the class name Example as a command-line argument, as shown here:

> java Example

Java line by line, **comments** are ignored by the compiler

- **Variable* is a named memory location that can be assigned a value. Further, the value of a variable can be change during the execution of the program.
