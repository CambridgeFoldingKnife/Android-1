package com.drojian.test_demo1.kotlin_base


fun main() {
    demo3();
    demo4();
}

fun demo3(){
    //类型推断
    val count = 10   //int
    val name = "zhangsan"//strig
    val level = 'B'//char
    println(count)
    println(name)
    println(level)
}

fun demo4(){
    //类型转换
    val str = "123"
    val num = str.toInt()//to方法

    println(str)
    println(num)

    var num2 =10001
    var str2 = num2.toString()
    println(str2)


    val isLogin = false;
    val str3 = isLogin.toString()

    println(str3)

}