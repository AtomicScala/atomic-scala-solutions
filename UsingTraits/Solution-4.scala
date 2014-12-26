// Solution-4.scala
// Solution to Exercise 4 in "Using Traits"
import com.atomicscala.AtomicTest._

trait ArtPeriod {
  def period(year:Int) = {
    year match {
      case y:Int if y < 1300 => "Pre-Renaissance"
      case y:Int if y >= 1300 && y < 1600 => "Renaissance"
      case y:Int if y >= 1600 && y < 1700 => "Baroque"
      case y:Int if y >= 1700 && y < 1790 => "Late Baroque"
      case y:Int if y >= 1790 && y < 1880 => "Romanticism"
      case y:Int if y >= 1880 && y < 1970 => "Modern"
      case _ => "Contemporary"
    }
  }
}

val art = new Object with ArtPeriod
art.period(1400) is "Renaissance"
art.period(1650) is "Baroque"
art.period(1279) is "Pre-Renaissance"

/* OUTPUT_SHOULD_BE
Renaissance
Baroque
Pre-Renaissance
*/
