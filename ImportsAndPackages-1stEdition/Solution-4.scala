// Solution-4.scala
// Solution to Exercise 4 in "Imports & Packages"

// Solution 1: import 1 class
import com.atomicscala.trivia.Literature

val lit = new Literature
println("Imported 1 class")

// Solution 2: import 2 classes
import com.atomicscala.trivia.{Science, Movies}
val science = new Science
val movies = new Movies
println("Imported 2 classes")

// Solution 3: import everything
import com.atomicscala.trivia._

val c1 = new Literature
val c2 = new Science
val c3 = new Movies
println("Imported everything")

/* OUTPUT_SHOULD_BE
Imported 1 class
Imported 2 classes
Imported everything
*/
