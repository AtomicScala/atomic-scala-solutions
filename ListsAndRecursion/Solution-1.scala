// Solution-1.scala
// Solution to Exercise 1 in "Lists & Recursion"
import com.atomicscala.AtomicTest._

import Math.max
{

def findMax(aList:List[Int], theMax: Int):Int = {
    if (aList.isEmpty) theMax
    else findMax(aList.tail, max(theMax, aList.head))
}

val aList = List(10, 20, 45, 15, 30)
findMax(aList, 0) is 45

}

