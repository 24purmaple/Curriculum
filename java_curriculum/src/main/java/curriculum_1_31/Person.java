package curriculum_1_31;

public class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	static int count;
	
	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;
	}
	
	double bmi() {
		return this.weight / this.height * this.height;
	}
	
	void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
	}
	
	void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}
