package curriculum_1_29_B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrefecturesService {
	
	public static class Prefecture {
		// フィールド
		String prefectureName;
		String capital;
		double area;
	
		// コンストラクタ
		public Prefecture(String prefectureName, String capital, double area) {
			this.prefectureName = prefectureName;
			this.capital = capital;
			this.area = area;
		}
		
		// ゲッター
		public String getPrefectureName() {
			return prefectureName;
		}
		
		public String getCapital() {
			return capital;
		}
		
		public double getArea() {
			return area;
		}
		
		//テンプレート
		public void template() {
			System.out.println("都道府県：" + prefectureName);
			System.out.println("県庁所在地：" + capital);
			System.out.println("面積" + area + "km2");
			System.out.println();
		}
	}
	
	// リストの宣言 >>Prefecture型 >>(String prefectureName, String capital, double area)
	private List<Prefecture> prefecturesList;
	
	public PrefecturesService() {
		// インスタンスの作成
		prefecturesList = new ArrayList<>();
		// リストの中身を追加
		prefecturesList.add(new Prefecture("北海道", "札幌市", 83424));
		prefecturesList.add(new Prefecture("青森県", "青森市", 9646));
		prefecturesList.add(new Prefecture("岩手県", "盛岡市", 15275));
		prefecturesList.add(new Prefecture("宮城県", "仙台市", 7282));
		prefecturesList.add(new Prefecture("秋田県", "秋田市", 11638));
		prefecturesList.add(new Prefecture("山形県", "山形市", 9323));
		prefecturesList.add(new Prefecture("福島県", "福島市", 13784));
		prefecturesList.add(new Prefecture("茨城県", "水戸市", 6097));
		prefecturesList.add(new Prefecture("栃木県", "宇都宮市", 6408));
		prefecturesList.add(new Prefecture("群馬県", "前橋市", 6362));
		prefecturesList.add(new Prefecture("埼玉県", "さいたま市", 3798));
	}
	
	public List<Prefecture> getSelectedPrefectures(List<Integer> keyNumbers, boolean asc) {
		// 入力された番号群を
		if (asc) {
			Collections.sort(keyNumbers);
		} else {
			keyNumbers.sort(Collections.reverseOrder());
		}
		
		List<Prefecture> result = new ArrayList<>();
		for (int i : keyNumbers) {
			if (i >=0 && i < prefecturesList.size()) {
				result.add(prefecturesList.get(i));
			}
		}
		return result;
	}
	
	// 入力文字列から番号リストと昇順/降順のフラグを抽出
	public static class SelectionResult {
	    public List<Integer> indices;
	    public boolean asc;

	    public SelectionResult(List<Integer> indices, boolean asc) {
	        this.indices = indices;
	        this.asc = asc;
	    }
	}
	
	//入力された文字列を分けて昇順降順デフォルトで分岐
	public SelectionResult parseInput(String input) {
		// 入力された文字列の分解
		String[] parts = input.split(",");
		List<Integer> selectedKeyNumbers = new ArrayList<>();
		// デフォルトをtrue「昇順」とする
		boolean asc = true;

		// 最後の文字列が「昇順」ならtrue
		String last = parts[parts.length - 1];
		if (last.equals("昇順")) {
			asc = true;
			// parts配列を最後の文字列「昇順」以外をint型に変換
			for (int i = 0; i < parts.length - 1; i++) {
				selectedKeyNumbers.add(Integer.parseInt(parts[i]));
			}
		} else if (last.equals("降順")) {
			asc = false;
			for (int i = 0; i < parts.length - 1; i++) {
				selectedKeyNumbers.add(Integer.parseInt(parts[i]));
			}
		} else {
			// 昇順降順の文字列がない場合
			for (int i = 0; i < parts.length; i++) {
				selectedKeyNumbers.add(Integer.parseInt(parts[i]));
			}
		}
	    return new SelectionResult(selectedKeyNumbers, asc);
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
