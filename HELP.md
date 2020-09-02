# Read Me First

## About the Project

The project is a reference for Basic startup for spring boot application for user management and includes
 
<ol>
<li>Spring Security Basic Http Authentication using in-memory database configuration by extending WebSecurityConfigurerAdapter. 
    <ul>Refer SpringSecurityConfig.java </ul></li>
 <li>Use H2 Database - Refer pom.xml for the h2 dependency</li>
 <li>Support both JSON and XML formats - Refer pom.xml for the jackson-dataformat-xml dependency</li>
</ol>

## Running the application locally
Run the command line mvn spring-boot:run
 - This would startup the application running in the port 8080. 

## Testing the application
<table>
<tr>
<td>Functionality</td>
<td>Http Method</td>
<td>URL</td>
<td>Headers</td>
<td>Request Body</td>
</tr> 
<tr>
<td>Get all user records</td>
<td>GET</td>
<td>http://localhost:8080/users</td>
<td></td>
<td></td>
</tr>  
<tr>
<td>Get a user record by id</td>
<td>GET</td>
<td>http://localhost:8080/users/{userId}</td>
<td></td>
<td></td>
</tr>
<tr>
<td>Add a new user record</td>
<td>POST</td>
<td>http://localhost:8080/users</td>
<td>Basic Authorization with user name as admin and password as password</td>
<td>{"name":"Second User","email":"secondemail@test.com"}</td>
</tr>  
<tr>
<td>Update a user record</td>
<td>PATCH</td>
<td>http://localhost:8080/users/{userId}</td>
<td>Basic Authorization with user name as admin and password as password</td>
<td>{"email":"secondemail@test.com"}</td>
</tr>  
</table>


### Reference Documentation
The following was discovered as part of building this project:

# Getting Started
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.0.BUILD-SNAPSHOT/maven-plugin/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.3.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.2.3.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

