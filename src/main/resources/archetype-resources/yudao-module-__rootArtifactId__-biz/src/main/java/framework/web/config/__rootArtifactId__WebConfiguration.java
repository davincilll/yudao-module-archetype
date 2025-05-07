package ${package}.framework.web.config;

import cn.iocoder.yudao.framework.swagger.config.YudaoSwaggerAutoConfiguration;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Web 组件的 Configuration
 * Todo:修改文件名
 */
@Configuration(proxyBeanMethods = false)
public class ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}WebConfiguration {

    /**
     * API 分组
     */
    @Bean
    public GroupedOpenApi ${artifactId}GroupedOpenApi() {
        return YudaoSwaggerAutoConfiguration.buildGroupedOpenApi("${artifactId}");
    }

} 