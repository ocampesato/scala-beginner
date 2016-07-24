import scala.io.StdIn.{readLine, readInt, readDouble};

object UserInput2 {
  def main(args: Array[String]) {
    var guess:Double = 0

    try {
       print("Enter a Number: ") 
       guess = readLine.toDouble 
       printf("you guessed %f\n", guess)
    } catch {
       case ex: java.lang.NumberFormatException => 
                     println("Please enter a Number")
    } finally {
    } 
  } 
} 
