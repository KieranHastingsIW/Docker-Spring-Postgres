# Docker-Spring-Postgres
A guide to setting up a spring boot application with a postgres database that is accessible through pgAdmin in your browser. 

1. Clone repository into directory of choice.
    - Before building the appicalion open the docker compose file and change the username and password in the db environment section to a username and password of your choice. Also update the username, password, and source url in the server enviroment to match those of the db enviroments. 
    - Repeate the above with the default email and password in the pgAdmin enviroment section.
    - Comments for where to make these changes can be found in the docker-compose.yml file. 
2. In DOS CMD while in the directory containing the Docker compose file run the `docker-compose up` command.
3. The build will take around 3 - 4 minutes so go make yourself a coffee, you deserve it.
4. To access the pgAdmin browser in your search engine of choice search `localhost:5050` and log in using the credentials you set for pgAdmin.
11. Set the host name to `db`, the port to `5432` and the username and password to what you the username and password for db.
12. To confirm the database has been attached successfully in the browser drill down; Servers -> "Name you gave to DB" -> Databases -> compose-postgres ->  Schemas -> public -> tables -> private_user (this is the table name) -> Columns. 
13. Here you should see 3 columns; id, first_name, and last_name 

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


