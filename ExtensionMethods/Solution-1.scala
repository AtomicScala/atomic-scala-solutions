// Solution-1.scala
// Solution to Exercise 1 in "Extension Methods"
import com.atomicscala.AtomicTest._

/*{oldDescription} 1.  Rewrite ExtensionMethodArguments.scala so you get the
same results without using extension methods. {oldDescription}*/

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
