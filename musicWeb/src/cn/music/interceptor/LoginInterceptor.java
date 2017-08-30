package cn.music.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.music.po.User;
/**
 * 用户登录拦截器
 * @author lhj
 */
public class LoginInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		//放行 登录请求    和主页请求
		String requestURI = request.getRequestURI();
		/*if(!(requestURI.contains("/to") ||requestURI.contains("/login"))){
			//非登录请求  和主页请求
			//判断用户是否登录
			User user = (User) request.getSession().getAttribute("user");
			if(null == user){
				//未登录  重定向到登录请求
				response.sendRedirect(request.getContextPath() + "/tologin.do");
				return false;
			}
		}*/
		return true;
	}


	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
					throws Exception {
		
	}

}
