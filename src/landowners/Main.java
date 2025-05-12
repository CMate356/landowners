package landowners;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LandOwner owner1 = new LandOwner();
		
		LandContract land1=new Rectangle(2,4);
		LandContract land2=new Square(4);
		LandContract land3=new Parallelogram(2,2);
		LandContract land4=new Triangle(1,3);
		owner1.add(land1);
		owner1.add(land2);
		owner1.add(land3);
		owner1.add(land4);
		System.out.println(owner1.getTotalArea());
		owner1.removeLand(1);
		System.out.println(owner1.getTotalArea());
		owner1.removeLand(2);
		System.out.println(owner1.getTotalArea());
	}

}
