package AWN;

public class StudentClub extends RegisterationClubs { //sub from super

    
    StudentClub() {
    }

    public StudentClub(String RegName, String RegEmail, String RegMajor) {
        super(RegName, RegEmail, RegMajor);
    }
    
    @Override
    void AboutClub() {
        
            System.out.println("\n--- Student Clubs ---\n");
            
            System.out.println("\n--- 1.The Coding Club ---\n"
                    + "provides participating students an opportunity to learn the basics of computer programming in a team setting. "
                    + "The club's main focus is on creating applications, websites, games, workshops and other projects to share with the community.");
            
            System.out.println("\n--- 2.The Design Thinking Club ---\n"
                    + "The club aims to technically strengthen the students by integrating their skills and ideas in the various fields of Engineering & technology,"
                    + " to cope up with the highly competitive environment.");
            
            System.out.println("\n--- 3.The Sport Club ---\n"
                    + "The clube aim to offer their members the opportunity to practise sport and to pass leisure time actively."
                    + "Joining a sporting club is It's an opportunity to expand your social network and form bonds that can last a lifetime.");
            
    }
    
}
