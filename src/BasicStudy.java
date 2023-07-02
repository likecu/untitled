
/**
 * @Description: 自由块
 * @Author: likecu
 * @Date: 2023/7/2
 */
public class BasicStudy {

    static int x=10;
    static { x/=3;}
    static { x+=5;}


    public static void main(String[] args) {
        System.out.println(x); // 5
        // 不能不初始化就使用
        Integer k = null;
        System.out.println((Object) null);
    }
}
