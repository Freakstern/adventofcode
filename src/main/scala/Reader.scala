import scala.io.Source

object Reader {

  def getInput(fileLocation: String): Iterator[String] = {
    val fileStream = getClass.getResourceAsStream(fileLocation)
    Source.fromInputStream(fileStream).getLines
  }

}
