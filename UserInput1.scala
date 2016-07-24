import scala.io.StdIn.{readLine, readInt, readDouble};

object UserInput1 {
  def main(args: Array[String]) {
    var guess:Int = 0

    print("Enter an Integer : ") 
    guess = readLine.toInt 
    printf("you guessed %d\n", guess)
  } 
} 
