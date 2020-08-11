package club.wlqzz.blog.exception;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class AllException {
 
	/// 角色权限异常捕捉
	@ExceptionHandler(value = UnauthorizedException.class)
	@ResponseBody // 在返回自定义相应类的情况下必须有，这是@ControllerAdvice注解的规定
	public String roleException(UnauthorizedException e) {
		log.error("请求方式错误！", e);
		return "角色权限不够！！！";
		// return "/abc";
	}
 
	// 其它异常异常捕捉
	@ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
	@ResponseBody // 在返回自定义相应类的情况下必须有，这是@ControllerAdvice注解的规定
	public String httpRequestException(Exception e) {
		log.error("请求方式错误！", e);
		return "请求方式错误！！！";
	}
 
}
