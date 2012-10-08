println "Introduce a text"
String str= System.console().readLine()
println "Introduce a letter that you want the program counts"
String letter= System.console().readLine()
int cont=0
for (int i=0;i<str.length();i++){
if(str.charAt(i)== letter.charAt(0)){
cont ++}
}
println cont