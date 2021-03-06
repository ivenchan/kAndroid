package com.github.tifezh.kchartlib.chart.base;

import android.graphics.Canvas;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.github.tifezh.kchartlib.chart.view.BaseKChartView;


/**
 *
 * Description 画图的基类 根据实体来画图形
 * Author puyantao
 * Email 1067899750@qq.com
 * Date 2018-10-26 17:41
 */


public interface IChartDraw<T> {
    /**
     * 需要滑动 物体draw方法
     *
     * @param canvas    canvas
     * @param view      k线图View
     * @param position  当前点的位置
     * @param lastPoint 上一个点
     * @param curPoint  当前点
     * @param lastX     上一个点的x坐标
     * @param curX      当前点的X坐标
     */
    void drawTranslated(@Nullable T lastPoint, @NonNull T curPoint, float lastX, float curX, @NonNull Canvas canvas, @NonNull BaseKChartView view, int position);

    /**
     * @param canvas
     * @param view
     * @param position 该点的位置
     * @param x        x的起始坐标
     * @param y        y的起始坐标
     */
    void drawText(@NonNull Canvas canvas, @NonNull BaseKChartView view, int position, float x, float y);

    /**
     * 获取当前实体中最大的值
     *
     * @param point
     * @return
     */
    float getMaxValue(T point);

    void drawMaxAndMin(@NonNull BaseKChartView view, Canvas canvas, float maxX, float minX, T maxPoint, T minPoint);

    /**
     * 获取当前实体中最小的值
     *
     * @param point
     * @return
     */
    float getMinValue(T point);



    /**
     * 获取value格式化器
     */
    IValueFormatter getValueFormatter();


    /**
     * 设置指标文字颜色
     */

    void setTargetColor( int ...color);
}
