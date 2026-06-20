class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> rez = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            if (words[i].indexOf(x) != -1) {
                rez.add(i);
            }
        }

        return rez;
    }
}
