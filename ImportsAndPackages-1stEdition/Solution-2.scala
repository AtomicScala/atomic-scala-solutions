// Solution-2.scala
// Solution to Exercise 2 in "Imports & Packages"
import com.atomicscala.royals.Crest

val crest = new Crest("Bear", "1875")
assert("Bear in the year 1875" ==
  crest.description(),
  "Expected Bear in the year 1875, Got " + crest)
println(crest.description)

/* OUTPUT_SHOULD_BE
Bear in the year 1875
*/
