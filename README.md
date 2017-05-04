# CI346 Programming Languages, Concurrency and Client Server Computing Semester 2

A Maven web application consists of the HATEOS API, with a ReactJS frontend, using HTML and Javascript, and has a .sql database that is linked to the index page. Springboot was used. automated build can be achieved using Eclipse or command line. the web application shows a list of staff members and their shift rotation and their positions according to the database. 

## Setup on `Windows`.

* Install [apache-maven-3.3.9-bin.zip](http://www.mirrorservice.org/sites/ftp.apache.org/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.zip)
* * Java: `JAVA_HOME` should point to `C:\Program Files\Java\jdk-version`.
* * Maven: `PATH` should have `;path/to/apache-maven-3.3.9/` appended to the end.
* Intall [NodeJS + NPM](https://nodejs.org/en/) 

## Database
I used USBwebserver to create database, download available here: http://www.usbwebserver.net/en/download.php

Settings for USBWebserver:
1. Root dir: {path}/root
2. Port apache: 8888
3. Port MySQL: 3300

To intall the database:
1. login to USBWebserver's PHPMyAdmin page
2. on the tabs on top of the admin page, click on "Databases" and create a new database called "Staff".
3. after creating the "staff" database, inside the database, click on "import" option and import the "staff.sql" file provided in the "Database" folder of this project.



## Running
- before running the project, please delete the "target" folder from the project path, because a new target folder will be created automatically by compiling the application.
- The project should compile and run by simply running `mvn spring-boot:run -X`. 
- or to automatically build the project on Eclipse, on run configurations, in "Goals" type "spring-boot:run -X" 
