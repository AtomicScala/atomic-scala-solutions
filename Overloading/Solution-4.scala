// Solution-4.scala
// Solution to Exercise 4 in "Overloading"

class FunNumbers2 {
  def f(i:Int, j:Int):Double = { i + j }
  // This won't work (redefined function, different only in return type):
  def f(i:Int, j:Int):Int = { i + j }
}


/* OUTPUT_SHOULD_CONTAIN
error: method f is defined twice
  def f(i:Int, j:Int):Int = { i + j }
      ^
one error found
*/
