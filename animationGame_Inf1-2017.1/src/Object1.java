
	public class Object1 extends GeometricObject {

		public Object1 (double w, double h, Vertex pos ){
			super(w, h, pos);}
		public Object1 (double w, double h, double x, double y){
			super(w, h, new Vertex(x,y));}
	public double area (){return Math.PI*width*height/4;}
		
	public String toString(){
				return "SimpelOval("+super.toString()+")";}
					
	public boolean equals(Object that){
		return(that instanceof SimpelOval && super.equals(that));
		
		
	}
	}
}
