# Lesson 5 (Revision of first 4 topics)

## Generics

<Object> is a super class of everything but it is different from <T>

Using <Object> can lead to Heap Pollution and ClassExceptionError. Does not give information about the type of the element in a list/array/map.

<T> is just a placeholder for a class. In the Main.java class, when instantiating the object, declare the type.

eg. public void Box<T>{} [in Box class]

Comparing objects using equals(Object obj) and hashCode()

hashCode() returns a hash code value for the object

Maps must have unique keys but can have duplicate values

## Decorator Pattern (Lesson 3)

Adding new functions to a class but doesnt change the base properties of the class.

eg. Window is still a window even if I add curtains or glass panes.

## Java Archives (JAR)

Mainly used to send files over to another user to compile and run the java files.

## Interface

- keyword "**implements**"
- use to show traits/attributes of an object/class.
- Can have many methods but no implementations
- A class that implements an interface, have to provide all the methods in the interface.
