# Examples Demonstrating Factory, Singleton and Strategy Design Patterns 🐉 


[![Open Source Love svg1](https://badges.frapsoft.com/os/v1/open-source.svg?v=103)](#)
[![GitHub Forks](https://img.shields.io/github/forks/harismuneer/Factory-Singleton-and-Strategy-Design-Patterns_Examples.svg?style=social&label=Fork&maxAge=2592000)](https://www.github.com/harismuneer/Factory-Singleton-and-Strategy-Design-Patterns_Examples/fork)
[![GitHub Issues](https://img.shields.io/github/issues/harismuneer/Factory-Singleton-and-Strategy-Design-Patterns_Examples.svg?style=flat&label=Issues&maxAge=2592000)](https://www.github.com/harismuneer/Factory-Singleton-and-Strategy-Design-Patterns_Examples/issues)
[![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat&label=Contributions&colorA=red&colorB=black	)](#)




To study more about Design Patterns, visit [Source Making Design Patterns](https://sourcemaking.com/design_patterns)

## Factory Method
Q1: In a ‘Drawing’ system, depending on user’s input, different pictures like square, rectangle, circle can be drawn. Here we can use factory method to create instances depending on user’s input. For adding new type of shape, no need to change client’s code. 

Q2: In travel site, we can book train ticket as well bus tickets and flight ticket. In this case user can give his travel type as ‘bus’, ‘train’ or ‘flight’.
Here we have an abstract class ‘AnyTravel’ with a static member function ‘GetObject’ which depending on user’s travel type, will create & return object of ‘BusTravel’ or ‘ TrainTravel’. ‘BusTravel’ or ‘ TrainTravel’ have common functions like passenger name, Origin, destination parameters. 


## Strategy and Singleton Patterns
Q. You are asked to develop a mobile application for a Famous Shopping Cart system.
This application has the option for the user to shop in either an online mode or in an offline mode. If the user is connected to the network, your application would fetch the product list from the server, which will be called by the NetworkManager and if the user is not connected to the server the product list will be fetched from local database using
DatabaseManager. You have a product object which contains product id, name and price.
The database manager and network manager has one method getProductList which will return array of products.

Note: You will require a global method in your main named bool checkAccessibility() it will return true if internet is connected and false if internet is not connected

Hint: Use singleton and strategy pattern.



## How to Run
1- Install these:
 * [Java SE Development Kit 8 (JDK 8)](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
 * After installing JDK 8, install [NetBeans IDE](https://netbeans.org/downloads/)

2- Open NetBeans IDE. Click on File -> Open Project and browse to the project you want to open say "Factory Method" and select it. It will load the NetBeans project. (There are basically two separate NetBeans Projects named *Factory Method* and *Strategy and Singleton Patterns*)


------

## Author
You can get in touch with me on my LinkedIn Profile: [![LinkedIn Link](https://img.shields.io/badge/Connect-harismuneer-blue.svg?logo=linkedin&longCache=true&style=social&label=Connect
)](https://www.linkedin.com/in/harismuneer)

You can also follow my GitHub Profile to stay updated about my latest projects: [![GitHub Follow](https://img.shields.io/badge/Connect-harismuneer-blue.svg?logo=Github&longCache=true&style=social&label=Follow)](https://github.com/harismuneer)

If you liked the repo then kindly support it by giving it a star ⭐!

## Contributions Welcome
[![forthebadge](https://forthebadge.com/images/badges/built-with-love.svg)](#)

If you find any bug in the code or have any improvements in mind then feel free to generate a pull request.

## Issues
[![GitHub Issues](https://img.shields.io/github/issues/harismuneer/Factory-Singleton-and-Strategy-Design-Patterns_Examples.svg?style=flat&label=Issues&maxAge=2592000)](https://www.github.com/harismuneer/Factory-Singleton-and-Strategy-Design-Patterns_Examples/issues)

If you face any issue, you can create a new issue in the Issues Tab and I will be glad to help you out.

## License
[![MIT](https://img.shields.io/cocoapods/l/AFNetworking.svg?style=style&label=License&maxAge=2592000)](../master/LICENSE)

Copyright (c) 2018-present, harismuneer                                                        
