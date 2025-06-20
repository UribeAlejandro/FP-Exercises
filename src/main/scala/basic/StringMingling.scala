package basic

object StringMingling {
  def main(args: Array[String]): Unit = {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val stdin = scala.io.StdIn
    val l1 = stdin.readLine.trim
    val l2 = stdin.readLine.trim

    println(l1.zip(l2) map { case (e1: Char, e2: Char) => e1.toString + e2.toString } mkString (""))
  }
}
