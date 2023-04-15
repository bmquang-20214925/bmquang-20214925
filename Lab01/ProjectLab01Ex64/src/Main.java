import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		boolean check = false;
		boolean check1 = false;
		boolean check2 = false;
		int day = 0;
		Scanner sc = new Scanner(System.in);
		do {
				
		System.out.println("Please enter the month:");
		String month = sc.nextLine();
		System.out.println("PLease enter the year with all digits (year 99 will not be counted as 1999 but 99):");
		
		int year = sc.nextInt();
		sc.nextLine();
		System.out.println(month + " " + year);
		switch(month) {
		case "1":
		case "Jan":
		case "Jan.":
		case "January":
			day = 31;
			check = true;
			break;
		case "2":
		case "Feb":
		case "Feb.":
		case "February":
			if ((year % 4 == 0) && (year % 100 != 0 || year %400 == 0)){
				day = 29;
				check = true;
				break;
			} else {
				day = 28;
				check = true;
				break;
			}
		case "3":
		case "Mar":
		case "Mar.":
		case "March":
			day = 31;
			check = true;
			break;
		case "4":
		case "Apr":
		case "Apr.":
		case "April":
			day = 30;
			check = true;
			break;
		case "5":
		case "May":
			day = 31;
			check = true;
			break;
		case "6":
		case "Jun":
		case "June":
			day = 30;
			check = true;
			break;
		case "7":
		case "Jul":
		case "July":
			day = 31;
			check = true;
			break;
		case "8":
		case "Aug":
		case "Aug.":
		case "August":
			day = 31;
			check = true;
			break;
		case "9":
		case "Sep":
		case "Sept.":
		case "September":
			day = 30;
			check = true;
			break;
		case "10":
		case "Oct":
		case "Oct.":
		case "October":
			day = 31;
			check = true;
			break;
		case "11":
		case "Nov":
		case "Nov.":
		case "November":
			day = 30;
			check = true;
			break;
		case "12":
		case "Dec":
		case "Dec.":
		case "December":
			day = 31;
			check = true;
			break;
		
			
		}
		if (check != true) {
			System.out.println("You've enterer an invalid input");
		}
		} while(check != true);
		System.out.println("The number of day in given month is: " + day);


}}
