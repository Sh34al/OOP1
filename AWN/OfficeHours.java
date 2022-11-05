package AWN;

public class OfficeHours extends Appointment {
    
 private int teacher_day_time;
 private int CourseNo;
 private String ID;

 OfficeHours(){
 }

 public OfficeHours(int teacher_day_time, String name, String email, String majer, String subject, int CourseNo, String ID) {
     super(name, email, majer, subject);
     this.teacher_day_time = teacher_day_time;
     this.CourseNo = CourseNo;
     this.ID = ID;
 }

 //set
 public void setteacher_day_time(int teacher_day_time) {
     this.teacher_day_time = teacher_day_time; }

 //get
 public int getteacher_day_time() {                                                                                                           
     return teacher_day_time; } 

     public int getCourseNo() {
     return CourseNo;
 }

 public void setCourseNo(int CourseNo) {
     this.CourseNo = CourseNo;
 }


 public String getID() {
     return ID;
 }

 public void setID(String ID) {
	 
     this.ID = ID;
 }
}

