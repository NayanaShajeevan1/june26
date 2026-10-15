package controlstatements;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day="mon";
		switch(day) {
		case "sun":System.out.println("sunday");
		break;
		case "mon":System.out.println("monday");
		break;
		case "tue":System.out.println("tuesday");
		break;
		case "wed":System.out.println("wednesday");
		break;
		case "thu":System.out.println("tursday");
		break;
		case "fri":System.out.println("sunday");
		break;
		case "sat":System.out.println("saturday");
		break;
		default:System.out.println("invalid day");
		
		}

	}

}
