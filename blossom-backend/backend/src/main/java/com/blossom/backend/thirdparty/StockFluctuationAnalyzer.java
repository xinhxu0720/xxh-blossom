package com.blossom.backend.thirdparty;
import java.util.List;
import java.util.ArrayList;

public class StockFluctuationAnalyzer {



    // 数据类，表示单个股票数据点
    static class StockData {
        String createTime; // 数据生成时间
        double current;    // 当前实时价格

        public StockData(String createTime, double current) {
            this.createTime = createTime;
            this.current = current;
        }
    }

    // 定义涨跌幅阈值
    private static final double THRESHOLD = 2.0;

    /**
     * 计算单个窗口的平均价
     *
     * @param window 单个时间窗口数据
     * @return 平均价格
     */
    private static double calculateAveragePrice(List<StockData> window) {
        double sum = 0;
        for (StockData data : window) {
            sum += data.current;
        }
        return sum / window.size();
    }

    /**
     * 分析所有窗口之间的涨跌幅，寻找大幅波动
     *
     * @param allWindows 所有时间窗口数据
     */
    public static void analyzeAllWindowCombinations(List<List<StockData>> allWindows) {
        int totalWindows = allWindows.size();
        double maxIncrease = 0.0;
        double maxDecrease = 0.0;
        int increaseWindowStart = -1, increaseWindowEnd = -1;
        int decreaseWindowStart = -1, decreaseWindowEnd = -1;

        // 遍历所有窗口之间的组合
        for (int i = 0; i < totalWindows; i++) {
            double firstAverage = calculateAveragePrice(allWindows.get(i));

            for (int j = i + 1; j < totalWindows; j++) {
                double secondAverage = calculateAveragePrice(allWindows.get(j));
                double changePercent = ((secondAverage - firstAverage) / firstAverage) * 100;

                // 检查是否是大幅上涨
                if (changePercent > THRESHOLD && changePercent > maxIncrease) {
                    maxIncrease = changePercent;
                    increaseWindowStart = i;
                    increaseWindowEnd = j;
                }

                // 检查是否是大幅下跌
                if (changePercent < -THRESHOLD && changePercent < maxDecrease) {
                    maxDecrease = changePercent;
                    decreaseWindowStart = i;
                    decreaseWindowEnd = j;
                }
            }
        }

        // 输出结果
        if (maxIncrease > 0) {
            System.out.printf("最大上涨: 从窗口 %d 到窗口 %d, 涨幅 %.2f%%\n", increaseWindowStart, increaseWindowEnd, maxIncrease);
        } else {
            System.out.println("未发现大幅上涨。");
        }

        if (maxDecrease < 0) {
            System.out.printf("最大下跌: 从窗口 %d 到窗口 %d, 跌幅 %.2f%%\n", decreaseWindowStart, decreaseWindowEnd, maxDecrease);
        } else {
            System.out.println("未发现大幅下跌。");
        }
    }

    public static void main(String[] args) {
        // 示例数据：模拟四个时间窗口
        List<StockData> window1 = new ArrayList<>();
        window1.add(new StockData("2024-12-19 14:27:53", 8.5));
        window1.add(new StockData("2024-12-19 14:28:53", 8.6));
        window1.add(new StockData("2024-12-19 14:29:53", 8.7));

        List<StockData> window2 = new ArrayList<>();
        window2.add(new StockData("2024-12-19 14:32:53", 8.9));
        window2.add(new StockData("2024-12-19 14:33:53", 9.0));

        List<StockData> window3 = new ArrayList<>();
        window3.add(new StockData("2024-12-19 14:37:53", 9.5));
        window3.add(new StockData("2024-12-19 14:38:53", 9.6));

        List<StockData> window4 = new ArrayList<>();
        window4.add(new StockData("2024-12-19 14:40:53", 8.4));
        window4.add(new StockData("2024-12-19 14:41:53", 8.3));

        // 将所有窗口放入列表
        List<List<StockData>> allWindows = new ArrayList<>();
        allWindows.add(window1);
        allWindows.add(window2);
        allWindows.add(window3);
        allWindows.add(window4);

        // 调用方法分析所有窗口之间的涨跌幅
        analyzeAllWindowCombinations(allWindows);
    }
}