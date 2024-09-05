package basic

import org.scalatest.funsuite.AnyFunSuiteLike

class ArraysExercisesTest extends AnyFunSuiteLike {

  test("testFilterArray") {
    val arr      = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val delim    = 5
    val expected = List(1, 2, 3, 4)
    val result   = ArraysExercises.filterByDelimiter(delim, arr)
    assert(result == expected)
  }

  test("testListReplication") {
    val n        = 3
    val arr      = List(1, 2, 3, 4)
    val expected = List(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4)
    val result   = ArraysExercises.listReplication(n, arr)
    assert(result === expected)
  }

  test("testFilterPositions") {
    val arr      = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val expected = List(2, 4, 6, 8, 10)
    val result   = ArraysExercises.filterPositions(arr)
    assert(result === expected)
  }
  test("testArrayOfNElements") {
    val n        = 5
    val expected = List(0, 1, 2, 3, 4)
    val result   = ArraysExercises.arrayOfNElements(n)
    assert(result === expected)
  }
  test("testReverseArray") {
    val arr      = List(1, 2, 3, 4, 5)
    val expected = List(5, 4, 3, 2, 1)
    val result   = ArraysExercises.reverseList(arr)
    assert(result === expected)
  }
  test("testSumOddElements") {
    val arr      = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val expected = 25
    val result   = ArraysExercises.sumOddElements(arr)
    assert(result === expected)
  }
  test("testListLength") {
    val arr      = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val expected = 10
    val result   = ArraysExercises.listLength(arr)
    assert(result === expected)
  }
  test("testUpdateList") {
    val arr      = List(-1, 2, -3, 4, -5, 6, -7, 8, -9, 10)
    val expected = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val result   = ArraysExercises.updateList(arr)
    assert(result === expected)
  }
}
