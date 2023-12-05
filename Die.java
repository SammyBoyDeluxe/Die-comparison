import java.util.Random;
public class Die {
private int value;
private int sides;
private static Random rand = new Random();

/*Initierar tärningen med hur många sidor tärningen ska ha och initierar random-generatorn för att kunna slå tärningen*/
public Die(int sides) {
	this.sides=sides;
	
}
/*Rullar tärningen och ger value ett nytt värde*/ 
public void roll() {
value=rand.nextInt(1, sides);
	
}
/* Ger värdet för tärningen*/
public int getValue() {

return value;	
	
}

public void getSides(int sidesin) {
	sides=sidesin;
	
	
	
}

}
