
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fName = scan.nextLine();

        System.out.println("Team:");
        String sTm = scan.nextLine();

        int gamesP = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner read = new Scanner(Paths.get(fName))) {
            while (read.hasNextLine()) {
                String line = read.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] pt = line.split(",");
                String hTm = pt[0];
                String vTm = pt[1];
                int hScore = Integer.valueOf(pt[2]);
                int vScore = Integer.valueOf(pt[3]);

                if (hTm.equals(sTm)) {
                    gamesP++;
                    if (hScore > vScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (vTm.equals(sTm)) {
                    gamesP++;
                    if (vScore > hScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + gamesP);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
