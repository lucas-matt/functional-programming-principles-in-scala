package recfun

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class PascalSuite extends FunSuite with ShouldMatchers {
  import Main.pascal
  test("pascal: col=0,row=2") {
    assert(pascal(0,2) === 1)
  }

  test("pascal: col=1,row=2") {
    assert(pascal(1,2) === 2)
  }

  test("pascal: col=1,row=3") {
    assert(pascal(1,3) === 3)
  }

  test("pascal: col=1,row=0") {
    pascal(1,0) should be(0)
  }

  test("pascal: col=-1,row=0") {
    pascal(-1, 0) should be(0)
  }

  test("pascal: col=-1,row=-1") {
    pascal(-1, -1) should be(0)
  }

  test("pascal: col=0,row=100") {
    pascal(0, 100) should be(1)
  }

}
