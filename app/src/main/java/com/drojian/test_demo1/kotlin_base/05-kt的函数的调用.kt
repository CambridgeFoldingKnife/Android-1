package com.drojian.test_demo1.kotlin_base



//1、带参数和返回值的函数
fun sum(num1: Int,num2: Int) : Int{
    return num1+num2;
}

//2、函数表达式，只适合一行代码的
fun sum2(num1: Int,num2: Int): Int = num1+ num2

//3、不带参数制返回值
fun intro(){
    println("hello everyone");
}

//4、带默认参数
fun intro2(name: String,age: Int=20){
    println("姓名：$name,年龄：$age")
}

//5、命名参数
fun getUser(name: String,age: Int,city: String ){
    println("name:$name,age:$age,city:$city")

}


fun  main (){
    intro();
    println(sum(1,2));
    //  println(sum(1,2L)); 有类型要求
    intro2("zhangsan",18)
    intro2("wangwu")

    getUser("xufeifei",20,"郑州");

}