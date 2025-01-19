# Document

<!--toc:start-->
- [Document](#document)
  - [Java's Code Units](#javas-code-units)
  - [if Then Structure](#if-then-structure)
    - [if with an Else block](#if-with-an-else-block)
    - [if with an else if and else block](#if-with-an-else-if-and-else-block)
  - [The Method](#the-method)
    - [The Benefits of the method](#the-benefits-of-the-method)
    - [Structure of the Method](#structure-of-the-method)
    - [Structure of the Method with parameters](#structure-of-the-method-with-parameters)
    - [Parameters or Arguments](#parameters-or-arguments)
    - [Method structure with parameters and return type](#method-structure-with-parameters-and-return-type)
    - [The return statement](#the-return-statement)
  - [Method Overloading](#method-overloading)
    - [More on Method Signatures](#more-on-method-signatures)
    - [Valid Overloaded Methods](#valid-overloaded-methods)
<!--toc:end-->

## Java's Code Units

Writing code is similar to writing a document. It consists of special
hierarchical units, which together form a whole. There are:

- The **Expression** - An expression computes to a single value.
- The **Statement** - Statements are stand alone units of work.
- And **Code Blocks** - A code block is a set of zero, one, or more statements,
  usually grouped together in some way to achieve a single goal.

## if Then Structure

```java
if (condition) {
  // Code in block will execute only if condition is true

  // block can contain 1 or many statements
}
```

Exp:

```java
int score = 5000;

if (score == 5000) {
    System.out.println("Your score was 5000");
}
```

### if with an Else block

```java
if (condition) {
  // code in block will execute only if condition is true
} else {
  // code in block will execute only if condition is false
}
```

Exp:

```java
if (score < 5000) {
    System.out.println("Your score was less than 5000");
} else {
    System.out.println("Got here");
}
```

### if with an else if and else block

```java
if (condition){
  // Code in block will execute only if firstCondition is true
} else if (secondCondition) {
  // Code in block will execute if firstCondition is false
  // and secondCondition is true

  // NOTE: THERE IS NO LIMIT TO THE NUMBER OF CONDITIONS THAT CAN BE TESTED
} else {
  // Code in block will execute if all conditions above are false

  // NOTE: THE ELSE BLOCK BE LAST BUT IS OPTIONAL
}
```

Exp:

```java

if (score < 5000 && score > 1000) {
    System.out.println("Your score was less than 5000 but greater than 1000");
} else if (score < 1000) {
    System.out.println("Your score was less than 1000");
} else {
    System.out.println("Got here");
}
```

## The Method

> Java's description of the method is:
> A method declares executable code that can be invoked, passing and fixed
> number of values as arguments.

### The Benefits of the method

A method is a way of reducing code duplication. A method can be executed many
times with potentially different results, by passing data to the method in the
form of arguments.

Example code duplication:

```java
boolean gameOver = true;
int score = 800;
int levelCompleted = 5;
int bonus = 100;

int finalScore = score;

if (gameOver) {
    finalScore += (levelCompleted * bonus);
    finalScore += 1000;
    System.out.println("Your final score was " + finalScore);
}

// code is duplication
score = 10000;
levelCompleted = 8;
bonus = 200;

finalScore = score;

if(gameOver) {
    finalScore += (levelCompleted * bonus);
    finalScore += 1000;
    System.out.println("Your final score was " + finalScore);
}
```

### Structure of the Method

- The simplest ways to declare a method:

```java
public static void methodName(){
  // Method statements form the method body
}
```

- This method has a name, but takes no data in, and return no data from the
  method (which is what the special word void means in this declaration).
- Exp:

```java
public static void calculateScore() {
    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

    int finalScore = score;

    if (gameOver) {
        finalScore += (levelCompleted * bonus);
        finalScore += 1000;
        System.out.println("Your final score was " + finalScore);
    }
}
```

### Structure of the Method with parameters

- Method parameters in the declaration:

```java
public static void methodName(p1type p1, p2type p2, {more}){
  // Method statements form the method body
}
```

- Example:

```java
public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    int finalScore = score;

    if (gameOver) {
        finalScore += (levelCompleted * bonus);
        finalScore += 1000;
        System.out.println("Your final score was " + finalScore);
  }
}
```

- And call for run method:

```java
calculateScore(gameOver, score, levelCompleted, bonus);
```

### Parameters or Arguments

- Parameters and arguments are term that are often used interchangeable. But
  technically, a parameter is the definition as shown in the method declaration,
  and the arguments will be the value that's passed to the method when we call it.

### Method structure with parameters and return type

- Similar to declaring a variable with a type, we can declare a method to have a
  type.

```java
public static dataType methodName(p1type p1, p2type p2, {more}){
  // Method statements
  return value;
}
```

- This declared type is placed just before the method name. A return statement
  is required in the code block, as show one the side, which returns the results
  form the method.

### The return statement

- Java states that a **return** statement returns control to the invoker of a
  method.
- The most common usage of the return statement, is to return a value back from
  a method.
- In a method that doesn't return anything, in other words, a method declared
  with void as the return type, a return statement is not required. It is assumed
  and execution is returned after the last line of code in the method is executed.
- But in methods that do return data, a return statement, with a value is
  required.

## Method Overloading

- Method overloading occurs when a class has multiple methods with the name
  name, but the methods are declared with different parameters. So, you can
  execute multiple methods with the same name, but call it with different
  arguments.
- Java can resolve which method it needs to execute based on the arguments being
  passed when the method is invoked.

### More on Method Signatures

- A method signature consists of the name of the method, and the uniqueness of the
  declaration of its parameters.
- In other words, a signature is unique, not just by the method name, but in
  combination with the number of parameters, their types, and order in which they
  are declared.
- A method's return type is not part of the signature.
- A parameter name is also not part of the signature.

### Valid Overloaded Methods

- The type, order and number of parameters, in conjunction with the name, make a
  method signature unique.
- A unique method signature is the key for the java compiler, to determine if a
  method is overloaded correctly.
- The name of the parameters is not part of the signature, and therefore it
  doesn't matter, from java's point of view, what we call our parameters.
- Example some valid overloaded methods:

```java
public static void doSomething(int parameterA){
  // method body
}

public static void doSomething(float parameterA){
  // method body
}

public static void doSomething(int parameterA, float parameterB){
  // method body
}

public static void doSomething(float parameterA, int parameterB){
  // method body
}

public static void doSomething(int parameterA, int parameterB, float parameterC){
  // method body
}
```

- Invalid overloaded methods:

```java

public static void doSomething(int parameterA){
  // method body
}

public static void doSomething(int parameterB){
  // method body
}

public static int doSomething(int parameterA){
  // method body
  return 0;
}
```
