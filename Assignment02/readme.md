# Assignment 2.1
The file numbers.text consists of sequences of numbers, each sequence preceded by a header value and then followed by that many integers. 
## Task
Read in the sequences and print their averages. When all sequences have been read in, print out the number of sequences processed.

You should not rely on the numbers in each sequence all being on the same line; ie, do not use nextLine for your input.

For example if the file numbers.text contains:
```bash
3 1 2 3 
5 12 14 6 4 0 
10 1 2 3 4 5 6 7 8 9 10 
1 17 2 
90 80
```
the program should produce the following output:
```bash
The average of the 3 integers 1 2 3 is 2.0 
The average of the 5 integers 12 14 6 4 0 is 7.2 
The average of the 10 integers 1 2 3 4 5 6 7 8 9 10 is 5.5 
The average of the 1 integers 17 is 17.0 
The average of the 2 integers 90 80 is 85.0 
5 sets of numbers processed
```

# Assignment 2.2
The file numbers2.text contains a header value, followed by that many double values.

## Task
Create an array of the appropriate size, populate the array with the doubles and print out various information about the array (see below).

For example if the file numbers.text contains:
```bash
8 12.3 2.5 9.4 3.14 22.15 17 54.3 7.6
```

the program should produce the following output:

```bash
The array: {12.3, 2.5, 9.4, 3.14, 22.15, 17.0, 54.3, 7.6} contains 8 elements
The first element of the array is 12.3
The last element of the array is 7.6 and is at position 7
The middle element of the array is 3.14 and is at position 3
The largest element of the array is 54.3 and is at position 6
The smallest element of the array is 2.5 and is at position 1
```