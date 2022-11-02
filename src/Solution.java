/**
 * 
 * @author alexis__memo
 * 
 */
import java.util.Scanner;
public class Solution {
private static boolean isGame=true;
private static int playerScore=0;
private static int computerScore=0;
	public static void main(String[] args) {
		
		System.out.println("Welcome to rock paper scisors program!");
		game();
		

	}
	private static void game() {
		Scanner in = new Scanner(System.in);
		while(isGame) {
			System.out.println("Enter your throw: (1=Rock, 2=Paper, 3=Scissors, any other number=close game):");
			int x = in.nextInt();
			int winner=getWinner(x);//0 tie, 1 player win, 2 computer win
			if(winner==0) {
				System.out.println("It's a tie!");			
			}
			else if(winner==1) {
				System.out.println("Player wins!");
				playerScore++;
			}
			else if(winner==2) {
				System.out.println("Computer wins!");
				computerScore++;
			}
			else {
				System.out.println("Please enter a valid number!");
				isGame=false;
			}
			printScore();
		}
		
		
	}
	private static void printScore() {
		System.out.println("The score is: Player:"+playerScore+" Computer:"+computerScore+"\n");
	}
	private static int getWinner(int x) {
		int randNum = (int)(Math.random()*3+1);
		if (x== 1) {
			System.out.println("Player throws Rock");
			if (randNum==1) {
				System.out.println("Computer throws Paper.");
				return 2;
			}
			if (randNum==2) {
				System.out.println("Computer throws Rock.");
				return 0;
			}
			if (randNum==3) {
				System.out.println("Computer throws Scissors.");
				return 1;
			}
		}
		if (x== 2) {
			System.out.println("Player throws Paper");
			if (randNum==1) {
				System.out.println("Computer throws Paper.");
				return 0;
			}
			if (randNum==2) {
				System.out.println("Computer throws Rock.");
				return 1;
			}
			if (randNum==3) {
				System.out.println("Computer throws Scissors.");
				return 2;
			}
		}
		if (x== 3) {
			System.out.println("Player throws Scissors");
			if (randNum==1) {
				System.out.println("Computer throws Paper.");
				return 1;
			}
			if (randNum==2) {
				System.out.println("Computer throws Rock.");
				return 2;
			}
			if (randNum==3) {
				System.out.println("Computer throws Scissors.");
				return 0;
			}
		}
		return-1;
	}

}