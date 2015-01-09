// Solution-3.scala
// Solution to Exercise 3 in "Extension Methods"
import com.atomicscala.AtomicTest._

/*{oldDescription}
3.  Rewrite the code in ExtensionMethodArguments.scala to turn Ops into a value class.
{oldDescription}*/

case class Book(title:String)

object BookExtension {
  implicit class Ops(book:Book) {
    def categorize(category:String) =
      s"$book, category: $category"
  }
}
import BookExtension._

Book("Dracula") categorize "Vampire" is
"Book(Dracula), category: Vampire"

/* OUTPUT_SHOULD_BE

*/
