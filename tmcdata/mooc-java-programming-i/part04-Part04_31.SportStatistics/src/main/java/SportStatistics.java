
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        int gameCounter=0;
        int wins = 0;
        int losses =0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String fileName = scan.nextLine();

        System.out.println("Team: ");
        String teamName = scan.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String[] shiai = line.split(",");
                String homeTeam = shiai[0];
                String visitingTeam = shiai[1];
                int homeScore = Integer.valueOf(shiai[2]);
                int visitingScore = Integer.valueOf(shiai[3]);

                if (homeTeam.equals(teamName)){
                    gameCounter++;
                    if (homeScore>visitingScore){
                        wins++;
                    }
                    else{
                        losses++;
                    }
                }
                if (visitingTeam.equals(teamName)){
                    gameCounter++;

                    if(visitingScore>homeScore){
                        wins++;
                    }
                    else{
                        losses++;
                    }
                }
            }

            System.out.println("Games: "+ gameCounter);
            System.out.println("Wins: "+ wins);
            System.out.println("Losses: "+losses);
        } catch (Exception e) {
            System.out.println("Error: cannot read file");
        }
    }

}
