// Solution-4.scala
// Solution to Exercise 4 in "Parameterized Types"
import com.atomicscala.AtomicTest._

def historicalData(data:Vector[Int]):String = {
  var sunny = 0
  var mostlySunny = 0
  var mostlyCloudy = 0

  for(s <- data) {
    s match {
      case 100 => sunny += 1
      case 80 => mostlySunny += 1
      case 20 => mostlyCloudy += 1
    }
  }

  val forecastString = ("Sunny=" + sunny +
    ", Mostly Sunny=" + mostlySunny +
    ", Mostly Cloudy=" + mostlyCloudy)

  forecastString
}

val weather = Vector(100, 80, 20, 100, 20)
historicalData(weather) is "Sunny=2, Mostly Sunny=1, Mostly Cloudy=2"

/* OUTPUT_SHOULD_BE
Sunny=2, Mostly Sunny=1, Mostly Cloudy=2
*/
