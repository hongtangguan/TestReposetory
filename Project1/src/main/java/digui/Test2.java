package digui;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: ZhengGaosheng
 * @date: 2018/10/9 20:26
 * @description:
 */
public class Test2 {

    public static void main(String[] args) {

        String path = "E:\\test";

        test(path);
    }

    private static void test(String path) {
        File f = new File(path);

        File[] fs = f.listFiles();

        if (fs == null) {
            return;
        }

        for (File file : fs) {
            if (file.isFile()) {

                //初始化线程池
                ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
                fixedThreadPool.execute(new Runnable() {
                    public void run() {
                        try {
                            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file.getPath()),"UTF-8"));
                            //写入相应的文件
                            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\E111.txt",true),"UTF-8"));
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

            } else {
                test(file.getPath());
            }
        }
    }


}

