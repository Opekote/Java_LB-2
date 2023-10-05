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

The `LibraryTest` class contains a set of JUnit test cases that validate the functionality of the library management system. These test cases ensure that the various components of the system work as expected, including registering patrons, lending and returning items, and managing the library's collection of items.

1. **`testRegisterPatron()`**: This test case verifies the functionality of the `registerPatron(Patron)` method in the `Library` class. It checks whether a patron can be successfully registered with the library and confirms that the library's list of patrons contains the registered patron.

2. **`testLendItem()`**: This test case focuses on lending an item to a patron. It first registers a patron, adds an item to the library's collection, and then attempts to lend that item to the patron. The test checks whether the patron's list of borrowed items contains the lent item and whether the item's `isBorrowed` status is correctly updated.

3. **`testReturnItem()`**: This test case validates the functionality of returning an item. It registers a patron, lends an item to the patron, and then attempts to return the item. The test ensures that the item is removed from the patron's list of borrowed items, and its `isBorrowed` status is updated accordingly.

4. **`testAddItemToLibrary()`**: This test case tests the addition of an item to the library's collection. It adds an item to the library and verifies that the library's list of items contains the newly added item.

5. **`testRemoveItemFromLibrary()`**: This test case checks the removal of an item from the library. It adds an item to the library, removes the same item, and ensures that the library's list of items no longer contains the removed item.

These test cases cover essential scenarios and interactions within the library management system, ensuring that it functions correctly. They help in identifying any issues or bugs in the code, providing confidence in the reliability and accuracy of the system's operations. Additionally, these tests can be expanded and customized to cover more specific use cases and edge scenarios as needed.

- Contains JUnit test cases to validate the functionality of the library management system.

## Additional Notes
- The code follows object-oriented principles, encapsulation, and abstraction to model a basic library management system.
