// Solution-2.scala
// Solution to Exercise 2 in "Extension Methods"
import com.atomicscala.AtomicTest._

case class Book(title:String)

object BookExtension {
  implicit class Ops(book:Book) {
    def categorize(category:String) =
      s"$book, category: $category"
    def ISBN(category:String, ISBN:String) =
      s"${categorize(category)}, ISBN:$ISBN"
  }
}
import BookExtension._

Book("Dracula") categorize "Vampire" is
"Book(Dracula), category: Vampire"

Book("The Cider House Rules").ISBN("Mainstream Fiction", "123-456-7890") is
"Book(The Cider House Rules), category: Mainstream Fiction, ISBN:123-456-7890"

/* OUTPUT_SHOULD_BE
Book(Dracula), category: Vampire
Book(The Cider House Rules), category: Mainstream Fiction, ISBN:123-456-7890
*/
