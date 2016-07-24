object CustomMethods {
  def main(args: Array[String]) { 
     def getSum(num1:Int=1, num2:Int=1) : Int = {
        return num1 + num2 
     } 

     def getSum2(args : Int*) : Int = {
        var sum : Int = 0
        for(num <- args) {
          sum += num 
        } 
        sum 
     } 

     def sayHello() : Unit = { 
        println("Hello how are you")
     } 

     println("5 + 4 = "+getSum(5,4))
     println("5 + 4 = "+getSum(num2=5,num1=4))

     sayHello 
     println("Get Sum "+ getSum2(1,2,3,4,5))
  } 
} 

