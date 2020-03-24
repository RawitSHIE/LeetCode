package easy;

import java.util.*;

public class KLowestInMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            int total = 0;
            for (Integer num : mat[i]){
                total += num;
            }
            map.put(i, total);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, mapComparator);
        int[] num = entries.stream().map(Map.Entry::getKey).mapToInt(i->i).toArray();
        return Arrays.copyOfRange(num,0, k);
    }

    Comparator<Map.Entry<Integer, Integer>> mapComparator = (e1, e2) -> {
        Integer v1 = e1.getValue();
        Integer v2 = e2.getValue();
        return v1.compareTo(v2);
    };

    public static void main(String[] args) {
        KLowestInMatrix obj = new KLowestInMatrix();
        System.out.println(Arrays.toString(obj.kWeakestRows(new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}}, 3)));
    }
}
