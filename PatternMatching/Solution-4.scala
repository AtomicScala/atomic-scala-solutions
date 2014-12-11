// Solution-4.scala
// Solution to Exercise 4 in "Pattern Matching"
import com.atomicscala.AtomicTest._

def forecast(temp:Int):String = {
  temp match {
    case 100 => "Sunny"
    case 80 => "Mostly Sunny"
    case 50 => "Partly Sunny"
    case 20 => "Mostly Cloudy"
    case 0 => "Cloudy"
    case _ => "Unknown"
  }
}

forecast(100) is "Sunny"
forecast(80) is "Mostly Sunny"
forecast(50) is "Partly Sunny"
forecast(20) is "Mostly Cloudy"
forecast(0) is "Cloudy"
forecast(15) is "Unknown"

/* OUTPUT_SHOULD_BE
Sunny
Mostly Sunny
Partly Sunny
Mostly Cloudy
Cloudy
Unknown
*/
