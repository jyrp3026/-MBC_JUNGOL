package Q9039;

public class Main {
    public static void main(String[] args){
        char[] arr = new char[26];
        for(int i = 0; i < 26; i++){
            arr[i] = (char)('A' + i);
        }

        for(char c : arr){
            System.out.print(c);
        }
    }
}
