// import java.util.Arrays;

// diambil dari soal hacker rank
// https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

public class cloudHackerRank {
    public static void main(String[] args) {
        int[] c = {0,0,0,1,0,0};
        System.out.print(jumpingOnClouds(c));
    }

    static int jumpingOnClouds(int[] c) {
        // int res = 0;
        // int len = c.length-1;
        // while (len >= 0) {
        //     if (len >= 2) {
        //         if (c[len-2] == 0) {
        //             res++;
        //             len -= 2;
        //         }else{
        //             res++;
        //             len--;
        //         }
        //     }else if (len == 1) {
        //         if (c[len-1] == 0) {
        //             res++;
        //             len--;
        //             break;
        //         }
        //     }else{
        //         break;
        //     }
        // }
        // return res;

        // -----------------------------------------------------------------------------------------------
        
        // nemu di hackerrank discuss
        int count = -1;
        int n = c.length;
        for (int i = 0; i < n; i++, count++) {
            if (i<n-2 && c[i+2]==0) i++;
        }
        return count;

    }
}
