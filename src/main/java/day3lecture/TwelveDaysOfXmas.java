package day3lecture;

public class TwelveDaysOfXmas {
	
	public static void main(String[] args) {
		//creates partial sentences for later use
		String on = "On the ";
		String day = " day of Xmas, my true love gave to me ";
		//iterates through the 'days of Xmas' where i represents the day
		for (int i = 1; i <= 12; i++) {
			
			System.out.print(on + i);
		//adds the correct cardinal number suffix	
			switch (i) {
			case 1:
				System.out.print("st");
				break;
			case 2:
				System.out.print("nd");
				break;
			case 3:
				System.out.print("rd");
				break;
			default:
				System.out.print("th");
				break;
			}
			
			System.out.print(day);
			//adds the correct items given by lover
			switch (i) {
			case 12:
				System.out.print("twelve drummers drumming, ");
			case 11:
				System.out.print("eleven pipers piping, ");
			case 10:
				System.out.print("ten lords a-leaping, ");
			case 9:
				System.out.print("nine ladies dancing, ");
			case 8:
				System.out.print("eight maids a-milking, ");
			case 7:
				System.out.print("seven swans a-swimming, ");
			case 6:
				System.out.print("six geese a-laying, ");
			case 5:
				System.out.print("five golden rings, ");
			case 4:
				System.out.print("four calling birds, ");
			case 3:
				System.out.print("three french hens, ");
			case 2:
				System.out.print("two calling birds, and ");
			case 1:
				System.out.print("a partridge in a pear tree.\n");
				break;
			}
		}
		
	}

}
