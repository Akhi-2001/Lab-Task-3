package akhi;

public class Cricket extends Sports
{
    String matchType;
    int over;
    Player player;
    Cricket(String matchType, int over, Player player)
    {
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }

    void display()
    {
        System.out.println("Match Type: " +matchType);
        System.out.println("Over of the match: " +over);
        System.out.println("Name of the player: " +player.playerName);
        System.out.println("Jersey number of the player: " +player.jerseyNumber);
    }
}
/*
Name: Akhi Roy
ID: 2012020150
Section: D
Email: cse_2012020150@lus.ac.bd
Date: 11-10-2021
*/
