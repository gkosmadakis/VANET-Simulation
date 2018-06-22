import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.SwingWorker;

import javax.swing.JTextField;


public class CarComponent extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int boxACoord,boxBCoord,boxCCoord,boxDCoord;
	private JComboBox<String> SpeedCombo;
	private JButton startButton,rotateButton, stopButton;
	@SuppressWarnings("unused")
	private JLabel WelcomeLabel,InstructionsLabel,RotationLabel;
	private JTextField RotationField;
	@SuppressWarnings("unused")
	private char [] namelanes;
	private boolean pressedExit = false;
	private boolean programIsRunning = false;
	private boolean rotatePressed = false;
	private SwingWorker<ListModel<?>, Void> worker = null;

	
	String []  carA1array,carA2array,carA3array,carA4array,carA5array,carB1array,carB2array,carB3array,carB4array,carB5array,
	carC1array,carC2array,carC3array,carC4array,carC5array,carD1array,carD2array,carD3array,carD4array,carD5array;
	
	DataPacket packet = new DataPacket();
	WMNprotocol WMNobject = new WMNprotocol();
	ReputationBased repobject = new ReputationBased();
	ThresholdbasedProtocol obj = new ThresholdbasedProtocol();
	
	public CarComponent() {  //constructor to instantiate the frame
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Mobility Model");
		setSize(1350, 750);
		layoutTop();//method to display the labels, the ComboBox and the JButton
				
	}
	
	public void moveTo(int a, int b, int c, int d) {
		
		boxACoord=a;
		boxBCoord=b;
		boxCCoord=c;
		boxDCoord=d;
	}
	
	private void doDrawing (Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		char [] namelanes= {'A','B', 'C', 'D'};//array of the lane characters
		g2.drawLine(1300, 150, 200,150);//upper and bottom line
		g2.drawLine(1300, 555, 200,555);

		g2.drawChars(namelanes, 0, 1, 600, 150);//draws the letters above each lane
		g2.drawChars(namelanes, 1, 1, 600, 250);
		g2.drawChars(namelanes, 2, 1, 600, 350);
		g2.drawChars(namelanes, 3, 1, 600, 450);

		float[] dash3 = {16f, 0f, 32f};//pattern for the dashed lines

		BasicStroke bs1 = new BasicStroke(1, BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND, 1.0f, dash3, 2f);

		g2.setStroke(bs1);
		g2.drawLine(200, 250, 1300, 250);// middle dashed lines
		g2.drawLine(200, 350, 1300, 350);
		g2.drawLine(200, 450, 1300, 450);
	}
	

	public void paintComponent(final Graphics g) {
		
		worker = new SwingWorker<ListModel<?>, Void>(){
			
		public ListModel<?> doInBackground() {
			
		Graphics2D g2 = (Graphics2D) g;

		doDrawing(g);

		boxACoord=0;//sets the initial value of the variable
		boxBCoord=-30;
		boxCCoord=-30;
		boxDCoord=-30;

		for (int i=0; i<3; i++) {
			
			g.translate(20, 0);//updates the initial position to make them visible in the beginning of the screen
		}

		
		for (int i=0; i<131; i++) { //loop for the moves of cars 
			
			BasicStroke bs2 = new BasicStroke(1,BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND);
			g2.setStroke(bs2);//changes from dashed lines to lines
		
			for (int j=0; j<1280; j=j+60) {
				
				g2.clearRect(j, 180, 61, 32);// clears A lane
				
			}
		
			Car carA1 = new Car (boxACoord+30, 180,Color.black);//creates a new car in the A lane
			carA1.draw(g2);
			Car carA2 = new Car (boxACoord+90, 180,Color.black);
			carA2.draw(g2);
			Car carA3 = new Car (boxACoord+150, 180,Color.black);
			carA3.draw(g2);
			Car carA4 = new Car (boxACoord+210, 180,Color.black);
			carA4.draw(g2);
			Car carA5 = new Car (boxACoord+270, 180,Color.black);
			carA5.draw(g2);

			for (int j=-35; j<1265;j++) {
				
				g2.clearRect(j, 300, 61, 32);// clears B lane
			}
			
			Car carB1 = new Car (boxBCoord,  300,Color.black);// creates a new car in the B lane 
			carB1.draw(g2);
			Car carB2 = new Car (boxBCoord+60,  300,Color.black);
			carB2.draw(g2);
			Car carB3 = new Car (boxBCoord+120,  300,Color.black);
			carB3.draw(g2);
			Car carB4 = new Car (boxBCoord+180,  300,Color.black);
			carB4.draw(g2);
			Car carB5 = new Car (boxBCoord+240,  300,Color.black);
			carB5.draw(g2);

			for (int j=30; j<1230;j++) {
				
				g2.clearRect(j, 400, 61, 32);// clears C lane
			}
			
			Car carC1 = new Car (boxCCoord+60, 400,Color.black);// creates a new car in the C lane 
			carC1.draw(g2);
			Car carC2 = new Car (boxCCoord+120, 400,Color.black);
			carC2.draw(g2);
			Car carC3 = new Car (boxCCoord+180, 400,Color.black);
			carC3.draw(g2);
			Car carC4 = new Car (boxCCoord+240, 400,Color.black);
			carC4.draw(g2);
			Car carC5 = new Car (boxCCoord+300, 400,Color.black);
			carC5.draw(g2);

			for (int j=-15; j<1250;j++) {
				
				g2.clearRect(j, 510, 61, 32);//clears D lane
			}
			
			Car carD1 = new Car (boxDCoord+15, 510,Color.black);// creates a new car in the D lane 
			carD1.draw(g2);
			Car carD2 = new Car (boxDCoord+75, 510,Color.black);
			carD2.draw(g2);
			Car carD3 = new Car (boxDCoord+135, 510,Color.black);
			carD3.draw(g2);
			Car carD4 = new Car (boxDCoord+195, 510,Color.black);
			carD4.draw(g2);
			Car carD5 = new Car (boxDCoord+255, 510,Color.black);
			carD5.draw(g2);
			
			try {
				
			packet.ArrayCarsA(carA1array,carA2array,carA3array,carA4array,carA5array);
			packet.ArrayCarsB(carB1array,carB2array,carB3array,carB4array,carB5array);
			packet.ArrayCarsC(carC1array,carC2array,carC3array,carC4array,carC5array);
			packet.ArrayCarsD(carD1array,carD2array,carD3array,carD4array,carD5array);
			
			WMNobject.WMN();// call the method for the WMN protocol
			//repobject.ReputationBasedprotocol();//call the method for the reputation protocol
			
			Object [][] data = packet.returndata();
			 
			for (int k=0; k<data.length; k++){
				
				for (int j=0; j<data[0].length; j++){
					
				}
			  }
			//obj.CheckSelfishness(data);
			Thread.sleep(100);// a delay occurs when data packets are tranferred
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			Speed();
			
			for (int j=0; j<4; j++) { //defines the speed of the cars in A lane. 4 determines the speed
			
				updateA(g2);
				
			}

			for (int j=0; j<3; j++) { //defines the speed of the cars in B lane. 3 determines the speed
			
				updateB(g2);
				
			}

			for (int j=0; j<2; j++) { //defines the speed of the cars in C lane. 2 determines the speed
			
				updateC(g2);
				
			}
			
			updateD(g2);//defines the speed of the cars in D lane. No loop, so D is the slowest lane
			
			if (pressedExit) {
				
					break;
				
					}
			
				}//end of loop
		
		return null;
		
			}// end of doInBackground
		
		public void done(){
            
			if (rotatePressed && !pressedExit){
				SwingWorker<ListModel<?>, Void> worker2 = new SwingWorker<ListModel<?>, Void>(){

					@Override
					protected ListModel<?> doInBackground() throws Exception {
					
						paintComponent(getGraphics());
						return null;
					}
				};				
				worker2.execute();
			}
        }
		
		};// end of Swing worker
		worker.execute();
		
	
	}// end of paintComponent method


	
	static String [] copySubarrayA(String[] carA1rray, int srcIndex, int length, String Value) {
		String [] carA2array = new String [4];
		
		for (int k=0; k<4; k++){
			
			carA2array [k] =carA1rray [0+k];
		}
		
		return carA2array;
	}
	
	 static String [] copySubarrayB(String[] carB1array, int srcIndex, int length, String Value) {
	
		 String [] carB2array = new String [4];
		
		 for (int k=0; k<4; k++){
		
			 carB2array [k] =carB1array [0+k];
		}
		 
		return carB2array;

	}

	public void updateA( Graphics g ){

		boxACoord = boxACoord+10;// changes the position by adding 10 points more in X coordinates

	}
	
	public void updateB ( Graphics g ){

		boxBCoord = boxBCoord+10;// changes the position by adding 10 points more in X coordinates

	}
	
	public void updateC ( Graphics g ){

		boxCCoord = boxCCoord+10;// changes the position by adding 10 points more in X coordinates

	}
	
	public void updateD ( Graphics g ){

		boxDCoord = boxDCoord+10;// changes the position by adding 10 points more in X coordinates

	}
	
	public void Speed() {
		
		String q = (String)SpeedCombo.getSelectedItem();
		if (q.equals("20 km/h")) {
			
			try {
				Thread.sleep(1000);// a delay to define the speed
			
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		
		else if (q.equals("40 km/h")) {
			
			try {
			
				Thread.sleep(800);
			
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		
		else if (q.equals("60 km/h")) {
			
			try {
			 
				Thread.sleep(600);
		
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		
		else if (q.equals("80 km/h")) {
			
			try {
			
				Thread.sleep(400);
		
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		
		else if (q.equals("100 km/h")) {
			
			try {
			
				Thread.sleep(200);
			
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		
	}

	public  void layoutTop() {
		
		JPanel panel = new JPanel();
		JLabel welcomeLabel = new JLabel("Welcome to Mobility Simulations on VANET");
		welcomeLabel.setPreferredSize(new Dimension(1330,17));// to display welcome label on up and left
		welcomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(welcomeLabel);

		JLabel InstructionsLabel = new JLabel("<html> A lane is the fastest lane, B is slower, C is even slower and D is the slowest.<br>Red vehicles are marked as selfish</html>");
		panel.add(InstructionsLabel);
		InstructionsLabel.setPreferredSize(new Dimension(1330,30));//to display the InstructionsLabel under the 
																	// the welcome label
		JLabel SpeedLabel = new JLabel("Please enter Speed:");
		SpeedCombo = new JComboBox<String>();
		SpeedCombo.addItem("20 km/h");
		SpeedCombo.addItem("40 km/h");
		SpeedCombo.addItem("60 km/h");
		SpeedCombo.addItem("80 km/h");
		SpeedCombo.addItem("100 km/h");
		SpeedCombo.addActionListener(this);

		panel.add(SpeedLabel);
		panel.add(SpeedCombo);
		JLabel RotationLabel = new JLabel("Rotate will keep the vehicles moving until you press stop:");
		RotationField = new JTextField();
		RotationField.setPreferredSize(new Dimension(40, 20));
		startButton = new JButton("Start");
		rotateButton = new JButton("Rotate");
		stopButton = new JButton("Stop");
		stopButton.addActionListener(this);
		rotateButton.addActionListener(this);
		startButton.addActionListener(this);
		panel.add(startButton);
		panel.add(RotationLabel);
		//panel.add(RotationField);
		
		panel.add(rotateButton);
		panel.add(stopButton);
		
		add(panel);

	}

	public void actionPerformed(ActionEvent e) {
			
		if (e.getSource()==startButton) {
			
				programIsRunning = true;
				pressedExit = false;
				
				paintComponent(getGraphics()); 	
				
			}

			if (e.getSource()== rotateButton) {
				
				if (programIsRunning) { 
					
					JOptionPane.showMessageDialog(null, "The program is already running, stop it and then press Rotate", "Result Summary", JOptionPane.ERROR_MESSAGE);
				}
				
				else {
					
					programIsRunning = true;
					pressedExit = false;
					rotatePressed = true;
					SwingWorker<ListModel<?>, Void> myworker = new SwingWorker<ListModel<?>, Void>(){

						@Override
						protected ListModel<?> doInBackground() throws Exception {
							
							paintComponent(getGraphics()); 
							return null;
						}
						
					};
					myworker.execute();
				}
			}
			
			if (e.getSource() == stopButton){
				pressedExit = true;
				programIsRunning = false;
				
			}

	}


	
	
}
