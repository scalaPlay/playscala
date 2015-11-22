package study

class Exercise7_11 (var channel: Int, var volume: Int) {
  var isPowerOn = false

  val MAX_VOLUME = 100
  val MIN_VOLUME = 0
  val MAX_CHANNEL = 100
  val MIN_CHANNEL = 1

  def turnOnOff(): Unit =
    isPowerOn = !isPowerOn

  def volumeUp(): Unit =
    if (volume < MAX_VOLUME) volume += 1

  def volumeDonw(): Unit =
    if (volume > MIN_VOLUME) volume -= 1

  def channelUP(): Unit = {
    channel += 1
    if (channel > MAX_CHANNEL) channel = MIN_CHANNEL
  }

  def channelDown(): Unit = {
    channel -= 1
    if (channel > MIN_CHANNEL) channel = MAX_CHANNEL
  }
  
  def gotoPrevChannel() : Unit =
    channelDown()

  override def toString = "CH:" + channel + ", VOL:" + volume

  def main(args: Array[String]): Unit = {
    val t = new Exercise7_11(1, 1)

    println(t)

    t.channelDown()
    t.volumeDonw()
    println(t)

    t.volume = 100
    t.channelUP()
    t.volumeUp()
    println(t)
    
    t.gotoPrevChannel()
    
    println(t)
  }

}