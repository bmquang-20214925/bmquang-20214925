package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		swap(jungleDVD, cinderellaDVD); 
		System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
		System.out.println("Cinderella DVD title: " + cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		
	}
	public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
	    // Swap the id's
	    int tempId = dvd1.getId();
	    dvd1.setId(dvd2.getId());
	    dvd2.setId(tempId);

	    // Swap the titles
	    String tempTitle = dvd1.getTitle();
	    dvd1.setTitle(dvd2.getTitle());
	    dvd2.setTitle(tempTitle);

	    // Swap the categories
	    String tempCategory = dvd1.getCategory();
	    dvd1.setCategory(dvd2.getCategory());
	    dvd2.setCategory(tempCategory);

	    // Swap the directors
	    String tempDirector = dvd1.getDirector();
	    dvd1.setDirector(dvd2.getDirector());
	    dvd2.setDirector(tempDirector);

	    // Swap the lengths
	    int tempLength = dvd1.getLength();
	    dvd1.setLength(dvd2.getLength());
	    dvd2.setLength(tempLength);

	    // Swap the costs
	    float tempCost = dvd1.getCost();
	    dvd1.setCost(dvd2.getCost());
	    dvd2.setCost(tempCost);
	}

	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldtitleString = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldtitleString);
	}
}
