package study.exercise

import java.util.Calendar
import java.util.Date
import java.text.SimpleDateFormat

object Exercise11_15 {
  def payCheckCount(from: Calendar, to: Calendar):Int = (from, to) match {
    case (null , _) | (_ , null) => 0
  }
  
  def printResult(from: Calendar , to: Calendar) = {
    var fromDate = from.getTime()
    var toDate = to.getTime
    
    var sdf = new SimpleDateFormat("yyyy-MM-dd")
    
    print(sdf.format(fromDate) + " ~ " + sdf.format(toDate) + ":")
    println(payCheckCount(from, to))
  }
  def main(args: Array[String]): Unit = {
    var fromCal = Calendar.getInstance()
    var toCal = Calendar.getInstance()
    
    fromCal.set(2010, 0, 1)
    toCal.set(2010,0, 1)
    printResult(fromCal, toCal)
    
    fromCal.set(2010, 0, 21)
    toCal.set(2010,0, 21)
    printResult(fromCal, toCal)
    
    fromCal.set(2010, 0, 1)
    toCal.set(2010,2, 1)
    printResult(fromCal, toCal)
    
    fromCal.set(2010, 0, 1)
    toCal.set(2010,2, 23)
    printResult(fromCal, toCal)
    
    fromCal.set(2010, 0, 23)
    toCal.set(2010,2, 21)
    printResult(fromCal, toCal)
    
    fromCal.set(2011, 0, 22)
    toCal.set(2011,2, 21)
    printResult(fromCal, toCal)
    
    
    
  }
}