package IntrfaceTest;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/11-21:18
 * @Description:
 * 接口模式，代理模式
 * //英语
 * browse vt. 浏览；吃草
 * Proxy n. 代理人；委托书；代用品
 **/
public class NetWorkTest {
    public static void main(String[] args) {
        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.Browse();
    }
}

interface NetWork{
    public void Browse();

}
//被代理类
class Server implements NetWork{
    @Override
    public void Browse() {
        System.out.println("真实的服务器访问网络");
    }
}
//代理类
class ProxyServer implements NetWork{
    private NetWork work;

    public ProxyServer(NetWork work) {
        this.work = work;
    }

    public  void check(){
        System.out.println("联网前校验检查");
    }
    @Override
    public void Browse() {
        check();
        work.Browse();
    }
}