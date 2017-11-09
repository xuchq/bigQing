# bigQing
bigQing's ssm framework 2017.11.08
* **这是一个空的ssm框架**
- spring+Springmvc+mybatis+mysql
* **使用git clone命令或git desktop下载该工程后，请按照如下步骤操作：**
- 1、配置maven，将镜像修改为阿里巴巴或公司自己的仓库
- 2、运行ChatRobot.sql，建库建表并插入一条数据
- 3、运行IUserDaoTest main方法，测试mybatis和spring整合
```
11:24:52.675 [main] DEBUG com.bigQing.dao.IUserDao.selectUser - <==      Total: 1
11:24:52.686 [main] DEBUG org.mybatis.spring.SqlSessionUtils - Closing non transactional SqlSession [org.apache.ibatis.session.defaults.DefaultSqlSession@2e570ded]
bigQing
xuchq1207@163.com
```
- 4、将项目部署到tomcat，访问默认首页index.html
- 5、点击onclick test按钮
- 6、界面返回刚插入的用户信息，则搭建ssm成功
```
{"id":1,"email":"xuchq1207@163.com","password":"abc123","username":"bigQing","role":"root","status":0,"regTime":1509696511000,"regIp":"127.0.0.1"}
```
