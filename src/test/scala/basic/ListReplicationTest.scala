package basic

import org.scalatest.funsuite.AnyFunSuiteLike

class ListReplicationTest extends AnyFunSuiteLike {

  test("testListReplication") {
    val n = 3
    val arr = List(1, 2, 3, 4)
    val expected = List(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4)
    val result = ListReplication.listReplication(n, arr)
    assert(result === expected)
  }

}
