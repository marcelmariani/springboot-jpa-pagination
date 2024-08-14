# springboot-redis

Java Springboot Redis

Implementation Redis to store customer information. After that, it is possible to send the data from Redis Database to H2 Database.

Technologies:
 - Java 19
 - JPA 
 - Springboot 3.0
 - H2 Databse
 - Redis Database
 - Redis Commander -> http://localhost:8081/

1 - Save Customer: Record customer information
 - POST /customer

2 - Find Customer Redis: Find customer information using different fields and pagination
 - GET /v2/customer
 
3 - Find Customer H2: Find customer information relational database
 - GET /v1/customer
 
4 - Redis Commander commands:
 - keys * -> list all keys storaged
 - hgetall + {index} -> get json key
 - del + {index} -> delete information

5 - Postman Collection
 - ./

6 - Dockerfile
 - Provided docker-compose.yml to deploy Redis Database e Redis Commander# springboot-redis
