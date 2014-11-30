// Solution-5.scala
// Solution to Exercise 5 in "Classes & Objects"
import com.atomicscala.AtomicTest._

var s1 = "Sally"
val s3 = s1.toUpperCase
if (s3.contentEquals(s1)) {
   println("s1 and s3 are equal")
}
else {
	println("s1 and s3 are not equal")
}
println(s1)
println(s3)

