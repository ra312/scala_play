import java.util.Calendar
class TickData {
   var Ticker = Set("NYSE", "NASDAQ", "TSX","SSE","TSE", "Euronext")
   val timestamp = Calendar.getInstance().getTime()
   // volume
   // bid
   // offer

   def list_markets():Unit = 
   {
      Ticker.foreach(T => println(T))
      //println(Ticker)
   }
}

