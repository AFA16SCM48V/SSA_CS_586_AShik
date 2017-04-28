/**
 * 
 */
package state;

import output.Output;

/**
 * State class performing activate function
 */
public class S extends state {

	public S(state s) {
		super(s);
		
	}

	@Override
	public void Activate() {
		
		opobj.StoreData();
		MDAEFSM.mdaefsmState = MDAEFSM.getS0State();
	}

	@Override
	public void Start() {
		

	}

	@Override
	public void PayCredit() {
		

	}

	@Override
	public void PayCash() {
		

	}

	@Override
	public void Reject() {
		

	}

	@Override
	public void Cancel() {
		

	}

	@Override
	public void Approved() {
		

	}

	@Override
	public void SelectGas(int g) {
		

	}

	@Override
	public void StartPump() {
		

	}

	@Override
	public void Pump() {
		

	}

	@Override
	public void StopPump() {
		

	}

	@Override
	public void Receipt() {
		

	}

	@Override
	public void NoReceipt() {
		

	}

	@Override
	public void ReturnCash() {
		
		
	}

}
