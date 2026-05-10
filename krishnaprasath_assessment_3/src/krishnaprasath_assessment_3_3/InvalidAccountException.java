package krishnaprasath_assessment_3_3;

class InvalidAccountException extends BankTransactionException {
    String accountId;

    public InvalidAccountException(String accountId) {
        super("InvalidAccountException: Account ID cannot be empty", 1001);
        this.accountId = accountId;
    }
}



