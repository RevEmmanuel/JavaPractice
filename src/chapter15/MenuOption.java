package Chapter15;

public enum MenuOption {

    ZERO_BALANCE(0),
    CREDIT_BALANCE(1),
    DEBIT_BALANCE(2),
    END(4);

    private final int value;

    private MenuOption(int value) {
        this.value = value;
    }
}
