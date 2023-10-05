# Library Management System

This Java code implements a simple library management system with the following classes and interfaces:

## `Item` (Abstract Class)
- Attributes:
    - `title`: String
    - `uniqueID`: String (unique for each item)
    - `isBorrowed`: boolean (default false)
- Methods:
    - Constructors, getters, setters
    - `abstract void borrowItem()`: Marks the item as borrowed.
    - `abstract void returnItem()`: Marks the item as not borrowed.

## `Book` (implements `Item`)
- Attributes:
    - `author`: String
- Methods:
    - `borrowItem()`: Implements the abstract method from `Item`.
    - `returnItem()`: Implements the abstract method from `Item`.

## `DVD` (implements `Item`)
- Attributes:
    - `duration`: int (minutes)
- Methods:
    - `borrowItem()`: Implements the abstract method from `Item`.
    - `returnItem()`: Implements the abstract method from `Item`.

## `Patron`
- Attributes:
    - `name`: String
    - `ID`: String (unique for each patron)
    - `borrowedItems`: List<Item>
- Methods:
    - Constructors, getters, setters
    - `borrow(Item)`: Adds an item to the patron's borrowed list.
    - `return(Item)`: Removes an item from the patron's borrowed list.

## `IManageable` (Interface)
- Methods:
    - `add(Item)`: Adds an item.
    - `remove(Item)`: Removes an item.
    - `listAvailable()`: Lists all available items.
    - `listBorrowed()`: Lists all borrowed items.

## `Library` (implements `IManageable`)
- Attributes:
    - `items`: List<Item> (to store all items)
    - `patrons`: List<Patron> (to store all registered patrons)
- Methods:
    - `registerPatron(Patron)`: Registers a new patron.
    - `lendItem(Patron, Item)`: Lends an item to a patron.
    - `returnItem(Patron, Item)`: Returns a borrowed item.
    - `add(Item)`: Adds an item to the library.
    - `remove(Item)`: Removes an item from the library.
    - `listAvailable()`: Lists all available items in the library.
    - `listBorrowed()`: Lists all borrowed items from the library.

## Test Cases (`LibraryTest`)
- Contains JUnit test cases to validate the functionality of the library management system.

## Additional Notes
- The code follows object-oriented principles, encapsulation, and abstraction to model a basic library management system.
