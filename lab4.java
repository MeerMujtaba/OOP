import java.util.Scanner;
public class lab4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter how many student you want to print :");
        int quentity = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your University name:");
        String uni_name = sc.nextLine();

        System.out.println("Enter your Department:");
        String uni_dep = sc.nextLine();
        System.out.println("your University name is :"+uni_name+"\nYour department name is: "+uni_dep);
        
        for (int i = 1 ;i<= quentity; i++)
        {
            System.out.println("25CS"+ i);
        }
    }
    
}
