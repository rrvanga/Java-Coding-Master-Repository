/* Implement a method that checks if two strings are permutations of each other. */

public static boolean permutation(String str1, String str2) {
HashMap<Character,Integer> hm1 = new HashMap<Character,Integer>();
HashMap<Character,Integer> hm2 = new HashMap<Character,Integer>();
if(str1.length() == str2.length())
{
for(int i = 0; i< str1.length(); i++){
char c = str1.charAt(i);
hm1.put(c, hm1.get(c) == null ? 1 : hm1.get(c) +1);
c = str2.charAt(i);
hm2.put(c, hm2.get(c) == null ? 1 : hm2.get(c) +1);
}
boolean returntype = true;
Set<Character> setofkeys = hm1.keySet();
for(char c: setofkeys){
if(hm1.get(c) != hm2.get(c)) returntype = false;
}
if(returntype) return true;
}
return false;
}
