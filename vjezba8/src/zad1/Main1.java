package zad1;

public class Main1 {

    public static void main(String[] args) {
        System.out.println("Reading the file using Scanner:\n");
        FileHandling.readFileScanner("vjezba8/src/zad1/randText.txt_namjernaGreska");
        System.out.println("---------------------------------");
        System.out.println("Reading the file using BufferedReader:\n");
        FileHandling.readFileBufferedReader("vjezba8/src/zad1/randText.txt");
        System.out.println("---------------------------------");
        System.out.println("Creating a file:\n");
        FileHandling.createAFile();
        System.out.println("---------------------------------");
        System.out.println("Writing to a file:\n");
        FileHandling.writeToFile("vjezba8/src/zad1/noviFile.txt", "Its been 5 minutes without Fortnite. I cannot walk without trembling , I feel like I am going through withdrawals. I can't go much longer without Fortnite, I can barely breathe I don't know how much longer I can last here without Fortnite.");

    }
}
