import java.util.ArrayList;

public class Main {

    /**
     * Use this main method to call the methods implemented
     * in the Assignment class.
     */
    public static void main(String[] args) {
	    Assignment assignment = new Assignment();
	    // Use the assignment reference to call methods, like this:
        System.out.println(assignment.isNumberSmallMediumOrBig(15));

        ArrayList<Integer> newArray = new ArrayList<>();
        newArray = assignment.findAllIntsBelowNumberInArray(new int[] {1,2,3,4,5,6,7,8,9}, 5);


    }
}
