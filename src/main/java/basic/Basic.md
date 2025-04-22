# Basic 基础题单

本题单专注于LeetCode上的基础题目，即简单题(1600分以下)

题单题目类型分为以下几种：

[TOC]



## 1.滑动窗口

**题单**

|                           题目名称                           |  题目难度  |                  标签                   | 正确与否  |
| :----------------------------------------------------------: | :--------: | :-------------------------------------: | :-------: |
| [1456. 定长子串中元音的最大数目](https://leetcode.cn/problems/maximum-number-of-vowels-in-a-substring-of-given-length/) | 中等(1263) |           [字符串] [滑动窗口]           | **True**  |
| [643. 子数组最大平均数 I](https://leetcode.cn/problems/maximum-average-subarray-i/) |    简单    |            [数组] [滑动窗口]            | **True**  |
| [1343. 大小为 K 且平均值大于等于阈值的子数组数目](https://leetcode.cn/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/) | 中等(1317) |            [数组] [滑动窗口]            | **True**  |
| [2090. 半径为 k 的子数组平均值](https://leetcode.cn/problems/k-radius-subarray-averages/) | 中等(1358) |            [数组] [滑动窗口]            | **True**  |
| [2379. 得到 K 个黑块的最少涂色次数](https://leetcode.cn/problems/minimum-recolors-to-get-k-consecutive-black-blocks/) | 简单(1360) |           [字符串] [滑动窗口]           | **True**  |
| [2841. 几乎唯一子数组的最大和](https://leetcode.cn/problems/maximum-sum-of-almost-unique-subarray/) | 中等(1546) |       [数组] [哈希表] [滑动窗口]        | **True**  |
| [2461. 长度为 K 子数组中的最大和](https://leetcode.cn/problems/maximum-sum-of-distinct-subarrays-with-length-k/) | 中等(1553) |       [数组] [哈希表] [滑动窗口]        | **True**  |
| [1423. 可获得的最大点数](https://leetcode.cn/problems/maximum-points-you-can-obtain-from-cards/) | 中等(1574) |       [数组] [前缀和] [滑动窗口]        | **True**  |
| [1052. 爱生气的书店老板](https://leetcode.cn/problems/grumpy-bookstore-owner/) | 中等(1418) |            [数组] [滑动窗口]            | **False** |
| [1652. 拆炸弹](https://leetcode.cn/problems/defuse-the-bomb/) | 简单(1417) |            [数组] [滑动窗口]            | **False** |
| [2269. 找到一个数字的 K 美丽值](https://leetcode.cn/problems/find-the-k-beauty-of-a-number/) | 简单(1280) |       [数学] [字符串] [滑动窗口]        | **True**  |
| [1984. 学生分数的最小差值](https://leetcode.cn/problems/minimum-difference-between-highest-and-lowest-of-k-scores/) | 简单(1306) |        [数组] [排序] [滑动窗口]         | **True**  |
| [1461. 检查一个字符串是否包含所有长度为 K 的二进制子串](https://leetcode.cn/problems/check-if-a-string-contains-all-binary-codes-of-size-k/) | 中等(1504) |  [位运算] [哈希表] [字符串] [滚动哈希]  | **True**  |
| [3. 无重复字符的最长子串](https://leetcode.cn/problems/longest-substring-without-repeating-characters/) |    中等    |      [字符串] [哈希表] [滑动窗口]       | **True**  |
| [3090. 每个字符最多出现两次的最长子字符串](https://leetcode.cn/problems/maximum-length-substring-with-two-occurrences/) | 简单(1329) |      [字符串] [哈希表] [滑动窗口]       | **True**  |
| [1493. 删掉一个元素以后全为 1 的最长子数组](https://leetcode.cn/problems/longest-subarray-of-1s-after-deleting-one-element/) | 中等(1423) |      [数组] [动态规划] [滑动窗口]       | **True**  |
| [1208. 尽可能使字符串相等](https://leetcode.cn/problems/get-equal-substrings-within-budget/) | 中等(1497) | [字符串] [二分查找] [前缀和] [滑动窗口] | **True**  |
| [904. 水果成篮](https://leetcode.cn/problems/fruit-into-baskets/) | 中等(1516) |       [数组] [哈希表] [滑动窗口]        | **True**  |
| [1695. 删除子数组的最大得分](https://leetcode.cn/problems/maximum-erasure-value/) | 中等(1529) |       [数组] [哈希表] [滑动窗口]        | **True**  |
| [2958. 最多 K 个重复元素的最长子数组](https://leetcode.cn/problems/length-of-longest-subarray-with-at-most-k-frequency/) | 中等(1535) |       [数组] [哈希表] [滑动窗口]        | **True**  |
| [2730. 找到最长的半重复子字符串](https://leetcode.cn/problems/find-the-longest-semi-repetitive-substring/) | 中等(1502) |           [字符串] [滑动窗口]           | **True**  |
| [209. 长度最小的子数组](https://leetcode.cn/problems/minimum-size-subarray-sum/) |    中等    |  [数组] [二分查找] [前缀和] [滑动窗口]  | **True**  |
| [2904. 最短且字典序最小的美丽子字符串](https://leetcode.cn/problems/shortest-and-lexicographically-smallest-beautiful-string/) | 中等(1483) |           [字符串] [滑动窗口]           | **True**  |
| [713. 乘积小于 K 的子数组](https://leetcode.cn/problems/subarray-product-less-than-k/) |    中等    |  [数组] [二分查找] [前缀和] [滑动窗口]  | **True**  |
| [3258. 统计满足 K 约束的子字符串数量 I](https://leetcode.cn/problems/count-substrings-that-satisfy-k-constraint-i/) | 简单(1258) |           [字符串] [滑动窗口]           | **True**  |
| [930. 和相同的二元子数组](https://leetcode.cn/problems/binary-subarrays-with-sum/) | 中等(1592) |   [数组] [哈希表] [前缀和] [滑动窗口]   | **False** |
|                                                              |            |                                         |           |



## 2.双指针

|                           题目名称                           |            题目难度             |                       标签                        | 正确与否  |
| :----------------------------------------------------------: | :-----------------------------: | :-----------------------------------------------: | :-------: |
| [344. 反转字符串](https://leetcode.cn/problems/reverse-string/) |              简单               |                 [双指针] [字符串]                 | **True**  |
| [125. 验证回文串](https://leetcode.cn/problems/valid-palindrome/) |              简单               |                 [双指针] [字符串]                 | **True**  |
| [1750. 删除字符串两端相同字符后的最短长度](https://leetcode.cn/problems/minimum-length-of-string-after-deleting-similar-ends/) |           中等(1502)            |                 [双指针] [字符串]                 | **True**  |
| [2105. 给植物浇水 II](https://leetcode.cn/problems/watering-plants-ii/) |           中等(1507)            |              [数组] [双指针] [模拟]               | **True**  |
| [977. 有序数组的平方](https://leetcode.cn/problems/squares-of-a-sorted-array/) | 简单(1130) 时间复杂度控制在O(n) |              [数组] [双指针] [排序]               | **True**  |
| [658. 找到 K 个最接近的元素](https://leetcode.cn/problems/find-k-closest-elements/) |              中等               | [数组] [双指针] [排序] [二分查找] [滑动窗口] [堆] | **False** |
| [1471. 数组中的 k 个最强值](https://leetcode.cn/problems/the-k-strongest-values-in-an-array/) |           中等(1332)            |              [数组] [双指针] [排序]               | **True**  |
| [167. 两数之和 II - 输入有序数组](https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/) |              中等               |            [数组] [双指针] [二分查找]             | **True**  |
| [633. 平方数之和](https://leetcode.cn/problems/sum-of-square-numbers/) |              中等               |            [数组] [双指针] [二分查找]             | **True**  |
| [2824. 统计和小于目标的下标对数目](https://leetcode.cn/problems/count-pairs-whose-sum-is-less-than-target/) |           简单(1166)            |         [数组] [双指针] [排序] [二分查找]         | **True**  |
|   [LCP 28. 采购方案](https://leetcode.cn/problems/4xy4Wx/)   |              简单               |         [数组] [双指针] [排序] [二分查找]         | **True**  |
| [2563. 统计公平数对的数目](https://leetcode.cn/problems/count-the-number-of-fair-pairs/) |           中等(1721)            |         [数组] [双指针] [排序] [二分查找]         | **False** |
|      [15. 三数之和](https://leetcode.cn/problems/3sum/)      |              中等               |              [数组] [双指针] [排序]               | **False** |
| [16. 最接近的三数之和](https://leetcode.cn/problems/3sum-closest/) |              中等               |              [数组] [双指针] [排序]               | **True**  |
|      [18. 四数之和](https://leetcode.cn/problems/4sum/)      |              中等               |              [数组] [双指针] [排序]               | **True**  |
| [611. 有效三角形的个数](https://leetcode.cn/problems/valid-triangle-number/) |              中等               |     [数组] [双指针] [排序] [二分查找] [贪心]      | **False** |
| [1577. 数的平方等于两数乘积的方法数](https://leetcode.cn/problems/number-of-ways-where-square-of-number-is-equal-to-product-of-two-numbers/) |           中等(1594)            |          [数组] [双指针] [哈希表] [数学]          | **True**  |
| [27. 移除元素](https://leetcode.cn/problems/remove-element/) |              简单               |                  [数组] [双指针]                  | **True**  |
| [26. 删除有序数组中的重复项](https://leetcode.cn/problems/remove-duplicates-from-sorted-array/) |              简单               |                  [数组] [双指针]                  | **True**  |
| [80. 删除有序数组中的重复项 II](https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii/) |              中等               |                  [数组] [双指针]                  | **False** |
|   [283. 移动零](https://leetcode.cn/problems/move-zeroes/)   |              简单               |                  [数组] [双指针]                  | **True**  |
| [905. 按奇偶排序数组](https://leetcode.cn/problems/sort-array-by-parity/) |           简单(1178)            |              [数组] [双指针] [排序]               | **False** |
| [922. 按奇偶排序数组 II](https://leetcode.cn/problems/sort-array-by-parity-ii/) |           简单(1174)            |              [数组] [双指针] [排序]               | **True**  |
| [3467. 将数组按照奇偶性转化](https://leetcode.cn/problems/transform-array-by-parity/) |           简单(1166)            |               [数组] [计数] [排序]                | **True**  |
| [2460. 对数组执行操作](https://leetcode.cn/problems/apply-operations-to-an-array/) |           简单(1224)            |              [数组] [双指针] [模拟]               | **True**  |
| [1089. 复写零](https://leetcode.cn/problems/duplicate-zeros/) |           简单(1263)            |                  [数组] [双指针]                  | **False** |
| [2109. 向字符串添加空格](https://leetcode.cn/problems/adding-spaces-to-a-string/) |           中等(1315)            |          [数组] [双指针] [模拟] [字符串]          | **True**  |
| [2540. 最小公共值](https://leetcode.cn/problems/minimum-common-value/) |           简单(1250)            |        [数组] [双指针] [二分查找] [哈希表]        | **True**  |
| [88. 合并两个有序数组](https://leetcode.cn/problems/merge-sorted-array/) |              简单               |              [数组] [双指针] [排序]               | **True**  |
| [2570. 合并两个二维数组 - 求和法](https://leetcode.cn/problems/merge-two-2d-arrays-by-summing-values/) |           简单(1281)            |             [数组] [双指针] [哈希表]              | **True**  |
|                                                              |                                 |                                                   |           |
|                                                              |                                 |                                                   |           |



## 3.二分法



## 4.枚举



## 5.前缀和



## 6.差分算法



## 7.栈



## 8.队列



## 9.堆



## 10.单调栈



## 11.网格图



## 12.位运算



## 13.图论算法



## 14.动态规划



## 15.数学



## 16.贪心算法



## 17.链表



## 18.二叉树



## 19.回溯算法



## 20.字符串
