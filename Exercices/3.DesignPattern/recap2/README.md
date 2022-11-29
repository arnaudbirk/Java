# Exercice - Recap 2

## Fabrique - Singleton

L'obectif est de créer une fabrique abstraite qui va permettre de créer des véhicules (Car ou Scooter) Electrique ou à Essence à partir de 2 sous-fabriques héritant de la fabrique abstraite.

Pour information, les 2 fabriques ```ElectricFactory``` et ```GasolineFactory``` sont des singletons.

Voici le diagramme UML :

![diagramme factory](img/factory2.png)

Pout tester votre application, utilisez le code suivant :

``` java
AbstractFactory factory = AbstractFactory.getElectricFactory();
System.out.println(factory.createCar("ZoE", 25000).toString());
System.out.println(factory.createScooter("Rider", 8000).toString());

factory = AbstractFactory.getGasolineFactory();
System.out.println(factory.createCar("Hummer", 100000).toString());
System.out.println(factory.createScooter("Tmax", 5000));
```

## Decorator

A partir de la classe ```Car```, nous allons enrichir ses fonctionnalitées à l'aide du pattern decorator.

* Implémentez le pattern decorator et implémentez 2 classes ```CarWithGPS``` et ```CarWithSunRoof```. Ces 2 classes doivent étendre une classe ```CarWithOption```.

L’appel à la méthode ```toString()``` héritée de ```Car``` sur un objet de type ```CarWithGPS``` par exemple doit afficher le résultat de l’appel à ```toString()``` sur l’objet ```Car``` encapsulé dans le décorateur concaténé « OPTION : GPS (500 euros) », où 500 euros est ici un exemple de prix pour l’option GPS. Les surcoût de chaque option est défini au sein de chaque classe par une variable constante static.

* Testez votre application en créant :
  * Une voiture de base
  * Une Voiture avec l'option GPS.
  * Une Voiture avec l'option Toit ouvrant
  * Une Voiture avec toutes les options
  * Pour chaque voiture créé appelez la méthode ```toString()``` afin de contrôler le bon fonctionnement.
