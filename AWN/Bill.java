package AWN;

public class Bill {

	 public static double getBill( NonStudentClub [] Club ){
	 double bill = 0.0;
	 for(int i = 0 ; i < Club.length ; i++)
	   bill += Club[i].getClubprice();
	 return bill;
	 }

	}

