// Solution-2.scala
// Solution to Exercise 2 in "Design by Contract"
// Compile, then run with
// > scala ConvertLetters Eleven pigs named FunkleBudder had8 part%es

/*{oldDescription} 2.  Write an App (see Applications) with a method
that takes the command-line argument of a String of letters,
converts it to lowercase, and then converts each character to its
numerical value in the alphabet, with 'a' being 1, 'b' being 2, etc.
Sum the values and display the result. Use preconditions to verify
that the input is in the correct form, and postconditions to ensure
that the result is in the expected range of values.
{oldDescription}*/

object ConvertLetters extends App {
  def convert(s:String) = {
    require(s.forall(_.isLetter), "Only letters are allowed")
    val converted = s.toLowerCase.map(_.asDigit - 'a'.asDigit + 1).reduce(_ + _)
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
