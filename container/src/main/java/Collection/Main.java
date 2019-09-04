/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Collection;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangjundong
 * @date 2019/8/1922:32
 */
public class Main {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
       Boolean result= StringUtils.isEmpty(null);

        List<String> list=new ArrayList<String>();
        System.out.println(list.indexOf(1));
        System.out.println(result);
       System.out.println("hello world");
    }
}
