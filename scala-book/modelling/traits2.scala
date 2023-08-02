class Person(var firstName: String, var lastName: String):
  def printFullName() = println(s"$firstName $lastName")

@main def traits() =
  val p = Person("John", "Jones")
  println(p)
  p.printFullName()

  p.firstName = "Casey"
  p.printFullName()
