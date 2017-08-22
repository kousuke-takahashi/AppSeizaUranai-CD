
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

		switch(num){
		case 1:
			System.out.println("1位だよ！");
			System.out.println("人生に影響を及ぼす人との出会いが訪れます");
			break;
		case 2:
			System.out.println("2位だよ！");
			System.out.println("幸福の女神が微笑む素敵な1日になります");
			break;
		case 3:
			System.out.println("3位だよ！");
			System.out.println("オープンな態度で過ごすのが大事");
			break;
	    case 4:
	    	System.out.println("4位だよ！");
	    	System.out.println("暮らしの中に新たなものを取り入れると吉です");
	    	break;
	    case 5:
	    	System.out.println("5位だよ！");
	    	System.out.println("胸がときめくシーンに遭遇する日になります");
	    	break;
	    case 6:
	    	System.out.println("6位だよ！");
	    	System.out.println("胸がときめくようなものを見つけられそう");
	    	break;
	    case 7:
	    	System.out.println("7位だよ！");
	    	System.out.println("イメージチェンジに適している日になります");
	    	break;
	    case 8:
	    	System.out.println("8位だよ！");
	    	System.out.println("刺激を求めて冒険をしたくなりそう");
	    	break;
	    case 9:
	    	System.out.println("9位だよ！");
	    	System.out.println("刺激や変化を求める日になりそう");
	    	break;
	    case 10:
	    	System.out.println("10位だよ！");
	    	System.out.println("無理な約束をしないように注意");
	    	break;
	    case 11:
	    	System.out.println("11位だよ！");
	    	System.out.println("楽しみを見つけて上手に気分転換を");
	    	break;
	    case 12:
	    	System.out.println("12位だよ！");
	    	System.out.println("プラス思考でいきましょう");
	    	break;
		}
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

		 if(num == 1){
			    System.out.println("１位です。");
			    System.out.println("ラッキーアイテム：腕時計");
			  }
			  else if(num == 2){
		      System.out.println("２位です。");
		      System.out.println("ラッキーアイテム：android端末");
			  }
		    else if(num == 3){
		      System.out.println("３位です。");
		      System.out.println("ラッキーアイテム：りんご");
		    }
		    else if(num == 4){
		      System.out.println("４位です。");
		      System.out.println("ラッキーアイテム：100円玉");
		    }
		    else if(num == 5){
		      System.out.println("５位です。");
		      System.out.println("ラッキーアイテム：千円札");
		    }
		    else if(num == 6){
		      System.out.println("６位です。");
		      System.out.println("ラッキーアイテム：一万円札");
		    }
		    else if(num == 7){
		      System.out.println("７位です。");
		      System.out.println("ラッキーアイテム：赤のボールペン");
		    }
		    else if(num == 8){
		      System.out.println("８位です。");
		      System.out.println("ラッキーアイテム：イヤホン");
		    }
		    else if(num == 9){
		      System.out.println("９位です。");
		      System.out.println("ラッキーアイテム：色鉛筆");
		    }
		    else if(num == 10){
		      System.out.println("１０位です。");
		      System.out.println("ラッキーアイテム：ブランケット");
		    }
		    else if(num == 11){
		      System.out.println("１１位です。");
		      System.out.println("ラッキーアイテム：文鎮");
		    }
		    else if(num == 12){
		      System.out.println("１２位です。");
		      System.out.println("ラッキーアイテム：アニマルビデオ");
		    }
	}

	public static void scorpio(int num){
		//さそり座
		  if(num == 1){
			    System.out.println("１位です。");
			    System.out.println("ラッキーアイテム：スカイブルーの小物");
			  }
			  else if(num == 2){
		      System.out.println("２位です。");
		      System.out.println("ラッキーアイテム：財布");
			  }
		    else if(num == 3){
		      System.out.println("３位です。");
		      System.out.println("ラッキーアイテム：iphone");
		    }
		    else if(num == 4){
		      System.out.println("４位です。");
		      System.out.println("ラッキーアイテム：500円玉");
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
		      System.out.println("ラッキーアイテム：ギザ十");
		    }
		    else if(num == 8){
		      System.out.println("８位です。");
		      System.out.println("ラッキーアイテム：100円玉");
		    }
		    else if(num == 9){
		      System.out.println("９位です。");
		      System.out.println("ラッキーアイテム：銀色の500円");
		    }
		    else if(num == 10){
		      System.out.println("１０位です。");
		      System.out.println("ラッキーアイテム：昭和64年の10円");
		    }
		    else if(num == 11){
		      System.out.println("１１位です。");
		      System.out.println("ラッキーアイテム：二千円札");
		    }
		    else if(num == 12){
		      System.out.println("１２位です。");
		      System.out.println("ラッキーアイテム：女の子の連絡先");
		    }

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
