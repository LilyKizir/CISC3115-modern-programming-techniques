# Assignment 2
The file numbers.text consists of sequences of numbers, each sequence preceded by a header value and then followed by that many integers. 
## Task
Read in the sequences and print their averages. When all sequences have been read in, print out the number of sequences processed.

You should not rely on the numbers in each sequence all being on the same line; ie, do not use nextLine for your input.

For example if the file numbers.text contains:
```bash
3 1 2 3 5 12 14 6 4 0 10 1 2 3 4 5 6 7 8 9 10 1 17 2 90 80
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