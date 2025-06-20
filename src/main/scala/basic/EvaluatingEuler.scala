package basic

import scala.annotation.tailrec
import scala.math._

object EvaluatingEuler {
  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn
    val n = stdin.readLine.trim.toInt

    for (nItr <- 1 to n) {
      val x = stdin.readLine.trim.toDouble
      println(euler_expansion(x))
    }
  }

  private def euler_expansion(x: Double): Double = {
    1 + (1 until 10).map(y => pow(x,y) / factorial(y)).sum
  }

  @tailrec
  private def factorial(n: Int, acc: Double = 1.0): Double = {
    if (n == 1) {
      acc
    } else {
      factorial(n-1,n*acc)
    }
  }
}
