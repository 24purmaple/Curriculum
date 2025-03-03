package curriculum_B;

import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		
		input = scanner.nextLine();
		
		// 入力内容を「、」で区切りproductsに格納
		String[] products = input.split("、");
		
		int stock = -1;
		
		// productsの内容[]を0から繰り返しproductに格納
		for (String product : products) {
			product = product.trim(); // 余白の削除
			int random = (int) Math.floor(Math.random() * 11);
			
			switch (product) {
				case "パソコン":
				case "冷蔵庫":
				case "扇風機":
				case "洗濯機":
				case "加湿器":
					System.out.println(product + "の残り台数は" + random + "台です");
					break;
					
				// テレビとディスプレイを同じ商品とする=テレビが増えればディスプレイも減る
				case "テレビ":
				case "ディスプレイ":
					stock = (stock != -1) ? (11 - stock): random;
					System.out.println(product + "の残り台数は" + stock + "台です");
					break;
				
				default:
					System.out.println("『" + product + "』" + "は指定の商品ではありません");
			}
			
		}
		
		scanner.close();
	}

}
