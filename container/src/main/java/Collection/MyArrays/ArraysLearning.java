/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Collection.MyArrays;

import java.util.Arrays;

/**
 * @author zhangjundong
 * @date 2019/9/122:31
 */
public class ArraysLearning {
    public static void main(String[] args) {
        //int[] ints=new int[];
        int[] ints=new int[2];

        String[] integer=new String[2];

        ints[0]=0;
        ints[1]=1;
        ints[2]=2;
        //java.lang.ArrayIndexOutOfBoundsException
        ints[3]=2;
    }
}
