package luv2code;

public class TrackCoach implements Coach {

	FortuneService fortuneService;

	public TrackCoach(FortuneService theFortuneService)
	{
		this.fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Today we will Run !";
	}
}
