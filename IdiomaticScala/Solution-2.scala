// Solution-2.scala
// Solution to Exercise 2 in "Idiomatic Scala"
import com.atomicscala.AtomicTest._

// For.scala

for(i <- 0 to 9)
  print(i + " ")
println()

for(i <- 0 until 10)
  print(i + " ")
println()

for(i <- Range(0, 10))
  print(i + " ")
println()

for(i <- Range(0, 20, 2))
  print(i + " ")
println()

var sum = 0
for(i <- Range(0, 20, 2)) {
  println("adding " + i + " to " + sum)
  sum += i
}
println("Sum is " + sum)

/* OUTPUT_SHOULD_BE
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
0 2 4 6 8 10 12 14 16 18
adding 0 to 0
adding 2 to 0
adding 4 to 2
adding 6 to 6
adding 8 to 12
adding 10 to 20
adding 12 to 30
adding 14 to 42
adding 16 to 56
adding 18 to 72
Sum is 90
*/
