// Solution-1.scala
// Solution to Exercise 1 in "Maps"
import com.atomicscala.AtomicTest._

val constants = Map(3.141 -> "Pi", 2.718-> "e", 1.618-> "phi")

Map((3.141, "Pi"), (2.718, "e"), (1.618, "phi")) is constants

Vector((3.141, "Pi"), (2.718, "e"), (1.618, "phi")).toMap is constants

// Look up a value from a key:
constants(2.718) is "e"

constants.keys is "Set(3.141, 2.718, 1.618)"

constants.values is "MapLike(Pi, e, phi)"

// Iterate through key-value pairs:
(for(pair <- constants)
  yield pair.toString) is
List("(3.141,Pi)", "(2.718,e)", "(1.618,phi)")

// Unpack during iteration:
(for((k,v) <- constants)
  yield k + ": " + v) is
"List(3.141: Pi, 2.718: e, 1.618: phi)"

/* OUTPUT_SHOULD_BE
Map(3.141 -> Pi, 2.718 -> e, 1.618 -> phi)
Map(3.141 -> Pi, 2.718 -> e, 1.618 -> phi)
e
Set(3.141, 2.718, 1.618)
MapLike(Pi, e, phi)
List((3.141,Pi), (2.718,e), (1.618,phi))
List(3.141: Pi, 2.718: e, 1.618: phi)
*/
