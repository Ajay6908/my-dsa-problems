class Solution {
    public boolean doesAliceWin(String s) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        for (char ch : s.toCharArray()) {
            if (vowels.contains(ch)) {
                return true; // Alice wins if any vowel is found
            }
        }
        return false; // No vowels → Bob wins
    }
}
