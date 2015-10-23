
public class PaintableOval extends SimpelOval implements Paintable{
	public PaintableOval(double width, double height, double x, double y){
		super(width, height, x, y);
	}

public void paintTo(java.awt.Graphics g){
	g.fillOval((int)pos.x, (int)pos.y, (int)width, (int)height);
	}
}

	

