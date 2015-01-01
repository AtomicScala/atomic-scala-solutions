// Solution-4.scala
// Solution to Exercise 4 in "References & Mutability"
import com.atomicscala.AtomicTest._

var shapes = Vector("Round", "Rectangular", "Oblong")
shapes = shapes :+ "Pointy" // Append at end
shapes = "Ovoid" +: shapes // Insert at beginning
shapes is "Vector(Ovoid, Round, Rectangular, Oblong, Pointy)"
shapes ++ "Sticky" is
  "Vector(Ovoid, Round, Rectangular, Oblong, Pointy, S, t, i, c, k, y)"
shapes ++ Vector("Sticky") is
  "Vector(Ovoid, Round, Rectangular, Oblong, Pointy, Sticky)"
// Works the other way around, as well:
Vector("Sticky") ++ shapes is
  "Vector(Sticky, Ovoid, Round, Rectangular, Oblong, Pointy)"

// Wait, there ARE assignment-combination operators. Pretend the ':'
// represents the collection (two dots represent two elements?) and
// the '+' then shows which side you're attaching the new element
// onto:
shapes +:= "Fat"
shapes :+= "Skinny"
shapes is "Vector(Fat, Ovoid, Round, Rectangular, Oblong, Pointy, Skinny)"

/* OUTPUT_SHOULD_BE
Vector(Ovoid, Round, Rectangular, Oblong, Pointy)
Vector(Ovoid, Round, Rectangular, Oblong, Pointy, S, t, i, c, k, y)
Vector(Ovoid, Round, Rectangular, Oblong, Pointy, Sticky)
Vector(Sticky, Ovoid, Round, Rectangular, Oblong, Pointy)
Vector(Fat, Ovoid, Round, Rectangular, Oblong, Pointy, Skinny)
*/
