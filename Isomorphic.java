import java.io.*;
import java.util.*;;
public class Isomorphic {
public static void main(String args[])throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String str1 =br.readLine();
String str2 =br.readLine();
if (str1.length() == str2.length()) {
str1 = str1.toLowerCase();
str2 = str2.toLowerCase();
if (str1.equals(str2)) {
System.out.println("Isomorphic");
} 
else {
boolean isomorphic = true;
Map<Character, Character> map = new HashMap<Character, Character>();
for (int i = 0; i < str1.length(); i++) {
char char1 = str1.charAt(i);
char char2 = str2.charAt(i);
if (map.containsKey(char1)) {
if (map.get(char1) != char2) {
isomorphic = false;
}
} else {
if (map.containsValue(char2)) {
isomorphic = false;
} else {
map.put(char1, char2);
}
}
}
if (isomorphic) {
System.out.println("Isomorphic");
} else {
System.out.println("not Isomorphic");
}
}
} else {
System.out.println("not Isomorphic");
}
}
}
