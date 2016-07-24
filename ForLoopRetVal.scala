object ForLoopRetVal {
   def main(args: Array[String]) {
      var x = 0;

      val numList = List(1,2,3,4,5,6,7,8,9,10);
      var retVal = for{ x <- numList if x != 3; if x < 8 }yield x
      for( x <- retVal){ println( "x: " + x ); }
   }
}
