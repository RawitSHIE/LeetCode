package easy.KLowestInMatrix;

import java.util.*;

public class KLowestInMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            int soldier = (int) Arrays.stream(mat[i]).filter(num -> num == 1).count();
            map.put(i, soldier);
        }

        Comparator<Map.Entry<Integer, Integer>> comparator = (m1, m2) -> {
            Integer v1 = m1.getValue();
            Integer v2 = m2.getValue();
            return v1.compareTo(v2);
        };

        List<Map.Entry<Integer, Integer>> lst = new ArrayList<>(map.entrySet());
        Collections.sort(lst, comparator);
        int[] result = lst.stream().mapToInt(Map.Entry::getKey).toArray();

        return Arrays.copyOf(result, k);
    }





    public static void main(String[] args) {
        KLowestInMatrix obj = new KLowestInMatrix();
        System.out.println(Arrays.toString(obj.kWeakestRows(new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}}, 3)));
    }

}


