package tp2.magicFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    //Now we want to create a program that takes a file name and prints it s content

    public static void main(String[] args) {
        System.out.println("Give me your file name :)"); //try isi as an input ;)
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        printFileContent(fileName);
    }

    //Here you have 2 methods
    // getFileContent aims to get the content of a file
    // printFileContent that prints it s content otherwise print 'file not found :/'
    // todo : implement the methods and force exception handling in the printFile method

    private static String getFileContent(String fileName) throws FileNotFoundException {

        //use the line below if you're a linux user
        //File file = new File("src/tp2/magicFile/" + fileName);

        //use the line below if you're a windows user
        File file = new File("magicFile\\" + fileName);

        //the lines below help you to get the content
        Scanner reader = new Scanner(file);
        String content = reader.nextLine();
        return content;
    }

    private static void printFileContent(String fileName) {
        String data = null;
        try {
            data = getFileContent(fileName);
            System.out.println(data);

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
    }
}
