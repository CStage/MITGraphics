package src;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
public class DrawGraphics {
	BouncingBox box;
	BouncingBox a;
	BouncingBox b;
	BouncingBox BAX;
	/** Initializes this class for drawing. */
	public DrawGraphics() {
	box = new BouncingBox(200, 50, Color.RED);
	box.setMovementVector(0, -3);
	
	a = new BouncingBox(100, 200, Color.green); 
	a.setMovementVector(2, 0);
	
	b = new BouncingBox(150, 100, Color.black);
	b.setMovementVector(1, -1);
	
	BAX = new BouncingBox(10, 50, Color.cyan);
	System.out.println(a.y+a.yDirection);
	if ((a.y + a.yDirection) % 5 == 0) {
		BAX.setMovementVector(1, 2);
	}
	else {
		BAX.setMovementVector(0, 0);
	}
	
}
	
/** Draw the contents of the window on surface. Called 20 times per second. */
public void draw(Graphics surface) {
	int[] x_points = new int[] {10, 50, -110, 160, 90, 200};
	int[] y_points = new int[] {60, 40, -170, 80, 160, -60};
	
	surface.drawLine(50, 50, 250, 250);
	surface.draw3DRect(50, 50, 25, 25, true);
	surface.drawArc(150, 200, 40, 110, 45, 90);
	surface.drawPolyline(x_points, y_points, 6);
	ArrayList<BouncingBox> AL = new ArrayList<BouncingBox>();
	AL.add(box);
	AL.add(a);
	AL.add(b);
	
	for (BouncingBox i:AL) {
		i.draw(surface);
	}
	
	BAX.draw(surface);
}
}