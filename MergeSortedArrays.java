class Main {
  
  public static void main(String[] args) {
    
   int[] array1 = {0,3,7,31};
   int[] array2 = {4,,7,8,30,45};

   int result[] = mergeSortedArrays(array1,array2);

   System.out.println(result);

  }

  private static int[] mergeSortedArrays(int[] array1,int[] array2){
     
     int len1 = array1.length;
     int len2 = array2.length;
     
     int result[] = new int[len1 + len2];

     int i=0,j=0,k=0;

     while(i < len1 && j < len2){

       if(array[i] <= array2[j]){
          result[k] = array1[i];
          k++;
          i++;
       }
       else{
          result[k] = array2[j];
          k++;
          j++;
       }
    }

    while(i < len1){
      result[k] = array1[i];
      k++;
      i++;
    }

    while(j < len2){
      result[k] = array2[j];
      k++;
      j++;
    }

    return result;

  }
}
