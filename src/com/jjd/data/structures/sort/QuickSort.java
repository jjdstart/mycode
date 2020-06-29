package com.jjd.data.structures.sort;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author jjd
 * @date 2020-05-26
 */
public class QuickSort {

    public static void main(String[] args) {
        //测试快排的执行速度
        // 创建要给80000个的随机的数组
        /*int[] arr = new int[8000000];*/
       /* for (int i = 0; i < 8000000; i++) {
            arr[i] = (int) (Math.random() * 8000000); // 生成一个[0, 8000000) 数
        }*/
        int[] arr = {-9, 78, 0, 23, -567, 70, -1, 900, 4561};

        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(data1);
        System.out.println("排序前的时间是=" + date1Str);

        quickSort(arr, 0, arr.length - 1);

        Date data2 = new Date();
        String date2Str = simpleDateFormat.format(data2);
        System.out.println("排序前的时间是=" + date2Str);
        //System.out.println("arr=" + Arrays.toString(arr));
    }


    //八百万数据耗时1秒
    public static void quickSort(int[] v, int low, int high) {
        if (low >= high) {                 //结束标志
            return;
        }

        int first = low;                   //低位下标
        int last = high;                   //高位下标
        int key = v[first];                //设第一个为基准

        while (first < last) {
            // 将比第一个小的移到前面
            while (first < last && v[last] >= key) {
                last--;

            }
            if (first < last) {
                v[first++] = v[last];
            }
            // 将比第一个大的移到后面
            while (first < last && v[first] <= key) {
                first++;
            }
            if (first < last) {
                v[last--] = v[first];
            }
        }
        v[first] = key;
        quickSort(v, low, first - 1);
        quickSort(v, first + 1, high);
    }

    //八百万数据耗时2秒
    public static void quickSort2(int[] arr, int left, int right) {
        int l = left; //左下标
        int r = right; //右下标
        //pivot 中轴值
        int pivot = arr[(left + right) / 2];
        int temp = 0; //临时变量，作为交换时使用
        //while循环的目的是让比pivot 值小放到左边
        //比pivot 值大放到右边
        while (l < r) {
            //在pivot的左边一直找,找到大于等于pivot值,才退出
            while (arr[l] < pivot) {
                l += 1;
            }
            //在pivot的右边一直找,找到小于等于pivot值,才退出
            while (arr[r] > pivot) {
                r -= 1;
            }
            //如果l >= r说明pivot 的左右两的值，已经按照左边全部是
            //小于等于pivot值，右边全部是大于等于pivot值
            if (l >= r) {
                break;
            }

            //交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            //如果交换完后，发现这个arr[l] == pivot值 相等 r--， 前移
            if (arr[l] == pivot) {
                r -= 1;
            }
            //如果交换完后，发现这个arr[r] == pivot值 相等 l++， 后移
            if (arr[r] == pivot) {
                l += 1;
            }
        }

        // 如果 l == r, 必须l++, r--, 否则为出现栈溢出
        if (l == r) {
            l += 1;
            r -= 1;
        }
        //向左递归
        if (left < r) {
            quickSort2(arr, left, r);
        }
        //向右递归
        if (right > l) {
            quickSort2(arr, l, right);
        }
    }

    /**
     * 快排
     *
     * @param v     要排序的数据
     * @param left  地位数（左下标）
     * @param right 高位数（右下标）
     */
    public static void quickSort3(int[] v, int left, int right) {
        //
        if (left >= right) {
            return;
        }

        int first = left;
        int last = right;
        int key = v[first];

        while (first < last) {
            //将比第一个小的移动到前面
            while (first < last && v[last] >= key) {
                last--;
            }
            if (first < last) {
                v[first++] = v[last];
            }
            //将比第一个大的移动到后面
            while (first < last && v[first] <= key) {
                first++;
            }
            if (first < last) {
                v[last--] = v[first];
            }
        }

        v[first] = key;
        quickSort3(v, left, first - 1);
        quickSort3(v, first + 1, right);
    }

    public static void quickSort4(int[] v, int left, int right) {
        if (left >= right) {
            return;
        }

        int first = left;
        int last = right;
        int key = v[first];

        while (first < last) {
            while (first < last && v[last] >= key) {
                last--;
            }
            if (first < last) {
                v[first++] = v[last];
            }
            while (first < last && v[first] <= key) {
                first++;
            }
            if (first < last) {
                v[last--] = v[first];
            }
        }

        v[first] = key;
        quickSort4(v, left, first - 1);
        quickSort4(v, first + 1, right);
    }
}
