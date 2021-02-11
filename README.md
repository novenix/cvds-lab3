# CVDS-lab3
lab3 
Integrantes 
Nicolas Torres Paez :2137260 
Lorenzo Marquez Pinto : 2137527

---------------------------------------------------------------------------------------------------------

## CLASES DE EQUIVALENCIA

Se crea el proyecto maven de tal manera:

- Grupo: edu.eci.cvds
- Artefacto: ClasesEquivalencia
- Paquete: edu.eci.cvds.tdd
- archetypeArtifactId: maven-archetype-quickstart
- Actualizar y crear dependencias en el proyecto
Actualizamos las dependecias.
Hay que cambiar la versión del compilador de Java a la versión 8, para ello, agregue la sección properties antes de la sección de dependencias:
```
    <properties>
        <maven.compiler.target>1.8</maven.compiler.target>
        <maven.compiler.source>1.8</maven.compiler.source>
    </properties>
```
```
<!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api -->
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.7.1</version>
    <scope>test</scope>
</dependency>

```
## COMPILAR Y EJECUTAR
- mvn package
 ![](/imagenes/1.PNG)
 
- mvn Test
 ![](/imagenes/3.PNG)
 
### EJERCICIO “REGISTRADURÍA”
Se va a crear un proyecto base para un requerimiento de la registraduría en el cual se registrarán personas con intención de votar paras las próximas elecciones y se generarán los certificados electorales de aquellas personas cuyo voto sea válido.

Se usará la clase de persona que ya fue creada. El servicio de la registradiría permitirá registrar personas que sean votantes

### PROPIEDADES
- Solo se registrarán votantes válidos
- Solo se permite una inscripción por número de documento

![](/imagenes/5.PNG)
![](/imagenes/4.PNG)


### EJECUTAR LAS PRUEBAS

![](/imagenes/2.PNG)
- MVN package: Este comando es usado para ejecutar todas las faces de Maven (vistas en laboratorio anterior).Realiza el trabajo de copilar, verificar y construir el proyecto.
- MVN test: Corre los test usando frameworks de pruebas.
- Se pueden diferenciar en que test se puede usar unicamente para correr pruebas mientras que package es mas completo pues nos copila verifica , construye el proyecto y de haber pruebas tambien las realiza.

## EJERCICIO "DESCUENTO DE TARIFAS"
 mvn package
 
 mvn exec:java -Dexec.mainClass="edu.eci.cvds.tdd.App"


 ### parte implementacion de pruebas
 Descargue el archivo aerodescuentos.jar y adicione esta nueva dependencia en el archivo pom.xml de su proyecto.
Para adicionar una librería personalizada al repositorio local de maven puede ejecutar el siguiente comando.
se debe correr este comando para poder correr los test
```
$ mvn install:install-file -Dfile=aerodescuentos-1.0.0.jar -DgroupId=edu.eci.cvds -DartifactId=aerodescuentos -Dversion=1.0.0 -Dpackaging=jar
```
![](/imagenes/aerodescuentos.PNG)


### Copilacion y pruebas

![](/imagenes/6.PNG)
