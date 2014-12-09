// Solution-5.scala
// Solution to Exercise 5 in "Classes & Objects"

val s1 = "Sally"
val s3 = s1.toUpperCase

if(s3.contentEquals(s1)) {
  println("s1 and s3 are equal")
} else {
  println("s1 and s3 are not equal")
}
println("s1: " + s1)
println("s3: " + s3)

/* OUTPUT_SHOULD_BE
s1 and s3 are not equal
s1: Sally
s3: SALLY
*/
