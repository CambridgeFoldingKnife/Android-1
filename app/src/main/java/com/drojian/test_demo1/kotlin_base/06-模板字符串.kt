package com.drojian.test_demo1.kotlin_base

fun string1(){
    val name = "wangwu"
    val age = 30
    //1、
    val  s1= "姓名：$name, 年龄:$age "

    //2、基于这个变量进行运算，需要加上{}
    val  s2= "姓名：$name, 年龄:${age * 2} "

    //3、过滤器前面空格字符
    val  s3 = """
        name:$name
        age:$age
"""

    //4、过滤器前面空格字符
    val  s4 = """
        name:$name
        age:$age
""".trimIndent()
    println(s4)
}


fun main() {
    string1();
}