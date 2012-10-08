class Point {
double x;
double y;
}
Point num1=new Point()
Point num2=new Point()
Point num3=new Point()
println "Introduce 3 points"
println "coordenate x point 1"
num1.x =Double.parseDouble(System.console().readLine()) 
println "coordenate y point 1"
num1.y =Double.parseDouble(System.console().readLine())
println "coordenate x point 2"
num2.x =Double.parseDouble(System.console().readLine())
println "coordenate y point 2"
num2.y =Double.parseDouble(System.console().readLine())
println "coordenate x point 3"
num3.x =Double.parseDouble(System.console().readLine())
println "coordenate y point 3"
num3.y =Double.parseDouble(System.console().readLine())

double dist12=Math.pow (Math.pow((num1.x-num2.x),2)+Math.pow((num1.y-num2.y),2),0.5)
double dist23=Math.pow (Math.pow((num2.x-num3.x),2)+Math.pow((num2.y-num3.y),2),0.5)
double dist13=Math.pow (Math.pow((num1.x-num3.x),2)+Math.pow((num1.y-num3.y),2),0.5)
if (dist12<dist23 & dist23<dist13){println "Points closer point 1 and 2"}
if (dist12<dist13 & dist13<dist23){println "Points closer point 1 and 2"}
if (dist23<dist13 & dist13<dist12){println "Points closer point 2 and 3"}
if (dist23<dist12 & dist12<dist13){println "Points closer point 2 and 3"}
if (dist13<dist23 & dist23<dist12){println "Points closer point 1 and 3"}
if (dist13<dist12 & dist12<dist23){println "Points closer point 1 and 3"}