package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star World", "Fiction", "Bui Minh Quang", 19,  99.99f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("USS", "War", "Nguyen THanhh Binh", 39,  13.01f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Ke", "Fiction", "Bui Minh Quang", 19,  28.99f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Titanic", "Romance", "Mr. C K Venkataraman", 180,  29.99f);
		store.addDVD(dvd1);
		store.addDVD(dvd2);
		store.addDVD(dvd3);
		store.addDVD(dvd4);
		store.addDVD(dvd5);
		store.removeDVD(dvd1);
	}

}
