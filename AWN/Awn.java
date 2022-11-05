package AWN;
import java.util.Scanner; 

import java.util.ArrayList; 
public class Awn {
    
static Scanner input =new Scanner(System.in);
private static int subject;   

static String main_menu ="\n ------------ We Are Ready To Help You ------------ \n"+
 "1. Computer Scince\n" +
 "2. Exit \n"+
 "Enter your majer : 1 or 2 \n" ;

 static void displayMenu_Subject(){
 System.out.println("*******");
 System.out.println();
 System.out.println(  "\nMaterials In Which Peer Learning Is Available | 1 , 2 ,3 Or 0 | \n"+
                 "1. Digital Hardwear\n"+
                 "2. Opject Orinted Programing\n"+
                 "3. Another Subject\n"+
                 "0. Exit\n");
 				System.out.println();
}
 
  static void computer_Scince_System(){
displayMenu_Subject();
System.out.println("\nEnter Number Of Subject That You Want To Register For Peer Learning :\n");
       ArrayList<String> arr = new ArrayList<>();
       ArrayList<String> arr2= new ArrayList<>();
do{
   int subject = input.nextInt();
 switch(subject){
 case 1:
     // if user enter 1-Digital_Hardwear();
     arr.add("Zomrd");
     arr.add("Zom@gmail");
     arr.add("12:00");
     arr.add("Monday");
     
     System.out.println(arr);
              System.out.println("\nIs This Opetion Appropriate For You ? "
                      + "\n 1 : Yes , 2 : No " );
        int edit = input.nextInt();
        switch(edit){
            case 1:   
                 System.out.println("Succeessfully Registered !\n");
                 System.out.println("Your Appointment Information: "+arr);
                 System.out.println();
                 System.out.println("Enter Your Next Task :\n" );
                 displayMenu_Subject();
        
            break;
      
            case 2:
                   System.out.println("\nWhat Do You Want to Edit ?\n"+"1-Time\n"+"2-Day\n"+"3-Exit\n" );
                    int edd=input.nextInt();
                        if(edd==1){
                   System.out.println("\nEnter a New Time :\n");
                     input.nextLine();
                     String Timee = input.nextLine();
                            arr.set(2 , Timee);
                     System.out.println("\nAfter Editting : " +arr);
                               
                   }
                   else if(edd==2){
                    System.out.println("\nEnter a New Day :\n");
                    input.nextLine();
                   String Day = input.nextLine();
                           arr.set( 3 , Day);
                   System.out.println("\nAfter Editting : " +arr);}

                   else{
                       System.out.println("Enter Valid Option !!");
                 System.out.println("Enter Your Next Task :\n" );
                 displayMenu_Subject();
                   }
            case 3:
                 // System.out.println("\nThank You For Using Our System :)\n");
             break;
             default:
             System.out.println("Please Enter a Valid Option !!\n"); 
             System.out.println("Enter Your Next Task :\n" );
                 displayMenu_Subject();
        } 
    break;

 case 2:////if user enter object orinted == oop
     arr2.add("Noura");
     arr2.add("Noura@gmail");
     arr2.add("11:00");
     arr2.add("Sunday");
     System.out.println(arr2);
                    System.out.println("\nIs This Opetion Appropriate For You ? "
                      + "\n 1 : Yes , 2 : No\n" );        
                    int edit2 = input.nextInt();
        switch(edit2){
            case 1:
                System.out.println("Succeessfully Registered !\n");
                System.out.println("\nYour Appointment Information : "+arr2);  
                System.out.println("Enter Your Next Task :\n" );
                 displayMenu_Subject();
            break;
      
            case 2:
                 System.out.println("\nWhat Do You Want to Edit ?\n"+"1-Time\n"+"2-Day\n"+"3-Exit\n" );
                 int edit1 = input.nextInt();
                if(edit1==1){
                System.out.println("\nEnter a New Time : \n");
               input.nextLine();
                     String Timee = input.nextLine();
                            arr.set(2 , Timee);
                  System.out.println("\nAfter Editting : " +arr2);
                }
                else if(edit1==2){
                 System.out.println("\nEnter a New Day :\n");
                input.nextLine();
                     String Day = input.nextLine();
                           arr.set( 3 , Day);
                System.out.println("\nAfter Editting : " +arr2);}
                
                else
                {
                     System.out.println("Enter a Valid Option !!\n");
                }
                
                 System.out.println("Enter Your Next Task :\n" );
                 displayMenu_Subject();
           
             
             default:
             System.out.println("Please Enter a Valid Option !!"); 
               System.out.println("Enter Your Next Task :\n" );
                 displayMenu_Subject();
        } 
break;

 case 3: 

     PeerEducation student;
    
      System.out.println("\n Answer Following Question To Make Your Appointmant :\n");
      input.nextLine();
      
      System.out.println("\nEnter Name :");
      String Name=input.nextLine();
          if (Name.isEmpty()) {
                    System.out.println("\nname is Neccessary!");
                }
             while (Name.isEmpty());

      System.out.println("\nEnter Email :\n");
        String Email=input.nextLine();
                  if (Email.isEmpty()) {
                    System.out.println("\n Email is Neccessary!");
                }
             while (Email.isEmpty());
        
       System.out.println("\nEnter Major :\n");
       String Majer=input.nextLine();
       if (Majer.isEmpty()) {
                    System.out.println("\n Major is Neccessary!");
                }
             while (Majer.isEmpty());
            
       System.out.println("\nEnter Subject :\n");
       String Subject=input.nextLine();
          if (Subject.isEmpty()) {
                    System.out.println("\n Subject is Neccessary!");
                }
             while (Subject.isEmpty());

      System.out.println("\nEnter Time :\n");
      String Time=input.nextLine();
                if (Time.isEmpty()) {
                    System.out.println("\n Time is Neccessary!");
                }
             while (Time.isEmpty());
       
       System.out.println("\nEnter Day :\n");
       String Days=input.nextLine();
                       if (Days.isEmpty()) {
                    System.out.println("\n Day is Neccessary!");
                }
             while (Days.isEmpty());
       

       System.out.println("\nEnter Study_Level :\n");
       int StudyLevel=input.nextInt();
          
      student = new PeerEducation (Name, Email, Majer, Subject, Time,  Days, StudyLevel);
      System.out.println("\nSo, This is Your Appointmant information["+student.toString()+" ]We Will Send You an Email While it's Avaiable :) \n");

       System.out.println("If You Want To Edit Enter 1 Or Enter 2 To Comlate : ");
       int Editing =input.nextInt();
       
       if (Editing==1)
       {
       System.out.println("What Do You Want To Edit? 1-Name , 2-Email, 3-Major, 4-Subject,5- Time, 6- Day, 7-StudyLevel\n");
       int option =input.nextInt();
       if (option==1){
       System.out.print("\nEnter new name");
       input.nextLine();
       student.setName(input.nextLine());
       System.out.println("\nName is added");
       }
       else if (option==2){
               System.out.print("\nEnter new Email\n");
              input.nextLine();
      student.setID(input.nextLine());
      System.out.println("\nEmail is added");
       }
            else if (option==3){
               System.out.print("Enter new Majer\n");
              input.nextLine();
      student.setMajer(input.nextLine()); 
      System.out.println("Majer is added");
            }
               else if (option==4){
               System.out.print("\nEnter new Subject\n");
              input.nextLine();
      student.setSubject(input.nextLine());
      System.out.println("\nSubject is added");
            }
               else if (option==5){
               System.out.print("\nEnter new Time\n");
              input.nextLine();
      student.setPeerEd_time(input.nextLine()); 
      System.out.println("\nTime is added\n");
            }
       
               else if (option==6){
               System.out.print("\nEnter new Day\n");
              input.nextLine();
      student.setPeerEd_day(input.nextLine()) ;
      System.out.println("\nDay is added\n");
               }
              else if (option==7){
               System.out.print("\nEnter new Study Levael\n");
              input.nextLine();
      student.setStudy_Level(input.nextInt());
      System.out.println("\nStudy levael is added\n");
            }
       }
       else
           System.out.println("\nEnter a Valid Opiton");
       
      System.out.println("Enter your next task :\n" );
      displayMenu_Subject();  
   break;
   
    case 0:
  
        break;
 
 default:
	 System.out.println("Enter a Valid Option !!\n");
	 System.out.println("TRY Again ! Enter Number Of Subject That You Want To Register For Peer Learning :\n");
 }
 
 } while(subject != 0);
  
  }//End Of C.S Method
  
public static void displayAbout(){
System.out.println("\n\n----------------- WELCOME To Awn System -----------------");
System.out.println("\nWe're here to make it simple and fast to allow you to communicate with your instructors.\n"
        + "\nWe are here to serve the students, and make your communication with your professors easy and convenient;  "
        + "\nSo that you can book office hours with your teacher. Also, you can book hours with peer tutors"
        + "\n(a group of outstanding students), and register for student and non-student activities."
        + "\n Thank you .. AWN ");
}
 

public static int LogIn(String userName, String userPassword) //Database to Sign in
{
		if ( userName.equals("Noura") && userPassword.equals("N123") )
		{
			System.out.print("\n--------- Welcome Noura ---------\n");
                        return 1;
		}
		else if ( userName.equals("Relam") && userPassword.equals("R123") )
		{
			System.out.print("\n--------- Welcome Relam ---------\n");
                        return 1;
		}
		else if ( userName.equals("Shaikha") && userPassword.equals("S123") )
		{
			System.out.print("\n--------- Welcome Shaikha ---------\n");
                        return 1;
		}
        else if (userName.equals("Zainab") && userPassword.equals("Z123"))
		{
			System.out.print("\n--------- Welcome Zainab ---------\n");
                        return 1;
		}
                else
		{
		System.out.print("\nInvalid login attempt. Please try again.\n");
                    return 0;   
		}
	}


