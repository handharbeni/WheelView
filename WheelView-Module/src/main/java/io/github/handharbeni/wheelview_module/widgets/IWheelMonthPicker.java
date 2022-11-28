package io.github.handharbeni.wheelview_module.widgets;

public interface IWheelMonthPicker {
    /**
     * 获取月份选择器初始化时选择的月份
     *
     * @return 选择的月份
     */
    int getSelectedMonth();

    /**
     * 设置月份选择器初始化时选择的月份
     *
     * @param month 选择的月份
     */
    void setSelectedMonth(int month);

    /**
     * 获取当前选择的月份
     *
     * @return 当前选择的月份
     */
    int getCurrentMonth();
}
