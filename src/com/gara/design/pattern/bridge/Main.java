package com.gara.design.pattern.bridge;

import com.gara.design.pattern.bridge.*;
import com.gara.design.pattern.bridge.service.impl.Avi;
import com.gara.design.pattern.bridge.service.impl.Linux;
import com.gara.design.pattern.bridge.service.impl.Mp4;
import com.gara.design.pattern.bridge.service.impl.Windows;

/**
 * @description: 桥接模式：将抽象部分与实现部分分离，使它们都可以独立的变化
 * 核心实现： 抽象类依赖实现类
 * @author:  GaraYing
 * @createTime: 2020/9/23 11:36
 * @version: 1.0
**/
public class Main {

    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer(new Linux(new Mp4()));

        videoPlayer.playVideo();

        videoPlayer  = new VideoPlayer(new Windows(new Avi()));

        videoPlayer.playVideo();
    }
}
