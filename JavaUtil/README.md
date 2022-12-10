# Java.util
## java.util is a collection of Java utilities for the Java programming language.

## Arrays

### Arrays.length
```java
int[] array = {1, 2, 3, 4, 5};
int length = array.length;
System.out.println(length);
```
Output:
```java
5
```

### Arrays.toString()
```java
int[] array = {1, 2, 3, 4, 5};
System.out.println(Arrays.toString(array));
```
Output:
```
[1, 2, 3, 4, 5]
```

### Arrays.copyOf()
```java
int[] array = {1, 2, 3, 4, 5};
int[] copy = Arrays.copyOf(array, array.length);
System.out.println(Arrays.toString(copy));
```
Output:
```
[1, 2, 3, 4, 5]
```

### Arrays.copyOfRange()
```java
int[] array = {1, 2, 3, 4, 5};
int[] copy = Arrays.copyOfRange(array, 1, 4);
System.out.println(Arrays.toString(copy));
```
Output:
```
[2, 3, 4]
```

### Arrays.fill()
```java
int[] array = new int[5];
Arrays.fill(array, 1);
System.out.println(Arrays.toString(array));
```
Output:
```
[1, 1, 1, 1, 1]
```

### Arrays.sort()
```java
int[] array = {5, 4, 3, 2, 1};
Arrays.sort(array);
System.out.println(Arrays.toString(array));
```
Output:
```
[1, 2, 3, 4, 5]
```

### Arrays.binarySearch()
```java
int[] array = {1, 2, 3, 4, 5};
int index = Arrays.binarySearch(array, 3);
System.out.println(index);
```
Output:
```
2
```

### Arrays.equals()
```java
int[] array1 = {1, 2, 3, 4, 5};
int[] array2 = {1, 2, 3, 4, 5};
boolean equals = Arrays.equals(array1, array2);
System.out.println(equals);
```
Output:
```
true
```
