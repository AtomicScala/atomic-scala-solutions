// Solution-4.scala
// Solution to Exercise 4 in "For Loops"
import com.atomicscala.AtomicTest._

/*
Write a for loop that adds even numbers between 1 and 10 (including 10). Sum all the values and ensure that it equals 30. Hint: here’s a conditional expression that you can use to determine if a number is even:
if(number % 2 == 0)
The % (modulo) operator checks to see if there is a remainder when you divide number by 2. Satisfy the following test:
totalEvens is 30
*/
var totalEvens:Int = 0
for (i<- Range(0, 10).inclusive) {
  if (i % 2 == 0) totalEvens = totalEvens + i
}
totalEvens is 30

