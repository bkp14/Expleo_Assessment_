package krishnaprasath_assessment_3_3;

public class banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       try {
	            TransactionValidator.validateTransaction("", 1000, 500, 2000);
	        } catch (InvalidAccountException e) {
	            System.out.println(e.getMessage() + " Code: " + e.getErrorCode() );
	        } catch (InsufficientFundsException e) {
	            System.out.println(e.getMessage() + " Code: " + e.getErrorCode() );
	        } catch (TransactionLimitException e) {
	            System.out.println(e.getMessage() + "Code: " + e.getErrorCode());
	        } finally {
	            System.out.println("Validation complete.\n");
	        }
	}
}
