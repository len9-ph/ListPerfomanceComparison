package ListPerfomance;
import org.apache.commons.lang3.time.StopWatch;
import java.util.List;

/**
 * This class compares the performance of three list operations
 */
public class PerformanceComparison {

    /**
     * @param list - Array or Linked list
     * @param amountOfElements - amount of elements in list
     * @return operation execution time
     */
    public double addCheck(List list, int amountOfElements){
        StopWatch watch = new StopWatch();
        watch.start();
        for(int i = 0; i < amountOfElements; i++){
            list.add(i);
        }
        watch.stop();
        return watch.getNanoTime() / 1000000.;
    }

    /**
     * @param list - Array or Linked list
     * @param amountOfElements - amount of elements in list
     * @return operation execution time
     */
    public double getCheck(List list, int amountOfElements){
        StopWatch watch = new StopWatch();
        watch.start();
        for(int i = 0; i < amountOfElements; i++){
            int elem = (int)list.get(i);
        }
        watch.stop();
        return watch.getNanoTime() / 1000000.;
    }

    /**
     * @param list - Array or Linked list
     * @param amountOfElements - amount of elements in list
     * @return operation execution time
     */
    public double removeCheck(List list, int amountOfElements){
        StopWatch watch = new StopWatch();
        watch.start();
        for(int i = amountOfElements - 1; i >= 0; i--){
            list.remove(i);
        }
        watch.stop();
        return watch.getNanoTime() / 1000000.0;
    }
}
