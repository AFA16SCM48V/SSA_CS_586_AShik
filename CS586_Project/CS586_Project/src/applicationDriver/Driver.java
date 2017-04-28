package applicationDriver;

import java.util.Scanner;

import abstractFactory.ConcreteFactory1;
import abstractFactory.ConcreteFactory2;
import gaspump.GasPump1;
import gaspump.GasPump2;
import output.Output;
import state.MDAEFSM;
import state.state;

/**
 * @author ashik shukoor A20375848
 *
 */
public class Driver {

	public static int gaspump = 0;

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Gas pump menu: (Enter the item #)");
		System.out.println("1. Gas Pump 1");
		System.out.println("2. Gas Pump 2");

		Scanner inpScan = new Scanner(System.in);
		int menuItem = inpScan.nextInt();
		if (menuItem == 1) {

			gaspump = 1;
			ConcreteFactory1 factory = new ConcreteFactory1();
			MDAEFSM efsm = new MDAEFSM();
			state.opobj = new Output(factory, factory.GetDataStore());

			GasPump1 gp1 = new GasPump1(efsm, factory.GetDataStore());

			System.out.println("Gas pump 1 functionality:");

			while (true) {
				Thread.sleep(1000);
				System.out.println("  Select the Operation #: ");
				System.out.println("Operations for Gas Pump 1");
				System.out.println("1 . Activate(float,float)");
				System.out.println("2 . Start() ");
				System.out.println("3 . PayCredit()");
				System.out.println("4 . Reject() ");
				System.out.println("5 . Cancel()");
				System.out.println("6 . Approved()");
				System.out.println("7 . Super()");
				System.out.println("8 . Regular()");
				System.out.println("9 . StartPump()");
				System.out.println("10. PumpGallon()");
				System.out.println("11. StopPump()");
				System.out.println(" Input: ");
				int menuItem1 = inpScan.nextInt();

				if (menuItem1 == 12)
					break;

				if (menuItem1 == 1) {

					// ACTIVATE
					System.out.println("\n  Operation:  Activate(float a,float b)");
					System.out.println("   Enter the Unit Price for the Super Gas");
					float superprice = inpScan.nextFloat();
					System.out.println("   Enter the Unit  Price for the Regular Gas");
					float regularprice = inpScan.nextFloat();
					gp1.Activate(superprice, regularprice);

				} else if (menuItem1 == 2) {

					System.out.println("  Operation:  Start()");
					gp1.Start();
				} else if (menuItem1 == 3) {

					// PayCredit
					System.out.println("  Operation:  PayCredit()");
					gp1.PayCredit();
				} else if (menuItem1 == 4) {
					// Reject;
					System.out.println("Operations  Reject()");
					gp1.Reject();

				} else if (menuItem1 == 5) {
					// cancel
					System.out.println("Operations  Cancel()");
					gp1.Cancel();

				} else if (menuItem1 == 6) {
					// approve
					System.out.println("Operations Approved()");
					gp1.Approved();
				} else if (menuItem1 == 7) {
					// select regular gas
					System.out.println("  Operation:  Regular()");
					gp1.Regular();
				} else if (menuItem1 == 8) {
					// selected super gas
					System.out.println("  Operation:  Super()");
					gp1.Super();
				} else if (menuItem1 == 9) {
					// start pump
					System.out.println("  Operation:  StartPump()");
					gp1.StartPump();
				} else if (menuItem1 == 10) {
					// pump gas
					System.out.println("  Operation:  Pump()");
					gp1.Pump();
				} else if (menuItem1 == 11) {
					// stop the pump
					System.out.println("  Operation:  StopPump()");
					gp1.StopPump();
				}
			}
		} else if (menuItem == 2) {
			gaspump = 2;
			ConcreteFactory2 factory = new ConcreteFactory2();
			MDAEFSM efsm = new MDAEFSM();
			state.opobj = new Output(factory, factory.GetDataStore());

			GasPump2 gp2 = new GasPump2(efsm, factory.GetDataStore());

			System.out.println("Gas pump 2");
			System.out.println("Operations for Gas Pump 2");

			while (true) {
				Thread.sleep(1000);
				System.out.println("  Select Operation: ");
				System.out.println("1 . Activate(int, int ,int)");
				System.out.println("2 . Start() ");
				System.out.println("3 . PayCash(int)");
				System.out.println("4 . Cancel()");
				System.out.println("5 . Premium()");
				System.out.println("6 . Regular()");
				System.out.println("7 . Super()  ");
				System.out.println("8 . StartPump()");
				System.out.println("9 . PumpLiter()");
				System.out.println("10. Stop()");
				System.out.println("11. Receipt()");
				System.out.println("12. NoReceipt()");

				int menuItem1 = inpScan.nextInt();

				if (menuItem1 == 1) {

					// ACTIVATE
					System.out.println("\n  Operation:  Activate(int a,int b,int c)");
					System.out.println("   Enter the Unit  Price for Premium Gas");
					int premiumprice = inpScan.nextInt();
					System.out.println("   Enter the Unit  Price for Super Gas");
					int superprice = inpScan.nextInt();
					System.out.println("   Enter the Unit  Price for Regular Gas");
					int regularprice = inpScan.nextInt();
					gp2.Activate(premiumprice, superprice, regularprice);

				} else if (menuItem1 == 2) {

					System.out.println("  Operation:  Start()");
					gp2.Start();
				}

				else if (menuItem1 == 3) {

					// PayCash
					System.out.println("  Operation:  PayCash()");
					System.out.println("Enter the amount of cash :");
					int cash = inpScan.nextInt();
					gp2.PayCash(cash);
				}

				else if (menuItem1 == 4) {
					System.out.println("Operations  Cancel()");
					gp2.Cancel();
					// cancel
				} else if (menuItem1 == 5) {
					// select regular gas
					System.out.println("  Operation:  Premium()");
					gp2.Premium();
				}

				else if (menuItem1 == 6) {
					// select regular gas
					System.out.println("  Operation:  Regular()");
					gp2.Regular();
				} else if (menuItem1 == 7) {
					// selected super gas
					System.out.println("  Operation:  Super()");
					gp2.Super();
				} else if (menuItem1 == 8) {
					// start pump
					System.out.println("  Operation:  StartPump()");
					gp2.StartPump();
				} else if (menuItem1 == 9) {
					// to pump gas
					System.out.println("  Operation:  Pump()");
					gp2.Pump();
				} else if (menuItem1 == 10) {

					// stop pumping
					System.out.println("  Operation:  StopPump()");
					gp2.StopPump();
				} else if (menuItem1 == 11) {

					// generate and print receipt
					System.out.println("  Operation:  Receipt()");
					gp2.Receipt();
					;
				} else if (menuItem1 == 12) {

					// don't take receipt
					System.out.println("  Operation:  NoReceipt()");
					gp2.NoReceipt();
				}

			}
		} else {

			// retry choosing gas pump
			System.out.println("Invalid option, try again ");
		}

		inpScan.close();
	}

}
