/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.model;

import java.util.Calendar;

/**
 *
 * @author wsuetholz
 */
public class WelcomeService {
    private static String MORNING = "morning";
    private static String AFTERNOON = "afternoon";
    private static String EVENING = "evening";
    
    private static int MORNING_AFTERNOON_CUT = 12;
    private static int AFTERNOON_EVENING_CUT = 18;
    private static int EVENING_MORNING_CUT = 0;
    private static int EVENING_AFTERNOON_CUT = 24;
    
    private Calendar currDate;
    
    public String getMorningNoonNight ( ) {
	String ret = MORNING;
	
	currDate = Calendar.getInstance();
	
	// Setup Date Comparisons
	Calendar smallDate = Calendar.getInstance();
	smallDate.set(Calendar.MINUTE, 0);
	smallDate.set(Calendar.SECOND, 0);
	smallDate.set(Calendar.MILLISECOND, 0);
	Calendar largeDate = Calendar.getInstance();
	largeDate.set(Calendar.MINUTE, 0);
	largeDate.set(Calendar.SECOND, 0);
	largeDate.set(Calendar.MILLISECOND, 0);

	
	smallDate.set(Calendar.HOUR_OF_DAY, EVENING_MORNING_CUT);
	largeDate.set(Calendar.HOUR_OF_DAY, MORNING_AFTERNOON_CUT);
	if ((currDate.after(smallDate) || currDate.equals(smallDate)) && currDate.before(largeDate)) {
	    ret = MORNING;
	}
	
	smallDate.set(Calendar.HOUR_OF_DAY, MORNING_AFTERNOON_CUT);
	largeDate.set(Calendar.HOUR_OF_DAY, AFTERNOON_EVENING_CUT);
	if ((currDate.after(smallDate) || currDate.equals(smallDate)) && currDate.before(largeDate)) {
	    ret = AFTERNOON;
	}

	smallDate.set(Calendar.HOUR_OF_DAY, MORNING_AFTERNOON_CUT);
	largeDate.set(Calendar.HOUR_OF_DAY, EVENING_AFTERNOON_CUT);
	if ((currDate.after(smallDate) || currDate.equals(smallDate)) && currDate.before(largeDate)) {
	    ret = EVENING;
	}
	
	return ret;
    }

    public String getWelcome (String name) {
	String pubName;
	if (name == null || name.length() < 0) {
	    pubName = "User";
	} else {
	    pubName = name;
	}
	
	return "Good " + getMorningNoonNight() + ", " + pubName + ".  Welcome!" ;
    }
}
