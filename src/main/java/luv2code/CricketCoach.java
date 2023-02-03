package luv2code;

public class CricketCoach implements Coach {
	private String emailAdress;
	private String team;


	FortuneService fortuneService;
	//create a no-arg constructor

	public CricketCoach() {
		System.out.println("CricketCoach: inside no arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method.");
		this.fortuneService = fortuneService;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		System.out.println("CricketCoach: inside setter method. - setEmailAdress");
		this.emailAdress = emailAdress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method. - setTeam");
		this.team = team;
	}

	@Override

	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	@Override
	public String getDailyWorkout() {
		return "Bowl for 15 minutes.";
	}
}
