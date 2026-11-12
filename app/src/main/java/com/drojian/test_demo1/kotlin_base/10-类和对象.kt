package com.drojian.test_demo1.kotlin_base

fun main() {
    val p1 = Person()
    p1.name = "zhangsan"
    p1.age = 18

    val p2 = Person()
    p2.name = "wangwu"
    p2.age = 20

    println(p1.name)
    println(p2.name)
}

//定义属性和方法。
class Person {

    var name: String = ""
    var age: Int = 1

    fun intro() {
        println("姓名：${name}，年龄：${age}")
    }
}