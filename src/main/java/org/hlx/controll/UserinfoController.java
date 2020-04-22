package org.hlx.controll;

import com.github.pagehelper.PageInfo;
import org.hlx.pojo.Parames;
import org.hlx.pojo.Userinfo;
import org.hlx.service.UserinfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserinfoController
 * @Description: TODO
 * @Author 44401
 * @Date 2020/4/15
 * @Version V1.0
 **/
@Controller
public class UserinfoController {

    //业务数据
    @Resource
    private UserinfoService userinfoService;

    //list0.jsp
//    @RequestMapping("/list")
//    public String list(ModelMap map){
//
//        //业务方法
//        List<Userinfo> list= userinfoService.all();
//
//        //保存数据
//        map.addAttribute("list",list);
//
//        //转发
//        return "list";  //list.jsp
//    }


    @RequestMapping("/find")
    public String find(ModelMap map,int userId){

        //业务方法
        Userinfo list= userinfoService.findById(userId);

        //保存数据
        map.addAttribute("user",list);

        //转发
        return "find";  //find.jsp
    }


    /**
     * 把参数值传到update.jsp页面
     * @param map
     * @param userId
     * @return
     */
    @RequestMapping("/edit")
    public String edit(ModelMap map,int userId){

        //业务方法
        Userinfo list= userinfoService.findById(userId);

        //保存数据
        map.addAttribute("user",list);

        //转发
        return "update";  //update.jsp
    }



    @RequestMapping("/add")
    public String add(Userinfo userinfo){
        //业务方法
        int count= userinfoService.insert(userinfo);
        //转发
        return "redirect:/list";  //直接跳转到list
    }


    @RequestMapping("/update")
    public String update(Userinfo userinfo){
        //业务方法
        int count= userinfoService.update(userinfo);
        //转发
        return "redirect:/list";  //直接跳转到list
    }


    @RequestMapping("/del")
    public String del(int userId){
        //业务方法
        int count= userinfoService.delete(userId);
        //转发
        return "redirect:/list";  //直接跳转到list
    }


    //list1.jsp
//    @RequestMapping("/list")
//    public String list(ModelMap map,Parames parame){
//
//        //业务方法
//        PageInfo<Userinfo> pageInfo= userinfoService.getPageInfo(parame);
//
//        //保存数据
//        map.addAttribute("pageInfo",pageInfo);
//
//        //转发
//        return "list";  //list.jsp
//    }


    @RequestMapping("/list")
    public String list(ModelMap map,Parames parame,Userinfo userinfo){

        //业务方法
        PageInfo<Userinfo> pageInfo= userinfoService.findName(userinfo,parame);

        //保存数据
        map.addAttribute("pageInfo",pageInfo);

        //用户数据
        map.addAttribute("userinfo",userinfo);

        //转发
        return "list";  //list.jsp
    }


}
