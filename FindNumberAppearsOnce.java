/* Write a method that returns a number that appears only once in an array.
Assume the array will surely have a unique value. The array will never be empty.
Examples:
{1,2,3,4,1,2,4,3,5} ==> 5 */

public static int singleNumber(int[] A) {
Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
for(int i=0;i<A.length;i++){
if(ht.containsKey(A[i]))
ht.put(A[i], ht.get(A[i])+1);
else
ht.put(A[i],1);
}
for(int i=0;i<A.length;i++){
if(ht.get(A[i])==1)
return A[i];
}
return -1;
}
