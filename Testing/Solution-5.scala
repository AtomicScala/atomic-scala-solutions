// Solution-5.scala
// Solution to Exercise 5 in "Testing"
import com.atomicscala.AtomicTest._

def squareArea(x:Int):Int = {
  x * x
}

def rectangleArea(x:Int, y:Int):Int = { 
  x * x 
}

def trapezoidArea(x:Int, y:Int, h:Int):Double = {
  h/2 * (x + y)
}

squareArea(1) is 1
squareArea(2) is 4
squareArea(5) is 25
rectangleArea(2, 2) is 4
rectangleArea(5, 4) is 20
trapezoidArea(2, 2, 4) is 8
trapezoidArea(3, 4, 1) is 3.5

/* OUTPUT_SHOULD_BE
1
4
25
4
25
[Error] expected:
20
8.0
0.0
[Error] expected:
3.5
*/
