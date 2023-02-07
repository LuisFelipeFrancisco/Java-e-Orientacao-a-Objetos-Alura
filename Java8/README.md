## Java8 Course by Alura

### Topics

- [x] 1. Default Methods
- [x] 2. Lambda
- [x] 3. Method References
- [x] 4. Streams
- [x] 5. Optional
- [x] 6. Date and Time API

### Default Methods

Default methods are methods that can be implemented in interfaces. They are useful when you want to add new methods to an interface without breaking the code of the classes that implement it.

### Consumer

The Consumer interface is a functional interface that represents a function that receives a parameter and returns nothing.

### Lambda

Lambda expressions are used to create anonymous functions. They are useful when you want to pass a function as a parameter to another function.

Lambda expressions are defined using the following syntax:

```java
(parameter) -> { body }
```

Example without lambda:

```java
public class Main {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        }).start();
    }
}
```

Example with lambda:

```java
public class Main {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hello World")).start();
    }
}
```

### Anonymous Classes

Anonymous classes are classes that are defined without a name. They are useful when you want to create a class that is used only once.

Anonymous classes are defined using the following syntax:

```java
new Class() {
    // body
}
```

### Functional Interfaces

Functional interfaces are interfaces that have only one abstract method. They are useful when you want to create a function that receives another function as a parameter.

### Method References

Method references are used to pass a method as a parameter to another method. They are useful when you want to pass a method as a parameter to another method.

Method references are defined using the following syntax:

```java
Class::method
```

Example without method reference:

```java
public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Paul", "George", "Ringo");
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });
    }
}
```

Example with method reference:

```java
public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Paul", "George", "Ringo");
        names.forEach(System.out::println);
    }
}
```

### Streams

Streams are used to process collections of objects. They are useful when you want to process a collection of objects.

### Optional

Optional is a container object used to contain not-null objects. They are useful when you want to avoid NullPointerException.

### Collectors

Collectors are used to combine the result of processing on the elements of a stream. They are useful when you want to combine the result of processing on the elements of a stream.

### Date and Time API

The Date and Time API is used to work with date and time in Java. They are useful when you want to work with date and time in Java.

```java
public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
    }
}
```
