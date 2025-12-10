public class w601 {
    public static void main(String[] args) {

        // declaring and constructing array
        int[] age = new int[5];
        System.out.println(age.length);  // length of array

        // initialization
        age[0] = 10;
        age[1] = 20;
        age[2] = 30;
        age[3] = 40;
        age[4] = 50;

        int firstelement = age[0];
        System.out.println(firstelement);

        // another array using direct initialization
        int[] agr = {5, 10, 15, 20, 30};

        int end = agr.length - 1;

        // display in the SAME LINE
        for (int i = 0; i <= end; i++) {
            System.out.print(agr[i] + " ");
        }
    }
}