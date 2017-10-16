/* Selection sort offers improved performance over bubble sort, especially for arrays with a large number of elements.
Where bubble sort accumulated the largest elements towards the end of the array, selection sort accumulates the
smallest elements at the beginning of the array.
Write a method that uses the selection sort algorithm to sort an input array of integers. See the hints and click the
red colored links for additonal details on the algorithm. */

public static int[] selectionSortArray(int[] arr){
if(arr.length <1) return arr;
for(int i = 0; i< arr.length-1;i++){
for(int j=i+1; j < arr.length; j++){
if(arr[i] > arr[j]){
arr[i] = arr[j] + arr[i];
arr[j] = arr[i] - arr[j];
arr[i] = arr[i] - arr[j];
}
}
}
return arr;
}
