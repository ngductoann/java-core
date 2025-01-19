# INTRODUCTION

<!--toc:start-->
- [INTRODUCTION](#introduction)
  - [Variable](#variable)
    - [Keyword](#keyword)
    - [What is Variable](#what-is-variable)
    - [Data Type](#data-type)
    - [Expressions](#expressions)
  - [Java's Primitive Types](#javas-primitive-types)
    - [What actually is an integer?](#what-actually-is-an-integer)
    - [Wrapper Classes](#wrapper-classes)
    - [Overflow and Underflow in Java](#overflow-and-underflow-in-java)
    - [byte, short, int, long](#byte-short-int-long)
      - [The byte data type](#the-byte-data-type)
      - [The short data type](#the-short-data-type)
      - [Size of Primitive Types and Width](#size-of-primitive-types-and-width)
      - [Using a numeric literal character suffix](#using-a-numeric-literal-character-suffix)
      - [How big is the different between an int and a long?](#how-big-is-the-different-between-an-int-and-a-long)
      - [When is L required](#when-is-l-required)
  - [Casting in Java](#casting-in-java)
    - [Rule for declaring multiple variables in one statement](#rule-for-declaring-multiple-variables-in-one-statement)
    - [Assign expressions to variables with data types that don't match](#assign-expressions-to-variables-with-data-types-that-dont-match)
    - [Casting in Java](#casting-in-java)
    - [Int is a default data type in Java](#int-is-a-default-data-type-in-java)
  - [Floating-point Numbers](#floating-point-numbers)
    - [Single and Double Precision](#single-and-double-precision)
    - [float and double and numeric literal suffix](#float-and-double-and-numeric-literal-suffix)
  - [The char and boolean primitive data types](#the-char-and-boolean-primitive-data-types)
    - [Comparing the char to the String](#comparing-the-char-to-the-string)
    - [char Data Type](#char-data-type)
      - [Unicode](#unicode)
      - [Assigning value to a char variable](#assigning-value-to-a-char-variable)
    - [Boolean Primitive Type](#boolean-primitive-type)
  - [Operators](#operators)
<!--toc:end-->


## Variable

### Keyword

- A keyword is any one of number of reserved words, that have a predefineed
  meaning in the Java language.
- Exp: Int, int,...

### What is Variable

- Variable are a way to store information in our computer.
- Variable define in a program, can be accessed by a name we give them. The
  computer does the hard work, of figuring out where thay stored, in the
  computer's RAM (random access memory).

### Data Type

- There a lots of different types of data, that we can define for our variables.
  Collectively, these are khown as data types.

```java
// int is data types
// myFirstVariable is variable name
int myFirstVariable = 5;
```

### Expressions

- An expression is a coding construct, that evaluates to a single value.
- The expression is the code segment that is on the right side of the equals
  sign in a assignment or declaration statement.
- This code can be a simple literal value, like **number 5**, or it can be a
  complex mathematical equation using multiple literal values and mathematical
  operators.
- Exp:

```java
int mySecondVariable = (10 + 5) + (2 * 10);

int myTotal = myFirstVariable + mySecondVariable;
```

## Java's Primitive Types

- In Java, primitive types are the most basic data types.
- The eight primitive data types:
  | Whole number | Real number <br> (floating point or decimal) |
  |--------------|-----------------------------------------|
  | byte | float |
  | short | double |
  | int | |
  | long | |

  | Single Character | Boolean value |
  | ---------------- | ------------- |
  | char             | boolean       |

- **Remember**: primitive data types are simply placeholders in memory for a
  value.

### What actually is an integer?

- An integer is a whole number, meaning it doesn't contain a fractional
  element, or decimal.
- There's a specified range of values allowed for the **int** (which is true for
  the most data types). What this mean is, that the allowable range of values is
  **NOT infinite**.

```java
int myVariable = 10000; // int keyword define for Integer type
int myMinIntValue = Integer.MIN_VALUE; // minimum value in data type Integer.
int myMaxIntValue = Integer.MAX_VALUE; // maximum value in data type Integer.

// Integer is a Wrapper Class
```

### Wrapper Classes

- A class is building block for object-oriented programming, and allows us to
  build custom data types.
- A wrapper class provides simple operations, as well as some basic information
  about the primitive data type, which can't be stored on the primitive itself
  (saw that MIN_VALUE, MAX_VALUE, are element of this basic information, for the
  int data type).
- The primitive types, and their respective wrapper classes:

| Primitive | Wrapper Class |
| --------- | ------------- |
| byte      | Byte          |
| short     | Short         |
| char      | Char          |
| int       | Int           |
| long      | Long          |
| float     | Float         |
| double    | Double        |
| boolean   | Boolean       |

```java
System.out.println("Integer Value Range (" + myMinIntValue + " to " + myMaxIntValue + ")");
// Integer Value Range (-2147483648 to 2147483647)

System.out.println("Busted Max value = " + (myMaxIntValue + 1));
//Busted Max value = -2147483648

System.out.println("Busted Min value = " + (myMinIntValue - 1));
// Busted Min value = 2147483647
```

### Overflow and Underflow in Java

- If put a value larger than the maximum value into an int, called an Overflow
  situation. And similarly, if try to put value smaller then the minimum value
  in to an int, is a Underflow.
- These situations are also known as integer wraparound
- The maximum value, when it overflows, wraps around to the minimum value, and
  just continues processing without an error. The minimum value, when it
  underflow, wraps around to the maximum value, and continues processing.
- If assign a numeric literal value to a data type that is outside of the range,
  the compiler **does** give you an error. Example:

```java
int willThisCompile = 2147483648;
```

- If using numeric literal in the expression, the compiler still won't try to
  evaluate this expression, and the code will compile, resulting in an overflow
  condition:

```java
int willThisCompile = (Integer.MAX_VALUE + 1);
int willThisCompile = (2147483647 + 1);
```

- In Java, cannot put commas in a numeric literal. Example:

```java
int myMaxIntTest = 2,147,483,647; // is not valid
int myMaxIntTest = 2_147_483_647; // is valid
```

### byte, short, int, long

- Java has four primitive data type used to store whole numbers, these are the
  byte, the short the int, and the long.

| Whole number Data Type | Wrapper Class | What's noteworthy                                |
| ---------------------- | ------------- | ------------------------------------------------ |
| byte                   | Byte          | Has the smallest range                           |
| short                  | Short         |                                                  |
| int                    | Int           | Java's default data type for <br /> whole number |
| long                   | Long          | Has the largest range                            |

#### The byte data type

- Range byte data type from -128 to 127.
- One reason to use a byte is, if you had a requirement to store a lot of
  numbers that are within that range, and you want to save memory or try to boost
  performance.
- A smaller data type takes up less space and can be quicker to access.
- Another reason to use the byte instead of an int is if you wanted to document
  that you are only expecting or using a small range of values.

#### The short data type

- Range short data type from -32768 to 32767.
- Both the byte and the short, have the same overflow and underflow issue as the
  int data type has, but obviously with their own range of numbers.

#### Size of Primitive Types and Width

Size, or Width, is the amount of space that determines (or limits) the range of
values we've been discussing:

| Data Type | Width(in bits) | Min Value   | Max Value  |
| --------- | -------------- | ----------- | ---------- |
| byte      | 8              | -128        | 127        |
| short     | 16             | -32768      | 32767      |
| int       | 32             | -2147483648 | 2147483647 |

#### Using a numeric literal character suffix

- The number 100, by default, is as int. Java allows certain numeric literal to
  have a suffix appended to the value, to force it to be a different data type
  from the default type.
- The long is one of these types and it's suffix is an 'L'. This is one of the
  flew instances Java is not case sensitive, a lowercase 'l' or and uppercase 'L'
  at the end of a whole number mean the same thing - the number is a long.

#### How big is the different between an int and a long?

| Data Type | Width (in bits) | Min Value            | Max Value           |
| --------- | --------------- | -------------------- | ------------------- |
| int       | 32              | -2147483648          | 2147483647          |
| long      | 64              | -9223372036854775808 | 9223372036854775807 |

- Int will always fit into a long data type because a long is twice its width,
  so Java is smart enough to know that. Java will convert an int to a long,
  instead of giving us an error.
- But if we try to type in a literal value for a number that is bigger than an
  int can handle without the long suffix L, we'll get an error.

```java
long bigLongLiteralValue = 2_147_483_647; // correct (is variable in range of int data type)
long bigLongLiteralValue = 2_147_483_647_234; //error integer number too large
```

&rarr; Clearly, Java is telling us it's still treating that number as an integer.

#### When is L required

- A numeric literal that exceeds Integer.MAX_VALUE must use the 'L' suffix.
- Cannot create a numeric literal in Java, that exceeds Integer.MAX_VALUE,
  without using the 'L' suffix, we'll always get the error 'integer numeric to large'.

## Casting in Java

### Rule for declaring multiple variables in one statement

- Cannot declare variables with different data types in a single statement. If
  declare multiple variables of the same data type in a single statement, you must
  specify the data type only once before any variable names.

Exp:

```java
// Correct declare variable
short myMinShortValue = Short.MIN_VALUE;
int myMinIntValue = Integer.MIN_VALUE;

byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;

// Error declare
/**
* short firstShort = 1, int firstInteger = 2;
* byte firstByte = 1, byte secondByte = 2;
* error because use comma to split different variable
**/
```

### Assign expressions to variables with data types that don't match

- The java compiler does not attempt to evaluate the value, in a variable, when
  it's used in a calculation, so it doesn't know if the value fits, and throws an
  error. Exp:

  ```java
  byte myNewByteValue = (myMinByteValue / 2);
  // throw exception:
  // error: incompatible types: possible lossy conversion from int to byte
  ```

- if calculation uses literal values, Java can figure out the end result at
  compile time, and whether fit into the variable, and won't throw an error if it
  does. Exp:

```java
byte myNewByteValue = (128 / 2);
```

- In both example, and int result is being returned from the calculation, but in
  the second example, Java know the returned value can fit into a byte.

### Casting in Java

- Casting means to treat or convert a number, from one type to another. We put
  the type we want the number to be, in parentheses like this:

```java
(byte) (myMinByteValue / 2);
```

### Int is a default data type in Java

What effect does int, being the default value, have on our code?
follow:

- This statement works because the result is an int, and assigning it to an int
  variable is fine.

```java
int myTotal = (myMinIntValue / 2);
```

- This statement doesn't work, because the expression (myMinShortValue / 2) is
  an int, and can't be assigning to a short, because the compiler won't guess the
  result.

```java
short myNewShortValue = (myMinShortValue / 2);
```

- This statement works, because the result of (-128 / 2) is an int, but when
  calculations use only literal value, the compiler can determine the result
  immediately, and knows the value fits into a short.

```java
short myNewShortValue = (-128 / 2);
```

- finally, the code works because we tell the compiler we know that we're doing
  by using this cast, and the compiler doesn't give an error:

```java
short myNewShortValue = (short) (myMinShortValue / 2);
```

## Floating-point Numbers

- Floating-point numbers have fractional parts that we express with a decimal
  point. Floating-point numbers are aka real number. Exp:

| Whole number example | Floating Point Examples |
| -------------------- | ----------------------- |
| 3                    | 3.14159                 |
| 100000               | 10.0                    |
| -21231231L           | -0.666666667            |

- Use a Floating-point number when we need more precision in calculations.
- In Java, have two primitive types for expressing floating-point numbers, the
  float and the double.
  | Java's Data Types <br /> for floating point numbers |
  |------------------------------------------------------------------|
  | float <br /> **Double** <br /> The double is Java's default type for any decimal or real number |

### Single and Double Precision

- Precision refers to the format and amount of space occupied by the relevant
  type.

| Data Type | Width (in bits) | Min Value | Max Value |
| --------- | --------------- | --------- | --------- |
| float     | 32              | 1.4E-45   | 3.402E38  |
| double    | 64              | 4.9E-324  | 1.797E308 |

- Can see the e-notation followed by either a positive or negative number.

### float and double and numeric literal suffix

> [!IMPORTANT]
>
> - The double data type is Java's default type for real number
> - Any number with a decimal is a double. Exp: 10.5 is a double by default in Java.

- The double data type can be specified as a numeric literal with a suffix of
  either lowercase 'd', or uppercase 'D', but because doubles are the default in
  Java, the suffix is optional to use.
- The float data type can be specified as a numeric literal with a suffix of
  lowercase 'f', or uppercase 'F'. This suffix is required if you are assigning a
  real number to a variable that was declared with a float type.

## The char and boolean primitive data types

### Comparing the char to the String

| char                                 | String                                |
| ------------------------------------ | ------------------------------------- |
| - Holds one, and only one, character | - Can hold multiple characters        |
| - Literal enclosed in Single Quotes  | - Literal enclosed in Double Quotes   |
| - exp: char myChar = 'D';            | exp: String myString = "Hello world"; |

### char Data Type

- A char occupied two bytes of memory, or 16 bits, and thus has a width of 16.
- The reason it's not just a single byte, is that a is stored as a 2 byte
  number, similar to the short. This number get mapped to a single character by
  Java:
  - So, when you print a char, you will see the mapped character, and not the
    representative number.
  - And you can use single quote and a character literal to assign a value to a
    char, which is much simpler than looking up the representative number.

#### Unicode

Unicode is and international encoding standard for use with different languages
and script by which each letter, digit, or symbol is assigned a unique numeric
value that applies across different platforms and programs.

#### Assigning value to a char variable

- There are three ways to assign value to a char: Each of these methods,
  represents storing the letter, capital D, in memory.

| Assignment Type     | Example Code            |
| ------------------- | ----------------------- |
| a literal character | char myChar = 'D';      |
| a unicode value     | char myChar = '\u0044'; |
| an integer value    | char myChar = 68;       |

### Boolean Primitive Type

- A boolean value allows for two opposite choices, true of false, yes or no, one
  or zero. In java terms, we've got a boolean primitive type, and it can be set to
  two values only, either true or false.
- The wrapper for boolean is Boolean with a capital B.

## Operators

- Operator in java are special symbol that perform specific operations on ones,
  two or three operands, and then return result.
- Exp:

```java
long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
// symbols: +, *, ... there are many other operators in Java.
```
