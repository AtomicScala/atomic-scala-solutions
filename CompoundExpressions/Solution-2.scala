// Solution-2.scala
// Solution to Exercise 2 in "Compound Expressions"

val a = 1
val b = 5 // change to 6 to test exercise 2
val c = 5

if(a <=c && b <=c) {
  println("both are!")
} else if(a <= c || b <= c) {
  println("one is and one isn't!")
}

/* OUTPUT_SHOULD_BE
both are!
*/
