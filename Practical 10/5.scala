object LetterCount {

  def countLetterOccurrences(words: List[String]): Int = {
    words
      .map(word => word.length)  
      .reduce(_ + _)             
  }

  
  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")
    val totalOccurrences = countLetterOccurrences(words)
    println("Total count of letter occurrences: "+totalOccurrences)  
  }
}

