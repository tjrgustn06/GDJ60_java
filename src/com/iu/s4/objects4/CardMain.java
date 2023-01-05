package com.iu.s4.objects4;

public class CardMain {

	public static void main(String[] args) {

		//클래스명.변수명(클래스변수)(static영역에 만들어진다)
		System.out.println(Card.size);
		Card.staticMethod();
		
		Card card = new Card();
		card.setShape("Heart");
		card.setColor("Red");
		card.setNumber(1);
		
		Card.size =8;

		Card card2 = new Card();
		card2.setShape("Spade");
		card2.setColor("Black");
		card2.setNumber(12);
		

		card.info();
		card2.info();
		
	}

}
