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

