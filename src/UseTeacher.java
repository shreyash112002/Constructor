 import java.util.Scanner;
class UseTeacher
 {
     public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);
         System.out.println("Enter subject,name and salary");
        String sub=sc.next();
        String name=sc.next();
        double salary=sc.nextInt();
        Teacher tc1 =new Teacher(sub,name,salary);
        tc1.showData();
     }
}
