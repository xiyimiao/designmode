/**
 * 装饰模式 ：透明装饰模式，半透明装饰模式
 * 使用对象之间的关联关系取代类之间的继承关系
 * 
 * Sunny软件公司欲开发了一个数据加密模块，可以对字符串进行加密。
 * 最简单的加密算法 通过对字母进行移位来实现，同时还提供了稍复杂的逆向输出加密，还提供了更为高级 的求模加密。用户先使用最简单的加密算法对字符串进行加密，
 * 如果觉得还不够可以对 加密之后的结果使用其他加密算法进行二次加密，当然也可以进行第三次加密。试使用 装饰模式设计该多重加密系统。
 */
/**
 * @author 卢亮
 *
 */
package constructiontype.ll10decoratorpattern;

public class DecoratorPatternTest{
	
	public static void main(String[] args) {
		DataEncryption dataEncryption = new MD5();
		AbstractDecorator abstractDecorator = new MD5Decorator(dataEncryption);
		abstractDecorator = new SHA1Decorator(abstractDecorator);
		abstractDecorator = new BASE64Decorator(abstractDecorator);
		abstractDecorator = new MD5Decorator(abstractDecorator);
		abstractDecorator.encode("WONIMA");
	}
}