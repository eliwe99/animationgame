	public class Object2 extends GeometricObject {

		public Object2 (double w, double h, Vertex pos ){
			super(w, h, pos);}
		public Object2 (double w, double h, double x, double y){
			super(w, h, new Vertex(x,y));}
	public double area (){return width*height/2;}
		
	public String toString(){
				return "Object2("+super.toString()+")";}
					
	public boolean equals(Object that){
		return(that instanceof Object1 && super.equals(that));
		
		
	}
	}

