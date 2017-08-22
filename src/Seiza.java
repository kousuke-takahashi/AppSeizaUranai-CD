
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

	}

	public static void gemini(int num){
		//ふたご座

	}

	public static void cancer(int num){
		//かに座
	}

	public static void leo(int num){
		//獅子座
		switch(num){
		case 1 :
			System.out.println("1位");
			System.out.println("ラッキーアイテムは、帽子");
			break;
		case 2 :
			System.out.println("2位");
			System.out.println("ラッキーアイテムは、財布");
			break;
		case 3 :
			System.out.println("3位");
			System.out.println("ラッキーアイテムは、腕時計");
			break;
		case 4 :
			System.out.println("4位");
			System.out.println("ラッキーアイテムは、鉛筆");
			break;
		case 5 :
			System.out.println("5位");
			System.out.println("ラッキーアイテムは、風船");
			break;
		case 6 :
			System.out.println("6位");
			System.out.println("ラッキーアイテムは、ネックレス");
			break;
		case 7 :
			System.out.println("7位");
			System.out.println("ラッキーアイテムは、ブレスレット");
			break;
		case 8 :
			System.out.println("8位");
			System.out.println("ラッキーアイテムは、ハンカチ");
			break;
		case 9 :
			System.out.println("9位");
			System.out.println("ラッキーアイテムは、シャーペン");
			break;
		case 10 :
			System.out.println("10位");
			System.out.println("ラッキーアイテムは、日傘");
			break;
		case 11 :
			System.out.println("11位");
			System.out.println("ラッキーアイテムは、うちわ");
			break;
		case 12 :
			System.out.println("12位");
			System.out.println("ラッキーアイテムは、本");
			break;
		}

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
	  if(num == 1){
	    System.out.println("１位です。");
	    System.out.println("ラッキーアイテム：お金");
	  }
	  else if(num == 2){
      System.out.println("２位です。");
      System.out.println("ラッキーアイテム：宝くじ");
	  }
    else if(num == 3){
      System.out.println("３位です。");
      System.out.println("ラッキーアイテム：財布");
    }
    else if(num == 4){
      System.out.println("４位です。");
      System.out.println("ラッキーアイテム：万札");
    }
    else if(num == 5){
      System.out.println("５位です。");
      System.out.println("ラッキーアイテム：5千円札");
    }
    else if(num == 6){
      System.out.println("６位です。");
      System.out.println("ラッキーアイテム：千円札");
    }
    else if(num == 7){
      System.out.println("７位です。");
      System.out.println("ラッキーアイテム：500円玉");
    }
    else if(num == 8){
      System.out.println("８位です。");
      System.out.println("ラッキーアイテム：100円玉");
    }
    else if(num == 9){
      System.out.println("９位です。");
      System.out.println("ラッキーアイテム：10円玉");
    }
    else if(num == 10){
      System.out.println("１０位です。");
      System.out.println("ラッキーアイテム：5円玉");
    }
    else if(num == 11){
      System.out.println("１１位です。");
      System.out.println("ラッキーアイテム：1円玉");
    }
    else if(num == 12){
      System.out.println("１２位です。");
      System.out.println("ラッキーアイテム：物乞い");
    }
	}

	public static void pisces(int num){
		//うお座
	}

}
