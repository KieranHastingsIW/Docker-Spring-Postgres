# Docker-Spring-Postgres
A guide to setting up a spring boot application with a postgres database that is accessible through pgAdmin in your browser. 

NOTE: A lightweight simple bank app was used to reduce build time.

Clone repository into directory of choice.
In DOS CMD run the docker-compose up command.
The build will take around 3 - 4 minutes so go make yourself a coffee, you deserve it.


To test the creation of the API use POSTMAN.
Import the postman collection fond in this repository into your desktop version of POSTMAN.
Run the Get Accounts request.
The output should be a JSON object with an array called test within it, this array should contain 2 instances of the string iban.
Along with the JSON output the response status should be 501 unimplemented.
