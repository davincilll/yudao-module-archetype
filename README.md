# yudao-module-archetype

这是一个基于 ruoyi-vue-pro 的模块原型，用于快速创建一个新的业务模块。

## 使用方法

### 1. 配置仓库

在项目的 `pom.xml` 中添加以下配置：

```xml
<repositories>
    <repository>
        <id>github</id>
        <name>GitHub Packages</name>
        <url>https://maven.pkg.github.com/davincilll/yudao-module-archetype</url>
    </repository>
</repositories>
```

### 2. 创建新模块
#### 方式一：
通过命令行创建新模块
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
  -DartifactId=demo \
  -DmoduleDescription="demo相关业务的模块" \
  -DinitialErrorCode=010
```
#### 方式二：
通过 IntelliJ IDEA 创建新模块
* 下载archetype-catalog.xml文件
* idea配置添加目录
  [![pELmKVx.png](https://s21.ax1x.com/2025/05/07/pELmKVx.png)](https://imgse.com/i/pELmKVx)
* 创建新模块
  [![pELmQIK.png](https://s21.ax1x.com/2025/05/07/pELmQIK.png)](https://imgse.com/i/pELmQIK)
### 3. 添加到项目

在根项目的 `pom.xml` 文件中添加新模块：

```xml
<modules>
    <!-- 其他模块 -->
    <module>yudao-module-demo</module>
</modules>
```

### 4. 启动服务

- 修改数据库配置
- 添加必要的业务代码
- 启动服务 

## 开发者说明

### 发布新版本

1. 更新 `pom.xml` 中的版本号
2. 确保已配置 GitHub Personal Access Token（需要 `write:packages` 权限）
3. 执行发布命令：
```bash
mvn clean deploy
```

### 配置说明

如需使用 GitHub Packages，需要在 `~/.m2/settings.xml` 中配置 GitHub 认证信息：

```xml
<settings>
  <servers>
    <server>
      <id>github</id>
      <username>YOUR_GITHUB_USERNAME</username>
      <password>YOUR_GITHUB_PAT</password>
    </server>
  </servers>
</settings>
``` 