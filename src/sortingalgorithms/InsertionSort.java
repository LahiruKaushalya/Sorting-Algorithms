//https://www.geeksforgeeks.org/insertion-sort/

package sortingalgorithms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lahiru Kaushalya
 *
*
5 7 9 2 4
    5 7 9 2 4
    5 7 9 2 4
    2 5 7 9 4
    2 7 5 7 9
    * 
    * in-place sort
    * Stable
    * θ(n^2), O(n^2), Ω(n)
*/
public class InsertionSort extends SortAlgo{
    
    private List<Integer> data;
    
    public InsertionSort(List<Integer> data) {
        this.data = new ArrayList<>(data);
    }

    @Override
    protected void sort() {
        System.out.println("Starting Insertion sort....");
        long start = System.currentTimeMillis();
        
        int n = data.size();
        for(int i = 1; i < n ; i++){
            int num = data.get(i), j = i - 1;
            while(j >= 0 && num < data.get(j)){
                data.set(j+1, data.get(j));
                j--;
            }
            data.set(j+1, num);
        }
        long end = System.currentTimeMillis();
        double time = (end - start)/1000.0;
        System.out.println("Time teaken to sort " + n + " elements : " + time + "s");
    }

    @Override
    protected void printData() {
        data.forEach(num -> {
            System.out.print(num + " ");
        });
    }
    
}
