public class advpattern {




// public static void palindromicNumber(int n) {

//     for(int i =1;i<=n;i++){
//         for(int j =1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int j =i;j>=1;j--){
//             System.out.print(j);
//         }
//         for(int j =2;j<=i;j++ ){
//             System.out.print(j);
//         }
//         System.out.println();
//     }
    
// }


// FLOYDS TRIANGLE //
// public static void floyds_Trianlge(int n){
//     int X =1;

//     for(int  i =1; i<=n;i++){
//         for(int j =1;j<=i;j++){
//             System.out.print(X + " ");
//             X++;
//         }
//         System.out.println();
//     }
// }

// 01 triangle //
// public static void zero_one_triangle(int n){
//     for(int i =1;i<=n;i++){

//         for(int j =1 ;j<=i;j++){
//             if((i+j) % 2 ==0){
//                 System.out.print("1");
//             }
//             else{
//                 System.out.print("0");
//             }
//         }
//         System.out.println();
//     }
// }

// SOLID RHOMBUS //
// public static void solidRhombus(int n) {
//     for(int i =1;i<=n;i++){
//         for(int j =1;j<=(n-i);j++){
//             System.out.print(" ");
//         }
//         for(int j =1;j<=n;j++){
//             System.out.print (" * ");
//         }
// System.out.println();
//     }
    
// }



// DIAMOND PATTERN //
public static void diamondPattern(int n){
    for(int i =1;i<=n;i++){
        // SAPCES //
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        } 
         // STARS//
        for(int j =1;j<=(2*i)-1;j++){
            System.out.print(" * ");
        }
        System.out.println();
    }

    // 2nd half //
    for(int i =n;i>=1;i--){
        // SAPCES //
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        } 
         // STARS//
        for(int j =1;j<=(2*i)-1;j++){
            System.out.print(" * ");
        }
        System.out.println();
    }
}


public static void main(String args[]){
    diamondPattern(4);


        
    }
    


































    // public static void numberPattern(int n){
    //     for(int i =1;i<=n;i++){

    //         // for spaces //
    //         for(int j =1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j =1;j<=i;j++){
    //             System.out.print(i + " ");
    //         }System.out.println();
    //     }
    // }
    // public static void main(String args[]){
    //     numberPattern(5);


        
    // }



    
}
