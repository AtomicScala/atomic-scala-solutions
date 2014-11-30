// Solution-6.scala
// Solution to Exercise 6 in "Summary 2"
import com.atomicscala.AtomicTest._

// Temperature.scala

class Temperature {
  var current = 0.0
  var scale = "f"
  def setFahrenheit(now:Double) = {
    current = now
    scale = "f"
  }
  def setCelsius(now:Double) = {
    current = now
    scale = "c"
  }
  def setKelvin(now:Double) = {
    current = now
    scale = "k"
  }
  def getFahrenheit() = {
    if(scale == "f")
      current
    else {
      if (scale == "k") current -= 273.15
      current * 9.0/5.0 + 32.0
    }
  }
}

val t = new Temperature
t.setFahrenheit(75)
t.getFahrenheit() is 75

t.setCelsius(20)
t.getFahrenheit() is 68

t.setKelvin(293.15)
t.getFahrenheit() is 68

