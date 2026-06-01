// import java.util.Scanner;
// class patternproblem{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         for(int i=1; i<=4; i++){
//             System.out.println("*");
//         }
//     }
// }


//solid rectanglr
// import java.util.Scanner;
// class patternproblem{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=5; j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }



//hollow rectangle
// import java.util.Scanner;
// class patternproblem{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=5; j++){
//                 if(i==1 ||j==1||i==4||j==5){
//                 System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }



//half pyramid
// import java.util.Scanner;
// class patternproblem{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
                
//             }
//             System.out.println("");
//         }
//     }
// }





//inverted half pyramid
// import java.util.Scanner;
// class patternproblem{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         for(int i=4; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
                
//             }
//             System.out.println("");
//         }
//     }
// }


//180 half pyramid
// import java.util.Scanner;
// class patternproblem{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         for(int i=1; i<=4; i++){
//             for(int j=1;j<=4-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
                
//             }
//             System.out.println("");
//         }
//     }
// }




// import java.util.Scanner;
// class patternproblem{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j);
                
//             }
//             System.out.println("");
//         }
//     }
// }







import java.util.Scanner;
class patternproblem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
                
            }
            System.out.println("");
        }
    }
}




