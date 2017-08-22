
public class Seiza {


	public static void main(String[] args){
		int[] rand = Random.randomInt(12);
		aries(rand[0] + 1);
		taurus(rand[1] + 1);
		gemini(rand[2] + 1);
		cancer(rand[3] + 1);
		leo(rand[4] + 1);
		virgo(rand[5] + 1);
		libra(rand[6] + 1);
		scorpio(rand[7] + 1);
		sagittarius(rand[8] + 1);
		capricorn(rand[9] + 1);
		aquarius(rand[10] + 1);
		pisces(rand[11] + 1);



	}


			//numには1 ～ 12が入ります

	public static void aries(int num){
		//牡羊座

	}

	public static void taurus(int num){
		//牡牛座
		System.out.println("牡牛座のあなたの運勢は");
		switch(num){

		case 1  : System.out.println("1位です");
		          System.out.println("今日一日幸運です");

		case 2  : System.out.println("2位です");
		          System.out.println("良いことあるかも");

		case 3  : System.out.println("3位です");
		          System.out.println("まあまあかな");

		case 4  : System.out.println("4位です");
		          System.out.println("微妙かな");

		case 5  : System.out.println("5位です");
		          System.out.println("普通");

		case 6  : System.out.println("6位です");
		          System.out.println("悪くなく良くもない");

		case 7  : System.out.println("7位です");
		          System.out.println("普通よりは低い");

		case 8  : System.out.println("8位です");
		          System.out.println("悪いよりマシ");

		case 9  : System.out.println("9位です");
		          System.out.println("まあ低いかな");

		case 10 : System.out.println("10位です");
		          System.out.println("ドンマイ");

		case 11 : System.out.println("11位です");
		          System.out.println("ご愁傷様です");

		case 12 : System.out.println("12位です");
		          System.out.println("明日があるさ");

		}

	}

	public static void gemini(int num){
		//ふたご座

	}

	public static void cancer(int num){
		//かに座
	}

	public static void leo(int num){
		//獅子座
	}

	public static void virgo(int num){
		//おとめ座

	}

	public static void libra(int num){
		//天秤座

	}

	public static void scorpio(int num){
		//さそり座

	}

	public static void sagittarius(int num){
		//いて座

	}

	public static void capricorn(int num){
		//やぎ座

	}

	public static void aquarius(int num){
		//みずがめ座
	}

	public static void pisces(int num){
		//うお座
	}

}
