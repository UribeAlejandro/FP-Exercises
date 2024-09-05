package basic

import org.scalatest.funsuite.AnyFunSuiteLike

class HelloWorldTest extends AnyFunSuiteLike {
  test("HelloWorld.helloWorld") {
    assert(HelloWorld.helloWorld() == "Hello World")
  }
}
