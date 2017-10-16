/* Write a method that takes in an input String and returns true if all the characters in the String are unique and
false if there is even a single repeated character.
The method should return true if the input is null or empty String .
Examples:
areAllCharactersUnique("abcde") -> true */

public static boolean areAllCharactersUnique(String str){
if(str == null || str.length() < 1 ) return true;
HashSet<Character> hs = new HashSet<Character>();
for(char c: str.toCharArray()){
hs.add(c);
}
if(hs.size() == str.length()) return true;
return false;
}
