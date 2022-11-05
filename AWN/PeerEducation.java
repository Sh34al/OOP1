package AWN;

public class PeerEducation extends Appointment {
    
    private String PeerEd_time; 
    private String PeerEd_day;
    private int Study_Level;

   PeerEducation() {
   }

   PeerEducation( String name, String email, String majer, String subject, String PeerEd_time, String PeerEd_day, int Study_Level){
   
   super(name, email,majer, subject);
       this.PeerEd_time = PeerEd_time;
       this.PeerEd_day = PeerEd_day;
       this.Study_Level = Study_Level;
   }


//@override
    public String toString(){

return 
   
   super.toString()+ "StudyLevel"+Study_Level;
}
   

   public void setPeerEd_time(String PeerEd_time) {
       this.PeerEd_time = PeerEd_time;
   }

   public void setPeerEd_day(String PeerEd_day) {
       this.PeerEd_day = PeerEd_day;
   }

   public void setStudy_Level(int Study_Level) {
       this.Study_Level = Study_Level;
   }

   public String getPeerEd_time() {
       return PeerEd_time;
   }

   public String getPeerEd_day() {
       return PeerEd_day;
   }

   public int getStudy_Level() {
       return Study_Level;
   }


}