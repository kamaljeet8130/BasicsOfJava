package basic;

import java.util.TreeSet;

public class integerTreeSetIntoNaturalSortingOrderAsscendingOrder {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        for (int i = 0;i<10;i++){
            treeSet.add((int)(Math.random()*20+1));
        }
        System.out.println(treeSet);
    }

}

// not using comparator argument in TreeSet constructor::
