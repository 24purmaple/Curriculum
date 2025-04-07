package curriculum_1_25_B;

// クラスの継承
public class SubClass extends SuperClass {
	
	public SubClass(String name) {
		super(	name,
				getRandomNumber(),
				getRandomNumber(),
				getRandomNumber(),
				getRandomNumber(),
				getRandomNumber());
	}
	
	// ランダム数字の生成
	private static int getRandomNumber() {
		int random = (int) Math.floor(Math.random() * 1000);
		return random;
	}
}
