object ForLoopList {
   def main(args: Array[String]) {
      var x = 0;
      val numList = List(1,2,3,4,5,6,7,8);

      for( x <- numList
           if x != 3; if x < 6 ){
         println( "x: " + x );
      }
   }
}
