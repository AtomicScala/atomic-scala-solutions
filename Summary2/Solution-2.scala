// Solution-2.scala
// Solution to Exercise 2 in "Summary 2"
import com.atomicscala.AtomicTest._

val cVec = Vector('f', 'z', 'g', 'a', 'p')
val iVec = Vector(1, 455, 23, -8, 4, 9, 12, 2)
val sVec = Vector("My", "dog", "ate", "my", "homework")
val allVec = Vector(cVec, iVec, sVec)

var allString = ""
for(outer <- allVec) {
  for(inner <- outer) {
     allString += inner + " "
  }
}

allString is "f z g a p 1 455 23 -8 4 9 12 2 My dog ate my homework "

/* OUTPUT_SHOULD_BE
f z g a p 1 455 23 -8 4 9 12 2 My dog ate my homework 
*/
