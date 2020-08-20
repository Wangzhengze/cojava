package 代码的副本.chap06;

public class MethodTest {
    public static void main(String[] args) {
        /*
        String str = "123";
        int a = Integer.parseInt(str);
        String string = a+"";
        Integer in = Integer.valueOf(a);
        int ii = in.intValue();
        String s = in.toString();
        Integer in2 = Integer.valueOf(s);
        System.out.println("a:"+a);
        System.out.println("string:"+string);
        System.out.println("integer:"+in);
        System.out.println("ii:"+ii);
        System.out.println("s:"+s);
        System.out.println("in2:"+in2);
        int[] iarray = {10,20,3015,24,13};
        //常规遍历
        for(int i=0;i<iarray.length;i++) {
            System.out.print(iarray[i]+" ");
        }
        System.out.println();
        //增强的for循环遍历
        for(int each:iarray) {
            System.out.print(each+"  ");
        }
        System.out.println();
        */
        //int[] iarray = new int[]{10,20,30,40};
        MethodTest test = new MethodTest();
//        int result = test.sum(iarray);
        int result = test.sum2("tom",10,20,30);
        System.out.println("result:"+result);
        Color c = Color.green;//获取对象
        System.out.println("color:"+c);//输出枚举对象
        for(Color value: Color.values()) {
            System.out.println(value);
        }
        switch (c) {
            case yellow:
                System.out.println("黄色");
                break;
            case red:
                System.out.println("红色");
                break;
            case green:
                System.out.println("绿色");
                break;
            default:
                System.out.println("其他颜色");
                break;
        }
        System.out.println("所有汽车的价格:");
        for(Car car: Car.values()) {
            System.out.println(car+"需要:"+car.getPrice()+"元");
        }
    }
    public int sum(int a,int b) {
        return a+b;
    }
    public int sum(int a,int b,int c) {
        return a+b+c;
    }
    public int sum(int[] iarray) {
        int sum = 0;
        for(int i=0;i<iarray.length;i++) {
            sum+=iarray[i];
        }
        return sum;
    }
    public int sum2(String str,int... param) {
        int sum = 0;
        for(int i=0;i<param.length;i++) {
            sum+=param[i];
        }
        return sum;
    }
}

enum Color {
    //创建一个枚举类
    yellow,green,red;
}

enum Car {
    lamborghini(900),audi(50),honda(30);
    private  int price;
    Car(int price) {
        this.price = price;
    }
    int getPrice() {
        return price;
    }
}