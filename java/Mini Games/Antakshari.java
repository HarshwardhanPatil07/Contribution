package Games;
//take word from dictionary 
//give random word to user
//make array of the words given by user
//check if the word is valid or not and satisfy the game condition
//check if the word is already used or not
//find score

//dictionary is used

import java.io.*;
import java.util.*;
public class Antakshari {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random(); // ✅ Only one Random instance
    static List<String> dictionary = new ArrayList<>();
    static Set<String> usedWords = new HashSet<>();
    static Set<Character> specialLetters = new HashSet<>();

    // ✅ No longer passing usedWords here
    public static List<String> loadDictionary(String filename) {
        List<String> dict = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String word;
            while ((word = br.readLine()) != null) {
                word = word.trim().toLowerCase();
                if (!word.isEmpty()) {
                    dict.add(word);
                }
            }
        } catch (IOException e) {
            System.out.println("Failed to load dictionary: " + e.getMessage());
        }
        return dict;
    }

    public static List<Character> getSpecialCharacters() {
        List<Character> special = new ArrayList<>();
        while (special.size() < 3) {
            char c = (char) (rand.nextInt(26) + 'a');
            if (!special.contains(c)) {
                special.add(c);
            }
        }
        return special;
    }

    public static int getWordScore(String word) {
        int score = 0;
        for (char c : word.toCharArray()) {
            if (specialLetters.contains(c)) {
                score += 3;
            } else {
                score += 1;
            }
        }
        return score;
    }

    public static String getPCWord(String prevWord) {
        for (int i = 0; i < 100; i++) { 
            String candidate = dictionary.get(rand.nextInt(dictionary.size()));
            if (!usedWords.contains(candidate)) {
                if (prevWord.equals("") || candidate.charAt(0) == prevWord.charAt(prevWord.length() - 1)) {
                    usedWords.add(candidate);
                    return candidate;
                }
            }
        }
        return ""; // No suitable word found
    }

    public static boolean isValidWord(String word, String prevWord) {
        if (!dictionary.contains(word)) {
            System.out.println("Invalid word! Not in dictionary.");
            return false;
        }
        if (usedWords.contains(word)) {
            System.out.println("Word already used! Try another.");
            return false;
        }
        if (!prevWord.equals("") && word.charAt(0) != prevWord.charAt(prevWord.length() - 1)) {
            System.out.println("Word must start with '" + prevWord.charAt(prevWord.length() - 1) + "'");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("🎮 Welcome to the world of Antakshari!");

        dictionary = loadDictionary("dictionary.txt"); 

        if (dictionary.isEmpty()) {
            System.out.println("Dictionary is empty or not found. Exiting.");
            return;
        }

        specialLetters.addAll(getSpecialCharacters());
        System.out.println("Special letters worth 3 points: " + specialLetters + "\n");

        String prevWord = "";
        int userScore = 0;
        int pcScore = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("\n--------------------- Round " + i + " ---------------------");
            System.out.print("Your turn! Enter a word: ");
            String userWord = sc.nextLine().trim().toLowerCase();

            if (!isValidWord(userWord, prevWord)) {
                System.out.println("Try again.");
                i--; // Don't advance round
                continue;
            }

            usedWords.add(userWord);
            int uScore = getWordScore(userWord);
            userScore += uScore;
            prevWord = userWord;

            System.out.println("Your word: " + userWord + " (+ " + uScore + " points) | Total: " + userScore);

            String pcWord = getPCWord(prevWord);
            if (pcWord.isEmpty()) {
                System.out.println("PC couldn't find a valid word. You win this round!");
                break;
            }

            int pcScoreAdd = getWordScore(pcWord);
            pcScore += pcScoreAdd;
            prevWord = pcWord;

            System.out.println("PC's word: " + pcWord + " (+ " + pcScoreAdd + " points) | Total: " + pcScore);
        }

        System.out.println("\n--------------------- Game Over ---------------------");
        System.out.println("Your score: " + userScore);
        System.out.println("PC score: " + pcScore);

        if (userScore > pcScore) {
            System.out.println("Congratulations! You win!");
        } else if (userScore < pcScore) {
            System.out.println("PC wins! Better luck next time.");
        } else {
            System.out.println("It's a tie!");
        }
    }
}