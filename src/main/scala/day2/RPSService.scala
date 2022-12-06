package day2

object RPSService {

  val a = Map(
    "A Y" -> 8, "A X" -> 4, "A Z" -> 3,
    "B Y" -> 5, "B X" -> 1, "B Z" -> 9,
    "C Y" -> 2, "C X" -> 7, "C Z" -> 6,
    )

//  A rock  X
//  B paper Y
//  C scizzors Z

  def calculate(input: Iterator[String]): Int = {
    var score = 0
    for(line <- input) {
      score += a.get(line).get
    }
    score
  }

}
