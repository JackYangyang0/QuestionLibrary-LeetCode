# Basic 基础题单

本题单专注于LeetCode上的基础题目，即简单题(1600分以下)

题单题目类型分为以下几种：

[TOC]



## 1.滑动窗口

### **定长滑窗套路**

三步：入-更新-出。

1. 入：下标为 i 的元素进入窗口，更新相关统计量。如果 i<k−1 则重复第一步。
2. 更新：更新答案。一般是更新最大值/最小值。
3. 出：下标为 i−k+1 的元素离开窗口，更新相关统计量。

|                           题目名称                           |  题目难度  |                 标签                  | 正确与否  |
| :----------------------------------------------------------: | :--------: | :-----------------------------------: | :-------: |
| [1456. 定长子串中元音的最大数目](https://leetcode.cn/problems/maximum-number-of-vowels-in-a-substring-of-given-length/) | 中等(1263) |          [字符串] [滑动窗口]          | **True**  |
| [643. 子数组最大平均数 I](https://leetcode.cn/problems/maximum-average-subarray-i/) |    简单    |           [数组] [滑动窗口]           | **True**  |
| [1343. 大小为 K 且平均值大于等于阈值的子数组数目](https://leetcode.cn/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/) | 中等(1317) |           [数组] [滑动窗口]           | **True**  |
| [2090. 半径为 k 的子数组平均值](https://leetcode.cn/problems/k-radius-subarray-averages/) | 中等(1358) |           [数组] [滑动窗口]           | **True**  |
| [2379. 得到 K 个黑块的最少涂色次数](https://leetcode.cn/problems/minimum-recolors-to-get-k-consecutive-black-blocks/) | 简单(1360) |          [字符串] [滑动窗口]          | **True**  |
| [2841. 几乎唯一子数组的最大和](https://leetcode.cn/problems/maximum-sum-of-almost-unique-subarray/) | 中等(1546) |      [数组] [哈希表] [滑动窗口]       | **True**  |
| [2461. 长度为 K 子数组中的最大和](https://leetcode.cn/problems/maximum-sum-of-distinct-subarrays-with-length-k/) | 中等(1553) |      [数组] [哈希表] [滑动窗口]       | **True**  |
| [1423. 可获得的最大点数](https://leetcode.cn/problems/maximum-points-you-can-obtain-from-cards/) | 中等(1574) |      [数组] [前缀和] [滑动窗口]       | **True**  |
| [1052. 爱生气的书店老板](https://leetcode.cn/problems/grumpy-bookstore-owner/) | 中等(1418) |           [数组] [滑动窗口]           | **False** |
| [1652. 拆炸弹](https://leetcode.cn/problems/defuse-the-bomb/) | 简单(1417) |           [数组] [滑动窗口]           | **False** |
| [2269. 找到一个数字的 K 美丽值](https://leetcode.cn/problems/find-the-k-beauty-of-a-number/) | 简单(1280) |      [数学] [字符串] [滑动窗口]       | **True**  |
| [1984. 学生分数的最小差值](https://leetcode.cn/problems/minimum-difference-between-highest-and-lowest-of-k-scores/) | 简单(1306) |       [数组] [排序] [滑动窗口]        | **True**  |
| [1461. 检查一个字符串是否包含所有长度为 K 的二进制子串](https://leetcode.cn/problems/check-if-a-string-contains-all-binary-codes-of-size-k/) | 中等(1504) | [位运算] [哈希表] [字符串] [滚动哈希] | **True**  |



### **不定长滑动窗口**

主要分为三类：求最长子数组，求最短子数组（一般题目都有「至少」的要求），以及求子数组个数。

> 注：滑动窗口相当于在维护一个队列。右指针的移动可以视作入队，左指针的移动可以视作出队。

#### **求最长子数组**

一般题目都有「至多」的要求

|                           题目名称                           |  题目难度  |                  标签                   | 正确与否 |
| :----------------------------------------------------------: | :--------: | :-------------------------------------: | :------: |
| [3. 无重复字符的最长子串](https://leetcode.cn/problems/longest-substring-without-repeating-characters/) |    中等    |      [字符串] [哈希表] [滑动窗口]       | **True** |
| [3090. 每个字符最多出现两次的最长子字符串](https://leetcode.cn/problems/maximum-length-substring-with-two-occurrences/) | 简单(1329) |      [字符串] [哈希表] [滑动窗口]       | **True** |
| [1493. 删掉一个元素以后全为 1 的最长子数组](https://leetcode.cn/problems/longest-subarray-of-1s-after-deleting-one-element/) | 中等(1423) |      [数组] [动态规划] [滑动窗口]       | **True** |
| [1208. 尽可能使字符串相等](https://leetcode.cn/problems/get-equal-substrings-within-budget/) | 中等(1497) | [字符串] [二分查找] [前缀和] [滑动窗口] | **True** |
| [904. 水果成篮](https://leetcode.cn/problems/fruit-into-baskets/) | 中等(1516) |       [数组] [哈希表] [滑动窗口]        | **True** |
| [1695. 删除子数组的最大得分](https://leetcode.cn/problems/maximum-erasure-value/) | 中等(1529) |       [数组] [哈希表] [滑动窗口]        | **True** |
| [2958. 最多 K 个重复元素的最长子数组](https://leetcode.cn/problems/length-of-longest-subarray-with-at-most-k-frequency/) | 中等(1535) |       [数组] [哈希表] [滑动窗口]        | **True** |
| [2730. 找到最长的半重复子字符串](https://leetcode.cn/problems/find-the-longest-semi-repetitive-substring/) | 中等(1502) |           [字符串] [滑动窗口]           | **True** |

#### **求最短子数组**

一般题目都有「至少」的要求

|                           题目名称                           |  题目难度  |                 标签                  | 正确与否 |
| :----------------------------------------------------------: | :--------: | :-----------------------------------: | :------: |
| [209. 长度最小的子数组](https://leetcode.cn/problems/minimum-size-subarray-sum/) |    中等    | [数组] [二分查找] [前缀和] [滑动窗口] | **True** |
| [2904. 最短且字典序最小的美丽子字符串](https://leetcode.cn/problems/shortest-and-lexicographically-smallest-beautiful-string/) | 中等(1483) |          [字符串] [滑动窗口]          | **True** |

#### **求子数组个数**

- **越长越合法**：一般要写 ans += left，内层循环结束后，[left,right] 这个子数组是不满足题目要求的，但在退出循环之前的最后一轮循环，[left−1,right] 是满足题目要求的。由于子数组越长，越能满足题目要求，所以除了 [left−1,right]，还有 [left−2,right],[left−3,right],…,[0,right] 都是满足要求的。也就是说，当右端点固定在 right 时，左端点在 0,1,2,…,left−1 的所有子数组都是满足要求的，这一共有 left 个。

> 基础阶段暂无



-----



- **越短越合法**：一般要写 ans += right - left + 1，内层循环结束后，[left,right] 这个子数组是满足题目要求的。由于子数组越短，越能满足题目要求，所以除了 [left,right]，还有 [left+1,right],[left+2,right],…,[right,right] 都是满足要求的。也就是说，当右端点固定在 right 时，左端点在 left,left+1,left+2,…,right 的所有子数组都是满足要求的，这一共有 right−left+1 个

|                           题目名称                           |  题目难度  |                 标签                  | 正确与否 |
| :----------------------------------------------------------: | :--------: | :-----------------------------------: | :------: |
| [713. 乘积小于 K 的子数组](https://leetcode.cn/problems/subarray-product-less-than-k/) |    中等    | [数组] [二分查找] [前缀和] [滑动窗口] | **True** |
| [3258. 统计满足 K 约束的子字符串数量 I](https://leetcode.cn/problems/count-substrings-that-satisfy-k-constraint-i/) | 简单(1258) |          [字符串] [滑动窗口]          | **True** |

- **恰好型滑动窗口：**

  - 例如，要计算有多少个元素和恰好等于 k 的子数组，可以把问题变成：
    - 计算有多少个元素和 ≥k 的子数组。
    - 计算有多少个元素和 >k，也就是 ≥k+1 的子数组。
  - 答案就是元素和 ≥k 的子数组个数，减去元素和 ≥k+1 的子数组个数。这里把 > 转换成 ≥，从而可以把滑窗逻辑封装成一个函数 f，然后用 f(k) - f(k + 1) 计算，无需编写两份滑窗代码。
  - 总结：「恰好」可以拆分成两个「至少」，也就是两个「越长越合法」的滑窗问题。

  > 注：也可以把问题变成 ≤k 减去 ≤k−1（两个至多）。可根据题目选择合适的变形方式。
  >
  > 注：也可以把两个滑动窗口合并起来，维护同一个右端点 right 和两个左端点 left1 和 left2 ——> 三指针滑动窗口。
  >

|                           题目名称                           |  题目难度  |                标签                 | 正确与否  |
| :----------------------------------------------------------: | :--------: | :---------------------------------: | :-------: |
| [930. 和相同的二元子数组](https://leetcode.cn/problems/binary-subarrays-with-sum/) | 中等(1592) | [数组] [哈希表] [前缀和] [滑动窗口] | **False** |



## 2.双指针

### 普通双指针

**相向双指针：**两个指针 *left*=0, *right*=*n*−1，从数组的两端开始，向中间移动，这叫**相向双指针**。

**同向双指针：**两个指针的移动方向相同（都向右，或者都向左）。滑动窗口相当于**同向双指针**。

**背向双指针：**两个指针从数组中的同一个位置出发，一个向左，另一个向右，背向移动。

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

### **原地修改**

|                           题目名称                           |  题目难度  |          标签          | 正确与否  |
| :----------------------------------------------------------: | :--------: | :--------------------: | :-------: |
| [27. 移除元素](https://leetcode.cn/problems/remove-element/) |    简单    |    [数组] [双指针]     | **True**  |
| [26. 删除有序数组中的重复项](https://leetcode.cn/problems/remove-duplicates-from-sorted-array/) |    简单    |    [数组] [双指针]     | **True**  |
| [80. 删除有序数组中的重复项 II](https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii/) |    中等    |    [数组] [双指针]     | **False** |
|   [283. 移动零](https://leetcode.cn/problems/move-zeroes/)   |    简单    |    [数组] [双指针]     | **True**  |
| [905. 按奇偶排序数组](https://leetcode.cn/problems/sort-array-by-parity/) | 简单(1178) | [数组] [双指针] [排序] | **False** |
| [922. 按奇偶排序数组 II](https://leetcode.cn/problems/sort-array-by-parity-ii/) | 简单(1174) | [数组] [双指针] [排序] | **True**  |
| [3467. 将数组按照奇偶性转化](https://leetcode.cn/problems/transform-array-by-parity/) | 简单(1166) |  [数组] [计数] [排序]  | **True**  |
| [2460. 对数组执行操作](https://leetcode.cn/problems/apply-operations-to-an-array/) | 简单(1224) | [数组] [双指针] [模拟] | **True**  |
| [1089. 复写零](https://leetcode.cn/problems/duplicate-zeros/) | 简单(1263) |    [数组] [双指针]     | **False** |

### **双指针**

|                           题目名称                           |  题目难度  |                标签                 | 正确与否  |
| :----------------------------------------------------------: | :--------: | :---------------------------------: | :-------: |
| [2109. 向字符串添加空格](https://leetcode.cn/problems/adding-spaces-to-a-string/) | 中等(1315) |   [数组] [双指针] [模拟] [字符串]   | **True**  |
| [2540. 最小公共值](https://leetcode.cn/problems/minimum-common-value/) | 简单(1250) | [数组] [双指针] [二分查找] [哈希表] | **True**  |
| [88. 合并两个有序数组](https://leetcode.cn/problems/merge-sorted-array/) |    简单    |       [数组] [双指针] [排序]        | **True**  |
| [2570. 合并两个二维数组 - 求和法](https://leetcode.cn/problems/merge-two-2d-arrays-by-summing-values/) | 简单(1281) |      [数组] [双指针] [哈希表]       | **True**  |
|   [LCP 18. 早餐组合](https://leetcode.cn/problems/2vYnGI/)   |    简单    |  [数组] [双指针] [二分查找] [排序]  | **True**  |
| [1855. 下标对中的最大距离](https://leetcode.cn/problems/maximum-distance-between-a-pair-of-values/) | 中等(1515) |     [数组] [双指针] [二分查找]      | **False** |
| [1385. 两个数组间的距离值](https://leetcode.cn/problems/find-the-distance-value-between-two-arrays/) | 简单(1235) |  [数组] [双指针] [二分查找] [排序]  | **True**  |
| [925. 长按键入](https://leetcode.cn/problems/long-pressed-name/) | 简单(1271) |          [双指针] [字符串]          | **False** |

### **判断子序列**

|                           题目名称                           |  题目难度  |                      标签                      | 正确与否 |
| :----------------------------------------------------------: | :--------: | :--------------------------------------------: | :------: |
| [392. 判断子序列](https://leetcode.cn/problems/is-subsequence/) |    简单    |          [双指针] [字符串] [动态规划]          | **True** |
| [524. 通过删除字母匹配到字典里最长单词](https://leetcode.cn/problems/longest-word-in-dictionary-through-deleting/) |    中等    |        [数组] [双指针] [字符串] [排序]         | **True** |
| [2486. 追加字符以获得子序列](https://leetcode.cn/problems/append-characters-to-string-to-make-subsequence/) | 中等(1363) |            [贪心] [双指针] [字符串]            | **True** |
| [2825. 循环增长使字符串子序列等于另一个字符串](https://leetcode.cn/problems/make-string-a-subsequence-using-cyclic-increments/) | 中等(1415) |               [双指针] [字符串]                | **True** |
| [1023. 驼峰式匹配](https://leetcode.cn/problems/camelcase-matching/) | 中等(1537) | [字典树] [数组] [双指针] [字符串] [字符串匹配] | **True** |

### **分组循环**

**适用场景**：按照题目要求，数组会被分割成若干组，每一组的判断/处理逻辑是相同的。

**核心思想**：

- 外层循环负责遍历组之前的准备工作（记录开始位置），和遍历组之后的统计工作（更新答案最大值）。
- 内层循环负责遍历组，找出这一组最远在哪结束。

这个写法的好处是，各个逻辑块分工明确，也不需要特判最后一组（易错点）。

|                           题目名称                           |  题目难度  |               标签                | 正确与否  |
| :----------------------------------------------------------: | :--------: | :-------------------------------: | :-------: |
| [1446. 连续字符](https://leetcode.cn/problems/consecutive-characters/) | 简单(1165) |             [字符串]              | **True**  |
| [1869. 哪种连续子字符串更长](https://leetcode.cn/problems/longer-contiguous-segments-of-ones-than-zeros/) | 简单(1205) |             [字符串]              | **True**  |
| [2414. 最长的字母序连续子字符串的长度](https://leetcode.cn/problems/length-of-the-longest-alphabetical-continuous-substring/) | 中等(1222) |             [字符串]              | **True**  |
| [3456. 找出长度为 K 的特殊子字符串](https://leetcode.cn/problems/find-special-substring-of-length-k/) | 简单(1244) |             [字符串]              | **False** |
| [1957. 删除字符使字符串变好](https://leetcode.cn/problems/delete-characters-to-make-fancy-string/) | 简单(1358) |             [字符串]              | **True**  |
| [674. 最长连续递增序列](https://leetcode.cn/problems/longest-continuous-increasing-subsequence/) |    简单    |              [数组]               | **True**  |
| [978. 最长湍流子数组](https://leetcode.cn/problems/longest-turbulent-subarray/) | 中等(1393) |   [数组] [动态规划] [滑动窗口]    | **False** |
| [2110. 股票平滑下跌阶段的数目](https://leetcode.cn/problems/number-of-smooth-descent-periods-of-a-stock/) | 中等(1408) |     [数组] [数字] [动态规划]      | **True**  |
| [228. 汇总区间](https://leetcode.cn/problems/summary-ranges/) |    简单    |              [数组]               | **True**  |
| [2760. 最长奇偶子数组](https://leetcode.cn/problems/longest-even-odd-subarray-with-threshold/) | 简单(1420) |         [数组] [滑动窗口]         | **False** |
| [1887. 使数组元素相等的减少操作次数](https://leetcode.cn/problems/reduction-operations-to-make-the-array-elements-equal/) | 中等(1428) |           [数组] [排序]           | **True**  |
| [845. 数组中的最长山脉](https://leetcode.cn/problems/longest-mountain-in-array/) | 中等(1437) | [数组] [动态规划] [双指针] [枚举] | **False** |
| [2038. 如果相邻两个颜色均相同则删除当前颜色](https://leetcode.cn/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/) | 中等(1468) |   [贪心] [字符串] [数学] [博弈]   | **True**  |
| [1759. 统计同质子字符串的数目](https://leetcode.cn/problems/count-number-of-homogenous-substrings/) | 中等(1491) |          [字符串] [数学]          | **True**  |
| [3011. 判断一个数组是否可以变为有序](https://leetcode.cn/problems/find-if-array-can-be-sorted/) | 中等(1497) |      [位运算] [数组] [排序]       | **False** |
| [1578. 使绳子变成彩色的最短时间](https://leetcode.cn/problems/minimum-time-to-make-rope-colorful/) | 中等(1574) | [贪心] [字符串] [数组] [动态规划] | **True**  |
| [1839. 所有元音按顺序排布的最长子字符串](https://leetcode.cn/problems/longest-substring-of-all-vowels-in-order/) | 中等(1580) |        [字符串] [滑动窗口]        | **True**  |
| [2765. 最长交替子数组](https://leetcode.cn/problems/longest-alternating-subarray/) | 简单(1581) |           [数组] [枚举]           | **True**  |
| [3255. 长度为 K 的子数组的能量值 II](https://leetcode.cn/problems/find-the-power-of-k-size-subarrays-ii/) | 中等(1595) |         [数组] [滑动窗口]         | **False** |

## 3.二分法

### **二分查找**

|                           题目名称                           |  题目难度  |                    标签                    | 正确与否 |
| :----------------------------------------------------------: | :--------: | :----------------------------------------: | :------: |
| [34. 在排序数组中查找元素的第一个和最后一个位置](https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/) |    中等    |             [数组] [二分查找]              | **True** |
| [35. 搜索插入位置](https://leetcode.cn/problems/search-insert-position/) |    简单    |             [数组] [二分查找]              | **True** |
| [704. 二分查找](https://leetcode.cn/problems/binary-search/) |    简单    |             [数组] [二分查找]              | **True** |
| [744. 寻找比目标字母大的最小字母](https://leetcode.cn/problems/find-smallest-letter-greater-than-target/) |    简单    |             [数组] [二分查找]              | **True** |
| [2529. 正整数和负整数的最大计数](https://leetcode.cn/problems/maximum-count-of-positive-integer-and-negative-integer/) | 简单(1196) |          [数组] [二分查找] [计数]          | **True** |
| [2300. 咒语和药水的成功对数](https://leetcode.cn/problems/successful-pairs-of-spells-and-potions/) | 中等(1477) |     [数组] [二分查找] [双指针] [排序]      | **True** |
| [2389. 和有限的最长子序列](https://leetcode.cn/problems/longest-subsequence-with-limited-sum/) | 简单(1388) |  [贪心] [数组] [二分查找] [前缀和] [排序]  | **True** |
| [1170. 比较字符串最小字母出现频次](https://leetcode.cn/problems/compare-strings-by-frequency-of-the-smallest-character/) | 中等(1432) | [数组] [二分查找] [字符串] [哈希表] [排序] | **True** |

### **二分答案**

> “花费一个 log 的时间，增加了一个条件。” ——>二分答案

#### **求最小**

题目求什么，就二分什么

「求最小」和二分查找求「排序数组中某元素的第一个位置」是类似的，按照红蓝染色法，左边是不满足要求的（红色），右边则是满足要求的（蓝色）。

> **注**：部分题目可以优化二分边界，减少二分次数，从而减少代码运行时间。

|                           题目名称                           |  题目难度  |       标签        | 正确与否 |
| :----------------------------------------------------------: | :--------: | :---------------: | :------: |
| [1283. 使结果不超过阈值的最小除数](https://leetcode.cn/problems/find-the-smallest-divisor-given-a-threshold/) | 中等(1542) | [数组] [二分查找] | **True** |

#### **求最大**

「求最大」的题目与「求最小」相反，左边是满足要求的（蓝色），右边是不满足要求的（红色）。这会导致二分写法和「求最小」有一些区别。

以开区间二分为例：

- 求最小：check(mid) == true 时更新 right = mid，反之更新 left = mid，最后返回 right。

- 求最大：check(mid) == true 时更新 left = mid，反之更新 right = mid，最后返回 left。

对于开区间写法，简单来说 check(mid) == true 时更新的是谁，最后就返回谁。相比其他二分写法，开区间写法不需要思考加一减一等细节，推荐使用开区间写二分。

|                          题目名称                          | 题目难度 |       标签        | 正确与否  |
| :--------------------------------------------------------: | :------: | :---------------: | :-------: |
| [275. H 指数 II](https://leetcode.cn/problems/h-index-ii/) |   中等   | [数组] [二分查找] | **False** |

#### **二分间接值**

> 基础阶段暂无

#### 最小化最大值

> 基础阶段暂无

#### 最大化最小值

> 基础阶段暂无

####  第 K 小/大

> 基础阶段暂无



## 4.枚举

### 枚举右，维护左

对于**双变量问题**，例如两数之和 a[i] +a[j] =t，可以枚举右边的 a[j] ，转换成 **单变量问题**，也就是在 a[j]左边查找是否有 a[i] =t−a[j]，这可以用哈希表维护

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

### 枚举中间

对于三个或者四个变量的问题，枚举中间的变量往往更好算

|                           题目名称                           |  题目难度  |                   标签                   | 正确与否  |
| :----------------------------------------------------------: | :--------: | :--------------------------------------: | :-------: |
| [2909. 元素和最小的山形三元组 II](https://leetcode.cn/problems/minimum-sum-of-mountain-triplets-ii/) | 中等(1479) |                  [数组]                  | **False** |
| [1930. 长度为 3 的不同回文子序列](https://leetcode.cn/problems/unique-length-3-palindromic-subsequences/) | 中等(1533) |   [位运算] [哈希表] [字符串] [前缀和]    | **False** |
| [3128. 直角三角形](https://leetcode.cn/problems/right-triangles/) | 中等(1541) | [数组] [哈希表] [数学] [计数] [组合数学] | **False** |

## 5.前缀和

### 基础

|                           题目名称                           |  题目难度  |            标签            | 正确与否  |
| :----------------------------------------------------------: | :--------: | :------------------------: | :-------: |
| [303. 区域和检索 - 数组不可变](https://leetcode.cn/problems/range-sum-query-immutable/) |    简单    |   [设计] [数组] [前缀和]   | **True**  |
| [3427. 变长子数组求和](https://leetcode.cn/problems/sum-of-variable-length-subarrays/) | 简单(1216) |      [数组] [前缀和]       | **True**  |
| [2559. 统计范围内的元音字符串数](https://leetcode.cn/problems/count-vowel-strings-in-ranges/) | 中等(1435) |  [数组] [字符串] [前缀和]  | **True**  |
| [3152. 特殊数组 II](https://leetcode.cn/problems/special-array-ii/) | 中等(1523) | [数组] [二分查找] [前缀和] | **False** |
| [1749. 任意子数组和的绝对值的最大值](https://leetcode.cn/problems/maximum-absolute-sum-of-any-subarray/) | 中等(1542) |     [数组] [动态规划]      | **False** |
| [3361. 两个字符串的切换距离](https://leetcode.cn/problems/shift-distance-between-two-strings/) | 中等(1553) |  [数组] [字符串] [前缀和]  | **False** |

### 前缀和与哈希表

> 基础阶段暂无



### 距离和

|                           题目名称                           |  题目难度  |          标签          | 正确与否 |
| :----------------------------------------------------------: | :--------: | :--------------------: | :------: |
| [1685. 有序数组中差绝对值之和](https://leetcode.cn/problems/sum-of-absolute-differences-in-a-sorted-array/) | 中等(1496) | [数组] [数学] [前缀和] | **True** |

### 前缀异或和

> 基础阶段暂无



### 其他一维前缀和

|                           题目名称                           |  题目难度  |           标签           | 正确与否 |
| :----------------------------------------------------------: | :--------: | :----------------------: | :------: |
| [1310. 子数组异或查询](https://leetcode.cn/problems/xor-queries-of-a-subarray/) | 中等(1460) | [位运算] [数组] [前缀和] | **True** |

### 二维前缀和

![二维前缀和](./picture/二维前缀和.png)

求前缀和时：利用以下公式
$$
prefix[i + 1][j + 1] = prefix[i + 1][j] + prefix[i][j + 1] - prefix[i][j] + nums[i][j]
$$
去计算区域内的和时，利用以下公式
$$
sum = prefix[r2 + 1][c2 + 1] - prefix[r2 + 1][c1] - prefix[r1][c2 + 1] + prefix[r1][c1]
$$

|                           题目名称                           |  题目难度  |             标签              | 正确与否 |
| :----------------------------------------------------------: | :--------: | :---------------------------: | :------: |
| [304. 二维区域和检索 - 矩阵不可变](https://leetcode.cn/problems/range-sum-query-2d-immutable/) |    中等    | [设计] [数组] [前缀和] [矩阵] | **True** |
| [1314. 矩阵区域和](https://leetcode.cn/problems/matrix-block-sum/) | 中等(1484) |    [数组] [前缀和] [矩阵]     | **True** |
| [3070. 元素和小于等于 k 的子矩阵的数目](https://leetcode.cn/problems/count-submatrices-with-top-left-element-and-sum-less-than-k/) | 中等(1499) |    [数组] [前缀和] [矩阵]     | **True** |



## 6.差分算法

### 一维差分（扫描线）

对于数组 a，定义其差分数组（difference array）为
$$
d[i] = \begin{cases} 
a[0], i = 0 \\
a[i]-a[i - 1], i \ge 0
\end{cases}
$$

性质 1：从左到右累加 d 中的元素，可以得到数组 a。

性质 2：如下两个操作是等价的。

- 把 a 的子数组 a[i],a[i+1],…,a[j] 都加上 x。

- 把 d[i] 增加 x，把 d[j+1] 减少 x。

利用性质 2，我们只需要 O(1) 的时间就可以完成对 a 的子数组的操作。最后利用性质 1 从差分数组复原出数组 a。

> 注：也可以这样理解，d[i] 表示把下标 ≥i 的数都加上 d[i]。
>

|                           题目名称                           |  题目难度  |                标签                | 正确与否 |
| :----------------------------------------------------------: | :--------: | :--------------------------------: | :------: |
| [2848. 与车相交的点](https://leetcode.cn/problems/points-that-intersect-with-cars/) | 简单(1230) |      [数组] [哈希表] [前缀和]      | **True** |
| [1893. 检查是否区域内所有整数都被覆盖](https://leetcode.cn/problems/check-if-all-the-integers-in-a-range-are-covered/) | 简单(1307) |      [数组] [哈希表] [前缀和]      | **True** |
| [1854. 人口最多的年份](https://leetcode.cn/problems/maximum-population-year/) | 简单(1370) |       [数组] [计数] [前缀和]       | **True** |
| [2960. 统计已测试设备](https://leetcode.cn/problems/count-tested-devices-after-test-operations/) | 简单(1169) |        [数组] [计数] [模拟]        | **True** |
|   [1094. 拼车](https://leetcode.cn/problems/car-pooling/)    | 中等(1441) | [数组] [前缀和] [模拟] [排序] [堆] | **True** |
| [1109. 航班预订统计](https://leetcode.cn/problems/corporate-flight-bookings/) | 中等(1570) |          [数组] [前缀和]           | **True** |
| [3355. 零数组变换 I](https://leetcode.cn/problems/zero-array-transformation-i/) | 中等(1591) |          [数组] [前缀和]           | **True** |

### 二维差分

![二维差分](.\picture\二维差分.png)

最后从二维差分矩阵 *d* 还原出二维计数矩阵 *cnt*。类似对一维差分数组求前缀和得到原数组，我们需要**对二维差分矩阵求二维前缀和**

计算二维差分的和时，需要进行加减消元
$$
ans[i - 1][j - 1] = diff[i - 1][j] + diff[i][j - 1] - diff[i - 1][j - 1]
$$


|                           题目名称                           |  题目难度  |          标签          | 正确与否  |
| :----------------------------------------------------------: | :--------: | :--------------------: | :-------: |
| [2536. 子矩阵元素加 1](https://leetcode.cn/problems/increment-submatrices-by-one/) | 中等(1583) | [数组] [矩阵] [前缀和] | **False** |



## 7.栈

### 普通栈

利用栈的先进后出的特性来去做题

|                           题目名称                           |  题目难度  |        标签         | 正确与否 |
| :----------------------------------------------------------: | :--------: | :-----------------: | :------: |
| [1441. 用栈操作构建数组](https://leetcode.cn/problems/build-an-array-with-stack-operations/) | 中等(1180) | [栈] [数组]  [模拟] | **True** |
|                                                              |            |                     |          |
|                                                              |            |                     |          |



### 临项消除



### 合法括号字符串



### 表达式解析



### 对顶栈



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
