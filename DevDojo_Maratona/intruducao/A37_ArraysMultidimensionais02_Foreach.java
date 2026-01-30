package DevDojo_Maratona;

public class A37_ArraysMultidimensionais02_Foreach {
    static void main(String[] args) {
        int[][] dias = new int[3][3];

        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;

        dias[1][0] = 4;
        dias[1][1] = 5;
        dias[1][2] = 6;

        dias[2][0] = 7;
        dias[2][1] = 8;
        dias[2][2] = 9;

        for(int[] base : dias){
            for (int num : base){
                System.out.println(num);
            }
        }
    }
}
