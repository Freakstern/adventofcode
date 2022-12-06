package day1

import scala.io.Source

object ElfFoodService {

  def getHighestCalories(input: Iterator[String]): Int = {
    var highestCalories = 0
    var secondHighestCalories = 0
    var thirdHighestCalories = 0
    var elfCalories = 0
    for (line <- input) {
      if (line.isBlank) {
        if (elfCalories > highestCalories) {
          thirdHighestCalories = secondHighestCalories
          secondHighestCalories = highestCalories
          highestCalories = elfCalories
        } else if (elfCalories > secondHighestCalories) {
          thirdHighestCalories = secondHighestCalories
          secondHighestCalories = elfCalories
        } else if (elfCalories > thirdHighestCalories) {
          thirdHighestCalories = elfCalories
        }
        elfCalories = 0
      } else {
        elfCalories += line.toInt
      }
    }
    highestCalories + secondHighestCalories + thirdHighestCalories
  }

}
