package com.drojian.test_demo1.kotlin_base

import android.net.http.QuicException

fun main() {
    // ifDemo(60)

    //whenDemo(4)
    //whenDemo(5)
    forDemo();
}

fun ifDemo(score: Int) {

    /*    if (score >= 80) {
            println("Good!Good!")
        } else if (score >= 70) {
            println("Good!")
        } else if (score >= 60) {
            println("及格")
        }
        else println("bad")*/

//只有一个if-else可以简写一行代码
    val res = if (score >= 60) "及格" else "不及格"
    println(res)

}

fun whenDemo(difficuty: Int) {
    val level = when (difficuty) {
        1, 2 -> "简单"
        3, 4 -> "一般"
        5 -> "未知"
        else -> "未知"
    }
    println(level)
}

fun whenDemo02(score: Int) {
    val level = when {
        score >= 90 -> "优秀"
        score >= 70 -> "良好"
        score >= 60 -> "及格"
        else -> "不及格"
    }
    println(level)
}


fun forDemo() {
    /*    //1、默认步长1
        for (i in 1..20) {
            println(i)
        }
        //2、可以手动改设置步长为2
        for (i in 1..20 step 2) {
            println(i)
        }
        //3、降序输出--downto
        for (i in 20 downTo 1 step 5) {
            println(i)
        }*/

    //4、遍历集合
    val question = listOf("activity", "class", "service", "broadcost")
    /* for (q in question) {
         println(q)
     }*/

    //5、遍历集合带下标。0开始
    for ((index, q) in question.withIndex()) {
//        var idx = index + 1
//        println("$idx--$q")
        println("$index--$q")
    }
}

fun whileDemo() {
    val page = 1

}