

public class ThresholdbasedProtocol {

	public void CheckSelfishness(Object[][] data) { //to implement the protocol of the paper "A Threshold-Based Method for Selfish Nodes 
		//Detection in MANET"

		for(int row = 0; row < 4; row++) {	

			if (!data[row][0].equals(data[row][1]))//A1 broadcast the RREQ messages to its neighbors
				System.out.println("CarA2 is selfish");	
			if (!data[row][0].equals(data[row][5]))
				System.out.println("CarB1 is selfish");
			if (!data[row][0].equals(data[row][6]))
				System.out.println("CarB2 is selfish");
			if (!data[row][1].equals(data[row][2]))
				System.out.println("CarA3 is selfish");
			if (!data[row][1].equals(data[row][6]))
				System.out.println("CarB2 is selfish");
			if (!data[row][1].equals(data[row][7]))
				System.out.println("CarB3 is selfish");	
			if (!data[row][2].equals(data[row][3]))
				System.out.println("CarA4 is selfish");	
			if (!data[row][2].equals(data[row][7]))
				System.out.println("CarB3 is selfish");
			if (!data[row][2].equals(data[row][8]))
				System.out.println("CarB4 is selfish");	
			if (!data[row][3].equals(data[row][4]))
				System.out.println("CarA5 is selfish");	
			if (!data[row][3].equals(data[row][8]))
				System.out.println("CarB4 is selfish");	
			if (!data[row][3].equals(data[row][9]))
				System.out.println("CarB5 is selfish");	
			if (!data[row][4].equals(data[row][9]))
				System.out.println("CarB5 is selfish");	


			if (!data[row][5].equals(data[row][6]))//B1 broadcast the RREQ messages to its neighbors
				System.out.println("CarB2 is selfish");	
			if (!data[row][5].equals(data[row][10]))
				System.out.println("CarC1 is selfish");	
			if (!data[row][5].equals(data[row][11]))
				System.out.println("CarC2 is selfish");	
			if (!data[row][6].equals(data[row][7]))
				System.out.println("CarB3 is selfish");	
			if (!data[row][6].equals(data[row][11]))
				System.out.println("CarC2 is selfish");	
			if (!data[row][6].equals(data[row][12]))
				System.out.println("CarC3 is selfish");	
			if (!data[row][7].equals(data[row][8]))
				System.out.println("CarB4 is selfish");	
			if (!data[row][7].equals(data[row][12]))
				System.out.println("CarC3 is selfish");	
			if (!data[row][7].equals(data[row][13]))
				System.out.println("CarC4 is selfish");
			if (!data[row][8].equals(data[row][9]))
				System.out.println("CarB5 is selfish");	
			if (!data[row][8].equals(data[row][13]))
				System.out.println("CarC4 is selfish");	 
			if (!data[row][8].equals(data[row][14]))
				System.out.println("CarC5 is selfish");	
			if (!data[row][9].equals(data[row][14]))
				System.out.println("CarC5 is selfish");	

			if (!data[row][10].equals(data[row][11]))//C1 broadcast the RREQ messages to its neighbors
				System.out.println("CarC2 is selfish");	
			if (!data[row][10].equals(data[row][15]))
				System.out.println("CarD1 is selfish");	
			if (!data[row][10].equals(data[row][16]))
				System.out.println("CarD2 is selfish");	
			if (!data[row][11].equals(data[row][12]))
				System.out.println("CarC3 is selfish");	
			if (!data[row][11].equals(data[row][16]))
				System.out.println("CarD2 is selfish");	
			if (!data[row][11].equals(data[row][17]))
				System.out.println("CarD3 is selfish");	
			if (!data[row][12].equals(data[row][13]))
				System.out.println("CarC4 is selfish");	
			if (!data[row][12].equals(data[row][17]))
				System.out.println("CarD3 is selfish");	
			if (!data[row][12].equals(data[row][18]))
				System.out.println("CarD4 is selfish");	
			if (!data[row][13].equals(data[row][14]))
				System.out.println("CarC5 is selfish");	
			if (!data[row][13].equals(data[row][18]))
				System.out.println("CarD4 is selfish");	
			if (!data[row][13].equals(data[row][19]))
				System.out.println("CarD5 is selfish");	


			if (!data[row][10].equals(data[row][15]))
				System.out.println("CarD1 is selfish");	
			if (!data[row][15].equals(data[row][16]))//D1 broadcast the RREQ messages to its neighbors
				System.out.println("CarD2 is selfish");	
			if (!data[row][15].equals(data[row][17]))
				System.out.println("CarD3 is selfish");	
			if (!data[row][15].equals(data[row][18]))
				System.out.println("CarD4 is selfish");	
			if (!data[row][15].equals(data[row][19]))
				System.out.println("CarD5 is selfish");	


		}//end of for loop

	}//end of CheckSelfishness method




}
