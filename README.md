# healthshop

## 项目背景
电子商务课程结束后，是时候做一个电商网站展示学习情况了。

## 项目结构
```
.
├─main
│  ├─java
│  │  └─com
│  │      └─homework
│  │          └─healthshop
│  │              ├─annotation 自定义注解
│  │              ├─aspect AOP逻辑类
│  │              ├─constant 常量类
│  │              ├─controller 控制类
│  │              ├─DAO 持久层类
│  │              ├─DTO 数据传输类
│  │              ├─entity 数据库表实体类
│  │              ├─MQ
│  │              ├─repository JPA持久层类
│  │              ├─service 服务层及其实现
│  │              │  └─Impl
│  │              └─utils 工具类
│  └─resources
│      ├─mapper
│      ├─static
│      └─templates
└─test
```

## 涉及技术：
1. 使用 `Spring-JPA` 实现 DAO 业务；
2. 使用 `Spring自定义注解` + `Spring-AOP` + `AES-Java加密` 实现token机制；
3. 使用 Nginx 反向代理实现前后端分离发布；

## 亮点
1. 有 JWT 用户状态检测机制；

## 截图展示
