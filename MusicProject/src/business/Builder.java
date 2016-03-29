package business;

/**
 *
 * @author mhuhn
 */

public class Builder {
    
	//change buildScale parameter to an int to work with the main menu
	//combine triad and chord methods
	
    public static String buildScale(int note, int type){
	
    	String typeString = "";
    	String result = "";

    	switch (type) {
    	case 1:
    		typeString = "Chromatic";
    		break;
    	case 2: 
    		typeString = "Major";
    		break;
    	case 3: 
    		typeString = "Minor";
    		break;
    	case 4:
    		typeString = "Blues";
    		break;
    	case 5: 
    		typeString = "Dorian";
    		break;
    	default:
    		break;
    	}

    	if(note>0){
    		if(typeString.equalsIgnoreCase("Chromatic")){
    			for(int i=0; i<12; i++){
    				result+= Method.numberToNote(note + i) + " ";
    			}
    		} else if(typeString.equalsIgnoreCase("Major")){
    			result+= Method.numberToNote(note) + " ";
    			result+= Method.numberToNote(note += 2) + " ";
    			result+= Method.numberToNote(note += 2) + " ";
    			result+= Method.numberToNote(note += 1) + " ";
    			result+= Method.numberToNote(note += 2) + " ";
    			result+= Method.numberToNote(note += 2) + " ";
    			result+= Method.numberToNote(note += 2) + " ";
    			result+= Method.numberToNote(note += 1) + " ";
    		} else if(typeString.equalsIgnoreCase("Minor")){
    			result+= Method.numberToNote(note) + " ";
    			result+= Method.numberToNote(note += 2) + " ";
    			result+= Method.numberToNote(note += 1) + " ";
    			result+= Method.numberToNote(note += 2) + " ";
    			result+= Method.numberToNote(note += 2) + " ";
    			result+= Method.numberToNote(note += 1) + " ";
    			result+= Method.numberToNote(note += 2) + " ";
    			result+= Method.numberToNote(note += 2) + " ";
    		}else if(typeString.equalsIgnoreCase("Blues")){
    			result+= Method.numberToNote(note) + " ";
    			result+= Method.numberToNote(note += 2) + " ";
    			result+= Method.numberToNote(note += 2) + " ";
    			result+= Method.numberToNote(note += 1) + " ";
    			result+= Method.numberToNote(note += 1) + " ";
    			result+= Method.numberToNote(note += 3) + " ";
    			result+= Method.numberToNote(note += 2) + " ";
    			result+= Method.numberToNote(note += 2) + " ";
    		} else if(typeString.equalsIgnoreCase("Dorian")){
    			result+= Method.numberToNote(note) + " ";
    			result+= Method.numberToNote(note += 2) + " ";
    			result+= Method.numberToNote(note += 1) + " ";
    			result+= Method.numberToNote(note += 2) + " ";
    			result+= Method.numberToNote(note += 2) + " ";
    			result+= Method.numberToNote(note += 2) + " ";
    			result+= Method.numberToNote(note += 1) + " ";
    			result+= Method.numberToNote(note += 2) + " ";
    		} 
    	}
		return result;
    }
    
    public static String buildChord(int note, int type){

    	String typeString = "";
    	String result = "";

    	switch (type) {
			case 1:
				typeString = "Major Triad";
				break;
			case 2: 
				typeString = "Minor Triad";
				break;
			case 3: 
				typeString = "Major 7th";
				break;
			case 4:
				typeString = "Minor 7th";
				break;
			default:
				break;
		}

    	if (note>0){
    		if (typeString.equalsIgnoreCase("Major Triad")){
    			result+= Method.numberToNote(note) + " ";
    			result+= Method.numberToNote(note += 4) + " ";
    			result+= Method.numberToNote(note += 3) + " ";
    		} else if (typeString.equalsIgnoreCase("Minor Triad")){
    			result+= Method.numberToNote(note) + " ";
    			result+= Method.numberToNote(note += 3) + " ";
    			result+= Method.numberToNote(note += 4) + " ";
    		} else if (typeString.equalsIgnoreCase("Major 7th")){
    			result+= Method.numberToNote(note) + " ";
    			result+= Method.numberToNote(note += 4) + " ";
    			result+= Method.numberToNote(note += 3) + " ";
    			result+= Method.numberToNote(note += 4) + " ";
    		} else if (typeString.equalsIgnoreCase("Minor 7th")){
    			result+= Method.numberToNote(note) + " ";
    			result+= Method.numberToNote(note += 3) + " ";
    			result+= Method.numberToNote(note += 4) + " ";
    			result+= Method.numberToNote(note += 3) + " ";
    		}
    	}
    	return result;
    }
  
}

