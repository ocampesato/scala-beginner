import scala.io.StdIn.{readLine, readInt, readDouble};

object UserInput3 {
  def main(args: Array[String]) {
    var guess:Double = 0

    do {
       try {
          print("Enter a Number: ") 
          guess = readLine.toDouble
          printf("you guessed %f\n", guess)
       } catch {
          case ex: java.lang.NumberFormatException => 
                        println("Please enter a Number")
       } finally {
       } 
    } while(guess != 15)  
  } 
} 
//readInt readDouble readByte readShort readLong 
