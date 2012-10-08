println "Introduce a word"
String str= System.console().readLine()
int j= str.length()
boolean check=true
for (int i=0;i<str.length();i++){
if( str.charAt(i)!=str.charAt(j-1-i)){
check=false}
}
if (check) {println "Congratulation PALINDROME"}
if (!check) {println "NO PALINDROME"}