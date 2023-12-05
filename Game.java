import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int dieSideNmbr;
		System.out.print("Vänligen skriv in antalet sidor du önskar att tärningen ska ha");
		while(!(scan.hasNextInt())) {
			System.out.println("Det du skrev in var inte ett helttal, var vänlig försök igen med ett heltal");
			
			
			
			
		}
		dieSideNmbr=scan.nextInt();
		System.out.print("Vänligen skriv in antalet spelare som ska spela");
		while(!(scan.hasNextInt())) {
			System.out.println("Det du skrev in var inte ett helttal, var vänlig försök igen med ett heltal");
			
			
			
			
		}
		Player[] playerArr = new Player[scan.nextInt()];
		
		for(int i= 0;i<playerArr.length;i++) {
			System.out.println("Vänligen skriv in namnet på spelaren");
			String s= new scan.next();
			
			
			
						playerArr[i]= Player.setName(s);
						
						
						

			
			
		
			}
			
			
			
			
			
			
			
			
		}
		
		

	}

}
