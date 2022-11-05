package AWN;

public class Appointment {
	//super
    
    private String name;
    private String ID;
    private String majer;
    private String subject;
    
   
   public Appointment(String name, String ID, String majer, String subject) {
       this.name = name;
       this.ID = ID;
       this.majer = majer;
       this.subject = subject;
 
   }


   Appointment() {
   }
   
   public String getName() {
       return name;}
   
   
   public void setName(String name) {
       this.name = name;}
    
   public String getMajer() {
       return majer;
   }

   public void setMajer(String majer) {
       this.majer = majer;
   }

   public String getSubject() {
       return subject;
   }

   public void setSubject(String subject) {
       this.subject = subject;
   }


   public String getID() {
       return ID;
   }

   public void setID(String string) {
       this.ID = string;
   }
   
  
   
  public void App(){ //display
      
      System.out.println("\n--------------------------------------------------------------------------------\n");
      
      System.out.println("----- Available Appointments For November Month----- \n");
      
      System.out.println(""
               + "\n ||  Major :  Computer Science                                          ||"
               + "\n ||  Courses Number :                                   || "
               + "\n ||   1   | CS200                                       || "
               + "\n ||   2   |  CIS301                                     || "
               + "\n ||   3   | Phys111                                     ||"
               + "\n ||   4   | OOP423                                      || "
               + "\n ||   5   |  STAT321                                    || "
               + "\n ||   6   | Math221                                     ||"
               + "\n ||  Package Number                                     ||"
               + "\n ||   1   | Dr.Nour Mohammed | 05November22  |  9-10am  ||"
               + "\n ||   2   | Dr.Shahad Salem  | 10November22  |  1-2pm   ||"
               + "\n ||   3   | Dr.Sara Salman   | 13November22  |  11-1am  ||"
               + "\n ||   4   | Ms.Jenan Ahmed   | 16November22  |  8-9 am  ||"
                );
  
       System.out.println("\n--------------------------------------------------------------------------------\n");
 }
   

}
