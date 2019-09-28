import org.scalatest.{FlatSpec, FunSuite, Matchers, PrivateMethodTester}

class HangmanTest extends FunSuite {
  test("makeMask") {
    assert(Hangman.makeMask(word, Set[Char]('a', 'b', 'c')) == "ca*")
  }

  test("checkLetter") {
    assert(Hangman.checkLetter(word, 't'))
    assert(!Hangman.checkLetter(word, 'b'))
  }

  test("checkWin") {
    assert(!Hangman.checkWin("c*t"))
    assert(!Hangman.checkWin("***"))
  }

  val word = "cat"
}
