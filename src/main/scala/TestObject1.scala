/**
  * ${DESCRIPTION}
  *
  * @author lvliangliang
  * @create 2018-12-25 下午2:52
  */
object TestObject1 {
  def main(args: Array[String]): Unit = {
    //注意var、val，即为变量和常量
    var name:String="lll";
    name="mary"
    val sex:String ="male"
    val pt=new Point(2,3)
    //注意样例类的模式匹配
    val alice=new Person("Mary",21)


    //打印 test
    println("it's the first object");
    println("name :"+name)
    println("sex："+sex)
    pt.move(1,2)
    println("this is matchtest:"+matchTest(4))
    println(alice)
  }

  // 只要发现有一个匹配的case，剩下的case就不会继续匹配
  def matchTest(x:Int):String =x match {
    case 1=> "one"
    case 2=> "two"
    case _=> "other"
  }
}

class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc
  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println("x 的坐标点: " + x);
    println("y 的坐标点: " + y);
  }
}

trait Equal {
  def isEqual(X: Any): Boolean
  def isNotEqual(X: Any): Boolean = !isEqual(X)
}

// 使用case关键字的类定义就是样例类，是特殊的类，结果优化可以用于模式匹配
/*
    在声明样例类时，下面的过程自动发生了：
      构造器的每个参数都成为val，除非显式被声明为var，但是并不推荐这么做；
      在伴生对象中提供了apply方法，所以可以不使用new关键字就可构建对象；
      提供unapply方法使模式匹配可以工作；
      生成toString、equals、hashCode和copy方法，除非显示给出这些方法的定义。
*/
case class Person(name:String,age:Int)




