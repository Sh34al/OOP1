package AWN;

abstract class RegisterationClubs  {  //Super
    
    private String RegName;
    private String RegEmail;
    private String RegMajor;

    public RegisterationClubs() {
    }

    
    public RegisterationClubs(String RegName, String RegEmail, String RegMajor) {
        this.RegName = RegName;
        this.RegEmail = RegEmail;
        this.RegMajor = RegMajor;
    }
  

    public String getRegName() {
        return RegName;
    }

    public String getRegEmail() {
        return RegEmail;
    }
    

    public String getRegMajor() {
        return RegMajor;
    }

    public void setRegName(String RegName) {
        this.RegName = RegName;
    }

    public void setRegEmail(String RegEmail) {
        this.RegEmail = RegEmail;
    }

    public void setRegMajor(String RegMajor) {
        this.RegMajor = RegMajor;
    }
    
    //@Override
    abstract void AboutClub();  
    
   
    public void OurClubsAbstract(){
        
        System.out.println("--- About Registeration To Clubs ---\n\n");
        
        System.out.println("1. Student Club \n"
        + " Vision : Student clubs in universities represent an important step towards building students with distinguished social activity and interaction in many fields. "
                + " \n Goals : To development students, non-profit activity, in addition to volunteer hours added to the Social Service Bank. ");
        
         System.out.println("\n\n2. NonStudent Club \n"
        + " Vision : These clubs constitute a distinct field for stimulating the energies of the talented outside the scope of the teaching classes. "
                + " \n Goals : To provide opportunities for university students to participate in paid activities that suit their interests, abilities and hobbies. ");  
    }
}
