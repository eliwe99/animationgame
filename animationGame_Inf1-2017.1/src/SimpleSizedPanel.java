
public class SimpleSizedPanel extends SizedPanel{
	public void paintComponent(java.awt.Graphics g) {
		g.fillRect(30,50,45,100);
	}
	
	
	
	public static void main(String[] args) {
		showInFrame.show(new SimpleSizedPanel());
		
		
	}

}
