package day2

object RPSService {

  private val a = Map(
    "A Y" -> 8, "A X" -> 4, "A Z" -> 3,
    "B Y" -> 5, "B X" -> 1, "B Z" -> 9,
    "C Y" -> 2, "C X" -> 7, "C Z" -> 6,
    )

  private val b: Map[String, Int] = Map(
    "A Y" -> 4, "A X" -> 3, "A Z" -> 8,
    "B Y" -> 5, "B X" -> 1, "B Z" -> 9,
    "C Y" -> 6, "C X" -> 2, "C Z" -> 7,
    )

  def calculate(input: Iterator[String]): Int = {
    var score = 0
    for(line <- input) {
      score += b(line)
    }
    score
  }

}
