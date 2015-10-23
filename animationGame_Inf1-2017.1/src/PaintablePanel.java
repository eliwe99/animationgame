
public class PaintablePanel extends SizedPanel{

	Paintable pa;
	
	public PaintablePanel(Paintable pa){this.pa=pa;}
		
	public void PaintComponent(java.awt.Graphics g){
		pa.paintTo(g);
	}
public static void main(String[]args){
	showInFrame.show(new PaintablePanel(new PaintableOval(100,60,45,80)));
	showInFrame.show(new PaintablePanel(new PaintableOval(120,70,50,40)));
}
}
