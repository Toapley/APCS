import java.io.*;

public class BitBucketHelper {

	public static void main(String[] args) throws IOException {

		// Student data
		String data[][] = { 
				{"apcs-aalonzo","alonzoannika/apcs-aalonzo.git"},
				{"apcs-aghizila","andreeeeea/apcs-aghizila.git"},
				{"apcs-akuraishi","akuraishi/apcs-akuraishi.git"},
				{"apcs-asrivastava","Ajay-Srivastava/apcs-asrivastava.git"},
				{"apcs-bcoble","Bryce0Coble/apcs-bcoble.git"},
				{"apcs-bsim", "bsim1458/apcs-bsim.git"},				
				{"apcs-cabsalon","TrixMix/apcs-cabsalon.git"},
				{"apcs-cbell","connorbelll/apcs-cbell.git"},
				{"apcs-cstowe","CaseyStowe1/apcs-cstowe.git"},
				{"apcs-eko","s-eko/apcs-eko.git"},
				{"apcs-fqureshi","faraz525/apcs-fqureshi.git"},
				{"apcs-fwang","s-fwang/apcs-fwang.git"},
				{"apcs-ghaynes","s-ghaynes/apcs-ghaynes.git"},
				{"apcs-golson","GarrettOlson/apcs-golson.git"},
				{"apcs-hbrophy","s-hbrophy/apcs-hbrophy.git"},
				{"apcs-hnadeem","Shadragon99/apcs-hnadeem.git"},
				{"apcs-isidorenko","isidorenko-lwsd/apcs-isidorenko.git"},
				{"apcs-jcando","jamessscandooo/apcs-jcando.git"},
				{"apcs-jeverard","JennaEverard1918/apcs-jeverard.git"},
				{"apcs-jgoelzer","jgoelzer/apcs-jgoelzer.git"},
				{"apcs-jocando","Johnchangs/apcs-jocando.git"},
				{"apcs-mjiang","maggiej/apcs-mjiang.git"},
				{"apcs-mhilwa","mhilwa/apcs-mhilwa.git"},
				{"apcs-mtun","Smooth53/apcs-mtun.git"},
				{"apcs-nalimono", "YTAkuro/apcs-nalimono.git"},
				{"apcs-pramesh","pranathiiir/apcs-pramesh.git"},
				{"apcs-sacharya","susanacharya/apcs-sacharya.git"},
				{"apcs-sfeinberg","s-sfeinberg/apcs-sfeinberg.git"},
				{"apcs-spoulin","seanpoulin/apcs-spoulin.git"},
				{"apcs-spwilliams","s-spen/apcs-spwilliams.git"},
				{"apcs-ssuresh","s-ssuresh/apcs-ssuresh.git"},
				{"apcs-thuang","HTYYYYY/apcs-thuang.git"},
				{"apcs-xfontenot","XFontenot/apcs-xavierfontenot.git"},
				{"apcs-tyim","Tyler_Y/apcs-tyim.git"},
				
				
		};	
		
		//bitbucket account of person running this script.
		String sourcePerson = "https://toapley@bitbucket.org/";
		
		writeCloneFile("C:\\Users\\Todd\\Documents\\AP\\ClassRepositories\\", "C:\\Users\\Todd\\Downloads\\clonerepos.bat",sourcePerson, data);
		writeCheckinFile("C:\\Users\\Todd\\Documents\\AP\\ClassRepositories\\","C:\\Users\\Todd\\Downloads\\checkin.bat", data);
		writePullFile("C:\\Users\\Todd\\Documents\\AP\\ClassRepositories\\","C:\\Users\\Todd\\Downloads\\sync.bat", data);
		
				
	
	}

	// Writes a batch file for cloning repos 
	public static void writeCloneFile(String rootFolder, String cloneFile, String sourcePerson, String data[][]) throws IOException {
		
		PrintWriter  sw = new PrintWriter(cloneFile);
		int count = 1;
		
		sw.println("rd /s /q " + rootFolder);
		
		// Write out string for cloning each repo locally.
		for(String[] student : data) {			
			sw.println("REM Student #" + count++ + " (" + student[0] + ")");
			sw.println("git clone " + sourcePerson + student[1] + " \"" + rootFolder + student[0] + "\"");	
		}
		
		sw.close();				
		
	}
	
	// Writes file for staging/pushing all changes to all the various repos.
	public static void writeCheckinFile(String rootFolder, String checkinFile, String data[][]) throws IOException {
		
		PrintWriter  sw = new PrintWriter(checkinFile);
		
		
		// Batch file is expected to be run at the parent root of all the students repos
		sw.println("if [%1]==[] goto usage");
		
		// Write out string for cloning each repo locally.
		for(String[] student : data) {
			// Move to the repo
			sw.println("cd " + student[0]);
			// Stage any files
			sw.println("git add -A");	//I think -A works better than -u
			// Commit changes w/ message
			sw.println("git commit -m %1");
			sw.println("git push origin master");
			sw.println("cd ..");			
		}
		
		sw.println("goto :eof");
		sw.println(":usage");
		sw.println("@echo Usage: %0 CheckinMessage");
		sw.println("exit /B 1");
		
		sw.close();				
		
	}
	
	// Writes a file for pulling (syncing) all repos
	public static void writePullFile(String rootFolder, String checkinFile, String data[][]) throws IOException {
		
		PrintWriter  sw = new PrintWriter(checkinFile);
		
		
		// Batch file is expected to be run at the parent root of all the students repos

		// Write out string for cloning each repo locally.
		for(String[] student : data) {
			// Move to the repo
			sw.println("cd " + student[0]);
			// Pull down
			sw.println("git pull");

			// Go back a directory.
			sw.println("cd ..");			
		}
				
		sw.close();				
		
	}
}

