object AddNumbers {
  def main(args: Array[String]): Unit = {
    def Add2(n1:Int, n2:Int):Int = {
       return n1+n2
    }

    var num1=3
    var num2=8
    var sum = Add2(num1,num2) 
    println("num1=",num1," num2=",num2,"and sum=",sum)
    println("num1 = "+num1+" num2 = "+num2+" and sum = "+sum)
  }
}

