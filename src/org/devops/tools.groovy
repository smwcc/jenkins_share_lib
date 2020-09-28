package org.devops  //必备格式，类似于java 的一种目录格式的包路径引用,org和devops就是上面的路径

//定义一个颜色输出的方法，供所有jenkinsfile 调用
def PrintMes(value,color){
    colors = ['red'   : "\033[40;31m >>>>>>>>>>>${value}<<<<<<<<<<< \033[0m",
              'blue'  : "\033[47;34m ${value} \033[0m",
              'green' : "^[[1;32m>>>>>>>>>>${value}>>>>>>>>>>^[[m",
              'green1' : "\033[40;32m >>>>>>>>>>>${value}<<<<<<<<<<< \033[0m" ]
    ansiColor('xterm') {
        println(colors[color])
    }
}//此文件就是一个类，里面可以定义好多个方法不止上面一个
