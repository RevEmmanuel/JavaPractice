package Chapter9.EStore;

public class CreditCard {

    private final int Cvv;
    private final int expirationYear;
    private final int expirationMonth;
    private String name;
    private final String cardNumber;
    private final CardType cardType;

    public CreditCard() {
        this(0, 0, 0, "", CardType.MASTERCARD);
    }
    public CreditCard(int cvv, int expirationYear, int expirationMonth, String cardNumber, CardType cardType) {
        Cvv = cvv;
        this.expirationYear = expirationYear;
        this.expirationMonth = expirationMonth;
        this.cardNumber = cardNumber;
        this.cardType = cardType;
    }
}
