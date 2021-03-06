package cn.music.controller.front;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;







import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.music.po.User;
import cn.music.po.UserWithBLOBs;
import cn.music.service.UserService;

/**
 * 用户管理
 * @author lhj
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    
    
    /**
     * 测试
     * @return
     */
    @RequestMapping(value="toTest.do")
    public String Test(){
    	return "/msg.jsp";
    }
    
    /**
     * 跳转到注册页面
     * @return
     */
  	@RequestMapping("/toRegister.do")
  	public String toRegister(){
  		return "/register.jsp";
  	}
  	/**
  	 * 跳转到登录页面
  	 * @return
  	 */
  	@RequestMapping("/toLogin.do")
  	public String toLogin(){
  		return "/login.jsp";
  	}
  	
  	/**
  	 * 跳转到主页面
  	 * @return
  	 */
  	@RequestMapping("/toIndex.do")
  	public String toIndex(){
  		return "/index.html";
  	}
  	
  	/**
  	 * 检验邮箱是否已经注册过
  	 * @return
  	 */
  	@RequestMapping("/emailCheck.do")
  	public String emailCheck(String email){
  		System.out.println(email);
  		//调用Service 方法进行检验
  		UserWithBLOBs hasRegist = userService.findUserByid(email);
  		if(null != hasRegist){
  			System.out.println("用户名已存在=====================");
  			//
  			//有问题。。。。。。。。。。。。。。。。。
  			//
  			//
  			return "fail";
  		}else {
			return "success";
		}
  	}
  	
  	/**
  	 * 邮箱注册
  	 * @param userid
  	 * @param password
  	 */
  	@RequestMapping("/registerByEmail.do")
  	public String registerByEmail(Model model,
  			@RequestParam(value="email") String userid,String password){
  		
  		try {
			//调用service 方法注册
			//返回用户id
			Integer register = userService.register(userid,password);
			
			//邮箱激活。。。。
			//若激活成功
			//改变该注册用户的激活状态

			if(null!=register && register>0){
				//注册成功
				model.addAttribute("msg", "注册成功，正在跳转到登录页面");
			}else {
				model.addAttribute("msg", "注册失败");
			}
		} catch (Exception e) {
			model.addAttribute("msg", "注册失败");
			e.printStackTrace();
		}
  		return "/msg.jsp";
  	}
  	
  	/**
  	 * 手机注册
  	 * @param userid
  	 * @param password
  	 */
  	@RequestMapping("/registerByPhone.do")
  	public String registerByPhone(Model model,
  			@RequestParam(value="phone") String userid,String password){
  		
  		try {
  		//调用service 方法注册
  		//返回用户id
  		userService.register(userid,password);
  		
  		//邮箱激活。。。。
  		//若激活成功
  		//改变该注册用户的激活状态
  		
		
			//
			model.addAttribute("msg", "注册成功，正在跳转到登录页面");
		} catch (Exception e) {
			model.addAttribute("msg", "注册失败");
			e.printStackTrace();
		}
		return "/msg.jsp";
  	}
    
    /**
     * 邮箱登录
     * @param userid
     * @param password
     * @param session
     * @return
     */
    @RequestMapping(value="/loginByEmail.do")
    public String loginByEmail(
    		@RequestParam(value="email") String userid,String password,
    		HttpSession session,HttpServletRequest request){
    	//调用service 方法登录  
    	User user=userService.login(userid,password);
    	if(null != user){
    		//登录成功，将user对象设置到HttpSession作用范围域中
    		session.setAttribute("user", user);
    		
    		
    		return "redirect:/toIndex.do";
    		
    	}else{
            //登录失败，设置失败信息，并调转到登录页面
    		request.setAttribute("msg", "登录失败，请检查用户名或密码");
    		return "/login.jsp";
        }
    }
   
    /**
     * 手机登录
     * @param phone
     * @param password
     * @param session
     * @return
     */
    @RequestMapping(value="/loginByPhone.do")
    public String loginByPhone(
    		@RequestParam(value="phone") String userid,String password,
    		HttpSession session,HttpServletRequest request){
    	//调用service 方法登录  
    	User user=userService.login(userid,password);
    	if(null != user){
    		//登录成功，将user对象设置到HttpSession作用范围域中
    		session.setAttribute("user", user);
    		
    		
    		return "redirect:/toIndex.do";
    		
    	}else{
    		//登录失败，设置失败信息，并调转到登录页面
    		request.setAttribute("msg", "登录失败，请检查用户名或密码");
    		return "/login.jsp";
    	}
    }
    
}
