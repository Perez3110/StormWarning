import java.util.Scanner;
public class EndofDays {

	public static void main(String[] args) {

		
	Scanner	input = new Scanner(System.in);
	
	
	
	
	System.out.print("Stormulator: Hello, there. Is this a harsh class title? \n 0 for no, 1 for yes: ");
	double introAnswer = input.nextDouble();
	if (introAnswer == 0) 
			System.out.println("\nStormulator: Well, you will change your answer to yes when I, Stormulator, \n"
					+ "bringer of the end, will unravel my mysterious power of the storm."); 
	if (introAnswer == 1)
		System.out.println("\nStormulator: Then my actions will agree with your answer when I, Stormulator, \n"
				+ "Bringer of the End, will unravel my mysterious power of the storm."); 
	else
		System.out.println("\nStormulator: I guess you were not able to answer me properly. \n"
				+ "I, Stormulator, Bringer of the End, shall keep you expressionless\n"
				+ "with my mysterious power of the storm.");
	
	System.out.print("\nEnter a number that is not greater than, but prefer to be 14 to continue.");
	int Mark = input.nextInt();
	
	switch (Mark) {
	case 0: System.out.println("\nStormulator: What have you done?! I absolutely cannot conjure any of my power!\n"
			+ "Fine, keep your boring stabilized weather!"
			+ "\nYou notice no change in weather and the voice of the Stormulator has"
			+ "\nvanished"); System.exit(1);
			
	case 1: System.out.println("\nStormulator: This is my power, but I'm not even trying"
			+ "\nYou feel a drizzle of peaceful rain."); break;
			
	case 2: System.out.println("\nStormulator: This is absoulutely riduculous, I will prove that I am terrifying"
			+ "\nsoon enough."
			+ "\nYou feel a strong breeze, only to realize that today is just a windy day."); break;
			
	case 3: System.out.println("\nStormulator: I will show you mercy; for now."
			+ "\nYou notice a simple, calming rainstorm that is relaxing to the ear."); break;
			
	case 4: System.out.println("\nStormulator: I guess now is not the time to show off my true evil power"
			+ "\nYou watch the news, noticing heavy rainstroms in California."); break;
				
	case 5: System.out.println("\nStormulator: This is just a simple fraction of my power"
			+ "\n You feel a cold breeze that begins to become colder, and then"
			+ "\n watch the news to notice frozen powerlines have knocked out power"
			+ "\n across a quarter of the entire state of Kansas."); break;	
				
	case 6: System.out.println("\nStormulator: Oh come on, this is just a pathetic demonstration of my power!"
			+ "\nYou notice on the news that a mysterious snowstorm started in "
			+ "\nmere seconds, but does not appear to be too deadly right now. "); break;
						
	case 7: System.out.println("\nStormulator: This is something that is usually seen, but this is still fun"
			+ "\nYou notice clouds combining to create a heavy rain storm frequent enough to flood "
			+ "\n an entire town,"); break;
							
	case 8: System.out.println("\nStormulator: This is not my half-way point of power, but this is better than nothing"
			+ "\nYou feel a strong breeze, then take a look at the news to realize that a combination"
			+ "\n of three colossal tornadoes going at ridiculous speeds of 80 miles per hour"
			+ "\n easily tear apart structures"); break;
								
	case 9: System.out.println("\nStormulator: A little under my standards, but blunt force sounds distastful enough."
			+ "\n You notice a giant cloud forming above your sheltered location\n"
			+ "then you begin to hear loud beating above you. You end up witnessing"
			+ "\n bowling ball-sized hail falling from the sky, preying that the stones will not fall through"); break;
									
	case 10: System.out.println("\nStormulator: Just like my average disaster, but this level should do."
			+ "\nYou begin to feel like your turning into a frozen statue and notice that the\n"
			+ "temerature has decreased to -93 degrees Fahrenheit"
			+ "\nyou quickly find a heated room to coordinate a plan"); break;
										
	case 11: System.out.println("\nStormulator: A nice choice, this will create a beautiful scene. \n"
			+ "You feel the earth begin to shake. Looking at the current state of disaster, \n"
			+ "you see the staff in a newsroom on television discuss a 9.1 Earthquake, followed by a loss\n"
			+ "of service"); break;
							
	case 12: System.out.println("\nStormulator: A decent choice, this will descend into chaos shortly."
			+ "\n Watching the news, you notice a dormant volcano beginning to rumble and erupt.\n"
			+ "The lava and smoke approach your city."); break;
								
	case 13: System.out.println("\nStormulator: This is almost the peak of my storm! Embrace the terror! \n"
			+ "You witness the creation of a godlike storm on your radar containing lightning strikes \n"
			+ "at the rapid count of 2,098,374 strikes in mere seconds with insane striking power, followed by a tornado-like blizzard\n"
			+ "vacuuming disaster. This storm approaches your city."); break;
									
	case 14: System.out.println("\nStormulator: I knew you wanted chaos to reign! Then behold my devastating storm! \n"
			+ "The evil being conjured a storm beyond belief. You hear a strong breeze, you see "
			+ "\nall devastating forms of weather, "
			+ "\nyou feel a strong chill, you smell disaster, and you will soon taste death."); break;
	
	default: System.out.println("\nStormulator: What is this? It appears that you have discovered newly found \n"
			+ "power for my brilliance! I now have the knowledge and power to create a species that \n"
			+ "will swarm your kind and I can just sit back and watch this show!"
			+ "\nYou notice alien creatures erupting from the ground, descending from the sky, appearing from th...\n"
			+ "\nStormulator: Ahahahaha! I'm so disastrous, you couldn't finish witnessing the gloriousness\n"
			+ "before I put an end to you. Just like everything else soon enough."); System.exit(2);
				
																																																												
	}
	
	
	
	char[] Fascination = {'F','a','s','c','i','n','a','t','i','n','g',',',' ', 'r','i','g','h','t','?'};
	System.out.print("\nStormulator: ");
	System.out.print(Fascination);
	
	System.out.println("\n1. Fascinating? Ha! Your efforts are laughable!"
			+ "\n2. Well that was... interesting."
			+ "\n3. That is fascinating, indeed!"
			+ "\n4. Please stop this madness!"
			+ "\n5. I shall put an end to your madness!"
			+ "\nAny Number. 'Remain Silent'");
	int Answer = input.nextInt();
	
		if (Answer == 1)
		System.out.println("I'll show you true power soon enough, then we will see who is laughable then.");
	
		if (Answer ==2)
		System.out.println("I will be sure you are actually interested soon enough.");	

		if (Answer ==3)
		System.out.println("I knew you would value my power. Now you shall witness even more!");	

		if (Answer ==4)
		System.out.println("Fine, I will stop, but after you have met your demise.");	

		if (Answer ==5)
		System.out.println("You cannot stop absolute power, but I would like to see you try!");	
	
		else if (Answer != 1 && Answer != 2 && Answer != 3 && Answer != 4 && Answer != 5)
			System.out.println("What is the matter? You are speechless!");
		
	System.out.print("\nEnter 1 to attempt to stop Stormulator, Enter 0 to give up: ");
	int attempt = input.nextInt();
	
	if (attempt == 1)
	System.out.println("\nWait, what do you think you are you doing!?");
	
	
	else {
		System.out.println("\nYou will taste death by my storm!"
				+ "\nStormulator uses the power of the current storm to annihilate you."
				+ "\nShould the current storm be too weak, Stormulator will enhance the storm\n"
				+ "and then annihilate you."); System.exit(3); }
	
		for (int i=0; i< 16; i=i+4) {
		if (i == 0)
			System.out.println("\nOkay, I have three shots at this to stop Stormulator. Now,"
				+ "\nI must recall the storm that was conjured.");
		if (i == 4)
			System.out.println("\nOkay, I have two attempts remaining. I must do better this time.");
		if (i == 8)
			System.out.println("\nStormulator: HAHAHAHA! You have one chance left! You can't possibly stop me, now!");
		if (i ==12) {
			System.out.println("\nStormulator: You are persistent, are you not? You will now pay for such transgression!"
					+ "\nStormulator conjured a giant cloud around the earth and enveloped the planet in \n"
					+ "a whirlwind of disaster."); System.exit(4); }
		
					int recall = Mark;
		
		int[][] RecallandRelease = new int [7][2];
		RecallandRelease[0][0] = 1;
		RecallandRelease[0][1] = 2;
		RecallandRelease[1][0] = 3;
		RecallandRelease[1][1] = 4;
		RecallandRelease[2][0] = 5;
		RecallandRelease[2][1] = 6;
		RecallandRelease[3][0] = 7;
		RecallandRelease[3][1] = 8;
		RecallandRelease[4][0] = 9;
		RecallandRelease[4][1] = 10;
		RecallandRelease[5][0] = 11;
		RecallandRelease[5][1] = 12;
		RecallandRelease[6][0] = 13;
		RecallandRelease[6][1] = 14;
		
		System.out.print("\nRecall the storm number requested by Stormulator to"
				+ "\nenter the storm's core and"
				+ "\ndesperately attempt to put a stop to it: ");
		int remember = input.nextInt();
		
		
		if (remember == recall){
		System.out.print("\nNow this is my only chance; I must get past this problem:"); 
		i = 16;
		    boolean release;
			int numberOne = (int) (Math.random() * 1000);
			int numberTwo = (int) (Math.random() * 1000);
			
			System.out.println(" What is " + numberOne + " + " + numberTwo + "?");
			int answer = input.nextInt();
			
			
			
				if (answer == numberOne + numberTwo) 
				System.out.println("\nStormulator: Noooooooooooooo?! My powers have been stripped from my hands; "
					+ "\nYou may have defeated me, but you have not erased my pow...\n"
					+ "\nCongratulations, you have defeated Stormulator!\n"
					+ "\nWhat is this!? You have suddenly burst to the skies and feel"
					+ "\nan intense sense of power flowing about you. Your will has been stripped"
					+ "\nfrom your hands and passed on to an unknown entity. You wish to conjure a storm.\n\n"); 
				
				else if (answer != numberOne + numberTwo) {
				System.out.println("\nYou failed to stop the storm, enraged Stormulator in the process, causing\n"
						+ "him to obliterate you."
						+ "\n\nStormulator: You are such a fool, thinking you were closing in on a \n"
						+ "solution. You instead closed in on death.");
				System.exit(6); }
				 
				}
		
			
			}
		
				CustomMethodtoTakePower(Mark);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

	private static void CustomMethodtoTakePower(int Destroy) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("You are forced to increase the power of the storm yourself."
				+ "\nIncreasing power will be done just by simply stacking the storms together."
				+ "\n\nEnter a value to do so. There is a secret to destroying this power."
				+ "\nThe value chosen will determine that."
				+ "\n\nHint: entering at least " + (Destroy + 15) + " \n"
						+ "will summon the end of days.");
		int IncrementPower = input.nextInt();
		int Result = IncrementPower - Destroy;
		if (Result == 0) {
			System.out.print("\nYou have snuffed out the storm by destroying the power"
					+ "\ncreating it. You have finally stabilized the weather and saved planet Earth."); System.exit(8);
		}
		if (Result == Destroy + 15) {
			System.out.print("\nYou notice creatures jutting from the ground, raining from the sky,"
					+ "\nblowing out of the..."
					+ "\nYour awareness is cut off by dying from the alien creatures.");
		}
		
		int strike = 0;
		if (Result >= 1 || Result <= 14)
		do {strike++;
			if (strike == 3) {
			System.out.println("The area is packed with storms and you feel overwhelmed by"
					+ "\n the amount of power that you have released. This is the time"
					+ "\n to call off ending the storm and watch the world come to an end."); System.exit(7); }
		
		System.out.println("The storm strengthens. You must try once again to stop this.");
			
		} while (Result !=0 || Result > 14 || Result < 0);
		
		
			
	}
		
		
	}
	


