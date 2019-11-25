package waterwolf9910.scienceFair2019;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import javax.sound.sampled.*;


public class CaesarCipher {

	public static void main(String[] args) throws InterruptedException {
		try {
			
			File audioFile = new File(music());
			 
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
			 
			AudioFormat format = audioStream.getFormat();
			 
			DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
			 
			SourceDataLine audioLine = (SourceDataLine) AudioSystem.getLine(info);
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			int p = 0;
			while (p < 5) {
				// Time Method
				LocalDate date = LocalDate.now();
				LocalTime time = LocalTime.now();
				System.out.println("Date: " + date);
				System.out.println("");
				System.out.println("Time: " + time);
				System.out.println("");

				// Loading Methods
				System.out.print("Loading Code ");
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				int x = 0;
				while (x < 500) {
					System.out.println(" ");
					x++;
				}
				p++;
			}
			System.out.println("Code/Program By. Waterwolf9910 and Andon1379");
			System.out.println(" ");
			System.out.println("Thanks to those who help make the language 'Java'");
			System.out.println(" ");
			Thread.sleep(5000);
			int l = 0;
			while (l < 250) {
				System.out.println("");
				l++;
			}
			System.out.print("Do u want to encrypt (type 1) or Decrypt (type 2): ");
			int choise = input.nextInt();
			System.out.println("Loading");
			int encrypt = 1;
			int decrypt = 2;
			int cancel = 3;
			Thread.sleep(3000);
			if (choise == encrypt) {
				// Replace Method Encrypt
				System.out.print("Type Sentence (use _ for space): ");
				// input
				String s1 = input.next();
				String str = new String(s1.toLowerCase());
				// Converter
				System.out.println(str.replaceAll("a", "x").replaceAll("b", "y").replaceAll("c", "z")
						.replaceAll("d", "a").replaceAll("e", "b").replaceAll("f", "c").replaceAll("g", "d")
						.replaceAll("h", "e").replaceAll("i", "f").replaceAll("j", "g").replaceAll("k", "h")
						.replaceAll("l", "i").replaceAll("m", "j").replaceAll("n", "k").replaceAll("o", "l")
						.replaceAll("p", "m").replaceAll("q", "n").replaceAll("r", "o").replaceAll("s", "p")
						.replaceAll("t", "q").replaceAll("u", "r").replaceAll("v", "s").replaceAll("w", "t")
						.replaceAll("x", "u").replaceAll("y", "v").replaceAll("z", "w"));
				Thread.sleep(3000);
				System.out.println("");
				System.out.println("");
				// End
				System.exit(0);
			}
			if (choise == decrypt) {
				// Replace Method Decrypt
				System.out.print("Type Sentence (use _ for space): ");
				// Input
				String s1 = input.next();
				String str = new String(s1.toLowerCase());
				// Converter
				System.out.println(str.replaceAll("w", "z").replaceAll("v", "y").replaceAll("u", "x")
						.replaceAll("t", "w").replaceAll("s", "v").replaceAll("r", "u").replaceAll("q", "t")
						.replaceAll("p", "s").replaceAll("o", "r").replaceAll("n", "q").replaceAll("m", "p")
						.replaceAll("l", "o").replaceAll("k", "n").replaceAll("j", "m").replaceAll("i", "l")
						.replaceAll("h", "k").replaceAll("g", "j").replaceAll("f", "i").replaceAll("e", "h")
						.replaceAll("d", "g").replaceAll("c", "f").replaceAll("b", "e").replaceAll("a", "d")
						.replaceAll("z", "c").replaceAll("y", "b").replaceAll("x", "a"));
				Thread.sleep(3000);
				System.out.println("");
				System.out.println("");
				// End
				System.exit(0);
			}
			if (choise == cancel) {
				System.out.println("closing");
			}
		} catch (Exception e) {
			System.out.println("Something Went Wrong, Error Code 1");
			System.exit(1);
		}
	}
	public static String music() throws IOException, FileNotFoundException{
		Scanner input = new Scanner(System.in);
		System.out.println("Type Path To Music or press enter (default Candyland[NCS Release] by Tobu:");
		String musicfile = input.next();
		if (musicfile == "") {
			file1 = "Candyland.wav"
		}
        else if (musicfile == " ") {
            file1 = "Candyland.wav"
        } 
        else {
            file1 = musicfile;
        }
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file1);
            AudioFormat format = audioStream.getFormat();
			DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
			SourceDataLine audioLine = (SourceDataLine) AudioSystem.getLine(info);
        }
        catch (FileNotFoundException ex)
        
        }
        return file1;
	}
}
