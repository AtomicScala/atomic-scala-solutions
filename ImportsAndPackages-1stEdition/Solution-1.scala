// Solution-1.scala
// Solution to Exercise 1 in "Imports & Packages"
import com.atomicscala.royals.Royalty

val royal = new Royalty("Henry", "Laughs")
val title = royal.title()
assert("Sir Laughsalot" == title, "Expected Sir Laughsalot, Got " + title)
println(title)

/* OUTPUT_SHOULD_BE
Sir Laughsalot
*/
