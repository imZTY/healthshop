package com.homework.healthshop.utils;


import com.homework.healthshop.DTO.CommonDTO;

/**
 * @author tianyi
 * @date 2018-04-29 01:57
 */
public class CommonDTOUtil {

    public static CommonDTO success(Object object){
        CommonDTO rt=new CommonDTO();
        rt.setResultCode(200);
        rt.setResultMsg("成功");
        rt.setData(object);
        return rt;
    }



    public static CommonDTO success(){return success("ok");}

    public static CommonDTO error(Integer code, String msg){
        CommonDTO rt=new CommonDTO();
        rt.setResultCode(code);
        rt.setResultMsg(msg);
        rt.setData(null);
        return rt;
    }

    public static CommonDTO error(Integer code, String msg, Object object){
        CommonDTO rt=new CommonDTO();
        rt.setResultCode(code);
        rt.setResultMsg(msg);
        rt.setData(object);
        return rt;
    }
}
