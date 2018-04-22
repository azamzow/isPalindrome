# Queue/Stack Implementation in Palindrome Project

### Description

This project has a Queue Implementation (in three ways), a Stack Implementation (in three ways), and a isPalindrome (using Stack and Queue). The three ways they are implemented is array-based list-based, and reference-based. 

1) TestQueue.java utilizes the three Queue implementations in the classes QueueArrayBased.java, QueueReferenceBased.java, and QueueListBased.java. Each of these classes implement queueInterface class.

Below is a UML Diagram of the TestQueue.java,

![UML Diagram](https://github.com/azamzow/isPalindrome/blob/master/UML%20Diagram.png?raw=true)

2) isPalindrome.java is an application where both Stack and Queue are utilized to check whether the given word is in a symmetric language (i.e., palindrome)

- By definition, palindrome = {<b>str</b> | <b>str</b> reads the same left to right as right to left}

 This program executes the classes QueueArraybased.java and StackArrayBased.java.

### To Run

Using terminal on Mac:

```
$ cd isPalindrome
$ javac TestQueue.java
$ java TestQueue
--------------Then-----------
$ javac isPalindrome.java
$ java isPalindrome
```

### Output

When the above programs are ran, they should look like this..

<u>TestQueue</u>

-Runs QueueArrayBased first, then QueueReferenceBased, followed by QueueListBased.

The final result will print out...
```
5 6 7 8 9

a5 a6 a7 a8 a9

5.0 6.0 7.0 8.0 9.0
```


<u>isPalindrome</u>

-It asks the user to enter a string to check if it is a palindrome. An Example output is shown below..


```
Enter a string to check if it is a palindrome:
test
Input string is not a palindrome.
```

```
Enter a string to check if it is a palindrome:
alula
Input string is a palindrome.
```
