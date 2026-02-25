package guru.qa.data;

public abstract class Card {

   // СТРУКТУРА ДАННЫХ, КОТОРАЯ ОПИСЫВАЕТ БАНКОВСКУЮ КАРТОЧКУ

   protected String cardHolder; // данные на лицевой стороне карточки
   protected int balance; // баланс нашей карточки
   protected String cardNumber; // номер карты

   protected PaymentSystem paymentSystem; // указали название типа данных, и придумали имя переменной

   public String getCardHolder() {
      return cardHolder;
   }

   public void setCardHolder(String cardHolder) {
      this.cardHolder = cardHolder;
   }

   public int getBalance() {
      return balance;
   }

   public void setBalance(int balance) {
      this.balance = balance;
   }

   public String getCardNumber() {
      return cardNumber;
   }

   public void setCardNumber(String cardNumber) {
      this.cardNumber = cardNumber;
   }

   public void setPaymentSystem(PaymentSystem paymentSystem) {
      this.paymentSystem = paymentSystem;
   }


   // СОЗДАЛИ КОНСТРУКТОР
   public Card(PaymentSystem paymentSystem) {
      this.paymentSystem = paymentSystem;
   }

   // СОЗДАЛИ МЕТОД
   public PaymentSystem getPaymentSystem() {
      return paymentSystem;
   }

   // СОЗДАЛИ МЕТОД
   protected boolean isBalanceGreaterOrEqualThan(int amount) {
      return balance >= amount;
   }


   public void payInCountry(Country country, int amount) {
      if (isCountryValidForTheseCard(country) && isBalanceGreaterOrEqualThan(amount)) {
         balance = balance - amount;
         System.out.println("Accepted!");
      }
   }


   protected abstract boolean isCountryValidForTheseCard(Country country);

}

