# About Spatial Application
 * The goal of this application is to develop a natural language generation model which can learn describing interconnected venues of a building complex in natural language. A sample of current output is:
> This building's total size is: 85.0 with total capacity of 27 people  and energy consumption of 470.0 Kilowatts. Here are the details per sub-venues: One Kitchen of size 12.0 with the capacity of 5 that consumes 100.0 kilowatt per hour. It incorporates the following equipments:  microwave,  refrigerator,  table, One BathRoom of size 6.0 with the capacity of 1 that consumes 30.0 kilowatt per hour. It incorporates the following equipments:  mirror,  soap, One BathRoom of size 7.0 with the capacity of 1 that consumes 40.0 kilowatt per hour. It incorporates the following equipments:  mirror,  soap,  hand dryer, One Corridor of size 60.0 with the capacity of 20 that consumes 300.0 kilowatt per hour. It incorporates the following equipments:  water dispenser, 

# Methodology
 * Taking advantage of composite design pattern pattern, each building is considered as a Composite Of venues which is presented in com.spatial.nlg.VenueComposit class. This class holds an array of Venues (com.spatial.nlg.Venue) with unique ids. Each Venue can introduce connections to other venues. com.spatial.nlg.SingletoneCvutVenueBuilder is responsible for building "Cvut" imaginary building. It models Cvut as a building with 2 bathrooms and a kitchen which are all interconnected through a corridor.  

# Dependencies, compilation and running (installation commands are for Debian-based OS)
 * Java 1.8+
```
    $ sudo sudo apt-get install openjdk-8-jdk
```
 * install Maven:
```
    $ sudo apt-get install maven
```
 * clone the project from the git repository or simply copy it to a directory such as /path/to/project    
```
    $ git clone https://github.com/donkarlo/spatialnlg
    $ cd /path/to/project/spatialnlg
    $ mvn clean install
    $ mvn compile
    $ mvn clean package
    $ java -cp target/spatial-0.1-rise.jar com.spatial.nlg.Bootstrap
 ```
