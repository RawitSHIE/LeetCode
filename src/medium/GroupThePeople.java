package medium;

import java.util.*;

public class GroupThePeople {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<List<Integer>>> groups = new HashMap<>();
        List<List<Integer>> ran = new ArrayList<>();
        int index = 0;
        for (int groupSize : groupSizes) {
            if (!groups.containsKey(groupSize)) {
                groups.put(groupSize, new ArrayList<>(new ArrayList<>()));
                List<Integer> tmp = new ArrayList<>();
                tmp.add(index);
                groups.get(groupSize).add(tmp);
            } else {
                if (groups.get(groupSize).get(groups.get(groupSize).size() - 1).size() == groupSize){
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(index);
                    groups.get(groupSize).add(tmp);
                } else {
                    groups.get(groupSize).get(groups.get(groupSize).size() - 1).add(index);
                }
            }
            index ++;
        }
        groups.forEach((i, j) -> ran.addAll(j));
        return ran;
    }

    public static void main(String[] args) {
        GroupThePeople obj = new GroupThePeople();
        System.out.println(obj.groupThePeople(new int[]{3,3,3,3,3,1,3}));
    }
}

