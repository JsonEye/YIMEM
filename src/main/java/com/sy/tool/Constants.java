package com.sy.tool;

public class Constants {
    public static final String SIMPLE_QUEUE_NAME = "simple_queue";
    public static final String REPLAY_INFORMATION = "ReplayInformation";
    public static final String FANS_INFORMATION = "FansInformation";
    public static final String LIKE_INFORMATION = "LikeInformation";
    public static final String IMAGE_SERVER_URL = "http://www.yimem.com/";
    public static final Integer Max_SIZE = 1000000;
    public static final String LOGIN_SUCCESS = "success";

    public static final String LOGIN_FAILED = "failed";

    public static final String SESSION_USER = "userSession";

    public static final String MENUS = "MENUS";

    public static final String FUNURLS = "FUNURLS";

    public static final String TO_USER_NAME="gh_7564ec5aa11b";
    public static final String APPID = "wxcbe24adb36f7b45a";
    public static final String APPSECRET = "2304599f8013f2836071eac5ef21bdc9";

    public static final String TO_USER_NAME_2="gh_55db4b3b1b3f";
    public static final String APPID_2 = "wxf577f7f0011c36a3";
    public static final String APPSECRET_2= "6377b80773c62a761835e918a45d62c3";

    /**
     * 公钥
     */
//    public static final String PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAr9ndJGB4R76BRpGVMjzVT7OL25KqUHLG/TGIYBDEI6cigxpKTNfu6rhrEpqy+bJFR7aXAP50X70PiXBNaOck7Ib6q3+IH83VTzqY2ceMlD2GU7AdrKej0iUSuVk0hiVsZqSlBj8zOzYIezZi3DKXFZNSCXstvavaWgzvZebE0wWaTnzHxoUE5dBoUnOClY1FzbI/uKXT19RxPUOZgQd91lwlQ7u8X6ilHawLpArU8DHQABrE08P2vdo7DP0VO/7iGuvOBjZb0zIL9fDiysoGK4H13PaD1qZhzA+qedRmT8VnAgW7VqTDM2L7SaT98VdUeUGr/efKdGDdy7fMIq22kwIDAQAB";
    public static final String PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2OqZOfNpqieridefZ8hPeV752E6UPb7/6vsgTb0euDIiT1ZuuSxlJAX7978KgSpooZFex13CWD+P96+005j4LAT10MB8alumMAvwMgiiT+ZwHjX03+asKUBaeaqMwUT6eWOACA/OC43rKNZHBSFYFc5yka+gIyZToelRxviWEyXMY4QQfZAVDMrh+gZAuatvcV4shEnsvTm/ZmlxIqqjjfY88LsQRyq0NS/whEg6703zlAXEroIM1KWWFi6rB5PGagus7pBJ14gR3FKCp8w7JJO0pv/DLNg7073b8Lg62KWSlCAlcVt6ICsLWlesmoHR1GzqWEpa2+O/bO0DK3B4+wIDAQAB";

