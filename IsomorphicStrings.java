/* Given two strings - input1 and input2, determine if they are isomorphic.
Two strings are isomorphic if the letters in one string can be remapped to get the second string. Remapping a
letter means replacing all occurrences of it with another letter. The ordering of the letters remains unchanged. You
can also think of isomorphism as it is used in chemistry - i.e. having the same form or overall shape. Target linear
time and space complexity with your solution. */


public static boolean isIsomorphic(String input1, String input2) {
if(input1.isEmpty() && input2.isEmpty()) return true;
HashMap<Character,Integer> hm1 = new HashMap<Character,Integer>();
HashMap<Character,Integer> hm2 = new HashMap<Character,Integer>();
if(input1.length() == input2.length()) {
for(int i=0; i < input1.length(); i++) {
Character c = input1.charAt(i);
hm1.put(c, (hm1.get(c) == null ? 1 : hm1.get(c) +1) );
c = input2.charAt(i);
 hm2.put(c, (hm2.get(c) == null ? 1 : hm2.get(c) +1) );
}
boolean returntype = true;
for(int i=0; i < input1.length();i++){
if(hm1.get(input1.charAt(i)) != hm2.get(input2.charAt(i)) ) {
returntype = false;
break;
}
}
return returntype;
}
return false;
}
