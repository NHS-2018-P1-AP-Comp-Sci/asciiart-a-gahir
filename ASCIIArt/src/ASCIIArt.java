/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOUR CODE GOES HERE :)
public class ASCIIArt {
	
	public static void backSlashes1() {
		System.out.println("|\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
	}
	public static void backSlashes2() {
		System.out.println("||||||||||||||||||||||||||||||");
	}
	
	public static void verticalLines1() {
		System.out.print("||");
	}
	public static void verticalLines2() {
		System.out.println("                           |");
	}
	
	public static void vertLines3() {
		System.out.println("|");
	}
	public static void bigSpace() {
		vertLineFinal();
		vertLineFinal();
		vertLineFinal();
		verticalLines1();
		System.out.print("      ASCII Rules!!!       ");
		vertLines3();
		vertLineFinal();
		vertLineFinal();
		
	}
	
	public static void vertLineFinal() {
		verticalLines1();
		verticalLines2();
		
	}
	public static void keyboardWire () {
		System.out.println("|_/        \\               \\_|\n+           \\                +\n            / \n            \\");
	}
	public static void keyboard() {
		dashes();
		upperRow();
		midRow();
		bottomRow();
		System.out.print("   ");
		dashes2();
		System.out.println("\t\t\t\t  \\");
		}
	public static void dashes() {
		System.out.println("-------------------------");
	}
	public static void dashes2() {
		System.out.println("-------------------------      /");
	}
	public static void upperRow() {
		System.out.println("\\  Q W E R T Y U I O P  \\");
	}
	public static void midRow() {
		System.out.println(" \\   A S D F G H J K L   \\");
	}
	public static void bottomRow() {
		System.out.println("  \\ Alt Z X C V B N M Ctrl\\------\\_");
	}
	public static void mouse() {
		System.out.println("\t\t\t\t ____\n\t\t\t\t//||\\\\ \n\t\t\t\t||--|| \n\t\t\t\t\\\\--// \n\t\t\t\t \\\\//");
	}
	public static void main(String[] args) {
		backSlashes1();
		backSlashes2();
		bigSpace();
		System.out.println("||===========================|");
		System.out.println("||Knockoff Dell Monitor 9000=|");
		System.out.println("||===========================|");
		keyboardWire();
		keyboard();
		mouse();
		System.out.println("\n\nA computer depicting how ASCII and AP Comp Sci both rule.");
		
		
		
		
	}
}