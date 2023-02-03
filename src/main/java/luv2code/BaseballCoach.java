package luv2code;

public class BaseballCoach implements Coach {

	//define a field for the dependency injection
	private FortuneService fortuneService;

    //definte a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService)
	{
		this.fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout()
	{
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {

		//use my fortuneService to a get a fortune
		return fortuneService.getDailyFortune();
	}
}
