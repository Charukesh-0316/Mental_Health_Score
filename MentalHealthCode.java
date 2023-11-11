package mental_health.code;

import java.util.Scanner;

public class MentalHealthCode {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String [] questionStrings = 
			{
					"Do you often feel overwhelming sadness or a sense of hopelessness?",
		            "Have you experienced a significant change in your appetite or weight recently?",
		            "Do you find it challenging to concentrate on tasks that used to be easy for you?",
		            "Have you noticed a decrease in your energy levels or increased fatigue?",
		            "Are you more irritable or easily angered than usual?",
		            "Have you experienced changes in your sleep patterns, such as insomnia or oversleeping?",
		            "Do you often feel anxious or excessively worry about various aspects of your life?",
		            "Have you lost interest in activities that you used to enjoy?",
		            "Do you have thoughts of self-harm or suicide?",
		            "Have you experienced a loss or significant life event recently?"
			};
		
		int points = 0;
		for (int i = 0; i < questionStrings.length; i++) {
			System.out.println(questionStrings[i]);
			System.out.println("Yes or No");
			String answerString = scanner.next();
			if(answerString.equalsIgnoreCase("no") || answerString.equals("2")) {
				points++;
			}
		}
		System.out.println("Total Points " + points);
		if(points>=7) {
			System.out.println("You are well being with score : " + points);
		}else if(points>=5 && points<7) {
			System.out.println("Your mental well-being is in a moderate range. Consider seeking support or monitoring your well-being. With score "+ points );
		}else if(points<5) {
			System.out.println("Consider seeking support for your mental well-being.With score " + points);
		}
		
	}

}
