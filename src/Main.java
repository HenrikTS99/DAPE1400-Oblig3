import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    /**
     * Use this main method to call the methods implemented
     * in the Assignment class.
     */
    public static void main(String[] args) {
	    Assignment assignment = new Assignment();
	    // Use the assignment reference to call methods, like this:
        System.out.println(assignment.isNumberSmallMediumOrBig(15));

        System.out.println("2+3+4= " + assignment.addThreeNumbers(2,3,4));

        System.out.println("Small: " + assignment.isNumberSmallMediumOrBig(50));
        System.out.println("Medium: " + assignment.isNumberSmallMediumOrBig(500));
        System.out.println("Big: " + assignment.isNumberSmallMediumOrBig(1001));

        assignment.printCourseName("ADTS1600");
        assignment.printCourseName("DAPE1400");

        System.out.println("False:" + assignment.isColorInNorwegianFlag("black"));
        System.out.println("True:" + assignment.isColorInNorwegianFlag("blue"));

        System.out.println("Length of string 'hello' + 'world' is = " + assignment.combinedLength("Hello", "World"));

        System.out.println("False: " + assignment.checkIfStringIsWithinCorrectLength("False",10, 6));
        System.out.println("True: " + assignment.checkIfStringIsWithinCorrectLength("False",10, 3));

        assignment.printAllStrings(new String[]{"Printing", "all", "strings"});

        System.out.println("Sum of 3, 5 and 6 is " + assignment.arraySum(new int[]{3, 5, 6}));

        assignment.printAllStringsNotCorona(new String[] {"Printing", "All", "But", "Corona","C0R0NA"});

        System.out.println("All numbers 1-10 below 5: " +
                assignment.findAllIntsBelowNumberInArray(new int[]{1,2,3,4,5,6,7,8,9}, 5));

        System.out.println(assignment.makeHashMapFromTwoArrays(
                new String[] {"Key1", "Key2", "Key3"},
                new String[] {"Value1", "Value2", "Value3"}
        ));

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList("1 element", "2 elements", "2 elements", "3 elements", "3 elements", "3 elements"));
        System.out.println(assignment.findFrequencyOfElementsInArrayListOfStrings(arrList));

        System.out.println("The first index of f is: " + assignment.firstOccurrence("The first index of f is", 'f'));
        System.out.println("Returns -1: " + assignment.firstOccurrence("The first index of f is", 'a'));

        System.out.println(assignment.ensureOnlySingleSpaceAtEndOfString("    Ensure Only Single Space At End Of String"));

        System.out.println("False: " + assignment.validateString("failed  "));
        System.out.println("False: " + assignment.validateString(" failed"));
        System.out.println("False: " + assignment.validateString("failed"));
        System.out.println("true: " + assignment.validateString("success "));

        assignment.printUpperCaseStrings(new String[] {"Upper", "case", "letters"});

        assignment.printFirstSentence(("Printing the first sentence. This will not be printed").toCharArray());
        System.out.println();
        assignment.printFirstSentence(("Questions ignored? Printing to the first >. This will not be printed").toCharArray());
        System.out.println();

        assignment.printAllStringsNotCoronaCaseInsensitive(new String[] {"Does", "not", "print", "corona", "CORONA", "CoRoNa"});

        System.out.println("Sum of 3, 5 and 6 is " + assignment.addNumbers(3, 5, 6));
        System.out.println("Sum of 3, 5, 6 and 10 is " + assignment.addNumbers(3, 5, 6, 10));

    }
}
