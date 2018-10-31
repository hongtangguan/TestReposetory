package maopao;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther: ZGS
 * @Date: 2018/11/1 00:33
 * @Description:
 */
public class StringDemo {

    public static final String STRING = "psfs" ;



    public static void main(String[] args) {
/*
        String s = "2,4,1,3";
        String[] split = s.split(",");
        List<String> collect = Arrays.stream(split).sorted().collect(Collectors.toList());
        System.out.println(collect);

        */

        ArrayList<Integer> list1 = Lists.newArrayList(
                1, 2, 3, 4, 5
        );

        ArrayList<Integer> list2 = Lists.newArrayList(
                1, 2, 5
        );




        List<Integer> collect = list1.stream().filter(i -> list2.stream().noneMatch(t -> t == i)).collect(Collectors.toList());
        System.out.println(collect);



    }

}
