import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class DataPacket extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Object  [][] data;
	private boolean DEBUG = false;

	String []  carA1array,carA2array,carA3array,carA4array,carA5array,carB1array,carB2array,carB3array,carB4array,carB5array,
	carC1array,carC2array,carC3array,carC4array,carC5array,carD1array,carD2array,carD3array,carD4array,carD5array, columnNames;

	int savedfieldValueA1=5;
	int savedfieldValueA2=5;
	int savedfieldValueA3=5;
	int savedfieldValueA4=5;
	int savedfieldValueA5=5;
	int savedfieldValueB1=5;
	int savedfieldValueB2=5;
	int savedfieldValueB3=5;
	int savedfieldValueB4=5;
	int savedfieldValueB5=5;
	int savedfieldValueC1=5;
	int savedfieldValueC2=5;
	int savedfieldValueC3=5;
	int savedfieldValueC4=5;
	int savedfieldValueC5=5;
	int savedfieldValueD1=5;
	int savedfieldValueD2=5;
	int savedfieldValueD3=5;
	int savedfieldValueD4=5;
	int savedfieldValueD5=5;

	ThresholdbasedProtocol thresobject= new ThresholdbasedProtocol();

	public void ArrayCarsA(String [] a,String []b, String []c, String [] d, String []e)	{

		carA1array = new String [] {"A1a","A1b","A1c","A1d"};// CARA1 array
		carA2array = new String [] {"A2a","A2b","A2c","A2d"};// CARA2 array
		carA3array = new String [] {"A3a","A3b","A3c","A3d"};// CARA2 array
		carB1array = new String [] {"B1a","B1b","B1c","B1d"};// CARB1 array
		carB2array = new String [] {"B2a","B2b","B2c","B2d"};// CARB2 array
		carB3array = new String [] {"B3a","B3b","B3c","B3d"};// CARB3 array
		carB4array = new String [] {"B4a","B4b","B4c","B4d"};// CARB4 array
		carB5array = new String [] {"B5a","B5b","B5c","B5d"};// CARB5 array
		carC1array = new String [] {"C1a","C1b","C1c","C1d"};// CARC1 array
		carC2array = new String [] {"C2a","C2b","C2c","C2d"};// CARC2 array
		carD1array = new String [] {"D1a","D1b","D1c","D1d"};// CARB1 array

		carA2array = CarComponent.copySubarrayA( carA1array, 0,2,String.valueOf(savedfieldValueA1++));//A1 sends to A2

		carB1array = CarComponent.copySubarrayA(carA1array, 0, 2,String.valueOf(savedfieldValueA1++));//A1 sends to B1
		carB2array = CarComponent.copySubarrayA(carA1array, 0, 2,String.valueOf(savedfieldValueA1++));//A1 sends to B2

		carA3array = CarComponent.copySubarrayA( carA2array, 0, 2,String.valueOf(savedfieldValueA2++));//A2 sends to A3
		carB2array = CarComponent.copySubarrayA(carA2array, 0, 2, String.valueOf(savedfieldValueA2++));//A2 sends to B2
		carB3array = CarComponent.copySubarrayA(carA2array, 0, 2,String.valueOf(savedfieldValueA2++));//A2 sends to B3

		carA4array = new String [] {"A4a","A4b","A4c","A4d"};// CARA4 array
		carA4array = CarComponent.copySubarrayA( carA3array, 0, 2,String.valueOf(savedfieldValueA3++));//A3 sends to A4
		carB3array = CarComponent.copySubarrayA(carA3array, 0, 2,String.valueOf(savedfieldValueA3++));//A3 sends to B3
		carB4array =CarComponent.copySubarrayA(carA3array, 0, 2,String.valueOf(savedfieldValueA3++));//A3 sends to B4

		carA5array = new String [] {"A5a","A5b","A5c","A5d"};// CARA5 array
		carA5array = CarComponent.copySubarrayA( carA4array, 0, 2,String.valueOf(savedfieldValueA4++));//A4 sends to A5
		carB4array = CarComponent.copySubarrayA(carA4array, 0, 2,String.valueOf(savedfieldValueA4++));//A4 sends to B4
		carB5array = CarComponent.copySubarrayA(carA4array, 0, 2,String.valueOf(savedfieldValueA4++));//A4 sends to B5

		carB5array = CarComponent.copySubarrayA(carA5array, 0, 2,String.valueOf(savedfieldValueA5++));//A5 sends to B5


	}

	public void ArrayCarsB( String [] f,String []g, String []h, String [] i, String []j) {

		carB2array = CarComponent.copySubarrayB( carB1array, 0, 2,String.valueOf(savedfieldValueB1++)) ; // B1 sends to B2
		carC1array = CarComponent.copySubarrayA(carB1array, 0, 2,String.valueOf(savedfieldValueB1++));// B1 sends to C1
		carC2array = CarComponent.copySubarrayA(carB1array, 0, 2,String.valueOf(savedfieldValueB1++));// B1 sends to C2

		carB3array = CarComponent.copySubarrayB( carB2array, 0, 2,String.valueOf(savedfieldValueB2++));// B2 sends to B3
		carC2array = CarComponent.copySubarrayA(carB2array, 0, 2,String.valueOf(savedfieldValueB2++));// B2 sends to C2
		carC3array = CarComponent.copySubarrayA(carB2array, 0, 2,String.valueOf(savedfieldValueB2++));// B2 sends to C3

		carB4array = CarComponent.copySubarrayB( carB3array, 0, 2,String.valueOf(savedfieldValueB3++));// B3 sends to B4
		carC3array = CarComponent.copySubarrayA(carB3array, 0, 2,String.valueOf(savedfieldValueB3++));// B3 sends to C3
		carC4array = CarComponent.copySubarrayA(carB3array, 0, 2,String.valueOf(savedfieldValueB3++));// B3 sends to C4

		carB5array = CarComponent.copySubarrayB( carB4array, 0, 2,String.valueOf(savedfieldValueB4++));// B4 sends to B5
		carC4array = CarComponent.copySubarrayA(carB4array, 0, 2,String.valueOf(savedfieldValueB4++));// B4 sends to C4
		carC5array = CarComponent.copySubarrayA(carB4array, 0, 2,String.valueOf(savedfieldValueB4++));// B4 sends to C5

		carC5array = CarComponent.copySubarrayA(carB5array, 0, 2,String.valueOf(savedfieldValueB5++));//B5 sends to C5

	}

	public void ArrayCarsC(String [] k,String []l, String []m, String [] n, String []o) {	 

		carC2array = CarComponent.copySubarrayB( carC1array, 0, 2,String.valueOf(savedfieldValueC1++));// C1 sends to C2
		carD1array = CarComponent.copySubarrayA(carC1array, 0, 2,String.valueOf(savedfieldValueC1++));// C1 sends to D1
		carD2array = CarComponent.copySubarrayA(carC1array, 0, 2,String.valueOf(savedfieldValueC1++));// C1 sends to D2

		carC3array = new String [] {"C3a","C3b","C3c","C3d"};// CARC3 array
		carC3array = CarComponent.copySubarrayB( carC2array, 0, 2,String.valueOf(savedfieldValueC2++));// C2 sends to C3
		carD2array= CarComponent.copySubarrayA(carC2array, 0, 2,String.valueOf(savedfieldValueC2++));// C2 sends to D2
		carD3array= CarComponent.copySubarrayA(carC2array, 0, 2,String.valueOf(savedfieldValueC2++));// C2 sends to D3

		carC4array = new String [] {"C4a","C4b","C4c","C4d"};// CARC4 array
		carC4array = CarComponent.copySubarrayB( carC3array, 0, 2,String.valueOf(savedfieldValueC3++));//C3 sends to C4
		carD3array = CarComponent.copySubarrayA(carC3array, 0, 2,String.valueOf(savedfieldValueC3++));//C3 sends to D3
		carD4array = CarComponent.copySubarrayA(carC3array, 0, 2,String.valueOf(savedfieldValueC3++));//C3 sends to D4

		carC5array = new String [] {"C5a","C5b","C5c","C5d"};// CARC5 array
		carC5array = CarComponent.copySubarrayB( carC4array, 0, 2,String.valueOf(savedfieldValueC4++));//C4 sends to C5
		carD4array = CarComponent.copySubarrayA(carC4array, 0, 2,String.valueOf(savedfieldValueC4++));//C4 sends to D4
		carD5array = CarComponent.copySubarrayA(carC4array, 0, 2,String.valueOf(savedfieldValueC4++));//C4 sends to D5

		carD5array = CarComponent.copySubarrayA(carC5array, 0, 2,String.valueOf(savedfieldValueC5++));//C5 sends to D5

	}

	public void ArrayCarsD (String [] p,String []q, String []r, String [] s, String []t) {

		carD2array = new String [] {"D2a","D2b","D2c","D2d"};// CARB2 array
		carD2array = CarComponent.copySubarrayB( carD1array, 0, 2,String.valueOf(savedfieldValueD1++));//D1 sends to D2


		carD3array = new String [] {"D3a","D3b","D3c","D3d"};// CARB3 array
		carD3array = CarComponent.copySubarrayB( carD2array, 0, 2,String.valueOf(savedfieldValueD2++));//D2 sends to D3


		carD4array = new String [] {"D4a","D4b","D4c","D4d"};// CARB4 array
		carD4array = CarComponent.copySubarrayB( carD3array, 0, 2,String.valueOf(savedfieldValueD3++));//D3 sends to D4


		carD5array = new String [] {"D5a","D5b","D5c","D5d"};// CARB5 array
		carD5array = CarComponent.copySubarrayB( carD4array, 0, 2,String.valueOf(savedfieldValueD4++));//D4 sends to D5

	}

	public String [] returncarA1array(){

		return carA1array;
	}

	public String [] returncarA2array(){

		return carA2array;
	}

	public String [] returncarA3array(){

		return carA3array;
	}

	public String [] returncarA4array(){

		return carA4array;
	}

	public String [] returncarA5array(){

		return carA5array;
	}

	public String [] returncarB1array(){

		return carB1array;
	}

	public String [] returncarB2array(){

		return carB2array;
	}

	public String [] returncarB3array(){

		return carB3array;
	}

	public String [] returncarB4array(){

		return carB4array;
	}

	public String [] returncarB5array(){

		return carB5array;
	}

	public String [] returncarC1array(){

		return carC1array;
	}

	public String [] returncarC2array(){

		return carC2array;
	}

	public String [] returncarC3array(){

		return carC3array;
	}

	public String [] returncarC4array(){

		return carC4array;
	}

	public String [] returncarC5array(){

		return carC5array;
	}

	public String [] returncarD1array(){

		return carD1array;
	}

	public String [] returncarD2array(){

		return carD2array;
	}

	public String [] returncarD3array(){

		return carD3array;
	}

	public String [] returncarD4array(){

		return carD4array;
	}

	public String [] returncarD5array(){

		return carD5array;
	}

	public DataPacket() {

		super(new GridLayout(1,0));  


		columnNames= new String[] { "A1","A2","A3","A4","A5",
				"B1","B2","B3","B4","B5",
				"C1","C2","C3","C4","C5",
				"D1","D2","D3","D4","D5"  };

		ArrayCarsA(carA1array, carA2array,carA3array,carA4array,carA5array);		
		ArrayCarsB( carB1array, carB2array,carB3array,carB4array,carB5array);
		ArrayCarsC(carC1array, carC2array,carC3array,carC4array,carC5array);
		ArrayCarsD (carD1array, carD2array,carD3array,carD4array,carD5array);

		data= new Object[4][20];

		for(int row = 0; row < 4; row++)  {

			data[row][0] = carA1array[row];
			data[row][1] = carA2array[row];
			data[row][2] = carA3array[row];
			data[row][3] = carA4array[row];
			data[row][4] = carA5array[row];
			data[row][5] = carB1array[row];
			data[row][6] = carB2array[row];
			data[row][7] = carB3array[row];
			data[row][8] = carB4array[row];
			data[row][9] = carB5array[row];
			data[row][10] =carC1array[row];
			data[row][11] =carC2array[row];
			data[row][12] =carC3array[row];
			data[row][13] =carC4array[row];
			data[row][14] =carC5array[row];
			data[row][15] =carD1array[row];
			data[row][16] =carD2array[row];
			data[row][17] =carD3array[row];
			data[row][18] =carD4array[row];
			data[row][19] =carD5array[row];

		}		

		final JTable table = new JTable(data, columnNames);
		table.setPreferredScrollableViewportSize(new Dimension(600, 150));
		table.setBackground(Color.lightGray);   
		table.setFont(new Font("Arial", Font.PLAIN, 14));
		table.setFillsViewportHeight(true);

		if (DEBUG) {
			table.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					printDebugData(table);
				}
			});
		}

		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);


	}	

	private void printDebugData(JTable table) {

		int numRows = table.getRowCount();
		int numCols = table.getColumnCount();
		javax.swing.table.TableModel model = table.getModel();

		System.out.println("Value of data: ");
		for (int i=0; i < numRows; i++) {
			System.out.print("    row " + i + ":");
			for (int j=0; j < numCols; j++) {

				System.out.print("  " + model.getValueAt(i, j));
			}

			System.out.println();
		}

		System.out.println("--------------------------");

	}

	public Object [][] returndata(){

		return data;

	}

	public String [] getcolumnNames(){

		return columnNames;
	}

	public int getsavedfieldValueA1(){

		return savedfieldValueA1;
	}

	public int  getsavedfieldValueA2(){

		return savedfieldValueA2;
	}

	public int  getsavedfieldValueA3(){

		return savedfieldValueA3;
	}

	public int  getsavedfieldValueA4(){

		return savedfieldValueA4;
	}

	public int  getsavedfieldValueA5(){

		return savedfieldValueA5;
	}

	public int getsavedfieldValueB1(){

		return savedfieldValueB1;
	}

	public int  getsavedfieldValueB2(){

		return savedfieldValueB2;
	}

	public int  getsavedfieldValueB3(){

		return savedfieldValueB3;
	}

	public int  getsavedfieldValueB4(){

		return savedfieldValueB4;
	}

	public int  getsavedfieldValueB5(){

		return savedfieldValueB5;
	}

	public int getsavedfieldValueC1(){

		return savedfieldValueC1;
	}

	public int  getsavedfieldValueC2(){

		return savedfieldValueC2;
	}

	public int  getsavedfieldValueC3(){

		return savedfieldValueC3;
	}

	public int  getsavedfieldValueC4(){

		return savedfieldValueC4;
	}

	public int  getsavedfieldValueC5(){

		return savedfieldValueC5;
	}

	public int getsavedfieldValueD1(){

		return savedfieldValueD1;
	}

	public int  getsavedfieldValueD2(){

		return savedfieldValueD2;
	}

	public int  getsavedfieldValueD3(){

		return savedfieldValueD3;
	}

	public int  getsavedfieldValueD4(){

		return savedfieldValueD4;
	}

	public int  getsavedfieldValueD5(){

		return savedfieldValueD5;
	}



}

