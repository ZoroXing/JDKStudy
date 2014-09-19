# VER=122
# VER=130
# VER=140
# VER=150
# VER=160
# VER=170
function java_ver(){
   VER=`head -1 javaver |awk -F\" '{print $2}' | awk -F_ '{print $1}' | sed -e "s/\.//g"`
   echo "VER="$VER
   rm -f javaver
   
   if [ $VER -lt 150 ];
   then
      echo "<1.5.0 Java Vesrion:$VER"
   elif [ $VER -eq 150 ]; 
   then
      echo "1.5.0 Java Vesrion:$VER"
   elif [ $VER -eq 160 ];
   then
      echo "1.6.0 Java Vesrion:$VER"
   elif [ $VER -eq 170 ];
   then
      echo "1.7.0 Java Vesrion:$VER"
   else
      echo "Other!"
   fi    
}

JAVA2=D:/JDK/Oracle/jdk1.2/bin/java
JAVA3=D:/JDK/Oracle/jdk1.3/bin/java
JAVA4=D:/JDK/Oracle/jdk1.4.0/bin/java
JAVA5=D:/JDK/Oracle/jdk1.5.0_17/bin/java
JAVA6=D:/JDK/Oracle/JDK1.6U10/bin/java
JAVA7=D:/JDK/Oracle/jdk1.7.0_45/bin/java

$JAVA2 -version >javaver 2>&1
echo "***************************************************"
cat javaver
echo "***************************************************"
java_ver
$JAVA3 -version >javaver 2>&1
echo "***************************************************"
cat javaver
echo "***************************************************"
java_ver
$JAVA4 -version >javaver 2>&1
echo "***************************************************"
cat javaver
echo "***************************************************"
java_ver
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
