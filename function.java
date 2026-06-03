// import java.util.Scanner;
// class function{
//     public static void printmyname(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         String name=sc.next();
//         printmyname(name);    //function call kiya haii

//     }
// }






// import java.util.Scanner;
// class function{
//     public static int sum(int a,int b){
//         System.out.println(a+b);
//         return 1;
//     }
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
        
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int add=sum(a,b);
//     }
// }







// import java.util.Scanner;
// class function{
//     public static int mul(int a,int b){
        
//         return a*b;
//     }
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         //int ans=mul(a,b); 
//         System.out.println(mul(a,b));
//     }
// }







// import java.util.Scanner;
// class function{
//     public static int fact(int n){
//         int f=1;
//         for(int i=n;i>=1;i--){
//              f=i*f;

//         }
//         return f;
        
       
//     }
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(fact(n));
//     }
// }





// import java.util.Scanner;
// class function{
//     public static int even(int a){
//         if(a%2==0){
//             System.out.println("evem");
//         }
//         else {
//             System.out.println("not");
//         }
//         return 1;
        

//     }
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         even(n);
        
//     }
// }




// import java.util.Scanner;
// class function{
//     public static int table(int n){
//         for(int i=1;i<=10;i++){
//             System.out.println(n*i);
//         }
//         return 1;
        
        
//     }
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         table(n);
        
//     }
// }





import java.util.Scanner;
class function{
    public static int prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("not");
                return 1;
            }
            
            
        }

        System.out.println("prime");
        return 1;
        
        
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        prime(n);
    }
}