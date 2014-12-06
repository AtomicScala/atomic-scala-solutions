// Solution-4.scala
// Solution to Exercise 4 in "Pattern Matching with Tuples"
import com.atomicscala.AtomicTest._

/*{oldDescription}  Working from your solution to Exercise 2, add
another color (magenta) to PaintColors.scala and verify that the
rest of the examples still work correctly. Satisfy the following
tests:
{oldDescription}*/

blend2(red, yellow) is orange
blend2(red, red) is red
blend2(yellow,blue) is green
blend2(yellow, magenta) is purple
blend2(red, magenta) is purple
