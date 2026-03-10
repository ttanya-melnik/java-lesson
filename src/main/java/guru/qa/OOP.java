package guru.qa;

import static guru.qa.data.Country.RU;

import guru.qa.data.Card;
import guru.qa.data.VisaCard;

public class OOP {


   public static void main(String[] args) {

      // СОЗДАЛИ ОБЪЕКТ
      Card visaCard = new VisaCard();
      visaCard.setBalance(100);
      visaCard.payInCountry(RU, 75);
      System.out.println(visaCard.getBalance());

   }

}
