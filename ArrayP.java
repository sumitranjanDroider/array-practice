class ArrayP{

  public static void main(String[] args){
   int arr[]={1,2,3,4,5,6,7,8,9};
    for(int i=0;i<arr.length;i++){
        System.out.println("Index "+i+" Value Present "+arr[i]);
     }
//For each
    for(int value:arr){
  
     System.out.println("Index Is not available only value "+value);
    }
    //While Loop 
    int i=0;
    while(i<arr.length){
     System.out.println(i);
      i++;
    }
}
}
