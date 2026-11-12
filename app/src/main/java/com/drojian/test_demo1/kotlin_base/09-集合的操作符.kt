package com.drojian.test_demo1.kotlin_base

import android.os.Debug
import android.text.style.QuoteSpan
import androidx.lifecycle.ViewModel

//定一个一个结构体数据模型
data class QuestionItem(
    val id: String,
    val stem: String,
    val difficulty: Int,
    val views: Int,
    val likeCount: Int
)

fun main() {
    val question = listOf(
        QuestionItem("1", "activity生命周期", 1, 100, 20),
        QuestionItem("2", "handler原理", 3, 200, 50),
        QuestionItem("3", "compose", 2, 300, 40),
        QuestionItem("4", "Binder机制", 5, 500, 29)
    )
    //链式调用 取出来大于等于3的难度、根据view降序、stem
    //如第一步过滤没有满足>3的会返回null值。所有需要？空安全
    val stem = question.filter { it.difficulty > 3 }
        .sortedByDescending { it.views }
        .firstOrNull()
        ?.stem
    println(stem)

//1、filter过滤器-多种写法
    val easy = question.filter({ item -> item.difficulty < 2 })
    val easy1 = question.filter { item -> item.difficulty < 2 }
    val esay2 = question.filter { it.difficulty < 2 }
    println(esay2)

    //2、map：映射成一个新数组。
    val titles = question.map { it.stem }
    println(titles)

    //3、sort生序排序 --按照题目sortedBy、sortedByDescending
    val byviews = question.sortedBy { it.stem }
    //4、sort降序排序
    val byviewDesc = question.sortedByDescending { it.stem }
    println(byviews)
    println(byviewDesc)

    //5、集合的遍历
    question.forEach { q ->
        println("题目：${q.stem},浏览量：${q.views}")
    }

    question.forEach {
        println("题目：${it.stem},浏览量：${it.views}")
    }


    //6、查找find
    val res = question.find { it.id == "3" }
    //查找到第一个满足条件的就返回
    val res1 = question.find { it.views > 300 }
    //查找全部满足条件的返回
    val res2 = question.findLast { it.views > 300 }

    //7、获取第一个元素没有就返回null，现将代拍元素进行降序排列，判断第一个是否为null
    //两种写法
    val hardest = question.sortedByDescending { it.difficulty }.firstOrNull()
    val hardest2 = question.maxByOrNull { it.difficulty }

    //8、any/all/none：进行判断
    //8.1有一个满足就是true
    val hashard = question.any({ it.difficulty >= 5 })

    //8.2所有都满足条件才是true,有一个不满足的就是false
    val allEasy = question.all { it.difficulty <= 2 }

    //8.3没有一个满足条件的才是true
    val noneImpossible = question.none { it.difficulty >= 5 }

    //9.计数conunt
    //集合中大于等于3的有几个
    val count = question.count { it.difficulty >= 3 }

    //10、groupBy 分组
    //按照指定属性进行分组。
    println(question.groupBy { it.difficulty })


}


