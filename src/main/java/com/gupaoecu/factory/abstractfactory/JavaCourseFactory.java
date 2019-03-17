/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JavaCourseFactory
 * Author:   huchu
 * Date:     2019/3/17 17:23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gupaoecu.factory.abstractfactory;

import com.gupaoecu.factory.ICourse;
import com.gupaoecu.factory.JavaCourse;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author huchu
 * @create 2019/3/17
 * @since 1.0.0
 */
public class JavaCourseFactory implements ICourseFactory{

    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}