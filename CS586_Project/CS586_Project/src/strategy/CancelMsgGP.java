package strategy;

public class CancelMsgGP extends CancelMsg {

	@Override
	public void cancelmsg() {
		
		System.out.println("\n  !!Transaction Cancelled!! \n");
		System.out.println("\n  Please Start Again: \n");
		
	}

}
