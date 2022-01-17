package minefield;

import java.util.Random;
import java.util.Scanner;

public class MineField {
	
	int rowNumber, colNumber, size;
	int map[][];
	int board[][];
	boolean game = true;
	
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	
	public MineField(int rowNumber, int colNumber) {
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
		this.map = new int[rowNumber][colNumber];
		this.board = new int[rowNumber][colNumber];
		this.size = rowNumber*colNumber;
	}
	
	public void run() {
		int row;
		int col;
		int succes = 0;
		prepareGame();
//		print(map);
		System.out.println("Game has begun");
		
		while (game) {
			print(map);
			System.out.println("==============");
			print(board);
			System.out.print("Row : ");
			row = scan.nextInt();
			System.out.print("Column : ");
			col = scan.nextInt();
			
			if (row<0 || row>=rowNumber) {
				System.out.println("Invalid coordinate !");
				continue;
			}
			if (col<0 || col>=colNumber) {
				System.out.println("Invalid coordinate !");
				continue;
			}
			
			
			if (map[row][col] != -1) {
				check(row,col);
				succes++;
				if (succes==(size - (size/4))) {
					System.out.println("Victory!!!");
					break;
				}
				
			} else {
				System.out.println("Game Over");
				game = false;
			}
	
		}
		
		
		
	}
	
	private void check(int r, int c) {
		if (map[r][c] == 0) {
			if ((c<colNumber-1) && (map[r][c+1] == -1)) {
				board[r][c]++;
			}
			if ( (r<rowNumber-1) &&(map[r+1][c] == -1)) {
				board[r][c]++;
			}
			if ( (r>0) && (map[r-1][c] == -1)) {
				board[r][c]++;
			}
			if ( (c>0) && (map[r][c-1] == -1)) {
				board[r][c]++;
			}
			
			if (board[r][c]==0) {
				board[r][c]=-2;
			}
		}
		
	
	}

	public void prepareGame() {
		int randRow,randCol;
		int count = 0; ;
		
		while (count != (size/4)) {
			randRow = rand.nextInt(rowNumber);
			randCol = rand.nextInt(colNumber);
			if (map[randRow][randCol] != -1) {
				map[randRow][randCol] = -1;
				count++;
			}
			
		}

	}
	
	public void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j]>=0) {
					System.out.print(" ");
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
