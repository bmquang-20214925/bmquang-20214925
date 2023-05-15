package hust.soict.dsai.aims.cart;
import java.awt.Checkbox;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	private static final int MAX_NUMBERS_ORDERED = 20;

	public int qtyOrdered = 0;
	public Cart(double[] arr, DigitalVideoDisc[] itemOrdered) {
		super();

		this.itemOrdered = itemOrdered;
	}
	public Cart() {
		super();

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
		if(qtyOrdered == MAX_NUMBERS_ORDERED)
		{
			System.out.println("The cart is almost full");
			return;
		}
		else if (qtyOrdered < MAX_NUMBERS_ORDERED)
		{
			
			itemOrdered[qtyOrdered] = dvd;
			System.out.println("The disc has been added");
			qtyOrdered ++;
			return;
			
		}
	

	}
	public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
	    for (DigitalVideoDisc dvd : dvds) {
	        itemOrdered[qtyOrdered] = dvd;
	        qtyOrdered ++;
	    }
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if (qtyOrdered + 2 > MAX_NUMBERS_ORDERED) {
			System.out.println("Exceeding maximum number of dvds");
		} else {
			itemOrdered[qtyOrdered] = dvd1;
			qtyOrdered ++;
			itemOrdered[qtyOrdered] = dvd2;
			qtyOrdered ++;
		}
	}
//	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
//		if (qtyOrdered + dvdList.length >= MAX_NUMBERS_ORDERED) {
//			System.out.println("You are trying to place too many orders");
//		} else {
//			for (int i =0; i < dvdList.length; i ++) {
//				itemOrdered[qtyOrdered] = dvdList[i];
//				qtyOrdered ++;
//			}
//			System.out.println("All dvds have been successfully added to the Order");
//		}
//	}
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
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 0; i < qtyOrdered; i ++) {
			System.out.println((i+1) + ".DVD" +"-" + itemOrdered[i].getTitle()+"-"+itemOrdered[i].getCategory()+"-"+itemOrdered[i].getDirector() +"-"+itemOrdered[i].getLength()+":"+itemOrdered[i].getCost()+"$");
		}
		System.out.println("Total Cost: " + totalCost());
	}
	public void searchByTitle(String Title){
		boolean check = false;
		for(int i = 1; i <= qtyOrdered; ++i){
			if(itemOrdered[i].isMatch(Title)){
				System.out.println(itemOrdered[i].toString());
				check = true;
				return;
			}
			
			
		}
		if ( !check) {
			System.out.println("This DVD is not in the cart");
			
		}
	}
	
	public void searchByID(int Id){
		boolean check = false;
		for(int i = 1; i <= qtyOrdered; ++i){
			if(itemOrdered[i].isMatch(Id)){
				System.out.println(itemOrdered[i].toString());
				check = true;
				return;
			}
			
		
		}
		if ( !check) {
			System.out.println("This DVD is not in the cart");
			
		}
	}

}
