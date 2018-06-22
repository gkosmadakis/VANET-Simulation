
public class WMNprotocol {

	String []  carA1array,carA2array,carA3array,carA4array,carA5array,carB1array,carB2array,carB3array,carB4array,carB5array,
	carC1array,carC2array,carC3array,carC4array,carC5array,carD1array,carD2array,carD3array,carD4array,carD5array;

	int reputationindexA1=10;
	int reputationindexA2=10;
	int reputationindexA3=10;
	int reputationindexA4=10;
	int reputationindexA5=10;
	int reputationindexB1=10;
	int reputationindexB2=10;
	int reputationindexB3=10;
	int reputationindexB4=10;
	int reputationindexB5=10;
	int reputationindexC1=10;
	int reputationindexC2=10;
	int reputationindexC3=10;
	int reputationindexC4=10;
	int reputationindexC5=10;
	int reputationindexD1=10;
	int reputationindexD2=10;
	int reputationindexD3=10;
	int reputationindexD4=10;
	int reputationindexD5=10;
	int rthresh=5;

	DataPacket wpacket = new DataPacket();


	public void WMN () { //Implementation of WMN Wireless Mesh Networks

		reputationindexA1++;
		reputationindexA2++;
		reputationindexA3++;
		reputationindexA4++;
		reputationindexA5++;
		reputationindexB1++;
		reputationindexB2++;
		reputationindexB3++;
		reputationindexB4++;
		reputationindexB5++;
		reputationindexC1++;
		reputationindexC2++;
		reputationindexC3++;
		reputationindexC4++;
		reputationindexC5++;
		reputationindexD1++;
		reputationindexD2++;
		reputationindexD3++;
		reputationindexD4++;
		reputationindexD5++;


		int savedfieldValueA1= wpacket.getsavedfieldValueA1(); 
		int savedfieldValueA2= wpacket.getsavedfieldValueA2();
		int savedfieldValueA3= wpacket.getsavedfieldValueA3();
		int savedfieldValueA4= wpacket.getsavedfieldValueA4();
		int savedfieldValueA5= wpacket.getsavedfieldValueA5();
		int savedfieldValueB1= wpacket.getsavedfieldValueB1(); 
		int savedfieldValueB2= wpacket.getsavedfieldValueB2();
		int savedfieldValueB3= wpacket.getsavedfieldValueB3();
		int savedfieldValueB4= wpacket.getsavedfieldValueB4();
		int savedfieldValueB5= wpacket.getsavedfieldValueB5();
		int savedfieldValueC1= wpacket.getsavedfieldValueC1();
		int savedfieldValueC2= wpacket.getsavedfieldValueC2();
		int savedfieldValueC3= wpacket.getsavedfieldValueC3();
		int savedfieldValueC4= wpacket.getsavedfieldValueC4();
		int savedfieldValueC5= wpacket.getsavedfieldValueC5();
		int savedfieldValueD1= wpacket.getsavedfieldValueD1();
		int savedfieldValueD2= wpacket.getsavedfieldValueD2();
		int savedfieldValueD3= wpacket.getsavedfieldValueD3();
		int savedfieldValueD4= wpacket.getsavedfieldValueD4();
		//int savedfieldValueD5= wpacket.getsavedfieldValueD5();

		wpacket.ArrayCarsA(carA1array,carA2array,carA3array,carA4array,carA5array);
		wpacket.ArrayCarsB(carB1array,carB2array,carB3array,carB4array,carB5array);
		wpacket.ArrayCarsC(carC1array,carC2array,carC3array,carC4array,carC5array);
		wpacket.ArrayCarsD(carD1array,carD2array,carD3array,carD4array,carD5array);

		if (reputationindexA1>savedfieldValueA1+rthresh) { // if field value is more than saved field value plus the threshold

			System.out.println("CarA1 is selfish");
		}

		if (reputationindexA2>savedfieldValueA2+rthresh) { // if field value is more than saved field value plus the threshold

			System.out.println("CarA2 is selfish");
		}

		if (reputationindexA3>savedfieldValueA3+rthresh) { // if field value is more than saved field value plus the threshold

			System.out.println("CarA3 is selfish");
		}

		if (reputationindexA4>savedfieldValueA4+rthresh) { // if field value is more than saved field value plus the threshold

			System.out.println("CarA4 is selfish");
		}

		if (reputationindexA5>savedfieldValueA5+rthresh) { // if field value is more than saved field value plus the threshold

			System.out.println("CarA5 is selfish");
		}

		if (reputationindexB1>savedfieldValueB1+rthresh) { // if field value is more than saved field value plus the threshold

			System.out.println("CarB1 is selfish");
		}

		if (reputationindexB2>savedfieldValueB2+rthresh) { // if field value is more than saved field value plus the threshold

			System.out.println("CarB2 is selfish");
		}

		if (reputationindexB3>savedfieldValueB3+rthresh) { // if field value is more than saved field value plus the threshold

			System.out.println("CarB3 is selfish");
		}

		if (reputationindexB4>savedfieldValueB4+rthresh) { // if field value is more than saved field value plus the threshold

			System.out.println("CarB4 is selfish");
		}

		if (reputationindexB5>savedfieldValueB5+rthresh) { // if field value is more than saved field value plus the threshold

			System.out.println("CarB5 is selfish");
		}

		if (reputationindexC1>savedfieldValueC1+rthresh) { // if field value is more than saved field value plus the threshold

			System.out.println("CarC1 is selfish");
		}

		if (reputationindexC2>savedfieldValueC2+rthresh) { // if field value is more than saved field value plus the threshold

			System.out.println("CarC2 is selfish");
		}

		if (reputationindexC3>savedfieldValueC3+rthresh) { // if field value is more than saved field value plus the threshold

			System.out.println("CarC3 is selfish");
		}

		if (reputationindexC4>savedfieldValueC4+rthresh) { // if field value is more than saved field value plus the threshold

			System.out.println("CarC4 is selfish");
		}

		if (reputationindexC5>savedfieldValueC5+rthresh) { // if field value is more than saved field value plus the threshold

			System.out.println("CarC5 is selfish");
		}

		if (reputationindexD1>savedfieldValueD1+rthresh) { // if field value is more than saved field value plus the threshold

			System.out.println("CarD1 is selfish");
		}

		if (reputationindexD2>savedfieldValueD2+rthresh) { // if field value is more than saved field value plus the threshold

			System.out.println("CarD2 is selfish");
		}

		if (reputationindexD3>savedfieldValueD3+rthresh) { // if field value is more than saved field value plus the threshold

			System.out.println("CarD3 is selfish");
		}

		if (reputationindexD4>savedfieldValueD4+rthresh) { // if field value is more than saved field value plus the threshold

			System.out.println("CarD4 is selfish");
		}

		/*if (reputationindexD5>savedfieldValueD5+rthresh) { // if field value is more than saved field value plus the threshold

			System.out.println("CarD5 is selfish");
		}*/

	}
}
