package curriculum_1_18;

public class Curriculum_1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void qes1 (String text, int numbers) {
		System.out.println(text + " " + numbers);
	}
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void qes2 (int num1, int num2) {
		int num = num1 * num2;
		System.out.println(num);
	}
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void qes3 (int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void qes2 (double num1, double num2) {
		double num = num1 + num2;
		System.out.println(num);
	}
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] qes5 (int number) {
		int[] numbers = new int[number];
		
		for(int i = 0; i < number; i++) {
			int random = (int) Math.floor(Math.random() * 100) + 1;
			numbers[i] = random;
			System.out.println(numbers[i]);
		}
		return numbers;
		
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double qes6 (int[] numbers) {
		double sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		double ave = sum / numbers.length;
		System.out.printf("平均値: %.2f\n", ave);
		return ave;
	}
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static void qes7(double ave) {
		boolean result = false;
		
		if(ave >= 50) {
			result = true;
		} else {
			result = false;
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
		qes1("Hello JavaSE", 11);
		System.out.println();
		
		qes2(5, 20);
		System.out.println();
		
		int[] numbers = {1, 2, 3, 4, 5, 6};
		qes3(numbers);
		System.out.println();
		
		qes2(5.0, 20.0);
		System.out.println();
		
		int[] numbers2 = qes5(5);
		System.out.println();
		
		double ave = qes6(numbers2);
		System.out.println();
		
		qes7(ave);
	}
}