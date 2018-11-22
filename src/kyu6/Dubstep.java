package kyu6;

/***
 * Input
 * The input consists of a single non-empty string, consisting only of uppercase English letters, the string's length doesn't exceed 200 characters
 *
 * Output
 * Return the words of the initial song that Polycarpus used to make a dubsteb remix. Separate the words with a space.*/

public class Dubstep {

    public static String SongDecoder(String song) {
        return song.replaceAll("(WUB)+", " ").trim();
    }

    public static void main(String[] args) {
        System.out.println(SongDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB"));
    }

}
