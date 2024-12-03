# NimapProject
Steps to Run the Code :
   1] Tools Used:
       1] Framework : Spring Boot for developing the application.
       2] API Testing Tool : Postman for testing the APIs.
       
   2] Design of APIs for category CRUD operations
     1] GET /api/categories?page=n: Fetch paginated categories.
     2] POST /api/categories: Create a new category with validation.
     3] GET /api/categories/{id}: Fetch a category by ID.
     4] PUT /api/categories/{id}: Update a category by ID.
     5] DELETE /api/categories/{id}: Delete a category by ID with checks for associated products.


 3] Running the Application :
    1] Started the Spring Boot application using :
     bash
     mvn spring-boot:run
     2] Run the NimapProjectApplication.java and NimapProject1Application.java
     3]Verified the application ran successfully on http://localhost:8080.

4] API Testing :
  1] Used Postman to test all endpoints, including:
    GET /api/categories?page=1 to fetch paginated categories.
    POST /api/categories to create a new category.
    GET /api/products/{id} to retrieve a product with its category.
    Confirmed all CRUD operations worked correctly.

5] Database Verification :
   1] Ensured that MySQL was configured as the database.
   2] Verified that tables (categories, products) and their relationships (one-to-many) were created successfully.
