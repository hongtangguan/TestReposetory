package jvmtest;

/**
 * @Auther: ZGS
 * @Date: 2018/11/1 21:39
 * @Description:
 */
public class Student {

    public String name;

    public Student(String name) {
        this.name = name;
    }

    public void add(){
        System.out.println(name);
    }
}
