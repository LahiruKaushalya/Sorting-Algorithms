//https://www.geeksforgeeks.org/bubble-sort/

package sortingalgorithms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lahiru Kaushalya
 *
 *
 5 7 9 2 4
    5 7 2 4 9
    5 2 4 7 9
    2 4 5 7 9
    * 
    * in-place sort
    * Stable
    * θ(n^2), O(n^2), Ω(n)
*/
public class BubbleSort extends SortAlgo{
    
    private List<Integer> data;
    
    public BubbleSort(List<Integer> data){
        this.data = new ArrayList<>(data);
    }
    
    @Override
    public void sort() {
        System.out.println("Starting Bubble sort....");
        long start = System.currentTimeMillis();
        
        int n = data.size();
        for(int i = 0; i < n - 1; i++){
            int first, second;
            boolean swapped = false;
            for(int j = 0; j < n - 1 - i; j++){
                first = data.get(j);
                second = data.get(j + 1);
                if(first > second){
                    data.set(j, second);
                    data.set(j+1, first);
                    swapped = true;
                }
            }
            if(!swapped){break;}
        }
        long end = System.currentTimeMillis();
        double time = (end - start)/1000.0;
        System.out.println("Time teaken to sort " + n + " elements : " + time + "s");
    }
    
    @Override
    public void printData(){
        data.forEach(num -> {
            System.out.print(num + " ");
        });
    }
    
}
