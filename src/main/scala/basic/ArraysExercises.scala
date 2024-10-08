package basic

object ArraysExercises {
  // https://www.hackerrank.com/challenges/fp-list-replication/problem?isFullScreen=true
  def listReplication(n: Int, arr: List[Int]): List[Int] = {
    arr.flatMap(List.fill(n)(_))
  }

  // https://www.hackerrank.com/challenges/fp-filter-array/problem?isFullScreen=true
  def filterByDelimiter(delim: Int, arr: List[Int]): List[Int] = {
    arr.filter(_ < delim)
  }
  // https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list/problem?isFullScreen=true
  def filterPositions(arr: List[Int]): List[Int] = {
    arr.zipWithIndex.filter(_._2 % 2 != 0).map(_._1)
  }

  // https: //www.hackerrank.com/challenges/fp-array-of-n-elements/problem?isFullScreen=true
  def arrayOfNElements(n: Int): List[Int] = {
    (0 until n).toList
  }
  // https://www.hackerrank.com/challenges/fp-reverse-a-list/problem?isFullScreen=false
  def reverseList(arr: List[Int]): List[Int] = {
    arr.reverse
  }
  // https://www.hackerrank.com/challenges/fp-sum-of-odd-elements/problem?isFullScreen=true
  def sumOddElements(arr: List[Int]): Int = {
    arr.filter(_ % 2 != 0).sum
  }
  // https://www.hackerrank.com/challenges/fp-list-length/problem?isFullScreen=true
  def listLength(arr: List[Int]): Int = {
    arr.length
  }
  // https://www.hackerrank.com/challenges/fp-update-list/problem?isFullScreen=true
  def updateList(arr: List[Int]): List[Int] = {
    arr.map(_.abs)
  }
}
