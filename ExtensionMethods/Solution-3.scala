// Solution-3.scala
// Solution to Exercise 3 in "Extension Methods"
// Compile with scalac Solution-3.scala
// Then run with:
// > scala Test
import com.atomicscala.AtomicTest._

case class Book(title:String)

package object BookExtension {
  implicit class Ops(val book:Book) extends AnyVal {
    def categorize(category:String) =
      s"$book, category: $category"
  }
}
import BookExtension._

object Test extends App {
  Book("Dracula") categorize "Vampire" is
  "Book(Dracula), category: Vampire"
}

/* OUTPUT_SHOULD_BE
Book(Dracula), category: Vampire
*/
