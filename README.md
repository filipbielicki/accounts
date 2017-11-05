# accounts
Web App / Spring Boot / REST API / JAX-RS / Jersey / Tests

SUMMARY:<br>
Web application with REST API (JAX-RS / Jersey) developed with MVC design pattern using Spring Boot 1.5.8.<br>
Annotation-based configuration.<br>
Build tool: Maven.<br>
Test class show examples of mocking with and without annotations.<br>
Take a look how to define your own exception and how to link it with a specific http response.<br>

DB CONFIGURATION:<br>
The project has H2 database but can easily be changed for e.g. PostgreSQL/MySQL databases.<br>
Look at "checkoutcomponent" project on my repo to see an example with PostgreSQL.<br>

SERVER CONFIGURATION:<br>
Default port: 8080<br>
To change the default port see application.properties file.<br>

BUILD & EXECUTE:<br>
1. Go to the project folder and launch command line window<br>
2. Enter: mvnw clean install<br>
3. Once the project is build enter: java -jar target\nameofjarfile.jar<br>
4. Application is launched and ready to use with a browser<br>
5. Have fun and grab a beer<br>

URL:<br>
Get all clients: http://localhost:8080/accounts/getall<br>
Find a client by surname: http://localhost:8080/accounts/find/{surname}<br>
Calculate total clients' savings: http://localhost:8080/accounts/totalsavings<br>
Get all products: http://localhost:8080/products/getall<br>
