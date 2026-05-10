package krishnaprasath_assessment_3_3;

class InsufficientFundsException extends BankTransactionException {
    double shortfall;

    public InsufficientFundsException(double shortfall) {
        super("InsufficientFundsException: Shortfall: " + shortfall, 1002);
        this.shortfall = shortfall;
    }
}

