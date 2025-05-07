# ${artifactId} 模块

${moduleDescription}

## 目录结构

```
yudao-module-${artifactId}/
├── yudao-module-${artifactId}-api/        // API 模块，暴露给其它模块调用
│   ├── src/main/java/
│   │   └── ${package}/
│   │       ├── api/                       // API 接口
│   │       └── enums/                     // 枚举类
│   └── pom.xml
├── yudao-module-${artifactId}-biz/        // 业务模块，实现具体业务逻辑
│   ├── src/main/java/
│   │   └── ${package}/
│   │       ├── api/                       // 内部 API 接口
│   │       ├── controller/                // Controller 层
│   │       │   ├── admin/                 // 管理后台的 Controller
│   │       │   └── app/                   // 前台应用的 Controller
│   │       ├── convert/                   // 数据转换层
│   │       ├── dal/                       // 数据访问层
│   │       │   ├── dataobject/           // 数据库实体对象
│   │       │   ├── mysql/                // MySQL 数据访问
│   │       │   └── redis/                // Redis 数据访问
│   │       ├── framework/                 // 框架封装
│   │       │   └── web/                  // Web 相关
│   │       │       └── config/           // Web 配置
│   │       └── service/                   // 业务逻辑层
│   ├── src/main/resources/               // 资源文件
│   ├── src/test/                         // 单元测试
│   └── pom.xml
└── pom.xml                               // 父 pom
```

## 开发规范

1. Controller URL：以 `/api/` 开头，避免和其它 Module 冲突
2. DataObject 表名：以模块前缀开头，方便在数据库中区分
3. 错误码：使用 1-${initialErrorCode} 段
4. 包名：使用 `${package}` 作为基础包名 