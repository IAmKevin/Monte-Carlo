object ApproximatePi extends App {

  val n = 10000000
  approximate(n)

  def approximate(num_samples: Int) = {
    val radius = 10

    var num_in_circle = 0.0
    for (i <- 0 to n) {
      val x = Math.random() * 10
      val y = Math.random() * 10
      if (Math.sqrt(x * x + y * y) <= radius) {
        num_in_circle += 1
      }
    }

    println(num_in_circle / n * 4)

  }

}