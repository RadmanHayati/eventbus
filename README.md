# EventBus Design Pattern with Kotlin and SharedFlow

This project implements the EventBus design pattern using Kotlin and SharedFlow. The EventBus design pattern is a messaging pattern that allows different components of an application to communicate with each other without being tightly coupled. It is a publish-subscribe model where publishers send messages to a central event bus, and subscribers receive those messages.

## Summary of the EventBus Design Pattern

The EventBus design pattern is a messaging pattern that allows different components of an application to communicate with each other without being tightly coupled. It is a publish-subscribe model where publishers send messages to a central event bus, and subscribers receive those messages.

The benefits of using the EventBus design pattern include:

- Decoupling: Components can communicate with each other without knowing about each other's implementation details.
- Scalability: Adding new components or changing existing ones does not affect the rest of the system.
- Flexibility: Components can subscribe to specific types of events, allowing for more targeted communication.

In this project, we use Kotlin and SharedFlow to implement the EventBus design pattern. SharedFlow is a type of flow that allows multiple subscribers to receive updates from a single publisher. This makes it ideal for implementing the publish-subscribe model of the EventBus design pattern.

To use this implementation in your own project, simply add the `EventBus.kt` file to your codebase and use it to send and receive events between components.
https://www.linkedin.com/in/radman-hayati/
