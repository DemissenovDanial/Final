# Restaurant system with food ordering, payment and charging for phones
Group: SE-2206
Team members: Danial Demissenov, George Georgiev

Project Overview:

In our project, we've developed a restaurant management system that incorporates features for ordering dishes, processing payments, and offering smartphone charging options. Our main goal was to establish a comprehensive system for efficiently managing a restaurant.

Main Body:

Adapter Pattern:

We implemented two adapter classes (AdapterLightningToTypeC and AdapterTypeCToLightning) to adapt charging interfaces, ensuring compatibility between Lightning and Type-C connectors.
Decorator Pattern:

The CheeseBurgerDecorator and PizzaMargaritaDecorator classes, developed by us, apply the Decorator pattern to dynamically enhance burgers and pizzas with additional ingredients.
Observer Pattern:

We've utilized the Observer pattern in the RestaurauntGuest class, making them observers notified when a dish is ready, enhancing the customer experience.
Strategy Pattern:

The Payment class, crafted by us, utilizes the Strategy pattern to enable dynamic switching between different payment strategies (Cash and KaspiCard) based on customer preferences.
Singleton Pattern:

We ensured the Pizza and Burger classes are implemented as singletons (Pizza.INSTANCE and Burger.INSTANCE), guaranteeing a single instance for each dish to maintain consistency.
Factory Method Pattern:

The Kitchen class, developed by our team, applies the Factory Method pattern to create various types of dishes based on the DishType enum, allowing for flexible menu expansion.
Conclusion:

In conclusion, we have successfully integrated various design patterns into our restaurant management system. We encountered challenges in ensuring seamless compatibility between different charging interfaces and maintaining a clear structure for the observer and decorator patterns.

Project Outcomes:

We've achieved a fully functional restaurant system, encompassing features for ordering, payment, and smartphone charging.
Our implementation of multiple design patterns has significantly enhanced the project's maintainability and extensibility.

Future Improvements:

Enhancements to the user interface are on our agenda, with the goal of providing a more intuitive and enjoyable customer experience.

UML diagram:
![src](https://github.com/DemissenovDanial/Final/assets/123939899/ac7466e4-92e8-42d7-8b9e-339a9c0a1719)
