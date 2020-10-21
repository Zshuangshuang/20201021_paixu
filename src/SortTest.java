/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-21
 * Time:19:42
 **/
public class SortTest {
    public static void selectSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            //maxIndex表示当前最大元素的位置，此时假设array[0]就是最大元素
            int maxIndex = 0;
            int j;
            //遍历无序区间，找到当前最大元素的位置
            for ( j = 1; j < array.length-i; j++) {
                if (array[j] > array[maxIndex]){
                    maxIndex = j;
                }
            }
            //将最大元素放到有序区间里面
            int tmp = array[maxIndex];
            array[maxIndex] = array[array.length-i-1];
            array[array.length-i-1] = tmp;
        }

    }
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            int j;
            //定义ret是对冒泡排序的一个优化，如果当前数组已经有序，可以直接从循环中break
            boolean ret = false;
            for ( j = 0; j <array.length-1-i ; j++) {
                if (array[j] > array[j+1]){
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                    ret =true;
                }
            }
            if (!ret){
                break;
            }
        }
    }

    public static void insertSort(int[] array){
        //[0，bound)表示已排序区间，这里我们假定第一个元素有序
        for (int bound = 0; bound < array.length-1; bound++) {
            //这里的key表示无序区间的第一个数字
            int key = array[bound+1];
            //cur表示当前有序区间的最后一个元素
            int cur;
            for (cur = bound; cur >= 0 ; cur--) {
                //如果key小于有序区间的最后一个元素，那么就将key的值语气交换
                if (key < array[cur]){
                    array[cur+1] = array[cur];
                }else {
                    break;
                }
            }
            array[cur+1] = key;
        }
    }
}
