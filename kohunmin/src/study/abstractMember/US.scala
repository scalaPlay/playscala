package study.abstractMember

/**
  * Created by kohunmin on 2016. 3. 19..
  */
object US extends CurrencyZone{
  abstract class Dollar extends AbstractCurrency {
    def designation = "USD"

    override def toString =
      ((amount.toDouble / CurrencyUnit.amount.toDouble)
        formatted("%." + decimals(CurrencyUnit.amount) + "F" + " " + designation))
  }
  type Currency = Dollar

  override def make(cents: Long) = new Dollar {
    val amount = cents
  }

  private def decimals(n: Long): Int =
    if(n < 10) 0 else 1 + decimals(n / 10)
  val Cent = make(1)
  val Dollar = make(100)
  val CurrencyUnit = Dollar
}

object Japan extends CurrencyZone {
  abstract class Yen extends AbstractCurrency {
    def designation = "JPY"
  }
  type Currency = Yen
  def make(yen: Long) = new Yen {
    val amount = yen
  }
  val Yen = make(1)
  val CurrencyUnit = Yen
}
