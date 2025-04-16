package curriculum_1_27;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Animal {
	//フィールド
	String animalName;
	double bodyLength;
	int speed;
	String scientificName;
	
	//コンストラクタ
	public Animal(String animalName, double bodyLength, int speed, String scientificName) {
		this.animalName = animalName;
		this.bodyLength =bodyLength;
		this.speed = speed;
		this.scientificName = scientificName;
	}
	
	// テンプレート
	public void templates() {
		System.out.println("動物名：" + animalName);
		System.out.println("体長：" + bodyLength + "m");
		System.out.println("速度：" + speed + "km/h");
		System.out.println("学名：" + scientificName);
		System.out.println();
	}
	
	// メインメソッド
	public static void main(String[] args) {
		// mapで動物名をキーとして、学名を出す >>動物名が～～の場合、学名は～～である
		Map<String, String> nameMap = new HashMap<>();
		nameMap.put("ライオン", "パンテラ レオ");
		nameMap.put("ゾウ", "ロキソドンタ・サイクロティス");
		nameMap.put("パンダ", "アイルロポダ・メラノレウカ");
		nameMap.put("チンパンジー", "パン・トゥログロディテス");
		nameMap.put("シマウマ", "チャップマンシマウマ");
		
		// 文字の入力
		Scanner scanner = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");
		String input = scanner.nextLine();
		
		// 文字の分割（動物毎に）配列に仮格納
		String[] animalDataArray = input.split(",");
		
		// 分割後、動物の各データを定義
		for (String animalData : animalDataArray) {
			String[] details = animalData.split(":");
			String animalName = details[0];
			double bodyLength = Double.parseDouble(details[1]);
			int speed = Integer.parseInt(details[2]);
			
			// 学名の宣言、並びに定義 >>デフォルト（マップにない）の場合、「不明」がでる
			String scientificName = nameMap.getOrDefault(animalName, "不明");
				
			// 定義したデータをanimalに格納
			// テンプレートによる文字起こし
			Animal animal = new Animal(animalName, bodyLength, speed, scientificName);
			animal.templates();
		}
		scanner.close();
	}
}


/*
	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	
	コンソール出力結果
	
	コンソールに文字を入力してください
	動物名：ライオン
体長：2.1m
速度：80km/h
学名：パンテラ レオ

動物名：ゾウ
体長：3.2m
速度：40km/h
学名：ロキソドンタ・サイクロティス

動物名：パンダ
体長：1.9m
速度：30km/h
学名：アイルロポダ・メラノレウカ

動物名：チンパンジー
体長：0.94m
速度：25km/h
学名：パン・トゥログロディテス

動物名：シマウマ
体長：2.4m
速度：65km/h
学名：チャップマンシマウマ

動物名：インコ
体長：0.1m
速度：50km/h
学名：不明


*/