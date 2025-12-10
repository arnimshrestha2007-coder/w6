import java.util.Scanner;

public class q6
{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[][] marks=new int[2][2];
        int total[]=new int[2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println((i+1)+".students "+(j+1)+". Subject marks");
                marks[i][j]=input.nextInt();
                total[i]+=marks[i][j];
            }
        }
        System.out.println("           Nepali   English");
        System.out.println("----------------------------");

        
        for (int i = 0; i < marks.length; i++) {
            int totalmarks = 0;
            System.out.print("Student " + (i + 1) + ":   ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "       ");
                totalmarks += marks[i][j];
            }
            System.out.println(" | Total = " + totalmarks);
        }
    }
        
        
}