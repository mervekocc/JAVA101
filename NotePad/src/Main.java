import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean hasNotes = false; // //tracker for previous notes

        System.out.println("<|><|>== WELCOME TO YOUR JAVA NOTEPAD ==<|><|>");
        System.out.println("------------------------------------------------");
        printLastSavedText();
        System.out.println("------------------------------------------------");
        try {
            FileReader noteReader = new FileReader("notepad.txt");
            BufferedReader bufferedReader = new BufferedReader(noteReader);
            String lines;

            while ((lines = bufferedReader.readLine()) != null) ;
            {
                //below line only works once due to the boolean tracker

                if (!hasNotes) {
                    System.out.println("Your note is : ");
                    hasNotes = true;
                }
                System.out.println(lines);
            }
            if (hasNotes) {
                System.out.println();
            }
            // ask note and input notepad.txt
            System.out.println("Enter your note : ");
            String text = input.nextLine();

            FileWriter notepadWriter = new FileWriter("notepad.txt", true);
            PrintWriter printWriter = new PrintWriter(notepadWriter);
            printWriter.println(text);
            System.out.println();
            System.out.println("Your note has been saved.. ");
            printWriter.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    // print notepad.txt (last saved note)
    private static void printLastSavedText() {
        try (BufferedReader reader = new BufferedReader(new FileReader("notepad.txt"))) {
            System.out.println("Last saved text:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Last saved text not found!");
        }
    }
}
