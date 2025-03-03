package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
		// 問1 ログイン時の入力チェックシステムを下記条件で作成してください
		
		// ・コンソールにユーザー名を入力できるようにする
		Scanner scanner = new Scanner(System.in);
		String username;
		
		System.out.println("「名前を入力してください」 ");
		
		while (true) {
			 username = scanner.nextLine();
			
			// ・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力する
	        if (username == null || username.isEmpty()) {
	        	System.out.println("「名前を入力してください」");
	        }
	        // ・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力する
	        else if (username.length() > 10) {
	        	System.out.println("「名前を10文字以内にしてください」");
	        }
	        // 問2 ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力する
	        else if (!username.matches("[a-zA-Z0-9]+")) {
	        	System.out.println("「半角英数字のみで名前を入力してください」");
	        }
	        // ・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力する
	        else {
	            System.out.println("ユーザー名「" + username + "」を登録しました");
	            System.out.println("");
	            break;
	        }
		}
		
		// 問3 じゃんけんのシステムを下記の条件で作成してください
		String[] hands = {"グー", "チョキ", "パー"};
		
		int[][] results = {
				{0,1,2},
				{2,0,1},
				{1,2,0}
		};
		
		int count = 0;
		
		while (true) {
			int playerHand = (int) Math.floor(Math.random() * 3);
			int cpuHand = (int) Math.floor(Math.random() * 3);
			count++;
			
			// プレイヤーとCPUの手を表示
			System.out.println(username + "の手は「" + hands[playerHand] + "」");
			System.out.println("相手の手は「" + hands[cpuHand] + "」");
			System.out.println("");
			
            // 2次元配列
            int result = results[playerHand][cpuHand];
            
            if (result == 0) { //あいこ
            	System.out.println("DRAW あいこ もう一回しましょう！");
            	System.out.println("");
            } else if (result == 2) { // プレイヤーの負け
                System.out.println("俺の勝ち！");
                if (cpuHand == 0) {
                    System.out.println("負けは次につながるチャンスです！");
                    System.out.println("ネバーギブアップ！");
                    System.out.println("");
                } else if (cpuHand == 1) {
                    System.out.println("たかがじゃんけん、そう思ってないですか？");
                    System.out.println("それやったら次も、俺が勝ちますよ");
                    System.out.println("");
                } else {
                    System.out.println("なんで負けたか、明日まで考えといてください。");
                    System.out.println("そしたら何かが見えてくるはずです");
                    System.out.println("");
                }
            } else { // プレイヤーの勝ち
                System.out.println("やるやん。");
                System.out.println("次は俺にリベンジさせて");
                System.out.println("");
                break; // 勝ったらループ終了
            }
            
		}
		// 試行回数を表示
        System.out.println("勝つまでにかかった合計回数は " + count + " 回です");
		scanner.close();
	}
}
