public class testGeometricObject {

public static void main(String[] args){
	
	GeometricObject o1= new GeometricObject(17, 4, new Vertex(42,23));
	GeometricObject o2= new GeometricObject(25, 36);
	GeometricObject o3= new GeometricObject(17, 34);
	GeometricObject o4= new GeometricObject(18, 6);
	
	System.out.println(o1.equals(o2));
	o2.moveTo(42, 23);
	System.out.println(o1.equals(o2))
}
}
