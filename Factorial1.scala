object Factorial1 {
   def main(args: Array[String]) {
      for (i <- 1 to 10)
        println( "Fact("+i+") : = " + fact(i) )
   }
   
   def fact(n: BigInt): BigInt = {  
      if (n <= 1)
         1  
      else    
      n * fact(n - 1)
   }
}

