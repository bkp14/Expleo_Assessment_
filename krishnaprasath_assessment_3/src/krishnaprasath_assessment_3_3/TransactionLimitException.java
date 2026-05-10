package krishnaprasath_assessment_3_3;

class TransactionLimitException extends BankTransactionException {
    double limit;

    public TransactionLimitException(double limit) {
        super("TransactionLimitException: Limit: "+limit, 1003);
        this.limit = limit;
    }
}
