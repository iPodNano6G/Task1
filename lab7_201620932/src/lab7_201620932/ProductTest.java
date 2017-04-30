package lab7_201620932;

public class ProductTest {

	ProductTest() {}
	
	
	public static void main(String[] args) {
		Product L = new Laptop();
		Product S = new SmartTV();
		Product T = new Toaster();
		ProductTest PT = new ProductTest();
		DataStorage DL = new Laptop();
		Networked NL = new Laptop();
		Networked NT = new SmartTV();
		Cooker CT = new Toaster();
		
		System.out.println(L.getName());
		System.out.println();
		PT.testDataStorage(DL);
		PT.testNetworked(NL);
		
		System.out.println(S.getName());
		System.out.println();
		PT.testNetworked(NT);
		
		System.out.println(T.getName());
		System.out.println();
		PT.testCooker(CT);
	}
	
	public void testProduct(Product P) {
		System.out.println(P.getName());
	}
	public void testDataStorage(DataStorage D) {
		System.out.println("Free Capacity : " + D.getFreeCapacity());
		D.format();
	}
	public void testNetworked(Networked N) {
		if(N.isConnected() == false) {
			System.out.println("Connection state : Not connnected");
		} else {System.out.println("Connection state : Connnected");}
		
		System.out.println("Max Speed : " + N.maxSpeed() + "\n");
	}
	public void testCooker(Cooker C) {
		System.out.println(C.prepareFood());
	}
}
