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
|   [LCP 18. 早餐组合](https://leetcode.cn/problems/2vYnGI/)   |              简单               |         [数组] [双指针] [二分查找] [排序]         | **True**  |
| [1855. 下标对中的最大距离](https://leetcode.cn/problems/maximum-distance-between-a-pair-of-values/) |           中等(1515)            |            [数组] [双指针] [二分查找]             | **False** |
| [1385. 两个数组间的距离值](https://leetcode.cn/problems/find-the-distance-value-between-two-arrays/) |           简单(1235)            |         [数组] [双指针] [二分查找] [排序]         | **True**  |
| [925. 长按键入](https://leetcode.cn/problems/long-pressed-name/) |           简单(1271)            |                 [双指针] [字符串]                 | **False** |
| [392. 判断子序列](https://leetcode.cn/problems/is-subsequence/) |              简单               |           [双指针] [字符串] [动态规划]            | **True**  |
| [524. 通过删除字母匹配到字典里最长单词](https://leetcode.cn/problems/longest-word-in-dictionary-through-deleting/) |              中等               |          [数组] [双指针] [字符串] [排序]          | **True**  |
| [2486. 追加字符以获得子序列](https://leetcode.cn/problems/append-characters-to-string-to-make-subsequence/) |           中等(1363)            |             [贪心] [双指针] [字符串]              | **True**  |
| [2825. 循环增长使字符串子序列等于另一个字符串](https://leetcode.cn/problems/make-string-a-subsequence-using-cyclic-increments/) |           中等(1415)            |                 [双指针] [字符串]                 | **True**  |
| [1023. 驼峰式匹配](https://leetcode.cn/problems/camelcase-matching/) |           中等(1537)            |  [字典树] [数组] [双指针] [字符串] [字符串匹配]   | **True**  |
| [1446. 连续字符](https://leetcode.cn/problems/consecutive-characters/) |           简单(1165)            |                     [字符串]                      | **True**  |
| [1869. 哪种连续子字符串更长](https://leetcode.cn/problems/longer-contiguous-segments-of-ones-than-zeros/) |           简单(1205)            |                     [字符串]                      | **True**  |
| [2414. 最长的字母序连续子字符串的长度](https://leetcode.cn/problems/length-of-the-longest-alphabetical-continuous-substring/) |           中等(1222)            |                     [字符串]                      | **True**  |
| [3456. 找出长度为 K 的特殊子字符串](https://leetcode.cn/problems/find-special-substring-of-length-k/) |           简单(1244)            |                     [字符串]                      | **False** |
| [1957. 删除字符使字符串变好](https://leetcode.cn/problems/delete-characters-to-make-fancy-string/) |           简单(1358)            |                     [字符串]                      | **True**  |
| [674. 最长连续递增序列](https://leetcode.cn/problems/longest-continuous-increasing-subsequence/) |              简单               |                      [数组]                       | **True**  |
| [978. 最长湍流子数组](https://leetcode.cn/problems/longest-turbulent-subarray/) |           中等(1393)            |           [数组] [动态规划] [滑动窗口]            | **False** |
| [2110. 股票平滑下跌阶段的数目](https://leetcode.cn/problems/number-of-smooth-descent-periods-of-a-stock/) |           中等(1408)            |             [数组] [数字] [动态规划]              | **True**  |
| [228. 汇总区间](https://leetcode.cn/problems/summary-ranges/) |              简单               |                      [数组]                       | **True**  |
| [2760. 最长奇偶子数组](https://leetcode.cn/problems/longest-even-odd-subarray-with-threshold/) |           简单(1420)            |                 [数组] [滑动窗口]                 | **False** |
| [1887. 使数组元素相等的减少操作次数](https://leetcode.cn/problems/reduction-operations-to-make-the-array-elements-equal/) |           中等(1428)            |                   [数组] [排序]                   | **True**  |
| [845. 数组中的最长山脉](https://leetcode.cn/problems/longest-mountain-in-array/) |           中等(1437)            |         [数组] [动态规划] [双指针] [枚举]         | **False** |
| [2038. 如果相邻两个颜色均相同则删除当前颜色](https://leetcode.cn/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/) |           中等(1468)            |           [贪心] [字符串] [数学] [博弈]           | **True**  |
| [1759. 统计同质子字符串的数目](https://leetcode.cn/problems/count-number-of-homogenous-substrings/) |           中等(1491)            |                  [字符串] [数学]                  | **True**  |
| [3011. 判断一个数组是否可以变为有序](https://leetcode.cn/problems/find-if-array-can-be-sorted/) |           中等(1497)            |              [位运算] [数组] [排序]               | **False** |
| [1578. 使绳子变成彩色的最短时间](https://leetcode.cn/problems/minimum-time-to-make-rope-colorful/) |           中等(1574)            |         [贪心] [字符串] [数组] [动态规划]         | **True**  |
| [1839. 所有元音按顺序排布的最长子字符串](https://leetcode.cn/problems/longest-substring-of-all-vowels-in-order/) |           中等(1580)            |                [字符串] [滑动窗口]                | **True**  |
| [2765. 最长交替子数组](https://leetcode.cn/problems/longest-alternating-subarray/) |           简单(1581)            |                   [数组] [枚举]                   | **True**  |
| [3255. 长度为 K 的子数组的能量值 II](https://leetcode.cn/problems/find-the-power-of-k-size-subarrays-ii/) |           中等(1595)            |                 [数组] [滑动窗口]                 | **False** |



## 3.二分法

|                           题目名称                           |  题目难度  |                    标签                    | 正确与否  |
| :----------------------------------------------------------: | :--------: | :----------------------------------------: | :-------: |
| [34. 在排序数组中查找元素的第一个和最后一个位置](https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/) |    中等    |             [数组] [二分查找]              | **True**  |
| [35. 搜索插入位置](https://leetcode.cn/problems/search-insert-position/) |    简单    |             [数组] [二分查找]              | **True**  |
| [704. 二分查找](https://leetcode.cn/problems/binary-search/) |    简单    |             [数组] [二分查找]              | **True**  |
| [744. 寻找比目标字母大的最小字母](https://leetcode.cn/problems/find-smallest-letter-greater-than-target/) |    简单    |             [数组] [二分查找]              | **True**  |
| [2529. 正整数和负整数的最大计数](https://leetcode.cn/problems/maximum-count-of-positive-integer-and-negative-integer/) | 简单(1196) |          [数组] [二分查找] [计数]          | **True**  |
| [2300. 咒语和药水的成功对数](https://leetcode.cn/problems/successful-pairs-of-spells-and-potions/) | 中等(1477) |     [数组] [二分查找] [双指针] [排序]      | **True**  |
| [2389. 和有限的最长子序列](https://leetcode.cn/problems/longest-subsequence-with-limited-sum/) | 简单(1388) |  [贪心] [数组] [二分查找] [前缀和] [排序]  | **True**  |
| [1170. 比较字符串最小字母出现频次](https://leetcode.cn/problems/compare-strings-by-frequency-of-the-smallest-character/) | 中等(1432) | [数组] [二分查找] [字符串] [哈希表] [排序] | **True**  |
| [1283. 使结果不超过阈值的最小除数](https://leetcode.cn/problems/find-the-smallest-divisor-given-a-threshold/) | 中等(1542) |             [数组] [二分查找]              | **True**  |
|  [275. H 指数 II](https://leetcode.cn/problems/h-index-ii/)  |    中等    |             [数组] [二分查找]              | **False** |
|                                                              |            |                                            |           |
|                                                              |            |                                            |           |
|                                                              |            |                                            |           |
|                                                              |            |                                            |           |
|                                                              |            |                                            |           |
|                                                              |            |                                            |           |
|                                                              |            |                                            |           |
|                                                              |            |                                            |           |
|                                                              |            |                                            |           |



## 4.枚举

|                           题目名称                           |  题目难度  |                   标签                   | 正确与否  |
| :----------------------------------------------------------: | :--------: | :--------------------------------------: | :-------: |
|     [1. 两数之和](https://leetcode.cn/problems/two-sum/)     |    简单    |             [数组] [哈希表]              | **True**  |
| [1512. 好数对的数目](https://leetcode.cn/problems/number-of-good-pairs/) | 简单(1161) |      [数组] [哈希表] [数学] [计数]       | **True**  |
| [2001. 可互换矩形的组数](https://leetcode.cn/problems/number-of-pairs-of-interchangeable-rectangles/) | 中等(1436) |   [数组] [哈希表] [数学] [计数] [数论]   | **True**  |
| [1128. 等价多米诺骨牌对的数量](https://leetcode.cn/problems/number-of-equivalent-domino-pairs/) | 简单(1333) |          [数组] [哈希表] [计数]          | **True**  |
| [121. 买卖股票的最佳时机](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/) |    简单    |            [数组] [动态规划]             | **False** |
| [2342. 数位和相等数对的最大和](https://leetcode.cn/problems/max-sum-of-a-pair-with-equal-sum-of-digits/) | 中等(1309) |       [数组] [哈希表] [排序] [堆]        | **True**  |
| [2815. 数组中的最大数对和](https://leetcode.cn/problems/max-pair-sum-in-an-array/) | 简单(1295) |             [数组] [哈希表]              | **True**  |
| [219. 存在重复元素 II](https://leetcode.cn/problems/contains-duplicate-ii/) |    简单    |        [数组] [哈希表] [滑动窗口]        | **True**  |
| [1679. K 和数对的最大数目](https://leetcode.cn/problems/max-number-of-k-sum-pairs/) | 中等(1346) |     [数组] [哈希表] [排序] [双指针]      | **True**  |
| [2260. 必须拿起的最小连续卡牌数](https://leetcode.cn/problems/minimum-consecutive-cards-to-pick-up/) | 中等(1365) |        [数组] [哈希表] [滑动窗口]        | **True**  |
| [624. 数组列表中的最大距离](https://leetcode.cn/problems/maximum-distance-in-arrays/) |    中等    |              [贪心] [数组]               | **True**  |
| [1010. 总持续时间可被 60 整除的歌曲](https://leetcode.cn/problems/pairs-of-songs-with-total-durations-divisible-by-60/) | 中等(1377) |          [数组] [哈希表] [计数]          | **False** |
| [3185. 构成整天的下标对数目 II](https://leetcode.cn/problems/count-pairs-that-form-a-complete-day-ii/) | 中等(1385) |          [数组] [哈希表] [计数]          | **True**  |
| [2506. 统计相似字符串对的数目](https://leetcode.cn/problems/count-pairs-of-similar-strings/) | 简单(1335) | [位运算] [数组] [哈希表] [字符串] [计数] | **True**  |
| [2748. 美丽下标对的数目](https://leetcode.cn/problems/number-of-beautiful-pairs/) | 简单(1301) |   [数组] [哈希表] [数学] [计数] [数论]   | **True**  |
| [2874. 有序三元组中的最大值 II](https://leetcode.cn/problems/maximum-value-of-an-ordered-triplet-ii/) | 中等(1583) |                  [数组]                  | **True**  |
|                                                              |            |                                          |           |
|                                                              |            |                                          |           |



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
