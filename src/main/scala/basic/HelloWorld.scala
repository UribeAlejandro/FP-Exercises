package basic

object HelloWorld {
  // https://www.hackerrank.com/challenges/fp-hello-world/problem?isFullScreen=true
  def helloWorld(): String = {
    "Hello World"
  }

  // https://www.hackerrank.com/challenges/fp-hello-world-n-times/problem?isFullScreen=true
  def nTimes(n: Int): Unit = {
    (1 to n).foreach(_ => println(helloWorld()))
  }
}
