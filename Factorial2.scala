object Factorial2 {
   def main(args: Array[String]) {
     for (i <- 1 to 10)
       println("Factorial("+i+") : = "+fact(i,1))
   }
   
   def fact(n: BigInt, prod:BigInt): BigInt = {  
     if (n <= 1)
       prod  
     else    
       fact(n - 1, n*prod)
   }
}

