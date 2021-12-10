package leetcode;
import java.util.Scanner;
public class huixingshu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int[][] b = new int[a][a];
        int k = 1, i=0, j=0,c=a,h=0;
        while(c>1) {
            for (; j < c -1; j++) {
                b[i][j] = k;
                k++;
            }
            for (; i < c -1; i++) {
                b[i][j] = k;
                k++;
            }
            for (; j>h; j--) {
                b[i][j] = k;
                k++;
            }
            for (; i > h; i--) {
                b[i][j] = k;
                k++;
            }
            h++;
            i=0;
            j=0;
            i=h;
            j=h;
            c--;
        }
       if(a%2!=0){
           b[(a-1)/2][(a-1)/2]=a*a;
       }
       for(i=0;i<a;i++){
            for(j=0;j<a;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }
    }
}