# JVM学习之JAVA虚拟机历史 #
>
## 1.4 Java虚拟机的发展史 2019/7/2 11:19:41 ##

1. Sun Classic/Exact VM
   
   - 纯解释器方式来执行Java代码，如果要使用JIT编译器，就必须进行外挂 
   - `java version"1.2.2"
Classic VM（build JDK-1.2.2-001，green threads,sunwjit）`
1. Exact VM
   
   - 两级即时编译器、编译器与解释器混合工作模式
   - Exact VM因它使用准确式内存管理（Exact Memory Management，也可以叫Non-Conservative/Accurate Memory Management）
1. Sun HotSpot VM


   - SUNJDK 和 OpenJDK 中自带的虚拟机，也是目前使用最广泛的虚拟机。（最初由Longview Technologies小公司设计）
   - HotSpot VM的热点代码探测能力可以通过执行计数器找出最具有编译价值的代码，然后通知JIT编译器以方法为单位进行编译
   - 通过编译器与解释器恰当地协同工作，可以在最优化的程序响应时间与最佳执行性能中取得平衡，而且无须等待本地代码输出才能执行程序即时编译的时间压力也相对减小，这样有助于引入更多的代码优化技术，输出质量更高的本地代码。
1. Sun Mobile-Embedded VM/Meta-Circular VM

   - KVM
      - KVM中的K是"Kilobyte"的意思，它强调简单、轻量、高度可移植，但是运行速度比较慢。在Android、iOS等智能手机操作系统出现前曾经在手机平台上得到非常广泛的应用
   - CDC/CLDC HotSpot Implementation
   - Squawk VM
      - Squawk VM由Sun公司开发，运行于Sun SPOT（Sun Small Programmable Object Technology，一种手持的WiFi设备），也曾经运用于Java Card
   -  JavaInJava 实验室性质的虚拟机
   -  Maxine VM Maxine VM和上面的JavaInJava非常相似，它也是一个几乎全部以Java代码实现（只有用于启动JVM的加载器使用C语言编写）的元循环Java虚拟机 
1. BEA JRockit/IBM J9 VM

   -  JRockit VM曾经号称“世界上速度最快的Java虚拟机”（广告词，貌似J9 VM也这样说过），它是BEA公司在2002年从Appeal Virtual Machines公司收购的虚拟机。BEA公司将其发展为一款专门为服务器硬件和服务器端应用场景高度优化的虚拟机，由于专注于服务器端应用，它可以不太关注程序启动速度，因此JRockit内部不包含解析器实现，全部代码都靠即时编译器编译后执行。除此之外，JRockit的垃圾收集器和MissionControl服务套件等部分的实现，在众多Java虚拟机中也一直处于领先水平
   -  IBM J9 VM并不是IBM公司唯一的Java虚拟机，不过是目前其主力发展的Java虚拟机
1. Azul VM/BEA Liquid VM  

   - Azul VM是Azul Systems公司在HotSpot基础上进行大量改进
   - Liquid VM即是现在的JRockit VE（Virtual Edition），它是BEA公司开发的
1. Apache Harmony/Google Android Dalvik VM
   - Harmony VM和Dalvik VM只能称做“虚拟机”，而不能称做“Java虚拟机”，但是这两款虚拟机（以及所代表的技术体系）对最近几年的Java世界产生了非常大的影响和挑战，甚至有些悲观的评论家认为成熟的Java生态系统有崩溃的可能。
1. Microsoft JVM及其他
   - JamVM.cacaovm.SableVM.Kaffe.Jelatine JVM.NanoVM.MRP.

### 可以运行在JVM之上的语言 ###
![](https://i.imgur.com/Q7LZzjt.png)
### 常见语言JVM实现版本 ###
![](https://i.imgur.com/0ynjLeC.png)
### OpenJDK和Oracle JDK之间的关系 ###
![](https://i.imgur.com/4zFHaS1.png)
### OpenJDK 6、OpenJDK 7、OpenJDK 7u、OpenJDK 8之间的关系 ###
![](https://i.imgur.com/1Vhlmi8.png)