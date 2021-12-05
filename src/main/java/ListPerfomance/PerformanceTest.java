package ListPerfomance;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * This class create simple table with information about comparison
 */
public class PerformanceTest {
    /**
     * @param amountsOfElements - the number of items that the lists will work with
     */
    public static void printTable(int... amountsOfElements){
        System.out.println("\t | List size | ArrayList | LinkedList |");
        for (int amountOfElements : amountsOfElements){
            ArrayList<Integer> arrayList = new ArrayList<>();
            LinkedList<Integer> linkedList = new LinkedList<>();

            System.out.print("Add  | ");
            System.out.printf("%8d", amountOfElements);
            System.out.print("  |");
            System.out.printf("%11f", new PerformanceComparison().addCheck(arrayList, amountOfElements));
            System.out.print("|");
            System.out.printf("%12f", new PerformanceComparison().addCheck(linkedList, amountOfElements));
            System.out.println("|");

            System.out.print("Get  | ");
            System.out.printf("%8d", amountOfElements);
            System.out.print("  |");
            System.out.printf("%11f", new PerformanceComparison().getCheck(arrayList, amountOfElements));
            System.out.print("|");
            System.out.printf("%12f", new PerformanceComparison().getCheck(linkedList,amountOfElements));
            System.out.println("|");

            System.out.print("Rem  | ");
            System.out.printf("%8d", amountOfElements);
            System.out.print("  |");
            System.out.printf("%11f", new PerformanceComparison().removeCheck(arrayList, amountOfElements));
            System.out.print("|");
            System.out.printf("%12f", new PerformanceComparison().removeCheck(linkedList, amountOfElements));
            System.out.println("|");
            System.out.println("-------------------------------------------");
        }
    }
}
