for jpa connection with h2 database using spring boot:

--> Make sure you are using h2 database, and you install h2 driver in your pom.xml file

AND then add the following properties in application.properties
    - spring.datasource.url=jdbc:h2:mem:database_name_you want
    - spring.datasource.driverClassName=org.h2.Driver

Go to the browser and open http://127.0.0.1:8080/h2-console and you will see h2 database in your browser