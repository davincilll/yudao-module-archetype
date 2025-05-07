# yudao-module-archetype

这是一个基于 ruoyi-vue-pro 的模块原型，用于快速创建一个新的业务模块。

## 使用方法

### 1. 安装 archetype

```bash
cd yudao-archetype-module
mvn clean install
```

### 2. 创建新模块

```bash
mvn archetype:generate \
  -Dpackage=cn.iocoder.yudao.module.${artifactId} \
  -DartifactId=<module-name> \
  -DmoduleDescription="<模块描述>" \
  -DinitialErrorCode=<错误码起始段，如010>
```

例如：

```bash
mvn archetype:generate \
  -Dpackage=cn.iocoder.yudao.module.${artifactId} \
  -DartifactId=ai \
  -DmoduleDescription="ai相关业务的模块" \
  -DinitialErrorCode=010
```

### 3. 添加到项目

在根项目的 `pom.xml` 文件中添加新模块：

```xml
<modules>
    <!-- 其他模块 -->
    <module>yudao-module-你在上一步填的artifactId></module>
</modules>
```

### 4. 启动服务

- 修改数据库配置
- 添加必要的业务代码
- 启动服务 