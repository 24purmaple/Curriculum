package curriculum_B;

public class Qes4 {
	public static void main(String[] args) {
		System.out.println("課題 4");
		System.out.println();
		
		for (int i = 1; i <= 9; i++) { // 行（1〜9）
            for (int j = 1; j <= 9; j++) { // 列（1〜9）
                // 各計算を出力（2桁にそろえる）
                System.out.printf("%02d * %02d = %02d", i, j, i * j);
                //System.out.print(i + " * " + j +  " = " + (i * j) + "||");
                if (j < 9) {
                	System.out.print(" || ");
                }
            }
            System.out.println(); // 改行（次の行へ）
        }
	}

}
