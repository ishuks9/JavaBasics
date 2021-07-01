import java.util.Scanner;
public class SnakeUC7{
	public static void main(String args[]){
		System.out.println("Welcome to the GAME");
		int pos1 = 0;
		int pos2 = 0;
		int r1 = 0;
		int r2 = 0;
		int s1;
		int s2;
		
		for(int i=1;i<=2;i++){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the CHANCE to PLAY: ");
			int player = sc.nextInt();
			switch(player){
			case 1:
			while(pos1<100){
				int run =(int) Math.floor(Math.random()*10)%3;
				s1 = (int) Math.floor(Math.random()*10)%6;
				switch(run){
					case 1:
						
						pos1 += s1;
						r1++;
						if (pos1>100) 
							pos1 -= s1;
						
						break;
					case 2:
						
						if (pos1 >= s1){
							pos1 -= s1;
						}else {
							pos1 = 0;
						}
			
					r1++;
					break;
					default:
						
						r1++;
					}
				}
				System.out.println("Player1 is at "+pos1+"th position");
				System.out.println("finished in "+r1+" rolls");
				break;
			case 2:
			while(pos2<100){
				int run =(int) Math.floor(Math.random()*10)%3;
				s2 = (int) Math.floor(Math.random()*10)%6;
				switch(run){
					case 1:
						
						pos2 += s2;
						r2++;
						if (pos2>100) 
							pos2 -= s2;
						
						break;
					case 2:
						
						if (pos2 >= s2){
							pos2 -= s2;
						}else {
							pos2 = 0;
						}
						
						r2++;
						break;
					default:
						
						r2++;
				}
				}
				System.out.println("Player2 is at "+pos2+"th position");
				System.out.println("finished in "+r2+" rolls");
				break;
			}
		}
		if (pos1>pos2){
			System.out.println("Player1 is the winner");
		}else {
			System.out.println("Player2 is the winner");
			}
	}
}
