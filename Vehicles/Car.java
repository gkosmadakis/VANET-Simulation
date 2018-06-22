import java.awt.*;
import java.awt.geom.*;

public class Car {
	
	public static final int WIDTH= 60;
	public static  final int HEIGHT=30;
	public static final int newWIDTH= 280;
	public static final int newHEIGHT=290;
	private Color colour;
	private int xLeft,yTop;
	
	public int newposX,newposY;
	
	
	public Car (int x, int y,Color col) {
		
		xLeft = x;
		yTop=y;
		colour=col;
	}
	
	public void draw (Graphics2D g2) {
		
		Rectangle body = new Rectangle(xLeft, yTop +10,40,8);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft +2, yTop +18,10,10);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft +27, yTop +18,10,10);
		
		Point2D.Double r1 = new Point2D.Double(xLeft+5, yTop+10);
		Point2D.Double r2 = new Point2D.Double(xLeft+12, yTop);
		Point2D.Double r3 = new Point2D.Double(xLeft+27, yTop);
		Point2D.Double r4 = new Point2D.Double(xLeft+35, yTop+10);
		
		Line2D.Double frontWindshield = new Line2D.Double(r1,r2);
		Line2D.Double roofTop = new Line2D.Double(r2,r3);
		Line2D.Double rearWindshield = new Line2D.Double(r3,r4);
		
		g2.setColor(colour);
		g2.draw(body);
		g2.draw(frontTire);
		g2.draw(rearTire);
		g2.draw(frontWindshield);
		g2.draw(roofTop);
		g2.draw(rearWindshield);
		
	}
	
	public Color getColor() { // method to return color, getter
	
		return colour;	
	}

	
	public void setColor(Color colour) {
	
	
       this.colour=colour;
	}
	

}

