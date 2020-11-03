package STOPWATCH;

import java.util.Random;
public class StopWatchDemo {
    public static void main(String[] args) {
        int MAX = 10000;
        StopWatch tmp = new StopWatch();

        //初始化数组
        Random rand = new Random(MAX);
        int[] array = new int[MAX];
        for(int i=0;i<MAX;i++)
            array[i]=rand.nextInt(MAX);

        //计算选择排序所需要的时间
        tmp.start();
        for(int i=0;i<MAX;i++){
            int pos =i;
            for(int j=i;j<MAX;j++){
                if(array[j]>array[pos])
                    pos=j;
            }
            int x=array[pos];
            array[pos]=array[i];
            array[i]=x;
        }
        tmp.stop();

        System.out.println(tmp.getElapsedTime());

    }
}
