package guru.qa.data;

public class MasterCard extends Card {

  // СОЗДАЛИ КОНСТРУКТОР
  public MasterCard() {
    super(PaymentSystem.MASTERCARD);
  }




  // СОЗДАЛИ ПУБЛИЧНЫЙ КЛАСС
  protected boolean isCountryValidForTheseCard(Country country) {
    return true;
  }



}
