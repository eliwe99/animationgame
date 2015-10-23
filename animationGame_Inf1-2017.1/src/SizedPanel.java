import javax.swing.*;
import java.awt.Dimension;

public class SizedPanel extends JPanel{
	
	int preferredWidth=400;
	int preferredHeight=300;
	
	public SizedPanel(int w, int h){
		preferredWidth=w;
		preferredHeight=h;
	}
	public SizedPanel(){};
	public Dimension getpreferredSize(){
		return new Dimension(preferredWidth, preferredHeight);
	}

	public static void main(String[]args){
		showInFrame.show(new SizedPanel());
		
	}
}
