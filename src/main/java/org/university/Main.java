package org.university;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Choose an option.\n1. Add book to library\n2. Add DVD to library\n3. Remove Book from library\n4. Remove DVD from library\n5. Register patron\n6.Lend item\n7. Return item\n8. Show all available items\n9. Show all borrowed items and their patrons");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.println("Enter author and title");
                    library.add(new Book(scanner.nextLine(), scanner.nextLine(),Item.generateUniqueID()));
                    scanner.nextLine();
                }
                case 2 -> {
                    System.out.println("Enter duration and title");
                    library.add(new DVD(scanner.nextInt(), scanner.nextLine(),Item.generateUniqueID()));
                    scanner.nextLine();
                }
                case 3 -> {
                    System.out.println("Enter title to delete");
                    String bookTitleNameToFound =  scanner.nextLine();
                        try{
                            Item foundBook = library.getItems().stream()
                                    .filter(book -> book.getTitle().equals(bookTitleNameToFound))
                                    .findFirst()
                                    .orElseThrow(() -> new IllegalArgumentException("No a such book with title ->" + bookTitleNameToFound));
                            library.remove(foundBook);
                            System.out.println("Your book was successfully removed!");


                        }
                        catch (IllegalArgumentException ex){
                            System.err.println(ex.getMessage());

                        }


                    }
                case 4 -> {
                    System.out.println("Enter title to delete");
                    String dvdTitleNameToFound =  scanner.nextLine();
                    try{
                        Item foundDVD = library.getItems().stream()
                                .filter(dvd -> dvd.getTitle().equals(dvdTitleNameToFound))
                                .findFirst()
                                .orElseThrow(() -> new IllegalArgumentException("No a such DVD with title ->" + dvdTitleNameToFound));
                        library.remove(foundDVD);
                        System.out.println("Your DVD was successfully removed!");


                    }
                    catch (IllegalArgumentException ex){
                        System.err.println(ex.getMessage());

                    }
                }
                case 5 ->{
                    System.out.println("Enter name of patron");
                    library.registerPatron(new Patron(scanner.nextLine(),Patron.generateRandomID()));

                }
                case 6 -> {
                    return;
                }
                default -> System.out.println("Invalid option.Choose another");
                }

            }
        }
    }

