//package JVM;
//import java.beans.Encoder;
//import java.lang.reflect.Method;
////import net.sf.cglib.proxy.Enhancer;
////import net.sf.cglib.proxy.MethodInterceptor;
////import net.sf.cglib.proxy.MethodProxy;
///**
// * @Described：方法区溢出测试
// * 使用技术 CBlib
// * @VM args : -XX:PermSize=10M -XX:MaxPermSize=10M
// * @author duanchuanchao1
//
// */
//public class MethodAreaOutOfMemory {
//
//	 /**
//     * @param args
//     * @Author duanchuanchao1
//     */
//
//    public static void main(String[] args) {
//       while(true){
//           Enhancer enhancer = new Encoder();
//           enhancer.setSuperclass(TestCase.class);
//           enhancer.setUseCache(false);
//           enhancer.setCallback(new MethodInterceptor() {
//              @Override
//              public Object intercept(Object arg0, Method arg1, Object[] arg2,
//                     MethodProxy arg3) throws Throwable {
//                  return arg3.invokeSuper(arg0, arg2);
//              }
//           });
//           enhancer.create();
//       }
//    }
//}
//
///**
// * @Described：测试用例
// */
//class TestCase{
//	
//}
