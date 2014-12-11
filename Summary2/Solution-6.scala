// Solution-6.scala
// Solution to Exercise 6 in "Summary 2"
import com.atomicscala.AtomicTest._

class Temperature {
  var current = 0.0
  var scale = "f"
  def setFahrenheit(now:Double):Unit = {
    current = now
    scale = "f"
  }
  def setCelsius(now:Double):Unit = {
    current = now
    scale = "c"
  }
  def setKelvin(now:Double):Unit = {
    current = now
    scale = "k"
  }
  def getFahrenheit():Double = {
    if(scale == "f") {
      current
    } else if(scale == "c" || scale == "k") {
      getCelsius() * 9.0/5.0 + 32.0
    } else {
      -1.0
    }
  }
  def getCelsius():Double = {
    if(scale == "c") {
      current
    } else if(scale == "f") {
      (current - 32.0) * 5.0/9.0
    } else if(scale == "k") {
      current - 273.15
    } else {
      -1.0
    }
  }
  def getKelvin():Double = {
    if(scale == "k") {
      current
    } else if(scale == "f" || scale == "c") {
      getCelsius() + 273.15
    } else {
      -1.0
    }
  }
}

def testFahrenheit(temp:Double):Unit = {
  // Convert back and forth to verify:
  val t1 = new Temperature
  t1.setFahrenheit(temp)
  val t2 = new Temperature
  t2.setCelsius(t1.getCelsius())
  t2.getFahrenheit() is t1.getFahrenheit()
  t2.setKelvin(t1.getKelvin())
  t2.getFahrenheit() is t1.getFahrenheit()
}

def testCelsius(temp:Double):Unit = {
  val t1 = new Temperature
  t1.setCelsius(temp)
  val t2 = new Temperature
  t2.setFahrenheit(t1.getFahrenheit())
  t2.getCelsius() is t1.getCelsius()
  t2.setKelvin(t1.getKelvin())
  t2.getCelsius() is t1.getCelsius()
}

def testKelvin(temp:Double):Unit = {
  val t1 = new Temperature
  t1.setKelvin(temp)
  val t2 = new Temperature
  t2.setFahrenheit(t1.getFahrenheit())
  t2.getKelvin() is t1.getKelvin()
  t2.setCelsius(t1.getCelsius())
  t2.getKelvin() is t1.getKelvin()
}

val t = new Temperature
t.setFahrenheit(-40.0)
t.getCelsius() is -40.0 // "Crossover" temperature

t.setFahrenheit(574.5875)
t.getKelvin() is 574.5875 // "Crossover" temperature

t.setFahrenheit(32.0)
t.getCelsius() is 0.0 

testFahrenheit(100.0)
testCelsius(100.0)
testKelvin(100.0)

// Note the floating-point error:
/* OUTPUT_SHOULD_BE
-40.0
574.5875
0.0
100.0
99.99999999999999
[Error] expected:
100.0
100.0
100.0
100.0
100.0
*/
