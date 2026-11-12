package com.drojian.test_demo1.kotlin_base

fun main() {
    val man = Person2(name = "zhangsan", age = 18)
    val man2 = Person2(name = "wangwu", age = 20)
}

//主显示构造函数
class Person3 constructor(var name: String, var age: Int) {
    fun intor2() {
        println("姓名：${name},年龄：${age}")
    }
}

//隐式构造函数
class Person2(var name: String, var age: Int) {
    fun intor2() {
        println("姓名：${name},年龄：${age}")
    }
}