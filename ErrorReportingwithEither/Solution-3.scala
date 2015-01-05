// Solution-3.scala
// Solution to Exercise 3 in "Error Reporting with Either"
import com.atomicscala.AtomicTest._

def letters = 'a' to 'z' map {
  case 'a' => Left('a')
  case 'e' => Left('e')
  case 'i' => Left('i')
  case 'o' => Left('o')
  case 'u' => Left('u')
  case x => Right(x)
}

letters is "Vector(Left(a), Right(b), " +
"Right(c), Right(d), Left(e), Right(f), " +
"Right(g), Right(h), Left(i), Right(j), " +
"Right(k), Right(l), Right(m), Right(n), " +
"Left(o), Right(p), Right(q), Right(r), " +
"Right(s), Right(t), Left(u), Right(v), " +
"Right(w), Right(x), Right(y), Right(z))"

/* OUTPUT_SHOULD_BE
Vector(Left(a), Right(b), Right(c), Right(d), Left(e), Right(f), Right(g), Right(h), Left(i), Right(j), Right(k), Right(l), Right(m), Right(n), Left(o), Right(p), Right(q), Right(r), Right(s), Right(t), Left(u), Right(v), Right(w), Right(x), Right(y), Right(z))
*/
