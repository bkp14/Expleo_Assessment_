package krishnaprasath_assessment_3_3;

abstract class BankTransactionException extends Exception {
    int errorCode;

    public BankTransactionException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
