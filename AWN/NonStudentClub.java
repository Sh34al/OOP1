package AWN;

public class NonStudentClub extends RegisterationClubs { //sub from super
    
    private int ClubId;
    private String Clubname;
    private int Clubprice;
    private String Currency;

    public NonStudentClub (String RegName, String RegEmail, String RegMajor) {
        super(RegName, RegEmail, RegMajor);
    
    }

    NonStudentClub() {
    }

    NonStudentClub(int ClubId, String Clubname, int Clubprice, String Currency) {
        this.ClubId = ClubId;
        this.Clubname = Clubname;
        this.Clubprice = Clubprice;
        this.Currency = Currency;
    }
    

    public String getClubname() {
        return Clubname;
    }

    public int getClubprice() {
        return Clubprice;
    }

    public String getCurrency() {
        return Currency;
    }

    public int getClubId() {
        return ClubId;
    }

    
  @Override
  void AboutClub(){
      
      System.out.println("\n--- Non Student Clubs ---\n");
            
            System.out.println("\n--- 1.The Art Club ---\n"
                    + "It is a club with a cultural and artistic nature concerned with all forms of arts. "
                    + "One of the club’s goals is to nurture, develop and refine student talents within the following axes : (Photography, written arts, plastic arts, performing arts, visual performances)..");
            
            System.out.println("\n--- 2.The History Club ---\n"
                    + "This is a club where you can analyze and present historic artistic masterpieces and hold discussions on the subject of art history"
                    + " You may also get to discuss and practice techniques that art historians use to preserve valuable pieces of art.");
            
            System.out.println("\n--- 3.The Video Games Club ---\n"
                    + "If playing video games is your favorite pastime, a video games club may be perfect for you."
                    + "Not only will you have the opportunity to play the games you love, but you may get to play on the competitive level and learn about how you can make a career out of your passion.\n\n");
 
 }
}

