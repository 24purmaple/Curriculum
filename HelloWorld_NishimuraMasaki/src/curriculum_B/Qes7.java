package curriculum_B;

import java.util.Scanner;

public class Qes7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 科目
		String[] subjects = {"英語", "数学", "理科", "社会"};
		
		// 人数
		int student;
		System.out.print("生徒の人数を入力してください（2以上）:");
		while (true) {
			student= scanner.nextInt();
			// 2以上
			if (student >= 2) {
				break;
			}
			System.out.print("生徒の人数を入力してください（2以上）:");
		}
		
		// 点数を各生徒の各教科に格納するハコの作成
		int[][] scores = new int[student][subjects.length];
		
		// i人目のjの点数の入力
		for(int i = 0; i < student; i++) {
			for(int j = 0; j < subjects.length; j++) {
				System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください:");
				while(true) {
					// ijに点数を格納
					int score = scanner.nextInt();
					//0～100まで
					if (score >= 0 && score <= 100) {
						scores[i][j] = score;
						break;
					}
					System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください:");
				}
				
			}
			System.out.println();
			
		}
		
		// 平均点の合計
		double totalSum = 0;
		
		for (int i = 0; i < student; i++) {
			// 生徒の合計点（初期化）
			double sum = 0;
			
			// 各教科の点数を加算
			for(int j = 0; j < subjects.length; j++) {
				sum += scores[i][j];
			}
			// 平均点の計算 合計点/教科
			double ave = sum / subjects.length;
			System.out.printf("%d人目の平均点は%.2f点です。\n",(i + 1), ave);
			
			// totalSumにsumを加算
			totalSum += sum;
		}
		System.out.println();
		
		// 教科の平均点
		for (int j = 0; j < subjects.length; j++) { // 行（1〜9）
			// 教科の合計点（初期化）
			double sum = 0;
            for (int i = 0; i < student; i++) { // 列（1〜9）
            	sum += scores[i][j];
            }
            // 教科の平均点 合計点/生徒人数
            double ave = sum / student;
			System.out.printf("%sの平均点は%.2f点です。\n",subjects[j], ave);
			
        }
		
		// 全体の平均点 平均点合計 / 全点数の要素数=(生徒数*教科数)
		double allAve = totalSum / (student * subjects.length);
		System.out.printf("全体の平均点は%.2f点です。\n", allAve);
		
		scanner.close();
	}

}
