package guru.qa.data;

public class UnionPayCard extends Card {

  // СОЗДАЛИ КОНСТРУКТОР
  public UnionPayCard() {
    super(PaymentSystem.UNION_PAY);
  }



  // СОЗДАЛИ МЕТОД
  protected boolean isCountryValidForTheseCard(Country country) {
    if (country == Country.CN)
       return true;
    else
       return false;
  }
}
