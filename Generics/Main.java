package Generics;

public class Main {
  public static void main(String[] args) {
    SoccerPlayer beckham = new SoccerPlayer("Beckham");
    BaseballPlayer tim = new BaseballPlayer("Tim");

    Team<SoccerPlayer> teamSoccer = new Team<>("Team Soccer");
    //ensure that only the same kind of sports players can be added to a team
    //Team class must be Generic
    teamSoccer.addPlayer(beckham);
    Team<SoccerPlayer> teamSoccerTwo = new Team<>("Team Soccer 2");
    teamSoccer.addPlayer(beckham);

    Team<BaseballPlayer> teamBaseball = new Team<>("Team Baseball");
    teamBaseball.addPlayer(tim);

    //this won't work because in generic class Team, we have specified bounded parameter, must be a type of Player
    // Team<String> brokenTeam = newTeam<>("this won't work");
    // brokenTeam.addPlayer("no-one")

    teamSoccer.results(teamSoccerTwo, 10, 5);
    System.out.println(teamSoccer.compareTo(teamSoccerTwo));

    //LEAGUE --> teams --> players
    League<Team<SoccerPlayer>> soccerLeague = new League<>("SoccerLeague");
    soccerLeague.add(teamSoccer);
    soccerLeague.add(teamSoccerTwo);
    soccerLeague.showLeagueTable();

  }

}
