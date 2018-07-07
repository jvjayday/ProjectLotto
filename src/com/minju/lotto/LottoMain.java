package com.minju.lotto;

public class LottoMain {

	public static void main(String[] args) {
	
		//사용하기
		Lotto lotto = new Lotto();
		int numbers[] = lotto.generate(6);
		
		for(int num : numbers) {
			System.out.print(num+ ", ");
		}
	}

}
