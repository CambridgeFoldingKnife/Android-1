//包名
package com.drojian.test_demo1
//导入需要用到的工具类，组件，颜色等。
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.drojian.test_demo1.ui.theme.Testdemo1Theme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {//继承自componentActivity类
    //是安卓底层的基类，来管理actiity的生命周期。
    //重写并调用了父类onCreate（）方法
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)//调用父类的onCreate方法
    //安全间距
        enableEdgeToEdge()

    //设置页面的内容页面内容统一放在里面。写compose UI
        setContent {
          Testone();
        }

    }
}

//数据驱动视图  view-model
@Composable
fun Testone() {
       //1、定义变量
    val appname = "购物商城"
    val version = "V0.0.1"
    //compose UI组件
    Column(
        modifier = Modifier
           .padding(30.dp)//外边距
            .fillMaxSize()
            .background(color = Color.Red)
            .padding(30.dp)//内边距
    ) {
        Text(text = "欢迎来到：$appname", fontSize = 25.sp)
        Text(text = "欢迎来到：$version", fontSize = 15.sp)
        Text(text = "1-10的和：${sum(1,10)}", fontSize = 15.sp)
    }
}
fun sum(start: Int=1,end: Int = 10): Int{
    var result = 0
    for(i in start..end){
        result+=i
    }
    return result;
}


//如果用@Composable注释的 那么这个方法中就是用来放composeui结构的
/*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    //compose UI的文本组件
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}*/



/*@Preview(showBackground = true)//增加预览视图注解
@Composable
fun GreetingPreview() {
    Testdemo1Theme {
        Greeting("Android")
    }
}*/
