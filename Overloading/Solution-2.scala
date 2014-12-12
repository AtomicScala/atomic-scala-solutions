// Solution-2.scala
// Solution to Exercise 2 in "Overloading"
import com.atomicscala.AtomicTest._

def f():Int = { 0 }
def f(i:Int):Int = { i }
def f(i:Int, j:Int):Int = { i + j }
def f(i:Int, j:Int, k:Int):Int = { i + j + k }
def f(i:Int, j:Int, k:Int, l:Int):Int = { i + j + k + l }

f() is 0
f(1) is 1
f(1, 2) is 3
f(1, 2, 3) is 6
f(1, 2, 3, 4) is 10

/* OUTPUT_SHOULD_BE
0
1
3
6
10
*/
