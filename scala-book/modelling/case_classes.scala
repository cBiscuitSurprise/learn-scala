case class Person(name: String, vocation: String)

@main def main() =
  val p = Person("A Person", "Singer")

  println(p)
  println(p.name)

  val p2 = p.copy(name = "Another person")
  println(p2)
