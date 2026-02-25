package guru.qa.data;

public class MirCard extends Card {

  // СОЗДАЛИ КОНСТРУКТОР
  public MirCard() {
    super(PaymentSystem.MIR);
  }



  protected boolean isCountryValidForTheseCard(Country country) {
    if (country == Country.RU)
      return true;
    else
      return false;
  }
}

