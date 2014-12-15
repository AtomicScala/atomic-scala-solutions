// Solution-1.scala
// Solution to Exercise 1 in "Idiomatic Scala"
import com.atomicscala.AtomicTest._

// If4.scala

val z = false
if(z)
  println("It's true!")
else
  println("It's false")

// OR

z match {
  case true => println("It's true!")
  case false => println("It's false")
}

// If5.scala

val result = {
  if(99 > 100) { 4 } // Discuss: these curly braces seem to add clarity
  else { 42 }
}
println(result)

// OR, compare to

val r =
  if(99 > 100) 4
  else 42

 println(r)

 // OR, Get rid of intermediate result with:
 if(99 > 100) println(4)
 else println(42)

/* OUTPUT_SHOULD_BE
It's false
It's false
42
42
42
*/
