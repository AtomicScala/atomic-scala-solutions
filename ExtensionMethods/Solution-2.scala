// Solution-2.scala
// Solution to Exercise 2 in "Extension Methods"
import com.atomicscala.AtomicTest._

/*{oldDescription} 2.  Modify ExtensionMethodArguments.scala by adding an
additional extension method in that has two arguments. Write tests.
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
