/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Collection.MyList;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * @author zhangjundong
 * @date 2019/9/223:47
 */
public class ArrayListLearning {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        //存储的object,可以存储不同的对象
        Dog dog = new Dog();
        dog.id = 1;
        dog.name = "testDog";

        Cat cat = new Cat();
        cat.id = 1;
        cat.name = "testCat";
        arrayList.add(dog);
        arrayList.add(cat);
        //可以存储空值
        arrayList.add(null);
        arrayList.add(1);

        //初始化一个容量为5的数组
        ArrayList<String> stringArrayList = new ArrayList<String>(5);
        stringArrayList.add("1");
        stringArrayList.add("2");
        stringArrayList.add("3");
        stringArrayList.add("4");
        stringArrayList.add("5");
        //当添加第6个元素时，检查到容量不够，扩容1.5倍
        stringArrayList.add("6");

        //初始化一个容量为5的数组
        ArrayList<String> stringIndexArrayList = new ArrayList<String>(5);
        stringIndexArrayList.add("1");
        stringIndexArrayList.add("2");
        stringIndexArrayList.add("3");
        stringIndexArrayList.add("4");
        stringIndexArrayList.add("5");

        stringIndexArrayList.add(3, "6");

        //初始化一个容量为5的数组
        ArrayList<String> stringRemoveArrayList = new ArrayList<String>(5);
        stringRemoveArrayList.add("1");
        stringRemoveArrayList.add("2");
        stringRemoveArrayList.add("3");
        stringRemoveArrayList.add("4");
        stringRemoveArrayList.add("5");

        String result= stringRemoveArrayList.remove(2);

        int[] a={1,2,3};
        Integer[] b={1,2,3};
        List A= Arrays.asList(a);
        List B= Arrays.asList(1,2,3);
        List C= Arrays.asList(b);
        System.out.println(JSON.toJSONString(A)+",ListA的元素类型为："+A.get(0).getClass()+",长度为："+A.size());
        System.out.println(B);
        System.out.println(C);

       /* List<String> pets= Arrays.asList("cat","dog");
        pets.add("pig");*/
        List<String> pets= new ArrayList<String>(Arrays.asList("cat","dog"));
        pets.add("pig");


        String[] test={"a","b","c","d"};
        //List<String> testList=Arrays.asList(test);
        List<String> testList = new ArrayList<String>(Arrays.asList(test));
        testList.set(0,"e");
        System.out.println("List的原始顺序："+testList);
        Collections.shuffle(testList,new Random(10));
        System.out.println("List打乱后的顺序："+testList);
        System.out.println("List打乱顺序后数组的顺序："+ Arrays.toString(test));
    }
}