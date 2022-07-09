package String;

public class Encryptor {
    public static String change(String str,int key){
        int newKey = key % 26;
        char[] charArray = new char[str.length()];
        for(int i=0;i<str.length();i++){
            int newLetterPsn= str.charAt(i) + newKey; //i int aayathu kondu we get its ASCII value
            if(newLetterPsn<=122){
                charArray[i]=(char) newLetterPsn; //(char) type casting - it converts ASCII values to Character
            } else {
                charArray[i]=(char) (96+newLetterPsn%122);
            }
        }
        return new String(charArray);
    }
    public static void main(String[] args){
        String value="xyz";
        System.out.println(change(value,2));
    }
}

// H.W - AAABBDD -> 3A2B2D
