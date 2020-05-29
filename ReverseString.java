class Main {
  
  public static void main(String[] args) {
    
    String str = "Hi Welcome!";
    String revStr = reverseString(str);
    System.out.println(revStr);

  }

  private static String reverseString(String str){
     
     //get the string length
     int length=str.length();
     
     //Instantiated string builder
     StringBuilder sb = new StringBuilder();

     //start looping from last character of the string
     //start appending character one by one
     for(int i=length-1 ; i>=0 ; i--){
        sb.append(str.charAt(i));
     }

     return sb.toString();

  }
}
