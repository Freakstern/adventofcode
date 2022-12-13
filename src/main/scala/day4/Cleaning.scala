package day4

object Cleaning {


  def findAllUselessCleaning(input: Iterator[String]): Int = {
    var sum = 0
    for(line <- input) {
      if(isUseless(line))
        sum+=1
    }
    sum
  }

  def isUseless(pair: String): Boolean = {
    val elfs = pair.split(",")
    val elf1 = elfs(0).split("-")
    val elf2 = elfs(1).split("-")
    if((elf1(0).toInt >= elf2(0).toInt && elf1(0).toInt <= elf2(1).toInt)
    ||(elf1(1).toInt >= elf2(0).toInt && elf1(1).toInt <= elf2(1).toInt)){
      return true
    }
    if((elf2(0).toInt >= elf1(0).toInt && elf2(0).toInt <= elf1(1).toInt)
      ||(elf2(1).toInt >= elf1(0).toInt && elf2(1).toInt <= elf1(1).toInt)){
      return true
    }

    false
  }

}
