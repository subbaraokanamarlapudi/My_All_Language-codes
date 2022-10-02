public class prac1_advancedpatterns {
    // write a program to print palindrome pattern

    public static void  palindromePATTERN(int n){
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){//spaces
           System.out.print(" ");
        }
        //desending order
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        //ascending order
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
       }
   
    }
    
    public static void main(String args[]){
        int n=7;
       palindromePATTERN(n);
    }
}
