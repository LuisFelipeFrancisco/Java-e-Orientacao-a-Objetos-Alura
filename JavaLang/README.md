# Class java.lang

## String manipulation methods

### .replace

```java
String str = "Hello World";
str = str.replace("Hello", "Goodbye");
System.out.println(str); // Goodbye World
```
### .toLowerCase

```java
String str = "Hello World";
str = str.toLowerCase();
System.out.println(str); // hello world
```
### .toUpperCase

```java
String str = "Hello World";
str = str.toUpperCase();
System.out.println(str); // HELLO WORLD
```
### .charAt

```java
String str = "Hello World";
char c = str.charAt(0);
System.out.println(c); // H
```

### .indexOf

```java
String str = "Hello World";
int i = str.indexOf("World");
System.out.println(i); // 6
```

### .substring

```java
String str = "Hello World";
String sub = str.substring(6);
System.out.println(sub); // World
```

### .length

```java
String str = "Hello World";
int len = str.length();
System.out.println(len); // 11
```

### .concat

```java
String str = "Hello";
str = str.concat(" World");
System.out.println(str); // Hello World
```

### .isEmpty

```java
String str = "Hello World";
boolean empty = str.isEmpty();
System.out.println(empty); // false
```

### .trim

```java
String str = " Hello World ";
str = str.trim();
System.out.println(str); // Hello World
```

### .contains

```java
String str = "Hello World";
boolean contains = str.contains("Hello");
System.out.println(contains); // true
```
