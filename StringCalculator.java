package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class StringCalculator {
/*
	//Point 1
    public int add(String input) {

    	int result = 0;

    	if(Objects.nonNull(input) && !input.isEmpty()) {

    		String[] splitted = input.split(",");

    		for (String string : splitted) {
				result += Integer.parseInt(string);
			}
    	}
        return result;
    }
*/
/*
	//Point 3
    public int add(String input) {

    	int result = 0;

    	if(Objects.nonNull(input) && !input.isEmpty()) {

    		String[] splittedByComma = input.split(",");

    		for (String string : splittedByComma) {
    			String[] splittedByNewLine = string.split("\n");

    			for (String string2 : splittedByNewLine) {
    				if(!string2.isEmpty()) {
        				result += Integer.parseInt(string2);
    				}
				}
			}
    	}
        return result;
    }
*/

/*
//Point 4
public int add(String input) {

    int result = 0;
    String defaultDelimiter = ",";

    if(Objects.nonNull(input) && !input.isEmpty()) {

        if(input.startsWith("//")) {
            System.out.println(true);
            defaultDelimiter = String.valueOf( input.charAt(2) );
            input = input.substring(4);
        }

        String[] splittedByComma = input.split(defaultDelimiter);

        for (String string : splittedByComma) {
            String[] splittedByNewLine = string.split("\n");

            for (String string2 : splittedByNewLine) {
                if(!string2.isEmpty()) {
                    result += Integer.parseInt(string2);
                }
            }
        }
    }
    return result;
}
*/

/*
//Point 5
public int add(String input) throws Exception {

    int result = 0;
    String defaultDelimiter = ",";
    List<Integer> negativeNumbers = new ArrayList<Integer>();

    if(Objects.nonNull(input) && !input.isEmpty()) {

        if(input.startsWith("//")) {
            System.out.println(true);
            defaultDelimiter = String.valueOf( input.charAt(2) );
            input = input.substring(4);
        }

        String[] splittedByComma = input.split(defaultDelimiter);

        for (String string : splittedByComma) {
            String[] splittedByNewLine = string.split("\n");

            for (String string2 : splittedByNewLine) {
                if(!string2.isEmpty()) {
                    Integer no = Integer.parseInt(string2);
                    if (Integer.signum(no) == -1){
                        negativeNumbers.add(no);
                    }else {
                        result += no;
                    }
                }
            }
        }
    }
    if (!negativeNumbers.isEmpty()){
        throw new Exception("negatives not allowed - " + negativeNumbers.toString());
    }
    return result;
}
*/

    //Point 6
    public int add(String input) throws Exception {

        int result = 0;
        String defaultDelimiter = ",";
        List<Integer> negativeNumbers = new ArrayList<Integer>();

        if(Objects.nonNull(input) && !input.isEmpty()) {

            if(input.startsWith("//")) {
                System.out.println(true);
                defaultDelimiter = String.valueOf( input.charAt(2) );
                input = input.substring(4);
            }

            String[] splittedByComma = input.split(defaultDelimiter);

            for (String string : splittedByComma) {
                String[] splittedByNewLine = string.split("\n");

                for (String string2 : splittedByNewLine) {
                    if(!string2.isEmpty()) {
                        Integer no = Integer.parseInt(string2);
                        if (Integer.signum(no) == -1){
                            negativeNumbers.add(no);
                        }else {
                            if (no <= 1000){
                                result += no;
                            }
                        }
                    }
                }
            }
        }
        if (!negativeNumbers.isEmpty()){
            throw new Exception("negatives not allowed - " + negativeNumbers.toString());
        }
        return result;
    }

}