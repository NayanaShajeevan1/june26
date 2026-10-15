package controlstatements;

public class NestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int school=2;
		char department='b';
		switch(school) {
		case 1:System.out.println("school of computerscience");
		switch(department) {
		case 'a':System.out.println("a.depppartment of information");
		break;
		case'b':System.out.println("b.department of machine learning");
		break;
		}
		break;
		case 2:System.out.println("school of buisiness");
		switch(department) {
		case 'a':System.out.println("a.depppartment of commerce");
		break;
		case'b':System.out.println("b.department of purchasing");
		break;
		
		}
		break;
		case 3:System.out.println("school of engineering");
		switch(department) {
		case 'a':System.out.println("a.depppartment of mechanicl engineering");
		break;
		case'b':System.out.println("b.department of metronics engineering");
		break;
		
	}
		break;
		default:System.out.println("choose correct option");
		}
	}

}
