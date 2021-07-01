public class SnakeUC4 {
	public static void main(String args[]){
		System.out.println("Welcome to the GAME");
		int pos = 0;
		int r = 0;
		int s;
		
		while(pos<=100){
		int run =(int) Math.floor(Math.random()*10)%3;
		switch(run){
		case 1:
                	s = (int) Math.floor(Math.random()*10)%6;
			pos += s;
			r++;
			break;
		case 2:
                	s = (int) Math.floor(Math.random()*10)%6;
			if (pos >= s){
			pos -= s;
			}else {
			pos = 0;
			}
			r++;
			break;
		default:
			System.out.println("playing not allowed");
			r++;
		}}
		System.out.println(pos);
                System.out.println(r);
	}
}
