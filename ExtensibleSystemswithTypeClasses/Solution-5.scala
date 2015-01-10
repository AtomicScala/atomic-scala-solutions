// Solution-5.scala
// Solution to Exercise 5 in "Extensible Systems with Type Classes"
import com.atomicscala.AtomicTest._

trait Reporter[I] {
  def generate(info:I):String
}

def report[I](info:I)(implicit reporter:Reporter[I]) =
  reporter.generate(info)

case class Person(name:String, age:Int, occupation:String)

implicit object PersonReporter extends Reporter[Person] {
  def generate(person:Person) =
    s"${person.name}, age: ${person.age}, occupation: ${person.occupation}"
}

case class Store(name:String, location:String, products:Vector[String])

implicit object StoreReporter extends Reporter[Store] {
  def generate(store:Store) =
    s"${store.name}, location: ${store.location}, products: ${store.products}"
}

case class Vehicle(manufacturer:String, make:String, model:String, year:Int)

implicit object VehicleReporter extends Reporter[Vehicle] {
  def generate(vehicle:Vehicle) =
    s"${vehicle.manufacturer}, make: ${vehicle.make}, model: ${vehicle.model}, year: ${vehicle.year}"
}

report(Person("Arnold Toynbee", 30, "Economic Historian")) is
  "Arnold Toynbee, age: 30, occupation: Economic Historian"

report(Store("Alf's Drugs", "4th and Main", Vector("Drugs", "Candy", "Sundries"))) is
  "Alf's Drugs, location: 4th and Main, products: Vector(Drugs, Candy, Sundries)"

report(Vehicle("Morris Garage", "MG", "B GT", 1968)) is
  "Morris Garage, make: MG, model: B GT, year: 1968"

/* OUTPUT_SHOULD_BE
Arnold Toynbee, age: 30, occupation: Economic Historian
Alf's Drugs, location: 4th and Main, products: Vector(Drugs, Candy, Sundries)
Morris Garage, make: MG, model: B GT, year: 1968
*/
