package ClassActivity;

public class Spider {

    public static void main(String[] args) {
        int[][] spiderBoard = new int[20][20];

        int a = 0;
        int b = spiderBoard.length - 1;
        for (int i = 0; i < spiderBoard.length; i++) {
            spiderBoard[i][b] = 1;
            spiderBoard[i][a] = 1;
            a++;
            b--;
        }

        for (int[] Legs : spiderBoard) {
            for (int aLeg : Legs) {
                System.out.print(aLeg);
            }
            System.out.println();
        }

        for (int[] Legs : spiderBoard) {
            for (int aLeg : Legs) {
                if (aLeg == 1) System.out.print("+*+");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
