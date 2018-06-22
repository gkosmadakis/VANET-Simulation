import javax.swing.JFrame;


public class mainVehicle extends JFrame{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main (String [] args){

		CarComponent display = new CarComponent();
		display.setVisible(true);

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

	private static void createAndShowGUI() {
		//Create and set up the window.
		JFrame frame = new JFrame("Routing Table (Columns are the 20 cars, rows are the data packets)");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocation(600, 510);

		//Create and set up the content pane.

		DataPacket newContentPane = new DataPacket();
		newContentPane.setOpaque(true); //content panes must be opaque
		frame.setContentPane(newContentPane);

		//Display the window.
		frame.pack();
		frame.setVisible(true);
	}






}