    /**
     * 私钥
     */
    public static final String PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCKQcDfcFRWDvliXXtM1G0/2JPpHysS/jzzs2X/hS8FEczpaBNnLDPl1hzKUjR30PICVAKz+WCwskTwdbZF9bNMjXdFCXUdxHNOC50DsvhVXL34YjnCXVYk+B2otBvQNFF/YxsCADHIYWEB34K+/BnOe6Z+QPAWk57qeYPcXtkVff/cQsIa/g4bvUsWeFL7bLcAAr7NMjoqpLqBTPa3pUp+z893neeWdP66dmF4Y+B0Qg9gDy8dSXXeWtHf84ne7HI+yracwmUElC0EnANtMgeY2TkAsDrpAbE8k0FLOT24Hy0nYVKIh784ugeTCmabSvEZsXLlfi/M8CNYkq+nwLW9AgMBAAECggEAW39gkX7ZkYqfaIXNT+9VzecbHDDQZOV0mSOk4RHXKFe7cMy76o/KWNT2gL8ekhzpzLikgU8MumOAVFLSqkIMwyDsSfgUVfrpBEGTTBtpVbTm1DbNWuBCXn0Fw9xOe9/j/5YrDYvrZl1rwb2V3achvREAApYfThGsHikFJxZuPFYDeLjiRw+EYqgtoDKc8z1UuYAOihRANhqv7cmlOL1sfQPPs6NOqZlydX3w1JUnsqTFtKqwx+wuvCJbzDojF4vgDoynzWfxcwCheQOR/et2TVWJCFqcRpR5xGnC8iwfTGxuOhbYpVqpK/fCaN0KKHAlD99Jc+Wfz2b6Ft93DK1lUQKBgQDrPR7c3pAnHdm/B2cFMEZpUt265KXL0DuAjoDap69qsmEISVJy9BPa6eF6agiLuZHUN0e0+6sZhfGJKoXAoVxdXnen2KrIin0J+8GxcfRMBiDr2oCuUVxClp6MvCMbs+8ni+HvdCBFPuudyw8hN1kzJ0Qk/sHRkykz/LfjtHUEDwKBgQCWdXeM76PUhCFbCvtRBGPCev4zX/k8Ev+JjrrnbBfvjjIe2M9TaPvOhOkCngif4U+kSOjgUoIzyDJeRdB6ihaEfRayiMlB5IjEfds5KKhaUe+U0StXy0a1QnemBAfjNhmfz6UlexY+gtTeRIywYX+4zMqB8SEo3JjE69dQkLLtcwKBgBLKYBO+h39IaCNVQQpuD8HMB8AtEX1VVdtwBqTwrhd0xkF2MerSyl87PXKc06/tk9OC0uyHCeTRCTkut15qxUkECcTTjtjUDybkAFXfR2dnOev9GThTcW40P9f4E0ncNqdPCi4pdYZyfzmshbnehPaMFWprGypVef4YGsxKlupLAoGAL0ngN0WiYkrdCPZcoswUZq2tc4w4k28NLbjUeaP5qesxSYyvLPIUIoaXjaEJ6OYx19qqhsan8Yp8ejDLI5h/F0kRdy+SwckIS2mbG03yC+Ewwb80NjXHlXS8kks2B22bhCUJLMyQ4zjPmsREy7L5J6YGB+03lNYwlcPiOoogEo0CgYBi6RDXIBrrnpqGliIE8oDWiZq76xxePU2luiRu3T2B0/e6GrrH56t1HpNXEkvJM7IyMHIpC3sS4Z4a4gUrAzjlZM6Qtpu7T8yXrspbfkG4fymfMks3suIcnfa4HlmrlWe95nP1P7X5q62yuUK2cChL0AgL1xjswh24ZX9goAwo4g==";
    /**
     * 字符集
     */
    public static final String CHAR_SET = "UTF-8";
    /**
     * 签名类型  RSA 或 RSA2
     */
    public static final String SIGN_TYPE = "RSA2";

    public static final String REDIRECT_URI = "http%3A%2F%2Fwww.yimem.com%2Fwechat%2Flogin";

    public static final String ACCESS_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";

    public static final String UPLOAD_URL = "https://api.weixin.qq.com/cgi-bin/media/upload?access_token=ACCESS_TOKEN&type=TYPE";

    public static final String CREATE_MENU_URL = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";

    public static final String QUERY_MENU_URL = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token=ACCESS_TOKEN";

    public static final String DELETE_MENU_URL = "https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN";

    public static final String TICKET_URL="https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token=ACCESS_TOKEN";

    public static final String TEMPLATE="https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";

    public static final String TEMPLATE_ID="WiLx_78eh1yP9TQeBwCxh2mfZt8CXhN3xvHXCwODX4c";

    public static final String TEMPLATE_ID2="PALmmHSVxSQle5WQmZ2pnX4EgRHsmGlHMJp9g4MVtnU";

    public static final String TEMPLATE_ID3="g29LkxPM2mzhKDk5JTg5UGsUPMpsRepujcRVCpWkK-s";

    public static final String TEMPLATE_ID4="WI1Hawtg_Dk-YbceHsoCx8v-8SNMRor-2zESVDEeCRo";

    public static final String[] type={"动作","喜剧","爱情","科幻","灾难","恐怖","悬疑","奇幻","战争","悬疑","犯罪"," 惊悚","动画","伦理",
            "剧情","冒险","历史","家庭","歌舞","传记","音乐"," 西部","运动","古装","家庭","情色","同性","武侠","短片","黑色电影","儿童",
    "舞台艺术","纪录片","鬼怪"};
    public static final String[]  language={"国语","粤语","英语","韩语","日语","法语","其他"};
    public static final String[] region={"大陆","香港","台湾","美国","法国","英国","日本","韩国","德国","泰国","印度","意大利","西班牙","加拿大","其他"};


}
