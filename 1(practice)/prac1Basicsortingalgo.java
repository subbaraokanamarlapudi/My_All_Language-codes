public class prac1Basicsortingalgo {
    // insertion sort ascending order sorting
   
    
  
       public static void Printarray(int arr[]){
        System.out.print( "selection sort in Descending order is: ");
        for(int j=0;j<arr.length;j++){
            System.out.print( arr[j]+" ");}
       }
    public static void main(String args[]){
        int arr[]={1,2,1};
        Selectionsort(arr);// function call for sorting
        Printarray(arr);// function call for printing sorted array
       
       
    }
    private static void Selectionsort(int[] arr) {
    }
    
}
