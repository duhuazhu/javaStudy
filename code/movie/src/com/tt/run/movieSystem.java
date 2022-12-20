package com.tt.run;

import com.tt.bean.Customer;
import com.tt.bean.Business;
import com.tt.bean.Movie;
import com.tt.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class movieSystem {
    /**
     * 定义系统容器存储数据
     * 1.存储很多用户 （客户对象，商家对象）
     */
    private static final List<User> All_USERS  = new ArrayList<>();

    /**
     * 2.存储系统全部商家排片信息
     *   商家1  =  【p1,p2,p3】
     *   .. 数组
     * @param args
     */
    public  static Map<Business, List<Movie>> ALL_MOVIES = new HashMap<>();

    public static final Scanner SYS_SC = new Scanner(System.in);


    //定义静态的用户对象 记住当前登陆成功的对象
    public static User loginUser;
    public static SimpleDateFormat sdf  = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");


    public static final Logger LOGGER =  LoggerFactory.getLogger("movieSystem.class");
    /**
     * 3.准备一些测试数据
     * @param args
     */
    static {
        Customer c = new Customer();
        c.setLoginName("duhuazhu999");
        c.setPassword("123456");
        c.setUserName("黑马刘德华");
        c.setSex('男');
        c.setMoney(10000.0);
        c.setPhone("110110");
        All_USERS.add(c);

        Business b = new Business();
        b.setLoginName("123");
        b.setPassword("123");
        b.setUserName("黑马包猪婆");
        b.setSex('女');
        b.setPhone("110110");
        b.setAddress("火星888号");
        b.setShopName("巧克力国际影城");
        All_USERS.add(b);

        //商家的信息添加到商铺里去
        List<Movie> movies3 = new ArrayList<>();
        ALL_MOVIES.put(b,movies3);

    }


    public static void main(String[] args){
        showMain();
    }

    /**
     * 首页展示
     */
    private static void showMain(){
        while (true) {
        System.out.println("===============黑马电影首页=================");
        System.out.println("1.登陆");
        System.out.println("2.用户注册");
        System.out.println("3.商家注册");
        System.out.println("请输入操作命令:");
        String command =  SYS_SC.nextLine();
            switch(command){
                case "1":
                    // 登陆
                    login();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("命令有误，请确认！！");
            }
        }
    }

    /**
     * 登陆功能
     */
    private static void login() {
        while (true) {
            System.out.println("请输入登陆的名称");
            String loginName =  SYS_SC.nextLine();
            System.out.println("请输入登陆的密码");
            String passWord =  SYS_SC.nextLine();

            //1.根据登陆名查询用户对象
            User u =getUserByLoginName(loginName);
            //判断这个用户对象是否存在 说明登陆名称正确
            if (u != null) {
                //比对密码
                if (u.getPassword().equals(passWord)) {
                    //登陆成功
                    loginUser =u;
                    LOGGER.info(u.getUserName() + "登陆了系统");
                    // 判断用户登陆 还是商家登陆的
                    if(u instanceof Customer){
                        // 当前登陆客户
                        showCustomerMain();
                    }else if(u instanceof Business){
                        // 当前登陆商家
                        showBusinessMain();
                    }
                    return;
                }else{
                    System.out.println("密码不对");
                }
            }else{
                System.out.println("登陆名称错误，请确认");
            }
        }
    }

    //客户操作界面
    private static void showCustomerMain() {
            System.out.println("===============黑马电影首页=================");
        System.out.println(loginUser.getLoginName() + (loginUser.getSex()=='男'?"先生":"女士"+"欢迎您进去系统"));
        System.out.println("请您选择要操作的功能");
            System.out.println("1.展示全部影片信息功能");
            System.out.println("2.根据电影名称查询电影信息");
            System.out.println("3.评分系统");
            System.out.println("4.购票功能");
            System.out.println("5.退出系统：");
            while (true) {
                System.out.println("请输入您要的操作命令：");
                String command =  SYS_SC.nextLine();
                switch(command){
                case "1":
                    // 展示全部排片信息
                    queryAllMovies();
                    break;
                case "2":
                    queryByName();
                    break;
                case "3":
                    scoreMovies();
                    break;
                default:
                    System.out.println("命令有误，请确认！！");
            }
        }
    }

    private static void scoreMovies() {
    }

    private static void queryByName() {
        
    }

    private static void queryAllMovies() {
        
    }

    //商家后台界面
    private static void showBusinessMain() {
        System.out.println(loginUser.getLoginName() + (loginUser.getSex()=='男'?"先生":"女士"+"欢迎您进去系统"));
        System.out.println("=====黑马电影商家界面======");
        System.out.println("1.展示详情:");
        System.out.println("2.上架电影:");
        System.out.println("3.下架电影:");
        System.out.println("4.修改电影:");
        System.out.println("5.退出:");
        System.out.println("请输入您要的操作命令");
        String command =  SYS_SC.nextLine();
        switch(command){
            case "1":
                // 展示全部排片
                showBusinessInfos();
                break;
            case "2":
                //上架电影信息
                addMovie();
                break;
            case "3":
                //下架电影信息
                deleteMovie();
                break;
            case "4":
                //修改电影信息
                updateMovie();
                break;
                case "5":
                    return;
            default:
                System.out.println("命令有误，请确认！！");
                break;
        }
    }

    private static void updateMovie() {
        System.out.println("==========修改电影==============");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        if (movies.size() == 0) {
            System.out.println("当前无片可以修改～");
            return;
        }
        while (true) {
            //2.让用户选择需要下架的电影名称
            System.out.println("让用户选择需要修改的电影名称");
            String movieName = SYS_SC.nextLine();
            //3.去查询有没有这个影片对象
            Movie movie = getMoiveByName(movieName);
            if (movie != null) {
                System.out.println("请输入修改后片名：");
                String name = SYS_SC.nextLine();
                System.out.println("请输入修改后主演");
                String actor = SYS_SC.nextLine();
                System.out.println("请输入修改后时长");
                String time = SYS_SC.nextLine();
                System.out.println("请输入修改后票价");
                String price = SYS_SC.nextLine();
                System.out.println("请输入修改后票数");
                String totalNumber = SYS_SC.nextLine();
//                System.out.println("您当前店铺的已经成功修改"+movie.getName());
                while (true) {
                    try {
                        System.out.println("请输入修改后的放映时间");
                        String stime = SYS_SC.nextLine();
                        movie.setName(name);
                        movie.setActor(actor);
                        movie.setPrice(Double.valueOf(price));
                        movie.setTime(Double.valueOf(time));
                        movie.setNumber(Integer.valueOf(totalNumber));
                        movie.setStartTime(sdf.parse(stime));
                        System.out.println("恭喜你，您已经成功修改该影片！！！");
                        showBusinessInfos();
                        return;//退出
                    }catch (Exception e){
                        e.printStackTrace();
                        LOGGER.info("时间解析出了问题");
                    }
                }

            }else{
                System.out.println("您的店铺没有上架商家该影片");
                System.out.println("请问继续修改吗？y/n");
                String command = SYS_SC.nextLine();
                switch (command) {
                    case "y":
                        break;
                    case "n":
                        System.out.println("好的");
                    default:
                }
            }
        }

    }

    private static void deleteMovie() {
        System.out.println("==========下架电影==============");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        if (movies.size() == 0) {
            System.out.println("当前无片可以下架～");
            return;
        }
        while (true) {
            //2.让用户选择需要下架的电影名称
            System.out.println("让用户选择需要下架的电影名称");
            String movieName = SYS_SC.nextLine();
            //3.去查询有没有这个影片对象
            Movie movie = getMoiveByName(movieName);
            if (movie != null) {
                movies.remove(movie);
                System.out.println("您当前店铺的已经成功下架"+movie.getName());
                showBusinessInfos();
            }else{
                System.out.println("您的店铺没有商家该影片");
                System.out.println("请问继续下架嘛");
                String command = SYS_SC.nextLine();
                switch (command) {
                    case "y":
                        break;
                    case "n":
                        System.out.println("好的");
                    default:
                }
            }
        }
    }
    public  static  Movie getMoiveByName(String movieName) {
            Business business = (Business) loginUser;
            List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if(movie.getName().contains(movieName)) {
                return movie;
            }
        }
        return null;
    }
    /**
     * 商家进行电影上架
     */
    private static void addMovie(){
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        System.out.println("请输入新片名");
        String name = SYS_SC.nextLine();
        System.out.println("请输入主演");
        String actor = SYS_SC.nextLine();
        System.out.println("请输入时长");
        String time = SYS_SC.nextLine();
        System.out.println("请输入票价");
        String price = SYS_SC.nextLine();
        System.out.println("请输入票数");
        String totalNumber = SYS_SC.nextLine();

        while (true) {
            try {
                System.out.println("请输入放映时间");
                String stime = SYS_SC.nextLine();

                Movie movie = new Movie(name,actor,Double.valueOf(time),Double.valueOf(price),Integer.valueOf(totalNumber), sdf.parse(stime));
                movies.add(movie);
                System.out.println(movies);
                System.out.println("您已经成功添加,"+movie.getName()+"");
                return;//退出
            }catch (ParseException e){
                e.printStackTrace();
               LOGGER.info("时间解析出了问题");
            }
        }
    }

    //展示当然登陆的商家
    private static void showBusinessInfos() {
        System.out.println("=====商家详情======");
        LOGGER.info(loginUser.getUserName() + "商家，正查看自己的详情");
        Business business = (Business) loginUser;
        System.out.println(business.getShopName()+"\t\t"+business.getPhone() +"\t\t地址"+business.getAddress());
        List<Movie> movies=ALL_MOVIES.get(business);
        if (movies.size() > 0) {
            System.out.println("片名\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println(movie.getName() +"\t\t"+ movie.getActor() +"\t\t"+ movie.getTime()+"\t\t"+movie.getScore() +"\t\t"+ movie.getPrice()+"\t\t"+movie.getNumber() +"\t\t"+ movie.getStartTime());
            }
        }else {
            System.out.println("您的店铺当前无片可播");
        }
    }

    public static User getUserByLoginName(String loginName) {
        for (User user : All_USERS) {
            if(user.getLoginName().equals(loginName)){
                return user;
            }
        }
        return null; //代表查无此用户
    }
}
