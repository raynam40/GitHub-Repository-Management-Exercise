import java.io.*;
import java.io.File;
import java.util.*;
/**
 *      The program prints the amount of characters, lines, words, and file length when the user types the file name.
 *
 *      Date Last Modified: 09/11/23
 *      @author Rayna Miller
 *
 *      CS1122, Fall 2023
 *      Lab Section 1
 */
public class FileStats {
        public static void main(String[] args)  {
                while(true) {
                        try {
                                Scanner console = new Scanner(System.in);
                                System.out.print("Enter a filename: ");
                                String inputFileName = console.next();

                                File inputFile = new File(inputFileName);       //Creates a File object called inputFile
                                Scanner word = new Scanner(inputFile);          //Construct Scanner object word for reading
                                Scanner line = new Scanner(inputFile);          //Construct Scanner object line for reading
                                Scanner character = new Scanner(inputFile);     //Construct Scanner object character for reading

                                int characters_count = 0;                       //Starting count of characters.
                                int words_count = 0;                            //Starting count of words
                                int lines_count = 0;                            //Starting count of lines

                                character.useDelimiter("");
                                while (character.hasNext()) {
                                        character.next();
                                        characters_count++;
                                }
                                while (word.hasNext()) {
                                        word.next();
                                        words_count++;

                                }
                                while (line.hasNextLine()) {
                                        line.nextLine();
                                        lines_count++;
                                }
                                System.out.println("characters = " + characters_count);
                                System.out.println("words = " + words_count);
                                System.out.println("lines = " + lines_count);
                                System.out.println("file length = " + inputFile.length());
                                word.close();
                                line.close();
                                character.close();
                                return;
                        }

                        catch (FileNotFoundException e) {

                                System.out.println("File not found. Try again.");

                        }

                }
        }
}


