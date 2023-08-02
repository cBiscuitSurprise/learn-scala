@main def main() =
  val nums = (1 to 10).toList

  val x = nums
    .filter(_ > 3)
    .filter(_ < 7)
    .map(_ * 10)

  println(x)
