package crackingthecodinginterview;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by dinu on 12/30/16.
 */
public class TriesContacts {
    static TrieNode trieRoot;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add")){
                addToTrie(contact);
            }else{
                int no = findFromTrie(contact);
                System.out.println(no);
            }
        }
    }

    public static void addToTrie(String contact){
        if(contact == null||contact.isEmpty()){
            return;
        }
        TrieNode iterator = trieRoot;
        if(iterator == null){
            iterator = new TrieNode();
            iterator.contactCount++;
            trieRoot = iterator;
            for(int i =0; i < contact.length(); i ++){
                TrieNode current = new TrieNode();
                current.contactCount++;
                iterator.children.put(contact.charAt(i),current);
                iterator = current;
            }
            TrieNode end = new TrieNode();
            end.isComplete =true;
            iterator.children.put('\b',end);
        }else{
            for(int i =0; i < contact.length(); i ++){
                if(iterator.children.containsKey(contact.charAt(i))){
                    iterator.contactCount++;
                    iterator = iterator.children.get(contact.charAt(i));
                }else{
                    iterator.contactCount++;
                    TrieNode current = new TrieNode();
                    iterator.children.put(contact.charAt(i),current);
                    iterator = current;
                }

            }
            TrieNode end = new TrieNode();
            end.isComplete =true;
            iterator.contactCount++;
            iterator.children.put('\b',end);
        }
    }

    public static int findFromTrie(String prefix){
        if(trieRoot == null){
            return 0;
        }
        TrieNode iterator = trieRoot;
        for(int i = 0; i < prefix.length(); i++){
            if(iterator.children.containsKey(prefix.charAt(i))){
                iterator = iterator.children.get(prefix.charAt(i));
            }else{
                return 0;
            }
        }
        return iterator.contactCount;

    }

}

class TrieNode{
    HashMap<Character,TrieNode> children;
    boolean isComplete;
    int contactCount;

    public TrieNode(){
        children = new HashMap<>();
        contactCount = 0;
    }

}
