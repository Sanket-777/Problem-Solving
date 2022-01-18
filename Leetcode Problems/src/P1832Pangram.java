public class P1832Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelaydog";
        //System.out.println(checkpangram(sentence));
        char a = 'a';
        System.out.println(a - 97);

    }
    static boolean checkpangram(String sentence)
    {
        int len = sentence.length()-1;
        int arr[] = new int[26];
        int i = 0;
        while (i <= len)
        {
            char ch = sentence.charAt(i);
            int index = Integer.valueOf(ch)-97;
            arr[index] = 1;
            i++;
        }
        for (int m:arr) {
            if (m == 0 ) {
                return false;
            }
        }
        return true;
    }
}
