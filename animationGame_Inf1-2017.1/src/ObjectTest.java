
public class ObjectTest extends GeometricObject{
	
	public ObjectTest (double w, double h, Vertex pos ){
		super(w, h, pos);}
	public ObjectTest (double w, double h, double x, double y){
		super(w, h, new Vertex(x,y));}
public double area (){return width*height/2;}
		
}


