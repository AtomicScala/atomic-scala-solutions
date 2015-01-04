// Solution-8.scala
// Solution to Exercise 8 in "Error Handling with Exceptions"
import com.atomicscala.AtomicTest._

// Any exception will do here, but IllegalStateException is often
// used to indicate constructor failure:
class FailingConstructor(fail:Boolean = false) {
  var result = "uninitialized"
  if(fail) throw new IllegalStateException else result = "success"
}

// There's usually very little you can do if a constructor fails,
// so one legitimate approach is to simply let the exception pass
// out of the method:
def test1(fail:Boolean) = (new FailingConstructor(fail)).result

def f(fail:Boolean) = try {
  test1(fail)
} catch {
  case e:IllegalStateException => "failed"
}

f(true) is "failed"
f(false) is "success"

// If you don't want the exception to pass out of your method,
// you can catch it and report the error in some other way:
def test2(fail:Boolean) = try {
  val fc = new FailingConstructor(fail)
  fc.result
} catch {
  case e:IllegalStateException => "fail"
}

test2(true) is "fail"
test2(false) is "success"

// In some cases, you can guarantee that the initialization succeeds,
// but this only works if you have a way to recover from constructor
// failure:
def test3(fail:Boolean) = {
  val fc = try {
    new FailingConstructor(fail)
  } catch {
    case e:IllegalStateException => new FailingConstructor(false)
  }
  fc.result
}

test3(false) is "success"
test3(true) is "success"

/* OUTPUT_SHOULD_BE
failed
success
fail
success
success
success
*/
