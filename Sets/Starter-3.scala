// Starter Code for Exercise 3
// From "Sets" atom
import com.atomicscala.AtomicTest._

val box1 = Set("shoes", "clothes")
val box2 = Set("toys", "dishes")
val box3 = Set("toys", "games", "books")
val attic = Set(box1, box2)
val basement = Set(box3)
val house = Set(attic, basement)
Set("shoes", "clothes", "toys", "dishes") is attic.flatten
Set("toys", "games", "books") is basement.flatten
Set("shoes", "clothes", "toys",
  "dishes", "games", "books") is
/* fill this in -- call flatten */
