package basic

// https://www.hackerrank.com/challenges/fp-solve-me-first/problem?isFullScreen=true
object BasicIO {
  def main(args: Array[String]): Unit = {
    println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)
  }
}
