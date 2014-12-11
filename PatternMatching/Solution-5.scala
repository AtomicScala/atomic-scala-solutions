// Solution-5.scala
// Solution to Exercise 5 in "Pattern Matching"

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

def forecastLoop(data:Vector[Int]):Unit = {
  for(s <-data)
    println("forecast(" + s + ") is " + forecast(s))
}

val allData = forecastLoop(Vector(100, 80, 50, 20, 15, 80, 20))

/* OUTPUT_SHOULD_BE
forecast(100) is Sunny
forecast(80) is Mostly Sunny
forecast(50) is Partly Sunny
forecast(20) is Mostly Cloudy
forecast(15) is Unknown
forecast(80) is Mostly Sunny
forecast(20) is Mostly Cloudy
*/
