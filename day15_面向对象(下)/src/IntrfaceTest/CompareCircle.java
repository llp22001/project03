package IntrfaceTest;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/11-23:21
 * @Description:
 **/
public class CompareCircle extends Circle implements CompareObject{
    public CompareCircle(Double radius) {
        super(radius);
    }



    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }
        if(o instanceof CompareCircle){
            CompareCircle c = (CompareCircle) o;
            //方式一
            //if(this.getRedius() > c.getRedius()){
            //    return 1;
            //}else if (this.getRedius() < c.getRedius()){
            //    return -1;
            //}else {
            //    return 0;
            //}

            //方式二 Double 方式
            return this.getRedius().compareTo(c.getRedius());
        }else {
            //return 0;
            throw new RuntimeException("传入的数据类型不匹配");
        }

    }
}
