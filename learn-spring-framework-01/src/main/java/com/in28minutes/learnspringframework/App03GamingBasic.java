package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;


@Configuration
public class App03GamingBasic {
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(GamingConfiguration.class)){
			
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
		
		
					
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
//		var game = new PacmanGame();
//		
//		var gameRunner = new GameRunner(game);
//		gameRunner.run();
	}
}