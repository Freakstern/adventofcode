import day1.ElfFoodService
import day2.RPSService
import day3.Backpacks
import day4.Cleaning

object Main {
  def main(args: Array[String]): Unit = {
    //val notSimpleHighest = ElfFoodService.getHighestCalories(Reader.getInput("/day1/notsimple.txt"))
    //println(notSimpleHighest)

    //println(RPSService.calculate(Reader.getInput("/day2/notsimple")))
    println(Cleaning.findAllUselessCleaning(Reader.getInput("/day4/notsimple")))

  }
}