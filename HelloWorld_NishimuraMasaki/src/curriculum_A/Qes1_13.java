package curriculum_A;

public class Qes1_13 {
	
	public static void main(String[] args) {
		/* 問1 下記9個をローカル変数として宣言のみしてください
		 *・バイト型・短整数型・整数型・長整数型
		 *・単精度浮動小数点数型・倍精度浮動小数点数型
		 *・文字型・文字列型
		 *・ブーリアン型
		 **/
		byte testByte;
		short testShort;
		int testInt;
		long testLong;
		float testFloat;
		double testDouble;
		char testChar;
		String testString;
		boolean testBoolean;
		
		//問2 それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		testByte = 0;
		testShort = 0;
		testInt = 0;
		testLong = 0L;
		testFloat = 0f;
		testDouble = 0.0d;
		testChar = '\u0000';
		testString = null;
		testBoolean = false;
		
		//問3 初期化をしたそれぞれの変数に下記の値を代入してください
		testByte = 10;
		testShort = 100;
		testInt = 1000;
		testLong = 10000;
		testFloat = 9.5f;
		testDouble = 10.5;
		testChar = 'a';
		testString = "ハロー";
		testBoolean = true;
		
		/*問4 下記の通りにコンソール出力されるようにしてください
		 * 	  上記で作成した変数を必ず使用すること
		 */
		System.out.println(testByte + testShort + testInt + testLong);
		System.out.println(testFloat + testDouble);
		System.out.println(testChar + " " + testString + " "+ testBoolean);
		System.out.println(testByte + testShort + testInt + testLong + testFloat + testDouble);
		System.out.println(testByte * testShort * testInt * testLong);
		System.out.println(testDouble / testShort);
		System.out.println(testByte - testShort);
		System.out.println();
		
		/*問5 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		 * 「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		 * String num="20";
		 * int num1=23;
		 * System.out.println("ハローJAVA"+(num+num1));
		 * */
		int num=20;
		int num1=23;
		
		System.out.println("ハローJAVA"+(num+num1));
		System.out.println();

		/*問6『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		 * ローカル変数に代入し○○に入れてください
		 * 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		 */
		testInt = 18;
		testFloat = 170.5f;
		testDouble = 62.2;
		testString = "山田太郎";
		
		System.out.println("初めまして" + testString + "です");
		System.out.println("年齢は" + testInt + "歳です");
		System.out.println("身長は" + testFloat + "cmです");
		System.out.println("体重は" + testDouble + "kgです");
		
		testString = "寿司";
		
		System.out.println("好きな食べ物は" + testString + "です");
		System.out.println();
		
		/*問7 6で作成した自己紹介に続いてBMIが出力されるようにしてください
		*「BMIは○○です」
		*ただし計算は数値を直書きせず、全て変数を使ってすること
		*/
		float heightInMeters = testFloat /100;
		double bmi= Math.round((testDouble/(heightInMeters * heightInMeters)) * 10) / 10.0;

		System.out.println("BMIは" + bmi  + "です");
		System.out.println();
		
		/* 問8 6で宣言した変数に再代入し下記の通りコンソールに出力してください
		 * 初めまして鈴木一郎です
		 * 年齢は24歳です
		 * 身長168.5cmです
		 * 体重は64.2kgです
		 * 好きな食べ物はオムライスです
		 * BMIは22.6です
		 * */
		testInt = 24;
		testFloat = 168.5f;
		testDouble = 64.2;
		testString = "鈴木一郎";
		
		System.out.println("初めまして" + testString + "です");
		System.out.println("年齢は" + testInt + "歳です");
		System.out.println("身長は" + testFloat + "cmです");
		System.out.println("体重は" + testDouble + "kgです");
		
		testString = "オムライス";
		
		System.out.println("好きな食べ物は" + testString + "です");
		
		heightInMeters = testFloat /100;
		bmi= Math.round((testDouble/(heightInMeters * heightInMeters)) * 10) / 10.0;

		System.out.println("BMIは" + bmi  + "です");
		System.out.println();

		/*問9 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		 * 初めまして鈴木一郎です
		 * 年齢は48歳です
		 * 身長337.0cmです
		 * 体重は128.4kgです
		 * 好きな食べ物はオムライスです
		 * BMIは11.31です
		 * */
		testInt += testInt;
		testFloat += testFloat;
		testDouble += testDouble;
		testString = "鈴木一郎";
		
		System.out.println("初めまして" + testString + "です");
		System.out.println("年齢は" + testInt + "歳です");
		System.out.println("身長は" + testFloat + "cmです");
		System.out.println("体重は" + testDouble + "kgです");
		
		testString = "オムライス";
		
		System.out.println("好きな食べ物は" + testString + "です");
		
		heightInMeters = testFloat /100;
		bmi= Math.round((testDouble/(heightInMeters * heightInMeters)) * 100) / 100.0;

		System.out.println("BMIは" + bmi  + "です");
		System.out.println();


		//問10 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		testInt = 24;
		
		System.out.println(testInt >= 25);
		System.out.println();
		
		//問11 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		
		testInt = 24;
		testFloat = 168.5f;
		testDouble = 64.2;
		
		String ageString = String.valueOf(testInt);
		String heightString = String.valueOf(testFloat);
		String weightString = String.valueOf(testDouble);
		
		System.out.println(ageString + "歳・" + heightString + "cm・" + weightString + "kg");
		System.out.println();
		
		//問12 11で変換した【年齢・身長】を整数型に変換して出力してください
		int ageInt = Integer.parseInt(ageString);
		float heightInt = Float.parseFloat(heightString);
		
		System.out.println(ageInt + "歳・" + heightInt + "cm");
		System.out.println();
		
		/*問13 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		*ただしif文は使わないでください
		*/
		System.out.println(ageInt == 25 || heightInt >= 160);
		System.out.println();
		
	}

}
