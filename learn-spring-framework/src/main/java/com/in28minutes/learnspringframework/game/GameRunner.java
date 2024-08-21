package com.in28minutes.learnspringframework.game;

public class GameRunner {
	
	//MarioGame game;
	private SuperContraGame game;
	
	public GameRunner(SuperContraGame game) {
		this.game = game;
	}
	
	public void run() {
		// 일반적으로는 로깅 프레임워크 사용
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}