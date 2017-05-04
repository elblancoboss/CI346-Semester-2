# CI346 Programming Languages, Concurrency and Client Server Computing Semester 2

## Setup on `Windows`.

* Install [apache-maven-3.3.9-bin.zip](http://www.mirrorservice.org/sites/ftp.apache.org/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.zip)
* * Java: `JAVA_HOME` should point to `C:\Program Files\Java\jdk-version`.
* * Maven: `PATH` should have `;path/to/apache-maven-3.3.9/` appended to the end.
* Intall [NodeJS + NPM](https://nodejs.org/en/) 

## Database
I used USBwebserver to create database, download available here: http://www.usbwebserver.net/en/download.php

Settings for USBWebserver:
Root dir: {path}/root
Port apache: 8888
Port MySQL: 3300

To intall the database:
1. login to USBWebserver's PHPMyAdmin page
2. on the tabs on top of the admin page, click on "Databases" and create a new database called "Staff".
3. after creating the "staff" database, inside the database, click on "import" option and import the "staff.sql" file provided in the "Database" folder of this project.



## Running
The project should compile and run by simply running `mvn spring-boot:run -X`. 
