package edu.mu.testing.param.value.main;

public class Score {

	private int score;
	
	public Score(int score) {
		if(score <= 0) {
			throw new IllegalArgumentException();
		}
		this.score = score;
	}
	
	public char scoreToLetter() {
		if (score >= 90) {
			return 'A';
		} else if(score >= 80) {
			return 'B';
		} else if(score >= 70) {
			return 'C';
		} else if(score >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}
	
	public char scoreToLetter2() {
		if (score >= 90 && score <=100) {
			return 'A';
		}else {
			return 'F';
		}
		
	}
	
	public boolean passed() {
		return score >= 60;
	}
	
}
