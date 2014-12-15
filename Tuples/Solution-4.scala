// Solution-4.scala
// Solution to Exercise 4 in "Tuples"
import com.atomicscala.AtomicTest._

def weather(temperature:Int, humidity:Int) = {
  if(humidity > 40) {
    if(temperature > 80)
      ("Hot", "Humid")
    else if(temperature < 50)
      ("Cold", "Damp")
    else
      ("Temperate", "Humid")
  } else {
    if(temperature > 80)
      ("Hot", "Pleasant")
    else if(temperature < 50)
      ("Cold", "Pleasant")
    else
      ("Temperate", "Pleasant")
  }
}

val (heat1, moisture1) = weather(81, 45)
heat1 is "Hot"
moisture1 is "Humid"

val (heat2, moisture2) = weather(27, 55)
heat2 is "Cold"
moisture2 is "Damp"

/* OUTPUT_SHOULD_BE
Hot
Humid
Cold
Damp
*/
