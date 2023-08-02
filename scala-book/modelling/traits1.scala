package triats1

trait Speaker:
  def speak(): String

trait TailWagger:
  def startTail(): Unit = println("tail is wagging")
  def stopTail(): Unit  = println("tail is idle")

trait Runner:
  def startRunning(): Unit = println("I'm running")
  def stopRunning(): Unit  = println("Stopped running")

class Dog(name: String) extends Speaker, TailWagger, Runner:
  def speak(): String = "Woof!"

class Cat(name: String) extends Speaker, TailWagger, Runner:
  def speak(): String               = "meow"
  override def startRunning(): Unit = println("Ha ...")
  override def stopRunning(): Unit  = println("Why am I running??")

@main def traits() =
  val d = Dog("Rover")
  println(d.speak())
  d.startRunning()
  d.stopRunning()

  val c = Cat("Morris")
  println(c.speak())
  c.startRunning()
  c.stopRunning()
