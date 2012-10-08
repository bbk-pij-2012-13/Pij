int oper
println "Introduce an operation"
String str = System.console().readLine()
for (int i=0;i<str.length();i++){
if (str.charAt(i)=="*"){ oper=i}
if (str.charAt(i)=="+"){ oper=i}
if (str.charAt(i)=="-"){ oper=i}
if (str.charAt(i)=="/"){ oper=i}
 
}

double a =Double.parseDouble(str.substring(0,oper))
double b= Double.parseDouble(str.substring(oper+1,str.length()))
char operator= str.charAt(oper)

if (operator=="*"){
double res= a*b
println res
}
if (operator=="/"){
double res= a/b
println res
}
if (operator=="+"){
double res= a+b
println res
}
if (operator=="-"){
double res= a-b
println res
}