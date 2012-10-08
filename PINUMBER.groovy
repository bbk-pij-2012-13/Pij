println "Introduce a number so we calculate the pi number"
int num= Integer.parseInt(System.console().readLine())
float res
for (int i=0;i<num;i++){
	float aux= 4*((-1)**i)/((2*i)+1)
	 res= res + aux

}

println "    "+ res
 