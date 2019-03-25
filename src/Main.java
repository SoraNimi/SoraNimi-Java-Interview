public class Main {
  /*  public static void main(String[] args) {
        IUserDao proxy=new UserDaoProxy();
        proxy.save();
    }*/

    public static void main(String[] args) {
        IUserDao target=new UserDao();
        System.out.println("目标对象"+target.getClass());
        IUserDao proxy=(IUserDao)new ProxyFactory(target).getProxyInstance();
        System.out.println("代理对象："+proxy.getClass());
        proxy.save();
    }

}
