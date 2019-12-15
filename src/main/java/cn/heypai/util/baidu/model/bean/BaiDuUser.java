package cn.heypai.util.baidu.model.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author three
 * @since 2019-12-15 16:04
 * <p>
 *
 * </p>
 */
@Data
public class BaiDuUser {
	private Integer score;
	@JSONField(name = "group_id")
	private String  groupId;
	@JSONField(name = "user_id")
	private String  userId;
	@JSONField(name = "user_info")
	private String  userInfo;
}
