package curriculum_1_25_A;

import java.util.Scanner;

import curriculum_1_25_B.SubClass;

public class Main {
	public static void main(String[] args) {
	// 名前の入力
	Scanner scanner = new Scanner(System.in);
	System.out.print("名前の入力：");
	String characterName = scanner.nextLine();
	
	// インスタンスの作成、文面表示、インスタンスからメソッドの呼び出し
	SubClass character = new SubClass(characterName);
	System.out.println("こんにちは「" + characterName + "」さん");
	
	character.displayStatus();
	
	scanner.close();;
	}
}
/*

名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

*/