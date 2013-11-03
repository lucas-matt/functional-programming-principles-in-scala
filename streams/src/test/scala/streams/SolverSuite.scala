package streams

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

/**
 * Created with IntelliJ IDEA.
 * User: lucas
 * Date: 11/2/13
 * Time: 9:19 PM
 * To change this template use File | Settings | File Templates.
 */
class SolverSuite extends FunSuite with Solver with StringParserTerrain with ShouldMatchers {

  val level =  """ST-
                 |ooo
                 |oo-""".stripMargin

  test("done") {
    done(Block(Pos(0,1), Pos(0,1))) should be(true)
    done(Block(Pos(0,0), Pos(0,1))) should be(false)
    done(Block(Pos(1,1), Pos(1,1))) should be(false)
  }

}
