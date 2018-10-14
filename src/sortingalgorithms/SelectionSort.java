//https://www.geeksforgeeks.org/selection-sort/

package sortingalgorithms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lahiru Kaushalya
 *
*
5 7 9 2 4
    2 7 9 5 4
    2 4 9 5 7
    2 4 5 9 7
    2 4 5 7 9
    * 
    * in-place sort
    * not Stable
    * θ(n^2), O(n^2), Ω(n^2)
*/
public class SelectionSort extends SortAlgo{
    
    private List<Integer> data;
    
    public SelectionSort(List<Integer> data) {
        this.data = new ArrayList<>(data);
    }
    
    @Override
    protected void sort() {
        System.out.println("Starting Selection sort....");
        long start = System.currentTimeMillis();
        
        int n = data.size();
        for(int i = 0; i < n - 1; i++){
            int minIndex = i, min = data.get(i);
            for(int j = i + 1; j < n; j++){
                if(min > data.get(j)){
                    min = data.get(j);
                    minIndex = j;
                }
            }
            data.set(minIndex, data.get(i));
            data.set(i, min);
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
