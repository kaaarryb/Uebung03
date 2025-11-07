package h3;

public class H3_main {
 public static void main(String[] args) {
	 int max = 5;
	 int fix = 2;
	 int wartend = 2;
	 boolean istVoll = false;
	 
	 int freiePlaetze = max - fix;
	 
	 if (freiePlaetze > 0 && wartend > 0) {
		 int zuVergeben = Math.min(wartend, freiePlaetze);
		 fix += zuVergeben;
		 wartend -= zuVergeben;
	 }
	 
	 if (fix >= max) {
		 istVoll = true;
	 } else {
		 istVoll = false;
	 }
	 
	 System.out.println("Fixplätze vergeben: " + fix);
     System.out.println("Teilnehmer auf Warteliste: " + wartend);
     System.out.println("Ist Voll: " + istVoll);
 }
}
