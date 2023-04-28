
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	double[] arr = new double[MAX_NUMBERS_ORDERED];
	public int qtyOrdered = 0;
	public Cart(double[] arr, DigitalVideoDisc[] itemOrdered) {
		super();
		this.arr = arr;
		this.itemOrdered = itemOrdered;
	}
	public Cart() {
		super();
		this.arr = new double[MAX_NUMBERS_ORDERED];
		this.itemOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	}
	public DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public float totalCost() {
		float sum = 0;
		for (int i = 0; i < qtyOrdered; i ++) {
			sum += itemOrdered[i].getCost();
		}
		return sum;
	}

	public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
		itemOrdered[qtyOrdered] = dvd;
		qtyOrdered ++;
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int id= 0;
		for (int i = 0; i < qtyOrdered; i ++) {
			if (itemOrdered[i].equals(disc)) {
				id = i;
			}
		}
		qtyOrdered --;
		for (int i = id; i <qtyOrdered; i++) {
			itemOrdered[i] = itemOrdered[i+1];
		}
		
	}

}
