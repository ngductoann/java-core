# Control Flow

<!--toc:start-->

- [Control Flow](#control-flow)
  - [The switch statement](#the-switch-statement)
    - [Switch Value Types](#switch-value-types)
    - [Fall through in switch statement](#fall-through-in-switch-statement)
    - [Traditional Switch Statement vs. Enhanced Switch Statement](#traditional-switch-statement-vs-enhanced-switch-statement)
    - [When to use yield in a switch](#when-to-use-yield-in-a-switch)
  - [Looping](#looping)
    - [Java supports three statements for looping](#java-supports-three-statements-for-looping)
    - [The for statement](#the-for-statement)
    - [The break statement](#the-break-statement)
    - [Java has two types of while loops](#java-has-two-types-of-while-loops)
    - [continue keyword](#continue-keyword)
  - [Parsing value and Reading Input using System.console()](#parsing-value-and-reading-input-using-systemconsole) - [Reading data from the console](#reading-data-from-the-console) - [Exception, Catching an exception and The try Statement](#exception-catching-an-exception-and-the-try-statement) - [The Scanner class and new keyword](#the-scanner-class-and-new-keyword) - [Instantiating Scanner](#instantiating-scanner)
  <!--toc:end-->

## The switch statement

```java
switch(case) {
    case x:
      // code for value == x
      break;
    case y:
      // Code for value == y
      break;
    default:
      // Code for value not equal to x or y
}
```

### Switch Value Types

| Valid Switch Value Types        |
| ------------------------------- |
| byte, short, int, char          |
| Byte, Short, Integer, Character |
| String                          |
| enum                            |

> [!IMPORTANT]
> Cannot use long, float, double or boolean or their wrappers.

### Fall through in switch statement

Once a switch case label matches the switch variable, no more case are checked.

Any code after the case label where there was a match found, will be executed,
until a break statement, or the end of switch statement occurs.

Without a break statement, execution will continue to fall through any case
labels declared below the matching one, and execute each case's code.

### Traditional Switch Statement vs. Enhanced Switch Statement

- Traditional Switch Statement

```java
switch (switchValue) {
    case 1:
        System.out.println("Value was 1");
        break;
    case 2:
        System.out.println("Value was 2");
        break;
    case 3:
    case 4:
    case 5:
        System.out.println("Was a 3, a 4, a 5");
        System.out.println("Actually it was a " + switchValue);
        break;
    default:
        System.out.println("Was not 1, 2, 3, 4, or 5");
        break;
```

- Enhanced Switch Statement

```java
switch (switchValue) {
    case 1 -> System.out.println("Value was 1");
    case 2 -> System.out.println("Value was 2");
    case 3, 4, 5 -> {
        System.out.println("Was a 3, a 4, a 5");
        System.out.println("Actually it was a " + switchValue);
    }
    default ->
        System.out.println("Was not 1, 2, 3, 4, or 5");
    }
```

### When to use yield in a switch

- Switch statement is being used as a switch expression returning a value.

| This code | is implicitly translated to |
| --------- | --------------------------- |
| -> "1st"  | -> { yield "1st"; }         |

- Example:

```java
public static String getQuarter(String month) {
    return switch (month) {
        case "JANUARY", "FEBRUARY", "MARCH" -> {
            yield "1st";
        }
        case "APRIL", "MAY", "JUNE" -> "2nd";
        case "JUNY", "AUGUST", "SEPTEMBER" -> "3rd";
        case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
        default -> {
            String badResponse = month + " is bad";
            yield badResponse;
        }
    };
}
// Call
String month = "JANUARY";
System.out.println(month + " is in the " + getQuarter(month) + " quarter");
```

## Looping

- Looping lets us execute the code a multiple number of times.
- Java supports several statements for looping, or executing code repetitively.

### Java supports three statements for looping

| Statements | Explanation                                                                                             |
| ---------- | ------------------------------------------------------------------------------------------------------- |
| for        | The for loop is more complex to set up but is commonly used when you iterating over a set of values.    |
| while      | The while loop executes until a specified condition becomes false.                                      |
| do while   | The do while loop always executes at least one and continues until a specified condition becomes false. |

### The for statement

- The **for statement** is often referred to as the for loop.
- It repeatedly loops somethings unit a condition is satisfied.

```java
for(init; expression; increment) {
  // block of statements
}
```

- There are three parts to the basic for statement's declaration.
- There are declared in parentheses, after the for keyword, and are separated by
  semi-colons.

There parts are all optional and consist of the following:

- The initialization section declares or sets state, usually declaring and
  initializing a loop variable, before the loop begins processing.
- The expression section, once it becomes false, will end the loop processing.
- The increment section is executed after the expression is tested, and is
  generally the place where the loop variable is incremented.

Example:

```java
for (int counter = 1; counter <= 5; counter++) {
    System.out.println(counter);
}
```

### The break statement

A break statement transfers control out of an enclosing statement.

We've seen the break statement in the switch statement, but it can also be used
in a loop.

Example:

```java
for (int counter = 1; counter <= 10; counter++) {
    System.out.println(counter);

    if (counter > 5) {
        break;
    }
}
```

### Java has two types of while loops

| While Loops | Explanation                                                                                 |
| ----------- | ------------------------------------------------------------------------------------------- |
| while       | Continue executing code block until the loop expression becomes false                       |
| do while    | Execute the code block once, then continue executing until the loop condition becomes false |

- The while statement:

```java
while (expression) {
  // block of statements
}
```

- The do while statement

```java
do {
  // block of statements
} while (expression);
```

### continue keyword

The continue statement, in its simplest form, will stop executing the current
iteration of a block of code in a loop, and start a new iteration.

## Parsing value and Reading Input using System.console()

- Use a static method on the wrapper class to let that class do the
  transformation for us.

| Wrapper | Wrapper Method      |
| ------- | ------------------- |
| Integer | parseInt(String)    |
| Double  | parseDouble(String) |

- Example:

```java
int currentYear = 2025;
String usersDateOfBirth = "2000";

int dateOfBirth = Integer.parseInt(usersDateOfBirth);

System.out.println("Age = " + (currentYear - dateOfBirth));

String usersAgeWithPartialYear = "24.5";
double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
System.out.println("The user say he's " + ageWithPartialYear);
```

### Reading data from the console

| Technique              | Description                                                                                                                                                                                         |
| ---------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| System.in              | Like System.out, Java provides System.in which can read input from the console or terminal. It's not easy to use for beginners, and lots of code has been built around it, to make it easier        |
| System.console         | This is Java's solution for easier support for reading a single line and prompting user for information. Although is easy to use, it doesn't work with IDE's because these environments disable it. |
| Command Line Arguments | This is calling the Java program and specifying data in the call. This is very commonly used but doesn't let us create an interactive application in a loop in Java.                                |
| Scanner                | The Scanner class was built to the common way to read input, either using System.in or a file. For beginners, it's much easier to understand than the bare bones System.in                          |

### Exception, Catching an exception and The try Statement

- An exception is an error that happens in code. Some types of errors can be
  predicted and named.
- An exception is caught first by creating a code block around the code that
  gets the error. This is code done with the try statement code block.
- The try statement actually has two code blocks. The first declared directly
  after the try keyword, and this code block ends, and is followed by the
  declaration of the catch keyword. Example:

```java
try {
  // statements that might get errors
} catch (Exception e){
  // code to 'handle' the exception
}
```

- The catch keyword includes the declaration of variables, in parentheses, and
  then has its own code block.

### The Scanner class and new keyword

- The Scanner class is described as a simple text scanner, which can parse
  primitive types and strings.
- To use the Scanner class, we have to create an instance of Scanner. This means
  we're creating an object of type Scanner. We'll use the keyword, **new**, to do it.
- The new keyword is used in what java calls a Class Instance Creation
  Exception. In its simple form, it's the word new, followed by the class name,
  and empty parentheses. And can optionally pass arguments in those parentheses:

```java
ClassName variableName = new ClassName();
// Or
ClassName variableName = new ClassName(argument1, argument2);
```

#### Instantiating Scanner

For reading input from the console or terminal, we instantiate a scanner object
using **new**, followed by the Scanner class name, and passing System.in, as an
argument, in the parentheses.

```java
Scanner sc = new Scanner(System.in);
```

For reading input from a file, we instantiate a scanner object using new, again
with the Scanner class name, but pass a File object, as an argument, in the
parentheses.

```java
Scanner sc = new Scanner(new File("nameOfFileOnFileSystem"));
```

File is another class provided by Java, for reading and writing files.
