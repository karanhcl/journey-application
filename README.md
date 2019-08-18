Prerequisite:

Java JRE version 1.8 installed.
Maven plugin and mysql software should be present or installed.

How to run application?

Build program with maven command using ## mvn clean install ##.
Program start from journey application class run from IDE or run with ##JAVA -jar demo-0.0.1-SNAPSHOT.jar##.

Application brief:

Program supports api's to add customer and journey details, I have used two seperate api classes for same purpose.
Follow modular programming approach as per requirement.
I have placed two input request json, one for customer details and other is for journey details. 


Request JSON:
All request JSON is present inside same directory.

Request URI:
please have look on request URI in JAVA api package for more information.

/bookingdata/customer/list (get request, to fetch customer details)
/bookingdata/customer (post request, customer-request json object, to add customer details)

/bookingdata/journey/list (get request, to fetch journey details)
/bookingdata/journey (post request, journey-request json object, to add journey details)
