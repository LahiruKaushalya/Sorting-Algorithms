package sortingalgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Lahiru Kaushalya
 */
public class Main {
    
    private static SortAlgo Soter;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Integer> data = generate(1000000);
        
        Soter = new BubbleSort(data);
        Soter.sort();
        //Soter.printData();
        
        Soter = new InsertionSort(data);
        Soter.sort();
        //Soter.printData();
        
        Soter = new SelectionSort(data);
        Soter.sort();
        //Soter.printData();
        
        Soter = new MergeSort(data);
        Soter.sort();
        //Soter.printData();
        
        Soter = new QuickSort(data);
        Soter.sort();
        //Soter.printData();
    }
    
    private static List<Integer> generate(int amount){
        int i = 0;
        List<Integer> data = new ArrayList<>();
        Random ran = new Random();
        do{
            data.add(ran.nextInt(100));
            i++;
        }
        while(i < amount);
        return data;
    }
}

