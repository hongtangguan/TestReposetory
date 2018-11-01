package digui;

/**
 * @author: ZhengGaosheng
 * @date: 2018/10/9 19:34
 * @description:
 */

import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        File path = new File("E:\\test");
        String suffix = ".txt";

        System.out.println("--------广度优先算法获取文件全路径---------");
        list = MyBFS.myBFS(path, suffix);

        for (String item : list) {

            //初始化线程池
            ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
            fixedThreadPool.execute(new Runnable() {
                public void run() {
                    try {
                        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(item),"UTF-8"));
                        //写入相应的文件
                        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\E.txt",true),"UTF-8"));
                        //读取数据
                        //循环取出数据
                        String str = null;
                        while ((str = in.readLine()) != null) {
                            System.out.println(str);
                            //写入相关文件
                            out.append(str);
                        }

                        //清楚缓存
                        out.flush();
                        //关闭流
                        in.close();
                        out.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

        }

    }
}

