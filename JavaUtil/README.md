# Java.util
## java.util is a collection of Java utilities for the Java programming language.

## ArrayList

ArrayList is a resizable array. Elements can be added and removed from an ArrayList whenever you want.

### .add()

The add() method adds an element to the ArrayList.

```java
ArrayList<String> cars = new ArrayList<String>();
cars.add("Volvo");
cars.add("BMW");
cars.add("Ford");
cars.add("Mazda");
```

### .remove()

The remove() method removes the element at the specified position in this list.

```java
cars.remove(0);
```

### .size()

The size() method returns the number of elements in this list.

```java
cars.size();
```

### .get()

The get() method returns the element at the specified position in this list.

```java
cars.get(0);
```

### .clear()

The clear() method removes all of the elements from this list.

```java
cars.clear();
```

### .contains()

The contains() method returns true if this list contains the specified element.

```java
cars.contains("Volvo");
```

### .equals()

The equals() method returns true if the two specified lists are equal to one another.

```java
cars.equals(cars);
```

### .isEmpty()

The isEmpty() method returns true if this list contains no elements.

```java
cars.isEmpty();
```

### .sort()

The sort() method sorts the elements in this list into ascending order, according to the natural ordering of its elements.

```java
cars.sort();
```

## LinkedList

LinkedList is a linear collection that supports element insertion and removal at both ends.
The linked list have the same methods as ArrayList.

## Vector

Vector is a legacy class that is similar to ArrayList, but with two differences: 
Vector is synchronized and contains many legacy methods that are not part of the collections framework.

## AutoBoxing and Unboxing

AutoBoxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes. For example, converting an int to an Integer, a double to a Double, and so on. If the conversion goes the other way, this is called unboxing.

```java
Integer myInt = 5; // boxes int to an Integer object
int myInt = myInt; // unboxes the Integer to a int
```

## Wrapper Classes

Wrapper classes are used to convert primitive data types into objects.

| Primitive Type | Wrapper Class |
|----------------|---------------|
| boolean        | Boolean       |
| char           | Character     |
| byte           | Byte          |
| short          | Short         |
| int            | Integer       |
| long           | Long          |
| float          | Float         |
| double         | Double        |
