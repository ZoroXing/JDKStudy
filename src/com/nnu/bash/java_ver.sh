function java_ver(){
   VER=`head -1 javaver |awk -F\" '{print $2}' | awk -F_ '{print $1}' | sed -e "s/\.//g"`
   echo "VER="$VER
   rm -f javaver
}


JAVA5=D:/JDK/Oracle/jdk1.5.0_17/bin/java
JAVA6=D:/JDK/Oracle/JDK1.6U10/bin/java
JAVA7=D:/JDK/Oracle/jdk1.7.0_45/bin/java

$JAVA5 -version >javaver 2>&1
echo "***************************************************"
cat javaver
echo "***************************************************"
java_ver
echo 
$JAVA6 -version >javaver 2>&1
echo "***************************************************"
cat javaver
echo "***************************************************"
java_ver
echo 
$JAVA7 -version >javaver 2>&1
echo "***************************************************"
cat javaver
echo "***************************************************"
java_ver
echo
