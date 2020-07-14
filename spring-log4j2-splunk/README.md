## Enabling Http Event Collector in Splunk
* Login to Splunk
* Go to Settings -> Data Inputs -> Http Event Collector
* Click on Global Settings
* Beside ‘All Tokens’ click on Enable Button and hit Save

## Create Data Entry for Http Event
* Go to Settings -> Add Data
* Click Monitor -> Http Event Collector
* Populate name and optional source name, description and click Next
* Select Source Type as Structured ->  _json
* Create a new Index. Enter name and click on Save.
* Select the Index from Available to Selected and click Review
* Hit Submit
* Capture the token value from last page

## Build the Code
mvn clean install

## Run the program
java -jar target/spring-log4j2-splunk-1.0.0.jar

## Validate in Splunk Search/Reporting
