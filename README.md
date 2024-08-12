Java Springboot JPA Pagination

Implementation JPA pagination to record and research customer information.

Technologies:
 - Java 19
 - JPA 
 - Springboot 3.0
 - H2 Databse

1 - Save Customer: Record customer information
	POST /customer

Request example:
{
    "name" : "Name 1",
    "email" : "name1@teste.com",
    "document_id" : "1"
}

2 - Find Customer: Find customer information using different fields and pagination
	GET /customer
	GET /customer?name=name&size=3&page=0

Response example:
{
    "totalPages": 1,
    "totalElements": 1,
    "size": 3,
    "content": [
        {
            "id": 1,
            "name": "Name 1",
            "email": "name1@teste.com",
            "document_id": "1"
        }
    ],
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": true,
    "last": true,
    "numberOfElements": 1,
    "pageable": {
        "pageNumber": 0,
        "pageSize": 3,
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "paged": true,
        "unpaged": false
    },
    "empty": false
}


# springboot-jpa-pagination
