package twitter;


public class ASCIIEncodedString {


    public static String decode(String inputString){
        StringBuilder encodedString = new StringBuilder();
        encodedString.append(inputString);
        encodedString=encodedString.reverse();
        StringBuilder decodedString = new StringBuilder();
        int i = 0;
        while(i<=encodedString.length()-1){
            int twoDig = Integer.parseInt(encodedString.substring(i,i+2));
            if(twoDig == 32 || (twoDig >= 65 && twoDig <= 90) || (twoDig >= 97 && twoDig <=99)){
                decodedString.append((char)twoDig);
                i+=2;
            }else{
                int threeDig = Integer.parseInt(encodedString.substring(i,i+3));
                if(threeDig >= 100 && threeDig <=122){
                    decodedString.append((char)threeDig);
                    i+=3;
                }
            }
        }
        return String.valueOf(decodedString);

    }

    public static void main(String args[]){
        System.out.println("ASCIIEncodedString");
        System.out.println(ASCIIEncodedString.decode("23511011501782351112179911801562340161171141148"));
    }
}
