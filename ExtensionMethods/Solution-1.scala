// Solution-1.scala
// Solution to Exercise 1 in "Extension Methods"
import com.atomicscala.AtomicTest._

case class Book(title:String)

def categorize(book:Book, category:String) =
  s"$book, category: $category"

categorize(Book("Dracula"), "Vampire") is
  "Book(Dracula), category: Vampire"

/* OUTPUT_SHOULD_BE
Book(Dracula), category: Vampire
*/
