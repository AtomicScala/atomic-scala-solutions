// Solution-3.scala
// Solution to Exercise 3 in "Tuples"
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

weather(81, 45) is ("Hot", "Humid")
weather(50, 45) is ("Temperate", "Humid")
weather(27, 55) is ("Cold", "Damp")
weather(27, 30) is ("Cold", "Pleasant")

/* OUTPUT_SHOULD_BE
(Hot,Humid)
(Temperate,Humid)
(Cold,Damp)
(Cold,Pleasant)
*/
