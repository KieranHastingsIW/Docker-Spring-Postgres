# Docker-Spring-Postgres
A guide to setting up a spring boot application with a postgres database that is accessible through pgAdmin in your browser. 

1. Clone repository into directory of choice.
2. In DOS CMD while in the directory conatining the Docker compose file run the `docker-compose up` command.
3. The build will take around 3 - 4 minutes so go make yourself a coffee, you deserve it.
4. To access the pgAdmin browser in your search engine of choice search `localhost:5050` and log in using the credentials: Username: **admin@admin.com** **Password: root**
5. Once logged in click add a new service, name the service and mocve over to connection.
6. Set the host name to `db`, the port to `5432` and both the username and password to `compose-postgres`.
7. to confime the database has been attached succsefully in the browser drill down; Servers -> "Name you gave to DB" -> Databases -> compose-postgres ->  Schemas -> public -> tables -> private_user (this is the table name) -> Columns. 
8. Here you should see 3 columns; id, first_name, and last_name 

Testing 
* To test the creation of the API use POSTMAN.
* Import the postman collection found in this repository into your desktop version of POSTMAN.
**Testing Get Request**
    * Run the Get Users request.
    * The output should be a JSON object with an empty array and a status code of 200 OK.
**Testing Post Request**
    * In the body of the Add user request edit the first and last name field to be your own.
    * The output should be status code of 201 CREATED.
    * To see if the user had been added successfully run the Get user test to see if your new user object had been added to the array.
