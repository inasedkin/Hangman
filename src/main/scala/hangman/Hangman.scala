import scala.io.Source
import scala.util.Random

object Hangman extends App {
  private val random = new Random()
  private val maxMistakes = 5

  val words = readDict("src/main/resources/dict.txt")
  val word = chooseWord(words, random)
  var doneMistakes = 0
  var letters = Set[Char]()
  var mask: String = "*"

  while ((doneMistakes != maxMistakes) && (!checkWin(mask))) {
    println("Guess a letter:")
    val letter = scala.io.StdIn.readChar()
    letters += letter
    if (checkLetter(word, letter)) {
      println("Hit!")
    }
    else {
      doneMistakes += 1
      println(s"Missed, mistake $doneMistakes out of $maxMistakes.")
    }
    mask = makeMask(word, letters)
    println("The word: " + mask)
    if (checkWin(mask)) {
      println("You won!")
    }
  }
  if (!checkWin(mask)) {
    println("You lost")
  }


  def readDict(path: String): List[String] = {
    val bufferedSource = Source.fromFile("src/main/resources/dict.txt")
    val words = bufferedSource.getLines.toList
    bufferedSource.close
    words
  }

  def chooseWord(words: List[String], random: Random): String = {
    words(random.nextInt(words.length))
  }

  def makeMask(word: String, letters: Set[Char]): String = {
    word.map((x: Char) => if (letters.contains(x)) x else '*' )
  }

  def checkLetter(word: String, letter: Char): Boolean = {
    word.contains(letter)
  }

  def checkWin(mask: String): Boolean = {
    !(mask.contains("*"))
  }
}