/* Find the first non-duplicate character in a string. Return null if no unique character is found.
firstNonRepeatedCharacter( "abcdcd" ) --> 'a'
firstNonRepeatedCharacter( "cbcd" ) --> 'b'
firstNonRepeatedCharacter( "cdcd" ) --> null */

public static Character firstNonRepeatedCharacter(String str) {
HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
for(int i =0; i< str.length();i++){
if(hm.containsKey(str.charAt(i)))
hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
else
hm.put(str.charAt(i), 1);
}
for(int i =0; i< str.length();i++){
if(hm.get(str.charAt(i)) == 1)
return str.charAt(i);
}
return null;
}
