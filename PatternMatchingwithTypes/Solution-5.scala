// Solution-5.scala
// Solution to Exercise 5 in "Pattern Matching with Types"
import com.atomicscala.AtomicTest._

def forecast(temp:Int):String = {
  temp match {
  	// You could say this:
    // case i if i > 80 => "Sunny"
    // Or:
    case _ if temp > 80 => "Sunny"
    case _ if temp > 50 => "Mostly Sunny"
    case _ if temp > 20 => "Partly Sunny"
    case _ if temp > 0 => "Mostly Cloudy"
    case 0 => "Cloudy"
    case _ => "Unknown"
  }
}

forecast(100) is "Sunny"
forecast(81) is "Sunny"
forecast(80) is "Mostly Sunny"
forecast(51) is "Mostly Sunny"
forecast(50) is "Partly Sunny"
forecast(21) is "Partly Sunny"
forecast(20) is "Mostly Cloudy"
forecast(1) is "Mostly Cloudy"
forecast(0) is "Cloudy"
forecast(-1) is "Unknown"

/* OUTPUT_SHOULD_BE
Sunny
Sunny
Mostly Sunny
Mostly Sunny
Partly Sunny
Partly Sunny
Mostly Cloudy
Mostly Cloudy
Cloudy
Unknown
*/
