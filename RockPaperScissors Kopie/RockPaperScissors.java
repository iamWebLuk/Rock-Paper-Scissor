package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	private static String pickedUser;
	private static String pickPC;

	public RockPaperScissors() {

	}

	public RockPaperScissors(String pickUser) {
		RockPaperScissors.pickedUser = pickUser;
	}

	public String getPickUser() {
		return pickedUser;
	}

	public void setPickUser(String pickUser) {
		RockPaperScissors.pickedUser = pickUser;
	}

	public String getPickPC() {
		return pickPC;
	}

	public void setPickPC(String pickPC) {
		this.pickPC = pickPC;
	}

	public static String computer() {
		String[] choice = { "Rock", "Paper", "Scissor" };
		int pick = new Random().nextInt(choice.length);
		return choice[pick];
	}

	public String play() {

//		computer();

		String sentence = pickedUser + " " + pickPC;

		switch (sentence) {
		case "Rock Paper":
		case "Paper Scissor":
		case "Scissor Rock": {
			return "Pc wins";
		}
		case "Rock Rock":
		case "Paper Paper":
		case "Scissor Scissor": {
			return "Draw";
		}
		case "Rock Scissor":
		case "Paper Rock":
		case "Scissor Paper": {
			return "User wins";
		}
		}
		return "";

	}
}
