import CrustSize.*

@main def crusts() =
  val currentCrustSize = Small
  currentCrustSize match
    case Small  => println("Small crust size")
    case Medium => println("Medium crust size")
    case Large  => println("Large crust size")

  if currentCrustSize == Small then println("SMALL")
