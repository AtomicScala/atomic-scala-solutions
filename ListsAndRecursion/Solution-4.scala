// Solution-4.scala
// Solution to Exercise 4 in "Lists & Recursion"
import com.atomicscala.AtomicTest._

val animalList = List("cat", "dog",
  "cat", "bird", "cat", "cat", "kitten", "mouse")

def calcFreq(aList:List[String], animal:String, total:Int):Int = {
  if(aList.isEmpty) total
  else {
    if(aList.head == animal) calcFreq(aList.tail, animal, total+1)
    else calcFreq(aList.tail, animal, total)
  }
}

calcFreq(animalList, "cat", 0) is 4
calcFreq(animalList, "dog", 0) is 1

/* OUTPUT_SHOULD_BE

*/
