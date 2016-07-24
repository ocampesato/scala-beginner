object Closure1 {
   def main(args: Array[String]) {
      println("multF(1) value = " +  multF(1) )
      println("multF(2) value = " +  multF(2) )
   }
   var F = 3
   val multF = (i:Int) => i * F
}
