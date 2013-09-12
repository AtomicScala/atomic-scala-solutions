// Solution-3.scala
// Solution to Exercise 3 in "Classes & Objects"
import com.atomicscala.AtomicTest._

/*{oldDescription}
Create a String object s1 (as a var) initialized to "Sally". Create a second String object s2 (as a var) initialized to "Sally". Use equals to determine if the two Strings are equivalent. If they are, print "s1 and s2 are equal", otherwise print "s1 and s2 are not equal".
{oldDescription}*/


var s1 = "Sally"
var s2 = "Sally"
if (s1.equals(s2)) {
  println("s1 and s2 are equal")
}
else {
  println("s1 and s2 are not equal")
}

