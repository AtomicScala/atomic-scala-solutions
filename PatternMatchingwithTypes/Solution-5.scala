// Solution-5.scala
// Solution to Exercise 5 in "Pattern Matching with Types"
import com.atomicscala.AtomicTest._

def forecast(temp:Int):String = {
  temp match {
    case i: Int if i > 80 => "Sunny"
    case i: Int if i > 50 => "Mostly Sunny"
    case i: Int if i > 20 => "Partly Sunny"
    case i: Int if i > 0 => "Mostly Cloudy"
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
