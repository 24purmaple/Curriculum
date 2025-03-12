package curriculum_1_22_B;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ForProcessing {
	// 条件2 フィールド
	private String message1;
	private String message2;
	private String message3;
	private String message4;
	
	public ForProcessing() {
		// 条件3 コンストラクタ
		this.message1 = "こんにちは！ここは日本です！";
		this.message2 = "この寿司はうまい";
		this.message3 = "寿司は和食です";
		
		// 条件4 日時
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		this.message4 = "今の現在日時は" + format.format(date) + "です";
	}
	
	// ディスプレイに表示させるためのメソッド
	public void displayMessage() {
		System.out.println(message1);
		System.out.println(message2);
		System.out.println(message3);
		System.out.println(message4);
	}
}
/*

下記がコンソールに出力されるように作成してください

	こんにちは！ここは日本です！
	この寿司はうまい
	寿司は和食です
	今の現在日時は2023/03/09 10:23:39です

【条件】
	・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
	・適切なファイルにフィールドで変数を必要な数作ってください。
	・thisを使って作成してください。
	・日時は今日の日付を取得してください。
	
*/