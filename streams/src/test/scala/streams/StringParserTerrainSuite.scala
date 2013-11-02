package streams

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

/**
 * Created with IntelliJ IDEA.
 * User: lucas
 * Date: 11/1/13
 * Time: 8:41 PM
 * To change this template use File | Settings | File Templates.
 */
class StringParserTerrainSuite extends FunSuite with ShouldMatchers {

  val lvl =  """ST-
               |ooo
               |oo-""".stripMargin

  test("hit terrain") {
    new { val level = lvl } with StringParserTerrain with GameDef {
      terrain(Pos(0,0)) should be(true)
      terrain(Pos(0,1)) should be(true)
      terrain(Pos(1,0)) should be(true)
      terrain(Pos(1,1)) should be(true)
      terrain(Pos(1,2)) should be(true)
      terrain(Pos(2,0)) should be(true)
      terrain(Pos(2,1)) should be(true)
    }
  }

  test("miss terrain") {
    new { val level = lvl } with StringParserTerrain with GameDef {
      terrain(Pos(0,2)) should be(false)
      terrain(Pos(2,2)) should be(false)
    }
  }

  test("outside board") {
    new { val level = lvl } with StringParserTerrain with GameDef {
      terrain(Pos(-1,1)) should be(false)
      terrain(Pos(4,1)) should be(false)
      terrain(Pos(1,-1)) should be(false)
      terrain(Pos(1,4)) should be(false)
    }
  }

  test("find char") {
    new { val level = lvl } with StringParserTerrain with GameDef {
      startPos should be(Pos(0,0))
      goal should be(Pos(0,1))
    }
  }

}
