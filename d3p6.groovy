println "Introduce a text"
String str= System.console().readLine()

boolean check=true

println "Introduce a letter that you want the program counts"
String letter= System.console().readLine()
int cont=0
for (int i=0;i<str.length();i++){
if(str.charAt(i)== letter.charAt(0)){
	cont ++}
}
println cont
while(check){
cont=0
	println "Introduce a letter that you want the program counts"
	String letter2= System.console().readLine()
	if (letter2!=letter){
		 for (int i=0;i<str.length();i++){
 			if(str.charAt(i)== letter2.charAt(0)){
			cont ++}
			}
		println cont
		}
else {check= false}
}