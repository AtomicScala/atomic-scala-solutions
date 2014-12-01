// Solution-4.scala
// Solution to Exercise 4 in "Using Traits"
import com.atomicscala.AtomicTest._

trait ArtPeriod {
  def show(year: Int) = {
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

val period = new Object with ArtPeriod
period.show(1400) is
  "Renaissance"
period.show(1650) is
  "Baroque"
period.show(1279) is
  "Pre-Renaissance"
