// Solution-1.scala
// Solution to Exercise 1 in "Overloading"

// This won't work -- redefining functions

def f(n:Int):Int = { 77 }
def f(n:Int):Int = { n + 1 }

class MethodOverloading1 {
  def f(n:Int):Int = { 88 }
  def f(n:Int):Int = { n + 2 }
}

/* OUTPUT_SHOULD_CONTAIN
error: method f is defined twice
error: method f is defined twice
two errors found
*/
