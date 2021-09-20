import java.util.*;
     class  Example{
     public static void main(String[] args){
	   
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number:");
        String word=scan.nextLine();
        System.out.println("count of vowels:"+countVowels(word));
        
	}
        
    public static int countVowels(String input) {
    return input.replaceAll("[^aeiouAEIOU]", "").length();
}
}
