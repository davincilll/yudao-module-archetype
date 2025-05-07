/**
 * Redis DAO 接口与实现类
 * 
 * Redis DAO 命名规则：
 * 1. 以 RedisDAO 结尾，例如 UserRedisDAO
 * 2. KEY 命名规则：项目名:模块名:业务名:词性，例如 yudao:${artifactId}:user:string
 * 3. 使用 RedisUtils 工具类，封装简单的 Redis 操作
 */
package ${package}.dal.redis; 