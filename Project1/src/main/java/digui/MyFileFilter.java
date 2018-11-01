package digui;

/**
 * @author: ZhengGaosheng
 * @date: 2018/10/9 19:35
 * @description:
 */
import java.io.File;
import java.io.FilenameFilter;

public class MyFileFilter implements FilenameFilter {
    //万能过滤器
    private String suffix;
    public MyFileFilter(String suffix) {
        this.suffix = suffix;
    }
    @Override
    public boolean accept(File dir, String name) {
        File f = new File(dir, name);
        if(f.isFile()){
            return f.getName().endsWith(suffix);//符合要求的文件返回
        }
        return true;//是文件也返回
    }
}

