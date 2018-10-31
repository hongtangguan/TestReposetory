package maopao;

/**
 * @Auther: ZGS
 * @Date: 2018/10/30 20:35
 * @Description:
 */
public class Demo {

    static Boolean foo(char c){
        System.out.println(c);
        return true;
    }

    public static void main(String[] args) {
        int i = 0;
        for (foo('A');foo('B') &&(i<2);foo('D')){
            i++;
            foo('D');
        }
    }

}
