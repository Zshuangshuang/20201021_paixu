import java.util.Arrays;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-21
 * Time:20:24
 **/
public class Test {

    public static void main(String[] args) {
        int[] 一般数字 = {2,4,1,5,6,7};
        int[] 逆序数组 = {5,4,3,2,1};
        int[] 相等数字 = {6,6,6,6,6};
        SortTest.bubbleSort(一般数字);
        System.out.println(Arrays.toString(一般数字));
    }
}
