## Java.io

Java.io is a library for reading and writing files in Java. It is a wrapper around the Java NIO library. It is designed to be simple to use and to be as fast as possible. It is also designed to be as memory efficient as possible. It is designed to be used in a multi-threaded environment.

### Reading a file

```java
import java.io.File;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        String content = file.read();
        System.out.println(content);
    }
}
```

### Writing a file

```java
import java.io.File;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        file.write("Hello World!");
    }
}
```

### Reading a file line by line

```java
import java.io.File;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        for (String line : file.lines()) {
            System.out.println(line);
        }
    }
}
```

### File opening options

Java.io supports the following file opening options:

* `READ` - Open the file for reading.
* `WRITE` - Open the file for writing.
* `APPEND` - Open the file for appending.
* `CREATE` - Create the file if it does not exist.
* `CREATE_NEW` - Create the file if it does not exist. If the file already exists, throw an exception.
* `TRUNCATE` - Truncate the file to zero bytes.
* `DELETE_ON_CLOSE` - Delete the file when the stream is closed.
* `SYNC` - Synchronize the file's content with the underlying storage device.
* `DSYNC` - Synchronize the file's content and metadata with the underlying storage device.

### FileWriter

```java
import java.io.FileWriter;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("test.txt");
        writer.write("Hello World!");
        writer.close();
    }
}
```
### PrintStream

```java
import java.io.PrintStream;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
        PrintStream stream = new PrintStream("test.txt");
        stream.println("Hello World!");
        stream.close();
    }
}
```

### PrintWriter

```java
import java.io.PrintWriter;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter("test.txt");
        writer.println("Hello World!");
        writer.close();
    }
}
```
### System.lineSeparator()

System.lineSeparator() its method that can be used to get the system's line separator.

```java
import java.io.System;

public class Example {
    public static void main(String[] args) {
        String lineSeparator = System.lineSeparator();
        System.out.println(lineSeparator);
    }
}
```
### System.currentTimeMillis()

System.currentTimeMillis() its method that can be used to get the system's current time in milliseconds.

```java
import java.io.System;

public class Example {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        System.out.println(currentTime);
    }
}
```
### Formatting

Java.io supports the following formatting options:

* `%b` - Boolean
* `%c` - Character
* `%d` - Integer
* `%f` - Float
* `%s` - String
* `%%` - Percent sign
* `%n` - New line
* `%t` - Date and time
* `%x` - Hexadecimal
* `%o` - Octal
* `%e` - Exponential

More information about formatting can be found [here](https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html#syntax).


All formatting options can be used with the following flags:

* `+` - Always include a sign
* `-` - Left justify
* `0` - Pad with zeros
* ` ` - Pad with spaces
* `,` - Use locale specific grouping separators
* `(` - Use parentheses for negative numbers
* `#` - Use alternate form

All formatting options can be used with the following width and precision options:

* `width` - The minimum number of characters to be written to the output
* `precision` - The maximum number of characters to be written to the output

All formatting options can be used with the following date and time options:

* `H` - Hour of the day for the 24-hour clock
* `I` - Hour for the 12-hour clock
* `k` - Hour of the day for the 24-hour clock
* `l` - Hour for the 12-hour clock
* `M` - Minute within the hour
* `S` - Second within the minute
* `L` - Millisecond within the second
* `N` - Nanosecond within the second
* `p` - Locale-specific morning or afternoon marker in lower case
* `z` - RFC 822 time zone
* `Z` - Time zone
* `s` - Seconds since the beginning of the epoch
* `Q` - Milliseconds since the beginning of the epoch

### Formatting a string

```java
import java.io.PrintStream;

public class Example {
    public static void main(String[] args) {
        PrintStream stream = new PrintStream("test.txt");
        stream.format("Hello %s!", "World");
        stream.close();
    }
}
```

### Encoding a string

```java
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Example {
    public static void main(String[] args) throws UnsupportedEncodingException {
        PrintStream stream = new PrintStream("test.txt", "UTF-8");
        stream.println("Hello World!");
        stream.close();
    }
}
```

### Serializing an object

```java
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("test.txt"));
        stream.writeObject(new Person("John", "Doe"));
        stream.close();
    }
}
```
