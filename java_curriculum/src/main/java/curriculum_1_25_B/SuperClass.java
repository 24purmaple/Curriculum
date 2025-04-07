package curriculum_1_25_B;

public class SuperClass {
	//フィールド
	private String name;
	private int hp;
	private int mp;
	private int atk;
	private int spd;
	private int def;
	
	// コンストラクタ
	public SuperClass(String name, int hp, int mp, int atk, int spd, int def) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.atk = atk;
		this.spd = spd;
		this.def = def;
	}
	
	// ゲッター
	public String getName() {
		return name;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getMp() {
		return mp;
	}
	
	public int getAtk() {
		return atk;
	}
	
	public int getSpd() {
		return spd;
	}
	
	public int getDef() {
		return def;
	}
	
	// 表示テンプレ
	public void displayStatus() {
		System.out.println("ステータス");
		System.out.println("名前：" + name);
		System.out.println("HP：" + hp);
		System.out.println("MP：" + mp);
		System.out.println("攻撃力：" + atk);
		System.out.println("素早さ：" + spd);
		System.out.println("防御力：" + def);
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");
	}
}
