package luv2code;

public class BoxingCoach implements Coach {

	FortuneService fortuneService;

	public BoxingCoach(FortuneService theFortuneService)
	{
		this.fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "20 Jap´s";
	}
	@Override
	public String getDailyFortune() {
		return "Today we will hit";
	}
}
