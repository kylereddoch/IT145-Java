import java.util.Scanner;

public class NameSong {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        String userName;
        String songVerse;

        userName = scnr.nextLine();
        userName = userName.substring(1); // Remove first character

        songVerse = scnr.nextLine();

        // Modify songVerse to replace (Name) with userName without first character

        songVerse = songVerse.replace("(Name)", userName);

        System.out.println(songVerse);
    }
}