//https://www.geeksforgeeks.org/quick-sort/
package sortingalgorithms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lahiru Kaushalya
 */
public class QuickSort extends SortAlgo{
    
    private List<Integer> data;
    
    public QuickSort(List<Integer> data) {
        this.data = new ArrayList<>(data);
    }
    
    @Override
    protected void sort() {
        System.out.println("Starting Quick sort....");
        long start = System.currentTimeMillis();
        
        int n = data.size();
        quickSort(data, 0, n - 1);
        
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
    
    private void quickSort(List<Integer> data, int l, int r){
        if(l >= r){
            return;
        }
        int p = partition(data, l, r);
        quickSort(data, l, p - 1);
        quickSort(data, p + 1, r);
    }
    
    private int partition(List<Integer> data, int l, int r){
        
        int p = l - 1, pValue = data.get(r);
        for(int i = l; i < r; i++){
            int temp = data.get(i);
            if(temp <= pValue){
                p++;
                data.set(i, data.get(p));
                data.set(p, temp);
            }
        }
        
        int temp = data.get(p + 1);
        data.set(p + 1, pValue);
        data.set(r, temp);
        return p + 1;
    }
}
