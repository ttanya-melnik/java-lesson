package guru.qa.data;

public class VisaCard extends Card {

  // СОЗДАЛИ КОНСТРУКТОР
  public VisaCard() {
    super(PaymentSystem.VISA);
  }




  protected boolean isCountryValidForTheseCard(Country country) {
    return true;
  }
}
