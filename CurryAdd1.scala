object CurryAdd1 {
   def main(args: Array[String]) {
      val sum1 = addC1(3)(5);
      val sum2 = addC2(3)(5);

      println("sum1 = "+sum1);
      println("sum2 = "+sum2);
   }

   def addC1(x: Int)(y: Int): Int = {
     x + y
   }

   def addC2(x: Int): (Int => Int) = {
     (y: Int) => {
       x + y
     }
   }
}