    public static void main(String[] args) { //main
        
        System.out.println("\n--------------------------------------------------------------------------------\n");
     
        System.out.println("\n\n----------------- WELCOME To Awn Services -----------------");

        //Display menu
        System.out.println("\n\n --- Sign in As --- \n\n 1. Employee \n\n 2. Student \n\n 3.About US\n\n 0.Exit\n\n");
        int Interface = input.nextInt();
        

   if( Interface == 1 ) 
{    
    String userName;
    String userPassword;
    System.out.println("\nEnter ID : ");
    input.nextLine();
    userName = input.nextLine();    
    
    System.out.println("\nEnter Password : ");
    userPassword = input.nextLine();
    
   int result_of = LogIn(userName, userPassword); //calling  
   if (  result_of == 1   ) {
       
       }
   
  else if (  result_of == 0   ) {
     do{
      
    System.out.println("\nEnter ID : ");
    input.nextLine();
    userName = input.nextLine();  
    System.out.println("\nEnter Password : ");
    userPassword = input.nextLine();
  
     }while (result_of != 0 );
  }
   
   System.out.println("\n----------------- Announcement Page -----------------\n");
   ArrayList<String> announcement = new ArrayList<> ();
    
   System.out.println("\nAdd a New Announcement :\n");
   System.out.println("\nAdd Subject :\n");
   announcement.add(input.nextLine());
   System.out.println("\nAdd Date :\n");
   announcement.add(input.nextLine());
   System.out.println("\nAdd Day :\n");
   announcement.add(input.nextLine());
   System.out.println("\nAdd Time :\n");
   announcement.add(input.nextLine());
 
        System.out.println("\n" + announcement);
            System.out.println("\n Announcement Was Posted.\n");

}
   
   
        
if( Interface == 2 )  //Student Interface
{ //start here
  
    String userName;
    String userPassword;
    System.out.println("\nEnter ID : ");
    input.nextLine();
    userName = input.nextLine();    
    
    System.out.println("\nEnter Password : ");
    userPassword = input.nextLine();
    
   int result_of = LogIn(userName, userPassword); //calling  
   if (  result_of == 1   ) {
       
       }
   
  else if (  result_of == 0   ) {
     do{
      
    System.out.println("\nEnter ID : ");
    input.nextLine();
    userName = input.nextLine();  
    System.out.println("\nEnter Password : ");
    userPassword = input.nextLine();
  
     }while (result_of != 0 );
  }
   
   
       System.out.println("\nChoose One Page Of Following Options :\n\n"
        + " ||       1.Appoinmein Page          ||\n\n"
        + " ||       2.Registeration Page       ||\n\n"
        + " ||       3.Peer Education Page      ||\n");
      
    int choosePage = input.nextInt();
        switch ( choosePage ) {
    
          case 1 : //Appoinment
           System.out.println("\n----------------- Appointment Page -----------------\n");
         
            
           Appointment Schedule = new Appointment();
           Schedule.App();

           System.out.println("\nCould You Creat Your Schedule According To Available Requairements :\n");
           
             Appointment stud = new Appointment();
             OfficeHours stud1 = new OfficeHours();
           
             System.out.println("\n - Enter Name : \n" );
                input.nextLine();
               stud1.setName(input.nextLine());
          
            System.out.println("\n - Enter ID : Must be 10 Digits \n" );
            
            String ID =  input.nextLine();
            while( ID.length() != 10 ){
            
            System.out.println("\nTry Again! The ID Should Be 10 Digits\n" );
                        ID =  input.nextLine();
            }
            
            System.out.println("\n - Enter Course Number : \n" );
              stud1.setCourseNo(input.nextInt() );
               
            System.out.println("\n - Enter Package : \n");
                stud1.setteacher_day_time(input.nextInt());
                
           System.out.println("\n - Save or Drop : 1 : Save , 0 : Drop \n");
                int Save = input.nextInt(); 
                switch(Save){
                
                case 0:
                        
                         System.out.println("\n Thank You, See You Later :) \n");
                    break;
                case 1:
                        
                  System.out.println("\n --------- Current Student Appoitment Information : ---------\n");
                  System.out.println("Hello "+stud1.getName()+" Your Reservation is as folloes:\n" );
                 // System.out.println("ID : " + stud1.getID() );
                  System.out.println("Subject : " + stud1.getCourseNo() );
                  System.out.println("Teacher | Day | Time : Package Number : " + stud1.getteacher_day_time() ); 
                  if (stud1.getteacher_day_time() == 1){
                      System.out.println("\n Package  -  1  - Detailes :"
                              + "\n | Dr.Nour Mohammed | 05November22  |  9-10 am  |");
                  }
                 else if (stud1.getteacher_day_time() == 2){
                      System.out.println( "\n Package  -  2  - Detailes :"
                              + "\n | Dr.Shahad Salem  | 10November22  |  1-2 pm   |");
                  }
                 else if (stud1.getteacher_day_time() == 3){
                      System.out.println( "\n Package  -  3  - Detailes :"
                              + "\n | Dr.Sara Salman   | 13November22  |  11-12 am |");
                  }
                 else if (stud1.getteacher_day_time() == 4){
                      System.out.println( "\n Package  -  4  - Detailes :"
                              + "\n | Ms.Jenan Ahmed   | 16November22  |  8-9 am   |");
                  }
                  break;
                  
                default:    
                    System.out.println("Invalid Choice!");
                }

                
System.out.println("\n -- Your Informaiton Added Successfully -- \n");

break;
          case 2 : //Reg
          //print openinig words //DONE
           System.out.println("\n----------------- Registeration Page -----------------\n");
          //Calling ( //adding abstract keyword ) AboutClub Method From Reg..... Class as: //?
             RegisterationClubs Object1 = new RegisterationClubs() {
             
               @Override
               void AboutClub() {
               }
           };
               Object1.OurClubsAbstract();
   
         //Print Question .. 1 or 2 //DONE
          System.out.println(" \n\nWITCH CLUB WOULD YOU LIKE TO REGISTERATE : 1 or 2 \n\n");
            input.nextLine();          
            int ClubNum = input.nextInt(); //Read user input
          
          if ( ClubNum == 1 )  {
              
         System.out.println("----------------- Student Clubs Page -----------------");    
       
        RegisterationClubs StdClub = new StudentClub(); //upcating
  
        System.out.println("\n - Enter Name : \n" );
               input.nextLine();
               StdClub.setRegName(input.nextLine());
        System.out.println("\n - Enter Email : \n" );
                input.nextLine();
                StdClub.setRegEmail(input.nextLine());
        System.out.println("\n - Enter Major : \n" );
                input.nextLine();
                StdClub.setRegMajor(input.nextLine());
             
       //calling Method
                StdClub.AboutClub();
                
        //print " Choose Club Name "; //DONE
        System.out.println("\nChoose Club1 Or Club2 Or Club3 ? 1 Or 2 Or 3 \n");
        input.nextLine();          
        int ChoooseClubName = input.nextInt(); //Read user input //DONE
        
       
        //user  must enter 1 or 2 or 3 to print more details //DONE
        if (ChoooseClubName == 1)
        {
        System.out.println(" \n          || The Coding Club || \n");
            
          System.out.println(" \nWhat will you offer to 'The Coding Club' : ");
                input.nextLine();
                String Reason1 = input.nextLine(); //Read user input //DONE
                
                System.out.println(" \nTHANK YOU! YOU HAVE REGISTERATED SUCCESSFULLY \n"
                        + "  WE WILL CONTACT YOU SOOOON :) "); 
        }//End of ChoooseClubName1 statement
        
        if (ChoooseClubName == 2) {
        System.out.println(" \n          || The Design Thinking Club || \n");
  
               System.out.println( " \nWhat will you offer to 'The Design Thinking Club' : ");
                input.nextLine();
                String Reason2 = input.nextLine(); //Read user input //DONE
                
                System.out.println(" \nTHANK YOU! YOU HAVE REGISTERATED SUCCESSFULLY \n"
                        + "  WE WILL CONTACT YOU SOOOON :) ");
        }//End of ChoooseClubName2 statement
        
        if (ChoooseClubName == 3) {
        System.out.println(" \n          || The Sport Club || \n");
       
               System.out.println(" \nWhat will you offer to 'The Sport Club' : ");
                String Reason3 = input.nextLine(); //Read user input //DONE
                
                System.out.println(" \nTHANK YOU! YOU HAVE REGISTERATED SUCCESSFULLY \n"
                        + "  WE WILL CONTACT YOU SOOOON :) ");
        }//End of ChoooseClubName3 statement
        
}//End of ClubNum statment
         
          if( ClubNum == 2 ) {//nonStudent clubs
          
          System.out.println("----------------- Non Student Clubs Page -----------------");
           
          NonStudentClub StdClub = new NonStudentClub();

            System.out.println("\n - Enter Name : \n" );
               input.nextLine();
               StdClub.setRegName(input.nextLine());
            System.out.println("\n - Enter Email : \n" );
                input.nextLine();
                StdClub.setRegEmail(input.nextLine());
            System.out.println("\n - Enter Major : \n" );
                input.nextLine();
                StdClub.setRegMajor(input.nextLine());
          
          StdClub.AboutClub();
 
            NonStudentClub [] Club = new NonStudentClub[3];
          
            Club[0] = new NonStudentClub(1 ," The Art Club " , 30 , " SAR ");

            Club[1] = new NonStudentClub(2 ," The History Club " , 25 , " SAR ");
           
            Club[2] = new NonStudentClub(3 ," The Video Games Club ", 45 ," SAR ");
           
           System.out.println( Club[0].getClubId() + Club[0].getClubname() + Club[0].getClubprice() + Club[0].getCurrency()  );
           System.out.println( Club[1].getClubId() + Club[1].getClubname() + Club[1].getClubprice() + Club[1].getCurrency() );
           System.out.println( Club[2].getClubId() + Club[2].getClubname() + Club[2].getClubprice() + Club[2].getCurrency() );


          System.out.println("\nChoose Club1 Or Club2 Or Club3 ? 1 Or 2 Or 3 \n");
          input.nextLine();
          int ClubN = input.nextInt();
          
          System.out.println("\n Add Another Club ? 1 : YES , 0 : NO \n"); 
                    int AddClub = input.nextInt();
                    
                if ( AddClub  == 1 ) { //yes
                     
                    System.out.println("\nUnfortunately, You Cannot Register In More Than One Club At The Moment. "
                            + "\nWe Will Inform You If Registration Is Opened..\n");  
                        }
                
                if ( AddClub  == 0 ) { //no adding
          
                System.out.println("\nConfirm or Drop Your Registration ?  1 : YES , 0 : NO \n");
                    input.nextLine();
                    int Confirm = input.nextInt();
                   
                 if ( Confirm == 1 ) {
              
                    if (  ClubN == 1   ) {
                          System.out.println("\nYour Total Bill :\n");
                          System.out.println( Club[0].getClubname() + ", and it's Price: " + Club[0].getClubprice() + Club[0].getCurrency() ); }
                    
                    else if (  ClubN == 2   ) {
                          System.out.println("\nYour Total Bill :\n");
                          System.out.println( Club[1].getClubname() + ", and it's Price: " + Club[1].getClubprice() + Club[1].getCurrency() ); }
                          
                    else if (  ClubN == 3   ) {
                          System.out.println("\nYour Total Bill :\n");
                          System.out.println( Club[2].getClubname() + ", and it's Price: " + Club[2].getClubprice() + Club[2].getCurrency() ); }
                   
                    } //End Of Confurm
                    else
                       System.out.println("\n Thank You, See You Later :) \n");
                            
                    System.out.println("\n Choose a Payment Method ? "
                                        + "\n 1 : MADA , 2 : Transfir , 3 : ApplPay , 4 : Visa \n");
                                                input.nextLine();
                                                int Payment = input.nextInt();   
                                                
System.out.println(" \nTHANK YOU! YOU HAVE REGISTERATED SUCCESSFULLY \n"
                        + "  WE WILL CONTACT YOU SOOOON :) ");
 
                }//End Of No Adding
               
          } //End Of Club 2 Statement

         break; 
         
        case 3 :
        System.out.println("\n----------------- Peer Education Page -----------------\n");

    
 int choice;
 do{
 System.out.print(main_menu);
 choice = input.nextInt();

switch(choice){
 case 1:
computer_Scince_System();
    break;
 case 2:
 System.out.println("Thank you for using our system");
    break;
 default:
System.out.print("Please enter a valid option.");
  }
 }
 while(choice != 2);
 
         default :
        	 System.out.print("\nSee you(:\n");
         }//End Of Switch     
        

    }//Enf Of interface2 statment

  
   if(Interface == 3) 
    {
         displayAbout();
    }

   if(Interface == 0) 
    {
        System.out.println("\n Thank You, See You Later :) \n");
    }

   
    } }//End Of Main