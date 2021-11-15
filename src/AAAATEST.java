/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/9/3 21:01
 * @purpose 此类用于测试Java语法
 * @ModifiedRecords null
 */

/*
如果在 finally 中出现了 return，会吞掉异常
所以不要在finally中进行返回操作
 */
public class AAAATEST {
    public static void main(String[] args) {
        AAAATEST Demo3 = new AAAATEST();
        int i = Demo3.test();
        //结果为20
        System.out.println(i);
        int j = AAAATEST.test1();
        System.out.println(j);
    }


    public static int test() {
        int i;
        try {
            i = 10;
            return i;
        } finally {
            i = 20;
//            return i;  // 有return 为20 无return 为10
        }
    }

    public static int test1() {
        int i;
        try {
            i = 10;
            //这里应该会抛出异常
            i = i/0;
            return i;
        } finally {
            i = 20;
            return i;
        }
    }
}
