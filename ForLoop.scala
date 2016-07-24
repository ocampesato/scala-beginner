object ForLoop {
  def main(args: Array[String]) {
   var x = 0; var y = 0;

   for(x <- 1 to 5)   {println("x: " + x );}
   for(x <- 1 until 5){println("x: " + x );}

   for( x <- 1 to 3; y <- 1 to 3){
      println( "x: " + x );
      println( "y: " + y );
   }
  }
}

