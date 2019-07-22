1.生成密钥指令
~~~linux
ssh-keygen -t rsa -C "1360196918@qq.com"
~~~
2.验证密钥指令  
~~~linux
ssh -T git@github.com
~~~
3.克隆仓库指令
~~~linux
git clone 地址
~~~  
4.配置用户名  
~~~linux  
git config --global user.name "hszsz"
~~~
5.配置邮箱  
~~~linux  
git config --global user.email "1360196918@qq.com"
~~~
6.提交  
~~~linux  
git add .
~~~
7.提交到本地仓库  
~~~linux
git commit -m "提交信息"
~~~  
8.上传远程仓库  
~~~linux  
git push -u origin master
~~~  
9.更改远程仓库地址  
~~~linux
git remote add origin 远程仓库地址
~~~
10.删除远程地址  
~~~linux
git remote rm origin
~~~