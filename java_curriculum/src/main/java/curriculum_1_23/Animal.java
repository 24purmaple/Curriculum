package curriculum_1_23;

public class Animal {
	//フィールド
	private String name; // 動物名
	private double bodyLength; // 体長
	private double speed; // 速度
	
	// セッター
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBodyLength(double bodyLength) {
		this.bodyLength = bodyLength;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	// ゲッター
	public String getName() {
		return this.name;
	}
	
	public double getBodyLength() {
		return this.bodyLength;
	}
	
	public double getSpeed() {
		return this.speed;
	}
	
	public static void main(String[] args) {
		Animal lion = new Animal();
		
		// セッターを使って値を設定
		lion.setName("ライオン");
		lion.setBodyLength(2.1);
		lion.setSpeed(80);
		
		// 動物の情報を表示
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getBodyLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");
	}
}

/*
	
	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください
	
	動物名：ライオン
体長：2.1m
速度：80km/h
	
*/