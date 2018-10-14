//https://www.geeksforgeeks.org/merge-sort/
package sortingalgorithms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lahiru Kaushalya
 */
public class MergeSort extends SortAlgo{
    
    private List<Integer> data;
    
    public MergeSort(List<Integer> data) {
        this.data = new ArrayList<>(data);
    }
    
    @Override
    protected void sort() {
        System.out.println("Starting Merge sort....");
        long start = System.currentTimeMillis();
        
        int n = data.size();
        mergeSort(data, 0, n - 1);
        
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
    
    private void mergeSort(List<Integer> data, int l, int r){
        int m = (r + l )/ 2;
        if(r <= l){
            return;
        }
        mergeSort(data, l, m);
        mergeSort(data, m+1, r);
        merge(data, l , m, r);
    }
    
    private void merge(List<Integer> data, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - (m + 1) + 1;
        
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        for(int i = 0; i < n1; i++){
            left[i] = data.get(l + i);
        }
        for(int j = 0; j < n2; j++){
            right[j] = data.get(m + 1 + j);
        }
        //Merge 2 arrays
        int p = 0, q = 0, k = l;
        
        while(p < n1 && q < n2){
            if(left[p] <= right[q]){
                data.set(k, left[p]);
                p++;
            }
            else{
                data.set(k, right[q]);
                q++;
            }
            k++;
        }
        while(p < n1){
            data.set(k, left[p]);
            p++;
            k++;
        }
        while(q < n2){
            data.set(k, right[q]);
            q++;
            k++;
        }
    }
    
}
