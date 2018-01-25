# SpringBootJavascript

Build du projet : gradlew build    ou ./gradlew build    sous Linux

Convertion du projet en un projet Eclispe : gradlew eclipse    ou ./gradlew eclipse    sous Linux

Importation du projet sous Eclipse : File -> Import -> General -> Existing project into Workspace

Le main est : https://github.com/charroux/SpringJavascript/blob/master/src/main/java/com/rentingService/CarsRentingApplication.java

Lancer ce main en tant que Java application

Dans un navigateur : http://localhost:8080/static/index.html

Fonctionnement du projet :

  - la page d'accueil contient un menu https://github.com/charroux/SpringJavascript/blob/master/src/main/webapp/static/index.html
  
  - le menu redirige vers deux pages :
    https://github.com/charroux/SpringJavascript/blob/master/src/main/webapp/static/createCar.html
    https://github.com/charroux/SpringJavascript/blob/master/src/main/webapp/static/listCars.html
  
  - la première page contient un formulaire HTML, et une fonction Javascript qui fait une requête Ajax HTTP POST vers le web service (https://github.com/charroux/SpringJavascript/blob/master/src/main/java/com/rentingService/CarRentingController.java) 
  
  - la deuxième page HTML appelle une fontion Javascript dès l'affichage de la page (https://github.com/charroux/SpringJavascript/blob/master/src/main/webapp/static/listCars.html). Cette fonction fait une requête Ajax HTTP GET vers le web service.

Travail à faire  :

  - créer une page  HTML et le controller associé qui permet (via un HTTP Delete) de supprimer une voiture retrouvée à partir de sa plaque d'immatriculation.
  - créer uene page HTML et le controller associé qui permet de modifier (via un HTTP Put) une voiture
