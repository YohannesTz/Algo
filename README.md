# Algo
a group of algorithms and functions to work on int array

# features
  - print
  - print line to separate other outputs in console
  - insert
  - removeAt a given index
  - search a given element
  - sort in ascending order
  - sort in dscending order
  - check if it contains a given element
  - return an element closest to zero
  - return index of an element closest to zero
  - closest to a given index
  - find max 
  - find min
  - to string (constructor)
  - to string any array

# implementation

printing elements

```java
  Algo algo = new Algo(3);//give length during initialization
  algo.print();
```
print line to separate other outputs in console

```java
  Algo algo = new Algo(2);//give length during initialization
  algo.printLine();
```
insert to an array

```java
  Algo algo = new Algo(3);//give length during initialization
  algo.insert(100);
  algo.insert(40);
  algo.insert(70);
```
remove element at a given index

```java
  Algo algo = new Algo(2);
  algo.insert(40);
  algo.insert(10);
  algo.removeAt(1);
```

search a given elment

```java
  Algo algo = new Algo(3);
  algo.insert(10);
  algo.insert(40);
  algo.insert(50);
  algo.search(40); // returns 1
  algo.search(50); // returns -1
```

sort in acending order

```java
  Algo algo = new Algo(3);
  algo.insert(10);
  algo.insert(20);
  algo.insert(30);
  algo.bubbleSortAsc();
```


sort in dcending order

```java
  Algo algo = new Algo(3);
  algo.insert(10);
  algo.insert(20);
  algo.insert(30);
  algo.bubbleSortDsc();
```
check if it contains a given element


sort in acending order

```java
  Algo algo = new Algo(3);
  algo.insert(10);
  algo.insert(20);
  algo.insert(30);
  algo.contains(30); //returns boolean value
```
return an element that is closest to zero

```java
  Algo algo = new Algo(3);
  algo.insert(10);
  algo.insert(20);
  algo.insert(30);
  algo.closestToZero(); //returns int value that is closest to zero
```
return an index of the element that is closest to zero

```java
  Algo algo = new Algo(3);
  algo.insert(10);
  algo.insert(20);
  algo.insert(30);
  algo.closestToZeroIndex(); //returns the index of a value that is closest to zero
```
closest to a given index

```java
  Algo algo = new Algo(3);
  algo.insert(10);
  algo.insert(20);
  algo.insert(30);
  algo.closestTo(33); //returns int value that is closest to 33
```

find max in the given array

```java
  Algo algo = new Algo(3);
  algo.insert(10);
  algo.insert(20);
  algo.insert(30);
  algo.max(); //returns int
```
find min of a given index

```java
  Algo algo = new Algo(3);
  algo.insert(10);
  algo.insert(20);
  algo.insert(30);
  algo.min(); //returns int
```
toString usage

```java
  Algo algo = new Algo(3);
  algo.insert(10);
  algo.insert(20);
  algo.insert(30);
  algo.toString();
```
or
```java
  Algo.toString(myArray);
```

