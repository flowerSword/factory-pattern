/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JavaCourse
 * Author:   huchu
 * Date:     2019/3/17 17:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoecu.factory;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author huchu
 * @create 2019/3/17
 * @since 1.0.0
 */
public class JavaCourse implements ICourse{

    @Override
    public void record() {
        System.out.println("录制java课程");
    }
}