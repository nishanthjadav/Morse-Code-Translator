import java.util.*;
public class Main
{
    public static void morseToEnglish(String[] code, String morseCode)
    {
        String[] array = morseCode.split(" ");
        System.out.print("Morse code " + morseCode + " to English: ");

        // Morse code to English
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < code.length; j++)
            {
                if (array[i].equals("/") && j == code.length - 1)
                {
                    System.out.print(" ");
                    break;
                }

                if (array[i].compareTo(code[j]) == 0)
                {
                    System.out.print((char)(j + 'a'));
                    break;
                }
            }
        }
    }
    public static void englishToMorse(String[] code, String englishLang, char[] letter)
    {
        System.out.print("Morse code of " + " ' " + englishLang + " '" + " is ");
        for (int i = 0; i < englishLang.length(); i++)
        {
            for (int j = 0; j < letter.length; j++)
            {
                if (englishLang.charAt(i) == letter[j])
                {
                    System.out.print(code[j] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
        String[] code = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "|", "/"};

        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.print("Enter 0 for Morse Code to English, Enter 1 for English to Morse Code: ");
        choice = scanner.nextInt();
        scanner.nextLine(); 
        if (choice == 0)
        {
            System.out.print("Enter the Morse Code you wish to translate, include spaces: ");
            String text = scanner.nextLine();
            morseToEnglish(code, text);
        } else if (choice == 1) {
            System.out.print("Enter the English you wish to translate, all lowercase: ");
            String text = scanner.nextLine();
            englishToMorse(code, text, letter);
        } else {
            System.out.print("Invalid choice. Please enter 0 or 1.");
        }
    }
}