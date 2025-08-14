# Assignment 1
Write a program that reads three numbers from keyboard, and then prints out some information about the relationships between the numbers - whether they are all equal, in ascending order, in descending order, and so on.
## Task
To determine these relationships, write the following boolean-valued functions:
```java
boolean allAreEqual(int a, int b, int c);
boolean twoAreEqual(int a, int b, int c); // false if all three are equal
boolean noneAreEqual(int a, int b, int c);
boolean areAscending(int a, int b, int c); // true if a <= b <= c
boolean areDescending(int a, int b, int c); // true if a >= b >= c
boolean strictlyAscending(int a, int b, int c); // true if a < b < c
boolean strictlyDescending(int a, int b, int c); // true if a > b > c
```
Try to "talk boolean" — i.e., use boolean variables and conditional operators rather than if statements where possible
For example, write:
```java
boolean isNegative = x < 0;
```
rather than:
```java
boolean isNegative;
if (x < 0)
isNegtive = true;
else
isNegative = false;
```
Below is how the output should look:
```bash
first number? 1
second number? 2
third number? 3
allAreEqual: false
twoAreEqual: false
noneAreEqual: true
areAscending: true
areDescending: false
strictlyAscending: true
strictlyDescending: false
```