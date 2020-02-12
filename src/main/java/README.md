Java OCA examples
--------------
Compile
--------------
```
javac -classpath ./classes -d ./classes chapter1/*.java
```

Run
--------------
```
java -classpath ./classes/ chapter1.MainSpecial		
```
Search for a class
--------------
```
jar -tf $JAVA_HOME/jre/lib/rt.jar | grep ArrayList
```