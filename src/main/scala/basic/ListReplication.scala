package basic

// https://www.hackerrank.com/challenges/fp-list-replication/problem?isFullScreen=true
object ListReplication {
  def listReplication(n: Int, arr: List[Int]): List[Int] = {
    arr.flatMap(List.fill(n)(_))
  }
}
