import javax.swing.*;
public class FirstPanel extends JPanel{
	
	public void printComponent(java.awt.Graphics g){
		g.fillRect(30,50,45,80);
		g.clearRect(60, 80, 100, 50);
	}

	public static void main(String[] args) {
		
		JFrame f=new JFrame ();
		f.add(new FirstPanel());
		f.setVisible(true);
		
	}

}