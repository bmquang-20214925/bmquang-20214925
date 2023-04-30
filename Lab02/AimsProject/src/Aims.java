
public class Aims {

	public static void main(String[] args) {
		// Create a new cart
		Cart anOrder = new Cart();
		
		//Create new DVD objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star World", "Fiction", "Bui Minh Quang", 19,  99.99f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("USS", "War", "Nguyen THanhh Binh", 39,  13.01f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Ke", "Fiction", "Bui Minh Quang", 19,  28.99f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Titanic", "Romance", "Mr. C K Venkataraman", 180,  29.99f);
		anOrder.addDigitalVideoDisc(dvd1);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.addDigitalVideoDisc(dvd4);
		anOrder.addDigitalVideoDisc(dvd5);

		anOrder.removeDigitalVideoDisc(dvd3);
		System.out.println(anOrder.qtyOrdered);
		for (int i = 0; i < anOrder.qtyOrdered; i++) {
			System.out.println(anOrder.itemOrdered[i].getTitle());
		}
	}

}
