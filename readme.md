# Java Comparable and Comparator Examples

This project demonstrates how to sort Java objects and arrays using the `Comparable` and `Comparator` interfaces.

It is a small educational example focused on common sorting scenarios in Java, including:

- sorting primitive and object arrays with `Arrays.sort(...)`
- implementing natural ordering through `Comparable`
- customizing ordering through multiple `Comparator` implementations
- sorting a custom `User` model by different fields such as `id`, `surname`, and `rating`

## Project purpose

The repository showcases the difference between:

- `Comparable`: defines the natural ordering of a class itself
- `Comparator`: defines external sorting logic without modifying the class

This is a useful example for learning Java collection ordering and the typical patterns used in real applications.

## Main classes

- `ArraySortingExample`: shows sorting examples for strings, integers, primitive arrays, dates, and date strings
- `UserSortingExample`: sorts `User` objects using several comparators
- `User`: custom model class implementing `Comparable<User>` and comparing users by `id`
- `Utils`: helper methods for printing and sorting arrays

## Example behavior

The `User` class implements:

```java
@Override
public int compareTo(User o) {
    return Integer.compare(this.getId(), o.getId());
}
```

This makes `User` ordered naturally by its `id`.

In addition, `UserSortingExample` creates several comparators such as:

- sort by surname
- sort by rating
- sort by rating in reverse order

Those comparators are used with `Arrays.sort(users, comparator)` to demonstrate custom ordering.

## Project structure

```text
java-comparable-comparator-examples/
├── src/
│   ├── ArraySortingExample.java
│   ├── UserSortingExample.java
│   └── edu/
│       └── upc/
│           └── eetac/
│               └── dsa/
│                   ├── model/
│                   │   └── User.java
│                   └── utils/
│                       └── Utils.java
├── java-comparable-comparator-examples.iml
└── readme.md
```

## Requirements

- Java JDK 8 or later
- A Java IDE such as IntelliJ IDEA or VS Code with Java support

## How to run

From the project root, compile all Java files:

```bash
javac -d out $(find src -name "*.java")
```

Then run one of the examples:

```bash
java -cp out ArraySortingExample
java -cp out UserSortingExample
```

## Learning goals

This project helps understand:

- how natural ordering works with `Comparable`
- how custom ordering works with `Comparator`
- how to sort arrays of built-in and custom data types
- how to use lambda expressions and method references in Java sorting

## License

This project is intended for educational purposes and can be used as a learning example for Java sorting techniques.
