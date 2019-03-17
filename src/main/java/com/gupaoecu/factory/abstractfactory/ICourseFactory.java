package com.gupaoecu.factory.abstractfactory;

import com.gupaoecu.factory.ICourse;

/**
 * @date 2019/03/17
 * @author huchu
 * @descripe 抽象工厂不符合开闭原则 容易拓展
 */
public interface ICourseFactory {
    ICourse createCourse();
    INote createNote();
    IVideo createVideo();
}
