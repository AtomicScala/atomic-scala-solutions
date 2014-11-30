// Solution-4.scala
// Solution to Exercise 4 in "Error Reporting with Either"
import com.atomicscala.AtomicTest._

/*{oldDescription}
 Working from your solution to the exercise above, call a test method that separates the mapping into Left and Right, as you say in EitherMap,scala. Satisfy the following tests:
testLetters(0) is "Vowel: a"
testLetters(4) is "Vowel: e"
testLetters(13) is "Consonant: n"
{oldDescription}*/

def testLetters(n:Int) = {
    letters(n) match {
        case Left(letter) => s"Vowel: $letter"
        case Right(letter) => s"Consonant: $letter"
        case _ => "Unknown"
    }
}

testLetters(0) is "Vowel: a"
testLetters(4) is "Vowel: e"
testLetters(13) is "Consonant: n"

// Starter Code:
testLetters(0) is "Vowel:
a"
testLetters(4) is "Vowel: e"
testLetters(13) is "Consonant: n"
