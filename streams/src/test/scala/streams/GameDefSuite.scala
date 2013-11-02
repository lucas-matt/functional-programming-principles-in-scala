package streams

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

/**
 * Created with IntelliJ IDEA.
 * User: lucas
 * Date: 11/2/13
 * Time: 8:20 PM
 * To change this template use File | Settings | File Templates.
 */
class GameDefSuite extends FunSuite with GameDef with StringParserTerrain with ShouldMatchers {

  val level =  """ST-
                 |ooo
                 |oo-""".stripMargin

  test("isStanding") {
    Block(Pos(1,1), Pos(1,1)).isStanding should be(true)
    Block(Pos(1,1), Pos(1,2)).isStanding should be(false)
    Block(Pos(1,1), Pos(2,1)).isStanding should be(false)
  }

  test("isLegal") {
    Block(Pos(1,0), Pos(1,1)).isLegal should be(true)
    Block(Pos(1,1), Pos(1,1)).isLegal should be(true)
    Block(Pos(0,4), Pos(0,4)).isLegal should be(false)
    Block(Pos(2,1), Pos(2,2)).isLegal should be(false)
  }

  test("startBlock") {
    startBlock should be (Block(Pos(0,0), Pos(0,0)))
  }

}
