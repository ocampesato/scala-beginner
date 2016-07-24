object SimpleTimer {
   def oncePerSecond(callback: () => Unit) {
      while (true) { callback(); Thread sleep 1000 }
   }

   def timeRightNow () {
      println("time right now...")
   }

   def main(args: Array[String]) {
      oncePerSecond(timeRightNow)
   }
}

