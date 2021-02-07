# cvds-lab3
lab3 
Integrantes 
Nicolas Torres Paez :2137260 
Lorenzo Marquez Pinto : 2137527
 mvn package
 
 mvn exec:java -Dexec.mainClass="edu.eci.cvds.tdd.App"


 ## parte implementacion de pruebas
 Descargue el archivo aerodescuentos.jar y adicione esta nueva dependencia en el archivo pom.xml de su proyecto.
Para adicionar una librería personalizada al repositorio local de maven puede ejecutar el siguiente comando.
se debe correr este comando para poder correr los test
```
$ mvn install:install-file -Dfile=aerodescuentos-1.0.0.jar -DgroupId=edu.eci.cvds -DartifactId=aerodescuentos -Dversion=1.0.0 -Dpackaging=jar
```
![](/imagenes/aerodescuentos.PNG)
