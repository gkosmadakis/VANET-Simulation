
public class ReputationBased {

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
	int rthresh=9;

	DataPacket repacket = new DataPacket();

	public void ReputationBasedprotocol() {//the implementation of reputation paper

		String carA1array[]= repacket.returncarA1array();
		String carA2array[]= repacket.returncarA2array();
		String carA3array[]= repacket.returncarA3array();
		String carA4array[]= repacket.returncarA4array();
		String carA5array[]= repacket.returncarA5array();
		String carB1array[]= repacket.returncarB1array();
		String carB2array[]= repacket.returncarB2array();
		String carB3array[]= repacket.returncarB3array();
		String carB4array[]= repacket.returncarB4array();
		String carB5array[]= repacket.returncarB5array();
		String carC1array[]= repacket.returncarC1array();
		String carC2array[]= repacket.returncarC2array();
		String carC3array[]= repacket.returncarC3array();
		String carC4array[]= repacket.returncarC4array();
		String carC5array[]= repacket.returncarC5array();
		String carD1array[]= repacket.returncarD1array();
		String carD2array[]= repacket.returncarD2array();
		String carD3array[]= repacket.returncarD3array();
		String carD4array[]= repacket.returncarD4array();
		String carD5array[]= repacket.returncarD5array();

		if  (carA2array[0].equals("A2a")) {// node A2 checks whether the packet is a retransmission

			reputationindexA1--; // if it is node A2 decrements the reputation of the neighbor A1

			if (reputationindexA1< rthresh) { //Node A2 then compares the current reputation index of the previous hop with the threshold

				carA2array = new String [] {"A2a","A2b","A2c","A2d"}; //A2 drops the packet

				System.out.println("CarA1 is selfish"); 
			}
		}

		else {

			carA2array = CarComponent.copySubarrayA( carA1array, 0, 2, ""); //A2 accepts the packet and if it is not selfish will forward the packet
			reputationindexA1++;//packet was delivered from A1 to A2. A2 awards A1 by incrementing its value.
		}


		if  (carA3array[0].equals("A3a")) { // node A2 checks whether the packet is a retransmission

			reputationindexA2--; // if it is node A2 decrements the reputation of the neighbor A1

			if (reputationindexA2< rthresh) { //Node A2 then compares the current reputation index of the previous hop with the threshold

				carA3array = new String [] {"A3a","A3b","A3c","A3d"}; //A2 drops the packet

				System.out.println("CarA2 is selfish"); 
			}

		}

		else {

			carA3array = CarComponent.copySubarrayA( carA2array, 0, 2, ""); //A2 accepts the packet and if it is not selfish will forward the packet
			reputationindexA2++;//packet was delivered from A1 to A2. A2 awards A1 by incrementing its value.
		}

		if  (carA4array[0].equals("A4a")){ // node A2 checks whether the packet is a retransmission

			reputationindexA3--; // if it is node A2 decrements the reputation of the neighbor A1

			if (reputationindexA3< rthresh) { //Node A2 then compares the current reputation index of the previous hop with the threshold

				carA4array = new String [] {"A4a","A4b","A4c","A4d"}; //A2 drops the packet

				System.out.println("CarA3 is selfish"); 
			}
		}

		else {

			carA4array = CarComponent.copySubarrayA( carA3array, 0, 2, ""); //A2 accepts the packet and if it is not selfish will forward the packet
			reputationindexA3++;//packet was delivered from A1 to A2. A2 awards A1 by incrementing its value.
		}


		if (carA5array[0].equals("A5a")) { // node A2 checks whether the packet is a retransmission

			reputationindexA4--; // if it is node A2 decrements the reputation of the neighbor A1

			if (reputationindexA4< rthresh) { //Node A2 then compares the current reputation index of the previous hop with the threshold

				carA5array = new String [] {"A5a","A5b","A5c","A5d"}; //A2 drops the packet

				System.out.println("CarA4 is selfish"); 
			}
		}

		else {

			carA5array = CarComponent.copySubarrayA( carA4array, 0, 2, ""); //A2 accepts the packet and if it is not selfish will forward the packet
			reputationindexA4++;//packet was delivered from A1 to A2. A2 awards A1 by incrementing its value.
		}


		if  (carB5array[0].equals("B5a")) { // node A2 checks whether the packet is a retransmission

			reputationindexA5--; // if it is node A2 decrements the reputation of the neighbor A1

			if (reputationindexA5< rthresh) { //Node A2 then compares the current reputation index of the previous hop with the threshold

				carB5array = new String [] {"B5a","B5b","B5c","B5d"}; //A2 drops the packet

				System.out.println("CarA5 is selfish"); 
			}
		}

		else {

			carB5array = CarComponent.copySubarrayB( carA5array, 0, 2, ""); //A2 accepts the packet and if it is not selfish will forward the packet
			reputationindexA5++;//packet was delivered from A1 to A2. A2 awards A1 by incrementing its value.
		}




		if  (carB2array[0].equals("B2a")) { // node A2 checks whether the packet is a retransmission

			reputationindexB1--; // if it is node A2 decrements the reputation of the neighbor A1

			if (reputationindexB1< rthresh) { //Node A2 then compares the current reputation index of the previous hop with the threshold

				carB2array = new String [] {"B2a","B2b","B2c","B2d"  }; //A2 drops the packet

				System.out.println("CarB1 is selfish"); 
			}
		}
		
		else {

			carB2array = CarComponent.copySubarrayA( carB1array, 0, 2, ""); //A2 accepts the packet and if it is not selfish will forward the packet
			reputationindexB1++;//packet was delivered from A1 to A2. A2 awards A1 by incrementing its value.
		}


		if  (carB3array[0].equals("B3a")) { // node A2 checks whether the packet is a retransmission

			reputationindexB2--; // if it is node A2 decrements the reputation of the neighbor A1


			if (reputationindexB2< rthresh) { //Node A2 then compares the current reputation index of the previous hop with the threshold

				carB3array = new String [] {"B3a","B3b","B3c","B3d"}; //A2 drops the packet

				System.out.println("CarB2 is selfish"); 
			}

		}
		
		else {

			carB3array = CarComponent.copySubarrayA( carB2array, 0, 2, ""); //A2 accepts the packet and if it is not selfish will forward the packet
			reputationindexB2++;//packet was delivered from A1 to A2. A2 awards A1 by incrementing its value.
		}

		if  (carB4array[0].equals("B4a")) { // node A2 checks whether the packet is a retransmission

			reputationindexB3--; // if it is node A2 decrements the reputation of the neighbor A1

			if (reputationindexB3< rthresh) { //Node A2 then compares the current reputation index of the previous hop with the threshold

				carB4array = new String [] {"B4a","B4b","B4c","B4d"}; //A2 drops the packet

				System.out.println("CarB3 is selfish"); 
			}
		}
		
		else {

			carB4array = CarComponent.copySubarrayA( carB3array, 0, 2, ""); //A2 accepts the packet and if it is not selfish will forward the packet
			reputationindexB3++;//packet was delivered from A1 to A2. A2 awards A1 by incrementing its value.
		}


		if  (carB5array[0].equals("B5a")) { // node A2 checks whether the packet is a retransmission

			reputationindexB4--; // if it is node A2 decrements the reputation of the neighbor A1

			if (reputationindexB4< rthresh) { //Node A2 then compares the current reputation index of the previous hop with the threshold

				carB5array = new String [] {"B5a","B5b","B5c","B5d"}; //A2 drops the packet

				System.out.println("CarB4 is selfish"); 
			}
		}
		
		else {

			carB5array = CarComponent.copySubarrayA( carB4array, 0, 2, ""); //A2 accepts the packet and if it is not selfish will forward the packet
			reputationindexB4++;//packet was delivered from A1 to A2. A2 awards A1 by incrementing its value.
		}

		if  (carC5array[0].equals("C5a")) { // node A2 checks whether the packet is a retransmission

			reputationindexB5--; // if it is node A2 decrements the reputation of the neighbor A1


			if (reputationindexB5< rthresh) { //Node A2 then compares the current reputation index of the previous hop with the threshold

				carC5array = new String [] {"C5a","C5b","C5c","C5d"}; //A2 drops the packet

				System.out.println("CarB5 is selfish"); 
			}
		}
		
		else {

			carC5array = CarComponent.copySubarrayB( carB5array, 0, 2, ""); //A2 accepts the packet and if it is not selfish will forward the packet
			reputationindexB5++;//packet was delivered from A1 to A2. A2 awards A1 by incrementing its value.
		}


		if  (carC2array[0].equals("C2a")) { // node A2 checks whether the packet is a retransmission

			reputationindexC1--; // if it is node A2 decrements the reputation of the neighbor A1

			if (reputationindexC1< rthresh) { //Node A2 then compares the current reputation index of the previous hop with the threshold

				carC2array = new String [] {"C2a","C2b","C2c","C2d"  }; //A2 drops the packet

				System.out.println("CarC1 is selfish"); 
			}
		}
		
		else {

			carC2array = CarComponent.copySubarrayA( carC1array, 0, 2, ""); //A2 accepts the packet and if it is not selfish will forward the packet
			reputationindexC1++;//packet was delivered from A1 to A2. A2 awards A1 by incrementing its value.
		}


		if  (carC3array[0].equals("C3a")) { // node A2 checks whether the packet is a retransmission

			reputationindexC2--; // if it is node A2 decrements the reputation of the neighbor A1


			if (reputationindexC2< rthresh) { //Node A2 then compares the current reputation index of the previous hop with the threshold

				carC3array = new String [] {"C3a","C3b","C3c","C3d"}; //A2 drops the packet

				System.out.println("CarC2 is selfish"); 
			}

		}
		
		else {

			carC3array = CarComponent.copySubarrayB( carC2array, 0, 2, ""); //A2 accepts the packet and if it is not selfish will forward the packet
			reputationindexC2++;//packet was delivered from A1 to A2. A2 awards A1 by incrementing its value.
		}

		if  (carC4array[0].equals("C4a")) { // node A2 checks whether the packet is a retransmission

			reputationindexC3--; // if it is node A2 decrements the reputation of the neighbor A1


			if (reputationindexC3< rthresh) { //Node A2 then compares the current reputation index of the previous hop with the threshold

				carB4array = new String [] {"C4a","C4b","C4c","C4d"}; //A2 drops the packet

				System.out.println("CarC3 is selfish"); 
			}
		}
		
		else {

			carC4array = CarComponent.copySubarrayA( carC3array, 0, 2, ""); //A2 accepts the packet and if it is not selfish will forward the packet
			reputationindexC3++;//packet was delivered from A1 to A2. A2 awards A1 by incrementing its value.
		}


		if  (carC5array[0].equals("C5a")) { // node A2 checks whether the packet is a retransmission

			reputationindexC4--; // if it is node A2 decrements the reputation of the neighbor A1


			if (reputationindexC4< rthresh) { //Node A2 then compares the current reputation index of the previous hop with the threshold

				carC5array = new String [] {"C5a","C5b","C5c","C5d"}; //A2 drops the packet

				System.out.println("CarC4 is selfish"); 
			}
		}
		
		else {

			carC5array = CarComponent.copySubarrayA( carC4array, 0, 2, ""); //A2 accepts the packet and if it is not selfish will forward the packet
			reputationindexC4++;//packet was delivered from A1 to A2. A2 awards A1 by incrementing its value.
		}


		if  (carD5array[0].equals("D5a")) { // node A2 checks whether the packet is a retransmission

			reputationindexC5--; // if it is node A2 decrements the reputation of the neighbor A1


			if (reputationindexC5< rthresh) { //Node A2 then compares the current reputation index of the previous hop with the threshold

				carD5array = new String [] {"D5a","D5b","D5c","D5d"}; //A2 drops the packet

				System.out.println("CarC5 is selfish"); 
			}
		}
		
		else {

			carD5array = CarComponent.copySubarrayB( carC5array, 0, 2, ""); //A2 accepts the packet and if it is not selfish will forward the packet
			reputationindexC5++;//packet was delivered from A1 to A2. A2 awards A1 by incrementing its value.
		}


		if  (carD2array[0].equals("D2a")) { // node A2 checks whether the packet is a retransmission

			reputationindexD1--; // if it is node A2 decrements the reputation of the neighbor A1

			if (reputationindexD1< rthresh) { //Node A2 then compares the current reputation index of the previous hop with the threshold

				carD2array = new String [] {"D2a","D2b","D2c","D2d"  }; //A2 drops the packet

				System.out.println("CarD1 is selfish"); 
			}
		}
		
		else {

			carD2array = CarComponent.copySubarrayA( carD1array, 0, 2, ""); //A2 accepts the packet and if it is not selfish will forward the packet
			reputationindexD1++;//packet was delivered from A1 to A2. A2 awards A1 by incrementing its value.
		}


		if  (carD3array[0].equals("D3a")) { // node A2 checks whether the packet is a retransmission

			reputationindexD2--; // if it is node A2 decrements the reputation of the neighbor A1


			if (reputationindexD2< rthresh) { //Node A2 then compares the current reputation index of the previous hop with the threshold

				carD3array = new String [] {"D3a","D3b","D3c","D3d"}; //A2 drops the packet

				System.out.println("CarD2 is selfish"); 
			}

		}

		else {

			carD3array = CarComponent.copySubarrayB( carD2array, 0, 2, ""); //A2 accepts the packet and if it is not selfish will forward the packet
			reputationindexD2++;//packet was delivered from A1 to A2. A2 awards A1 by incrementing its value.
		}

		if  (carD4array[0].equals("D4a")) { // node A2 checks whether the packet is a retransmission

			reputationindexD3--; // if it is node A2 decrements the reputation of the neighbor A1


			if (reputationindexD3< rthresh) { //Node A2 then compares the current reputation index of the previous hop with the threshold

				carD4array = new String [] {"D4a","D4b","D4c","D4d"}; //A2 drops the packet

				System.out.println("CarD3 is selfish"); 
			}
		}
		
		else { 

			carD4array = CarComponent.copySubarrayA( carD3array, 0, 2, ""); //A2 accepts the packet and if it is not selfish will forward the packet
			reputationindexD3++;//packet was delivered from A1 to A2. A2 awards A1 by incrementing its value.
		}


		if  (carD5array[0].equals("D5a")) { // node A2 checks whether the packet is a retransmission

			reputationindexD4--; // if it is node A2 decrements the reputation of the neighbor A1


			if (reputationindexD4< rthresh) { //Node A2 then compares the current reputation index of the previous hop with the threshold

				carD5array = new String [] {"D5a","D5b","D5c","D5d"}; //A2 drops the packet

				System.out.println("CarD4 is selfish"); 
			}
		}
		
		else {

			carD5array = CarComponent.copySubarrayA( carD4array, 0, 2, ""); //A2 accepts the packet and if it is not selfish will forward the packet
			reputationindexD4++;//packet was delivered from A1 to A2. A2 awards A1 by incrementing its value.
		}


	}

}
