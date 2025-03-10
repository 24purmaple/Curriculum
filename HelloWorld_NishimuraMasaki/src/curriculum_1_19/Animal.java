package curriculum_1_19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
	
	public static void main(String[] args) {
		String animalName = null;
		
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog = new Dog(animalName, 0);
		System.out.println(dog.getName());
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		System.out.println(dog.getCount());
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		System.out.println(format.format(date));
	}
}
