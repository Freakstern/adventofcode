import day1.ElfFoodService
import day2.RPSService

object Main {
  def main(args: Array[String]): Unit = {
    //val notSimpleHighest = ElfFoodService.getHighestCalories(Reader.getInput("/day1/notsimple.txt"))
    //println(notSimpleHighest)

    println(RPSService.calculate(Reader.getInput("/day2/notsimple")))

  }
}