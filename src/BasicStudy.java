/**
 * @Description: 自由块
 * @Author: likecu
 * @Date: 2023/7/2
 */
public class BasicStudy {

    static int x = 10;

    static {
        x /= 3;
    }

    static {
        x += 5;
    }


    public static void main(String[] args) {
        System.out.println(x); // 5
        // 不能不初始化就使用
        Integer k = null;
        System.out.println((Object) null);

        String string = "testString";
        String t = string;
        System.out.println(string.hashCode());
        string += 1;
        System.out.println(string + "  " + t); //testString1
        System.out.println(string.length());
        System.out.println(string.hashCode());

        int[] ints = new int[]{1, 2, 3, 4, 5};
        System.out.println(ints.length);

        int x = 6;
        int t1 = ++x + x++;
        System.out.println("help  " + t1 + "  " + x);

        x = 6;
        t1 = x++ + x++;
        System.out.println("help  " + t1 + "  " + x);
    }

    class Super {
        public int getLength() {
            return 4;
        }

    }

    public class Sub extends Super {
        public int getLength() {
            return 5;
        }

        public void main(String[] args) {

            Super sooper = new Super();
            Super sub = new Sub();
            System.out.println(sooper.getLength() + " " + sub.getLength());
        }

        ;

    }
}
