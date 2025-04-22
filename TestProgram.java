import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Borrowable> libraryResources = new ArrayList<>();
        libraryResources.add(new Book("To Kill a Mockingbird"));
        libraryResources.add(new Book("The Hunger Games"));
        libraryResources.add(new Book("Catching Fire"));
        libraryResources.add(new Book("Mockingjay"));
        libraryResources.add(new Journal("The Diary of a Young Girl"));
        libraryResources.add(new Journal("The Journals of Sylvia Plath"));
        libraryResources.add(new Journal("The Reagan Diaries"));
        libraryResources.add(new AudioBook("Becoming - Audiobook"));
        libraryResources.add(new AudioBook("The Midnight Library - Audiobook"));
        libraryResources.add(new AudioBook("Pride and Prejudice - Audiobook"));


        System.out.print("\nStudent name: ");
        String studentName = scanner.nextLine();

        System.out.print("Student ID: ");
        int studentID = scanner.nextInt();
        scanner.nextLine(); 

        Student student = new Student(studentName, studentID);

        System.out.println("\nAvailable resources in the library:");
        for (int i = 0; i < libraryResources.size(); i++) {
            System.out.println((i + 1) + ". " + libraryResources.get(i).getTitle());
        }

        System.out.print("\nWhat are you borrowing? (Enter number) ");
        int choice = scanner.nextInt();

        Borrowable chosen = libraryResources.get(choice - 1);

        System.out.println("\nProcessing borrow...");
        student.borrow(chosen);

        System.out.println("\nStudent borrowing: " + studentName + " (" + studentID + ")");
        System.out.println("Borrowed: " + chosen);

        // Test adding another new resource
        Borrowable eJournal = new Journal("Journal of Interdisciplinary Perspectives");
        libraryResources.add(eJournal);
        System.out.println("\nAdded a new resource type: " + eJournal.getTitle());
        student.borrow(eJournal);

        scanner.close();
    }
}