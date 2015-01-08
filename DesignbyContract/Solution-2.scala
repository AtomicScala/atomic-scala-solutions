// Solution-2.scala
// Solution to Exercise 2 in "Design by Contract"
// Compile, then run with
// > scala ConvertLetters Eleven pigs named FunkleBudder had8 part%es

object ConvertLetters extends App {
  def convert(s:String) = {
    require(s.forall(_.isLetter), "Only letters are allowed")
    val converted = s.toLowerCase.map(_.asDigit - 'a'.asDigit + 1).reduce(_ + _)
    val lowerBound = s.length * 1
    assume(converted >= lowerBound, "Result should be >= " + lowerBound)
    val upperBound = s.length * ('z'.asDigit + 1)
    assume(converted <= upperBound, "Result should be <= " + upperBound)
    println(converted)
  }
  for(arg <- args)
    try {
      convert(arg)
    } catch {
      case e:Throwable => println(e.getMessage)
    }
}

/* OUTPUT_SHOULD_BE
63
51
37
123
requirement failed: Only letters are allowed
requirement failed: Only letters are allowed
*/
