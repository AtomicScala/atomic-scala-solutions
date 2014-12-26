// Solution-5.scala
// Solution to Exercise 5 in "Using Traits"
import com.atomicscala.AtomicTest._

trait ArtPeriod {
  def period(year:Int) = {
    year match {
      case y: Int if y < 1300 => "Pre-Renaissance"
      case y: Int if y >= 1300 && y < 1600 => "Renaissance"
      case y: Int if y >= 1600 && y < 1700 => "Baroque"
      case y: Int if y >= 1700 && y < 1790 => "Late Baroque"
      case y: Int if y >= 1790 && y < 1880 => "Romanticism"
      case y: Int if y >= 1880 && y < 1970 => "Modern"
      case _ => "Contemporary"
    }
  }
}

class Painting(title:String, year:Int)
  extends Object with ArtPeriod {
    def period:String = period(year)
}

val painting = new Painting("The Starry Night", 1889)
painting.period is "Modern"

/* OUTPUT_SHOULD_BE
Modern
*/
