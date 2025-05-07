package ${package}.enums;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;

/**
 * 错误码枚举类
 *
 * 系统，使用 1-${initialErrorCode} 段
 */
public interface ErrorCodeConstants {

    // ========== 示例 1001-1099 ==========
    ErrorCode EXAMPLE_NOT_EXISTS = new ErrorCode(1001, "示例不存在");

} 