/* ***********************
 * RamString.java
 * This class is to implement WackyStringInterface
 * ***********************************
 * Jennifer Wang
 * CMSC256 - Online Section
 * February 17, 2022
 **************************************** */
package cmsc256;

public class RamString implements WackyStringInterface{

    private String string; //instance string variable

    public RamString(){
        string = "Let's Go Rams and CS@VCU!"; //the string to be set
    }

    public RamString(String string){
        if (string == null){
            throw new IllegalArgumentException("Cannot be null");
        } else{
            this.string = string;
        }; //sets the current string
    }

    @Override
    public void setWackyString(String string) {
        if (string == null){
            throw new IllegalArgumentException("Cannot be null");
        } else{
            this.string = string;
        } //return string
    }

    @Override
    public String getWackyString() {
        return string; //return current string
    }

    @Override
    public String getEveryThirdCharacter() {
        String thirdCharStr = "";
        for(int x = 2; x < string.length(); x+=3){ // goes through all index of the string
            thirdCharStr += string.charAt(x); //placing the third values of the string in a char array
        }
        return thirdCharStr; //returns the third values as a string
    }

    @Override
    public String getEvenOrOddCharacters(String evenOrOdd) throws IllegalArgumentException{
        String evenstr = "";
        String oddstr = "";
        if (evenOrOdd.equals("even")) { //determines that the string is even
            for (int x = 1; x < string.length(); x += 2) { //goes through all index of the string
                evenstr += string.charAt(x); //place even indexes in a char array
            }
            return evenstr; //return even string
        }
        else if (evenOrOdd.equals("odd")) { //determines that the string is odd
            for (int x = 0; x < string.length(); x += 2) {
                oddstr += string.charAt(x); //place odd indexes in a char array
            }
            return oddstr; //return odd string
        } else {
            //throws IllegalArgumentException if parameter is neither odd nor even
            throw new IllegalArgumentException("parameter is neither odd nor even");
        }
    }

    @Override
    public int countDoubleDigits() {
        int count = 0;
        // returns 0 if string is null or the length is 0
        if ((string == null) || (string.length() == 0)){
            return 0;
        }
        for (int x = 1; x < string.length(); x++){ //goes through all index of the string

            //Find the count of same digits that are side by side
            if (Character.isDigit(string.charAt(x)) == Character.isDigit(string.charAt(x-1))){
                //idenifies that there are more than 2 digits
                if((((x+1) < string.length()) && (Character.isDigit(string.charAt(x)) == ((Character.isDigit(string.charAt(x+1))))))){
                    x += 2;
                }
                //exactly 2 digits
                else {
                    count++; //add onto count whenever there's a double digits
                }
            }
        }
        return count; //return count of double digits
    }

    @Override
    public boolean isValidVCUEmail() {
        boolean valid = false; //initiate boolean valid
        for (int x = 0; x < string.length(); x++){ //goes through all index of the string
            if (string.charAt(x) == '@') { //Find the index of char '@'
                int length = string.length();
                String at = string.substring((x + 1), length);
                //determine if email is formatted correctly
                if ((x > 0) && ((at.equals("vcu.edu")) || (at.equals("mymail.vcu.edu")))) {
                    valid = true; //true if meet all requirements
                }
                else valid = false; //false if did not meet all requirements
            }
        }
        return valid;
    }

    @Override
    public String standardizePhoneNumber() {
        //initialize strings formatted and phoneNum to an empty string
        String formatted = "";
        String phoneNum = "";
        for(int x = 0; x < string.length(); x++) { //goes through all index of the string
            if (Character.isDigit(string.charAt(x))) { //determine if digit exists in the string
                phoneNum += string.charAt(x);
            }
        }
        // if phoneNum string does not contain exactly 10 digits, then the following statement is returned
        if(phoneNum.length() != 10){
            return "This WackyString is not a phone number.";
        }
        // the string formatted is structured with paranthesis surrounding the first 3 digits
        formatted = "(" + phoneNum.charAt(0) + phoneNum.charAt(1) + phoneNum.charAt(2)+ ") " +
                phoneNum.charAt(3) + phoneNum.charAt(4) + phoneNum.charAt(5) + "-" +
                phoneNum.charAt(6) + phoneNum.charAt(7) + phoneNum.charAt(8) + phoneNum.charAt(9);
        return formatted; //return the correctly formatted phone number
    }

    @Override
    public void ramifyString() {
        String ramify = "";
        for(int x = 0; x < string.length(); x++) {
            if (((string.charAt(x)) == '0') && ((string.charAt(x+1)) == '0') &&
                    ((x+2) < string.length()) && ((string.charAt(x+2)) == '0'))  {
                ramify += "000";
                x = x+2;
            }
            else if (((string.charAt(x)) == '0') && ((string.charAt(x+1)) == '0') &&
                    ((x+1) < string.length())){
                ramify += "CS@VCU";
                x++;
            }
            else if(string.charAt(x) == '0'){
                ramify += "Go Rams";
            }
            else{
                ramify += string.charAt(x);
            }
        }
        string = ramify;
    }

    @Override
    public void convertDigitsToRomanNumeralsInSubstring(int startPosition, int endPosition)
            throws MyIndexOutOfBoundsException, IllegalArgumentException {
        //if startPosition and endPosition are out of bound, throw MyIndexOutOfBoundException
        if(startPosition > string.length() || startPosition < 1 ||
                endPosition > string.length() || endPosition < 1){
            throw new MyIndexOutOfBoundsException("Start position and/or end position are out of bound");
        }
        //if startPosition is greater than endPosition, throw IllegalArgumentException
        else if(startPosition > endPosition){
            throw new IllegalArgumentException("Start position is greater than end position");
        }
        //if startPosition and endPosition are the same, an empty string is passed
        else if(startPosition == endPosition){
            string = "";
        }
        else
            //restrict the indexes searched within the bounds of startPosition and endPosition
            for (int x = startPosition; x <= endPosition; x++){
                char num = string.charAt(x);
                if(Character.isDigit(string.charAt(x))){ //determine if the value at the index is a digit

                    // replace search char digit as a roman numeral
                    if (num == 1){ string += "I"; }
                    else if (num == 2){ string += "II";}
                    else if (num == 3){ string += "III";}
                    else if (num == 4){ string += "IV";}
                    else if (num == 5){ string += "V";}
                    else if (num == 6){ string += "VI";}
                    else if (num == 7){ string += "VII";}
                    else if (num == 8){ string += "VIII";}
                    else if (num == 9){ string += "IX";}
                    else string += "0";
                }
            }
        setWackyString(string); //return the roman numerals
    }
}