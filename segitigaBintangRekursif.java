public class segitigaBintangRekursif {
    public static void main(String[] args) {
        // String p = "*";
        // p = p.substring(beginIndex);
        // sikuTerbalik(5);
        // System.out.println(a);
        // printStar("*", 5);
    }

    public static String sikuKeKanan(int count) {
        if (count == 0) return "";
        // System.out.println(p);
        String p = sikuKeKanan(count - 1);
        p = p + "*";
        System.out.println(p);
        return p;
    }

    public static String sikuTerbalik(int count) {
        if (count == 0) return "";
        String p = "";
        for (int i = 0; i < count; i++) {
            p += "*";
        }
        String a = p.substring(0, count);
        System.out.println(a);
        sikuTerbalik(count-1);
        return a;
    }

    // public static void printStar(String s, int lines) {
    //     String out = "";
    //     for (int i = 0; i < lines; i++) {
    //       out += s;
    //       System.out.println(out);
    //     }
    // }

    // public static int sikuKeKiri(int n) {
    //     if (n == 0) {
    //         return 1;
    //     }

    // }
}
