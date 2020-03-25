package easy;

public class NumJewelsInStones {
    public int numJewelsInStones(String J, String S) {
        int total = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.indexOf(S.charAt(i)) > -1) {
                total ++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        NumJewelsInStones obj = new NumJewelsInStones();
        System.out.println(obj.numJewelsInStones("aA", "aAAbbbb"));
    }
}
