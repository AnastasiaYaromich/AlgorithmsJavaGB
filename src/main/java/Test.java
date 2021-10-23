import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int treeIsBalansed = 0;
        int treeIsntBalanced = 0;
        List<TreeImpl<Integer>> list = new ArrayList<TreeImpl<Integer>>();
        for (int i = 0; i < 20; i++) {
            list.add(new TreeImpl<>());
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < 16; j++) {
                list.get(i).add(random.nextInt(50) - 25);
            }
            list.get(i).display();
            if (TreeImpl.isBalanced(list.get(i).getRoot())) {
                treeIsBalansed++;
            } else {
                treeIsntBalanced++;
            }
        }
        System.out.println("Число сбалансированных деревьев: " + treeIsBalansed);
        System.out.println("Число несбалансированных деревьев: " + treeIsntBalanced);
    }
        
}
