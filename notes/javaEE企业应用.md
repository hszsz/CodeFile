# JAVAEE企业版笔记
## 安装maven 
### 1.下载
###### 网址：http://maven.apache.org/download.cgi
###### 选择：Binary zip archive&emsp;&emsp;apache-maven-3.6.1-bin.zip下载  
### 2.安装 
##### 解压到你自己的安装路径
### 3.配置环境变量
###### 新建环境变量
**M2_HOME**  
**MAVEN_HOME** 
添加同样的maven路径我的是：
**E:\Program Files\apache-maven-3.6.1**
##### 再配置path环境：新建一个  
**%M2_HOME%\bin**
### 4.验证  
**mvn -varsion**  
### 5.修改源  
&emsp;&emsp;打开 maven 的安装目录/conf/setting.xml，替换里面的mirrors为下面代码。
~~~xml
<mirrors>
  <mirror>
    <id>alimaven</id>
    <name>aliyun maven</name>
    <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
    <mirrorOf>central</mirrorOf>        
  </mirror>
</mirrors>
~~~
&emsp;&emsp;修改源的目的在于能够用maven快速生成项目
### 6.创建新的java项目  
mvn archetype:generate -DgroupId=cn.com.scitc -DartifactId=test -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
### 7.要是不愿意在黑区区的cmd终端输入命令行运行这个的话还是有办法。在vscode安装合适的插件。
ctrl + ~打开vscode集成终端，把powershell换成cmd,一样的能运行，本人亲自实验过可以用
### 8.我在vscode 搭建个java开发环境出来。  
##### 8.1首先安装插件
  1.Maven for Java
  2.Language Support for Java(TM) by Red Hat  
  3.Debugger for Java
  4.Java Test Runner  
  5.Java Extension Pack
  6.Java Dependency Viewer
##### 8.2打开setting.json修改设置
在最后面加一句代码
~~~json
"java.configuration.maven.userSettings": "E:/Program Files/apache-maven-3.6.1/conf/settings.xml"
~~~
关闭窗口设置完成。
##### 8.3用vscode生成java项目ctrl + shift + p输入maven选择maven原型生成 再点击vaadin-archetype-application
##### 8.4用maven生成javaweb程序还是和上面的一样，但是最后是选maven-archetype-webapp 


# spring

### Dependencies 
**Developer tools  : spring boot Devtools 调试程序**
**web : spring web start**
**template Engines : Thymeleaf 渲染页面**
### 项目目录
src里面有两个目录 test 放测试文件
main里面两个目录 java里面放主要java代码
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;resources放配置文件


2019-7-1
## 1.关于创建项目
#### a.上节课便用的spring ititalize b.直援使用maven创罐。
持久层框渠，是JPA的一种实现，开源，免费
3.操作步费：
（1）创建项目：
向导里多选了两个项件：xx和xx
（2）连接数据库
view->tool window-> database I建立连援
（3）修改项目配置，增加hibernate支持项目结构->factes，增加hibernate，增加配置文件（4）根据表结构产生model类
a.view->persistence b.右键点hibernate.cfg.xnl选generate...->by.….  

  



# 2019-7-11  
##### 1.th:href="@{路径}" 链接网址表达式。  
##### 2.${param.x}将返回一个被调用的请求参数x.
##### 3.th:utext:如果我们希望Thymeleaf依然转义HTML标签而不是避开，我们将使用th:utext.  
th:text:如果用这个将转义，html标签，使它展现在浏览器页面中。
##### 4.1表达式：
    变量表达式： ${...}
    选择变量表达式： *{...}
    消息表达式： #{...}
    链接网址表达式： @{...}
    片段表达式： ~{...}
  ##### 4.2字面
    文本：'one text'，'Another one!'，...
    数字：0，34，3.0，12.3，...
    布尔型：true，false
    空： null
    文字标记：one，sometext，main，...
  ##### 4.3文字操作：
    字符串连接： +
    字面替换： |The name is ${name}|
  ##### 4.4算术运算：
    二元运算符：+，-，*，/，%
    减号（一元运算符）： -
  ##### 4.5布尔运算：
    二元运算符：and，or
    布尔否定（一元运算符）： !，not
  ##### 4.6比较和平等：
    比较：>，<，>=，<=（gt，lt，ge，le）
    平等运营商：==，!=（eq，ne）
  ##### 4.7条件选择：
    IF-THEN： (if) ? (then)
    IF-THEN-ELSE： (if) ? (then) : (else)
    默认： (value) ?: (defaultvalue)
 ##### 5.th:switch/ th:case选择语句。

 ## 2019.7.15  
 创建项目  
 1.选devtools、jpa\ mysql\webstart  
 2.将bootstrap 复制到resources/static  
 3.建立一个控制器HomeController. html,测试一下bootstarap。
4.新建resources/template/include.html 将bootstrap头定义成fragement  
5.在HomeController中定义/，关联deault.html  
6.在default.html中引用fragement。
7.产生model类，写dao
8.在default中查询数据库
9.绑表格

## 2019.7.16
1.th:href传参
<a th:href="|@{/student/edit?id=}${student.Id}&name=${student.name}|"></a>  
<a th:href="@{/student/edit(id=${student.id}.name=${student.name})}">  
第一种方便，第二种安全。  
2.log的用法  
private log log = logFactory.getLog(getClass())