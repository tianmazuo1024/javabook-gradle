import cn.javabook.controller.HelloWorldController

object Main extends App {
  // 调用Java类
  val hello = new HelloWorldController();
  hello.said("《JavaBook》", 1);
}
