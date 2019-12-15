package cn.heypai.util.baidu.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author three
 * @since 2019-12-08 17:53
 * <p>
 *
 * </p>
 */
@Data
public class BaiDuBaseResponse<T> {
	private T      result;
	@JSONField(name = "log_id")
	private String logId;
	@JSONField(name = "error_msg")
	private String errorMsg;
	private String cached;
	@JSONField(name = "error_code")
	private String errorCode;
	private Long   timestamp;
}
