package crackingthecodinginterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by dinuk on 12/27/2016.
 */
public class HashTableRansomeNote {

    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public HashTableRansomeNote(String magazine, String note) {
        magazineMap = new HashMap();
        noteMap = new HashMap();
        String[] magazineWords = magazine.split(" ");
        for(String wordInMagazine:magazineWords){
            if(magazineMap.containsKey(wordInMagazine)){
                int count = magazineMap.get(wordInMagazine);
                count++;
                magazineMap.put(wordInMagazine,count);
            }else{
                magazineMap.put(wordInMagazine,1);
            }
        }

        String[] noteWords = note.split(" ");
        for(String wordInNote:noteWords){
            if(noteMap.containsKey(wordInNote)){
                int count = noteMap.get(wordInNote);
                count++;
                noteMap.put(wordInNote,count);
            }else{
                noteMap.put(wordInNote,1);
            }
        }
    }

    public boolean solve() {
        for(String word:noteMap.keySet()){
            if(magazineMap.containsKey(word)== false){
                return false;
            }
            if(noteMap.get(word) > magazineMap.get(word)){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        HashTableRansomeNote s = new HashTableRansomeNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}
