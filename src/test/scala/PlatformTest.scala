package splatter

import org.scalatest.FunSpec
import org.scalatest.Matchers._

class PlatformTest extends FunSpec {

  describe("The platform") {
    it("should use the correct Java version") {
      System.getProperty("java.version") should startWith("1.8.0")
    }
    it("should use the correct Scala version") {
      scala.util.Properties.versionNumberString should be("2.11.7")
    }
  }
}
