
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
		if(num == 1){
			System.out.println("1位　総合運★★★★★恋愛運★★★★★仕事運★★★★☆金財運★★★★★");
			System.out.println("ショッピング運あり。たまたま入ったお店で一目惚れの予感。");
			System.out.println("その商品は、まさに一生モノ。たとえ予算オーバーでも、必ず手に入れるべき。");
			System.out.println("その他、迷った時は時間を置いて二度チェック。それでも欲しかったら買いです！");
			System.out.println("ただし時間をかけすぎて先に買われないよう注意！");
		}

		else if(num == 2){
			System.out.println("2位　総合運★★★★★恋愛運★★★★☆仕事運★★★★★金財運★★★★☆");
			System.out.println("趣味や習い事で、周囲から注目される出来事が起こりそう！");
			System.out.println("賞を受けるなど、その分野における名誉を手に入れることができるかもしれません。");
			System.out.println("楽しみでやっていたことが仕事となり、金銭につながる可能性も。一躍有名人の予感です。");
			System.out.println("視野を広げ、様々なことにチャレンジするといいでしょう。");
		}

		else if(num == 3){
			System.out.println("3位　総合運★★★★☆恋愛運★★★★☆仕事運★★★★☆金財運★★★★☆");
			System.out.println("ずっとやりたかったこと、憧れていたことにチャレンジすべき好機。");
			System.out.println("今なら、周囲は惜しみなく協力してくれるはず。そうした好意に素直に頼れば、");
			System.out.println("ネックだった金銭問題なども難なくクリア。新たな一歩を踏み出せるはず。");
			System.out.println("ただし油断してお金を使いすぎないよう注意！");
		}

		else if(num == 4){
			System.out.println("4位　総合運★★★★☆恋愛運★★★☆☆仕事運★★★★☆金財運★★★★☆");
			System.out.println("仕事のことでも、お金の動かし方でも、どうなるか知りたいという好奇心が強いでしょう。｢こんな方法もあるかも｣と興味が湧くとき。");
			System.out.println("うまくいくという確信よりも、");
			System.out.println("リスクを最小限に抑える方法も考えついたら、実行して正解！");
			System.out.println("慎重に行動すればさらにリスクを減らすことが出来るでしょう。");
		}

		else if(num == 5){
			System.out.println("5位　総合運★★★☆☆恋愛運★★★☆☆仕事運★★★☆☆金財運★★★☆☆");
			System.out.println("メンテナンスに最適な日。ゆっくりお風呂に浸かったり鏡に姿を映しながら、身体の隅々までしっかりチェック！　");
			System.out.println("疲れが残っていないか、体型に変化はないかなど");
			System.out.println("時間をかけて確認すると、美しさが格段にアップするはず。");
			System.out.println("ただし寝すぎには注意、遅刻には気を付けて！");
		}

		else if(num == 6){
			System.out.println("6位　総合運★★★☆☆恋愛運★★★☆☆仕事運★★★☆☆金財運★★★☆☆");
			System.out.println("何か新しいことを始めるのにいい日。今日スタートさせたことは後に、あなたに幸福をもたらすはず。");
			System.out.println("ただしそれには、長続きさせることが重要。「これだ！」というものに出会ったら、");
			System.out.println("じっくり腰をすえて取り組むようにして。");
			System.out.println("続くか続かないかの判断を素早く行えば時間を有効に活用出来るでしょう。");
		}

		else if(num == 7){
			System.out.println("7位　総合運★★★☆☆恋愛運★★★☆☆仕事運★★★☆☆金財運★★☆☆☆");
			System.out.println("家庭内にトラブル発生！　どうしたらいいのか、家族全員あたふたしてしまいそう。");
			System.out.println("ただ、問題が起こったことでみんなが一致団結。これまでバラバラだった心が一つになるなど、");
			System.out.println("絆を深めることができそう。収束には少し時間を要しますが、協力し合って解決できるはず。");
			System.out.println("相手の言葉をしっかりと聞き、理解するよう心がけましょう。");
		}

		else if(num == 8){
			System.out.println("8位　総合運★★★☆☆恋愛運★★★☆☆仕事運★★★☆☆金財運★☆☆☆☆");
			System.out.println("自分の欲望を満たすためにお金をつかうのではなく、誰かのために、役立つお金の使い方をして。");
			System.out.println("お世話になっている人に贈り物をしたり、ちょこちょこ募金をしたり、");
			System.out.println("共感できるボランティア団体に寄付したり…。後悔なく使うことができるはずです。");
			System.out.println("ただ、ボランティアへの募金に使いすぎないよう注意が必要。");
		}

		else if(num == 9){
			System.out.println("9位　総合運★★★☆☆恋愛運★☆☆☆☆仕事運★★★☆☆金財運★★☆☆☆");
			System.out.println("｢これはこのペースで続いていくはずだ｣と思っていた仕事に、何か変化がありそうな日。");
			System.out.println("しかし、ドンと構えて大丈夫！というのも、一時的には不安定に見えても、");
			System.out.println("さらに発展させていくチャンスになるから。堂々と仕事と向き合えば、充実する1日です。");
			System.out.println("問題が起きた時も冷静に対応すれば、大きくなることはなさそうです。");
		}

		else if(num == 10){
			System.out.println("10位　総合運★★☆☆恋愛運★☆☆☆☆仕事運★★☆☆☆金財運★★☆☆☆");
			System.out.println("自分ではかわいいわがままのつもりが、相手にとっては大迷惑…ということがちょこちょこありそう。");
			System.out.println("今日は、自分を抑えて何事も他人に譲ってしまうこと。大きなトラブルを招かないためにも、");
			System.out.println("主張しないことが一番です。");
			System.out.println("相手の表情を読み取るようにしましょう。");
		}

		else if(num == 11){
			System.out.println("11位　総合運★☆☆☆☆恋愛運★★☆☆☆仕事運★☆☆☆☆金財運★☆☆☆☆");
			System.out.println("焦って答えを出す必要はなしチャンスが舞い込んできそうです。驚くほどの大役もあれば、ボランティア的な");
			System.out.println("役割のものもあるでしょう。かし慎重になる必要があります。どんなに魅力的に見えるものでも、");
			System.out.println("あとで期待はずれだったと感じるものが混じっているかもしれません。");
			System.out.println("プライドを満たすことだけを考えていないか、自分がどうしたいかをじっくり考えてから決断しましょう。");
			System.out.println("決断は慎重に。あなたの今後を変える出来事かも？");
		}

		else if(num == 12){
			System.out.println("2位　総合運★☆☆☆☆恋愛運★☆☆☆☆仕事運★☆☆☆☆金財運★☆☆☆☆");
			System.out.println("どうでもいいことがきっかけとなって、親やきょうだいなど、身内と大ゲンカしちゃいそう。");
			System.out.println("長引くのは必至。もしかしたら断絶の可能性も…。たとえ納得いかなくても、今後のことを考えたら");
			System.out.println("自分から譲歩するべき。面と向かうのがイヤなら、手紙などで気持ちを伝えて。");
			System.out.println("長引いてしまうとどんどん伝えにくくなってしまうので早急に解決するようにしましょう。");
		}

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
