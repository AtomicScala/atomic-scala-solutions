// Solution-6.scala
// Solution to Exercise 6 in "References & Mutability"
import com.atomicscala.AtomicTest._

class Foo(var x:Int)

def modarg(f:Foo) = f.x += 1

val z = new Foo(1)
z.x is 1
modarg(z)
z.x is 2
println("Yes, modarg has side effects")

/* OUTPUT_SHOULD_BE
1
2
Yes, modarg has side effects
*/
