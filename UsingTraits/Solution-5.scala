// Solution-5.scala
// Solution to Exercise 5 in "Using Traits"
import com.atomicscala.AtomicTest._

trait ArtPeriod2 {
  def show(year:Int) = {
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

trait Color {
  def hue:Int
}
trait Texture {
  def feel:String
}
trait Dimensions {
  val width:Double
  val height:Double
  val depth:Double = 1.0
  def volume = width * height * depth
}
trait Description {
  val id:String
  def hue:Int
  def feel:String
  def volume:Double
  override def toString =
    id + " " + hue + " " + feel +
    " " + volume
}

abstract class PaintingDimensions
extends Dimensions {
  // Pretend all paintings are this thick:
  override val depth = 1.5
}

trait PaintingTexture extends Texture {
  def feel = "Dry"
}

class Painting2(val width:Double,
  val height:Double, val id:String,
  val hue:Int)
  extends PaintingDimensions with Color
  with PaintingTexture with Description with ArtPeriod2

val painting2 = new Painting2(64, 80, "Starry", 111)
painting2.show(1889) is "Modern"
