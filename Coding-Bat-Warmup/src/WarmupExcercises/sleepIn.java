package WarmupExcercises;

public void sleepIn(boolean weekday, boolean vacation) {
	  if (!weekday || vacation) {
	    return true;
	  }
	  else ( return false);
}
}
}
	  
	  // Solution notes: better to write "vacation" than "vacation == true"
	  // though they mean exactly the same thing.
	  // Likewise "!weekday" is better than "weekday == false".
	  // This all can be shortened to: return (!weekday || vacation);
	  // Her