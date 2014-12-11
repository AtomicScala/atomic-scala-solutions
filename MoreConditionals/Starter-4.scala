// Starter Code for Exercise 4
// From "More Conditionals" atom
import com.atomicscala.AtomicTest._

var createdStr = ""

for(c <- str) {
  // Convert to Int for comparison:
  val theValue = c.toInt
  if(/* check for letters */) {
    createdStr += c
  }
  else if(/* Check for numbers */) {
    createdStr += c
  }
}

isPalIgnoreSpecial("Madam I'm adam") is true
isPalIgnoreSpecial("trees") is false
