## Instructions

Create a program that continuous takes user input of integers and adds them together until the user enters the letter 'q' indicating that they would like to quit. The user should be prompted with something like "Enter a series of integers. Press 'q' to quit." at the beginning of the program. Print the sum at the end of the program. Make sure bad input is handled. No need for exception handling yet! 

**HINT:  if s is the scanner object, s.hasNextInt() will return true if the next user input is an integer and false if the next user input is NOT an integer. The same can be done with s.hasNext() to check if there is a new input available. 

Your output should look something like this: 

Enter a series of integers. Press 'q' to quit.

2       

4

5

6

9

8

7

2

5

q

The total is 48


Include all the Javadoc documentation just like the previous assignments, this time you just have to write it on your own:
* `@author` tag at the top of the file
* Method documentation for each method:
  *  A brief description of what the method does.
  * `@param` tag (if applicable)
  * `@return` tag (if applicable)
* Line comments within methods to explain your thinking