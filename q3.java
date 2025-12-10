import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        // Static array with 5 student names
        String[] names = {"Saroj", "Sushant", "Ujjwal", "Rabina", "Sandesh"};
        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
            
        }
        System.out.println(names[2]);
        names[4]="Arnim";
        System.out.println(names[4]);
        System.out.println("enter index");
        int j=a.nextInt();
        a.nextLine();
        System.out.println("enter a name");
        names[j]=a.nextLine();
        System.out.println("nw updated array is");
        for( int i=0; i<names.length;i++){
            System.out.println(names[i]);
            
        }
        
        
    }
}