package day3

object Backpacks {

  def FindSumOfDuplicates(input: Iterator[String]): Int = {
    var sum = 0
    for (line <- input) {
      val split = line.splitAt(line.length / 2)
      sum += findPriorityInSingleBag(split._1, split._2, 0)
    }
    sum
  }

  def findPriorityInSingleBag(firstPocket: String, secondPocket: String, position: Int): Int = {
    if (secondPocket.contains(firstPocket.charAt(position))) {
      if (firstPocket.charAt(position).toInt >= 97) {
        firstPocket.charAt(position).toInt - 96
      } else {
        firstPocket.charAt(position).toInt - 38
      }
    }
    else
      findPriorityInSingleBag(firstPocket, secondPocket, position + 1)
  }

  def findSumOfCommonItems(input: Iterator[String]): Int = {
    val list = input.toList
    var sum = 0
    for (i <- 0 to (list.size / 3)-1) {
        sum += findCommonItem(list(i*3),list(i*3+1),list(i*3+2),0)
    }
    sum
  }

  def findCommonItem(firstBag: String, secondBag: String, thirdBag: String, position: Int): Int = {
    if (secondBag.contains(firstBag.charAt(position)) && thirdBag.contains(firstBag.charAt(position))) {
      if (firstBag.charAt(position).toInt >= 97) {
        firstBag.charAt(position).toInt - 96
      } else {
        firstBag.charAt(position).toInt - 38
      }
    } else {
      findCommonItem(firstBag, secondBag, thirdBag, position + 1)
    }

  }

}
