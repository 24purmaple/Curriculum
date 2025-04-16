package curriculum_1_29_A;

import java.util.List;
import java.util.Scanner;

import curriculum_1_29_B.PrefecturesService;
import curriculum_1_29_B.PrefecturesService.Prefecture;
import curriculum_1_29_B.PrefecturesService.SelectionResult;

public class PrefecturesPrinter {
	// メインメソッド
	public static void main(String[] args) {
		
		// 文字の入力
		Scanner scanner = new Scanner(System.in);
		PrefecturesService service = new PrefecturesService();
		
		System.out.println("コンソールに数字と昇順・降順の値を入力してください");
		String input = scanner.nextLine();
		
		SelectionResult result = service.parseInput(input);
		
		// 指定された都道府県を取得、出力
		List<Prefecture> selected = service.getSelectedPrefectures(result.indices, result.asc);
		for (Prefecture p : selected) {
			p.template();
		}
		scanner.close();
	}
}
/*
	
	0, "北海道:札幌市:83424"
1, "青森県:青森市:9646"
2, "岩手県:盛岡市:15275"
3, "宮城県:仙台市:7282"
4, "秋田県:秋田市:11638"
5, "山形県:山形市:9323"
6, "福島県:福島市:13784"
7, "茨城県:水戸市:6097"
8, "栃木県:宇都宮市:6408"
9, "群馬県:前橋市:6362"
10, "埼玉県:さいたま市:3798"
	
	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
	都道府県がソートされてコンソールに出力されるように作ってください
	※Packageを2つ作ってください
	※複数選択できるようにしてください
	
	例:
	8,5,9,.....
	と入力された場合（昇順）
	
	都道府県名：山形県
県庁所在地：山形市
面積：9323.0km2
	
	都道府県名：栃木県
県庁所在地：宇都宮市
面積：6408.0km2

	都道府県名：群馬県
県庁所在地：前橋市
面積：6362.0km2

*/
