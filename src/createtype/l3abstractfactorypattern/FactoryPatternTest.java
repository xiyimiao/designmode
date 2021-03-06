/**
 * 抽象工厂模式，创建一组类，减少工厂类的个数
 * Sunny软件公司欲推出一款新的手机游戏软件，该软件能够支持Symbian、Android和 Windows Mobile等多个智能手机操作系统平台，
 * 针对不同的手机操作系统，该游戏软件提 供了不同的游戏操作控制(OperationController)类和游戏界面控制(InterfaceController)类，
 *  并提供相应的工厂类来封装这些类的初始化过程。 软件要求具有较好的扩展性以支持新 的操作系统平台，为了满足上述需求，试采用抽象工厂模式对其进行设计。
 */
/**
 * @author 卢亮
 *
 */
package createtype.l3abstractfactorypattern;

public class FactoryPatternTest{
	
	public static void main(String[] args) {
		AbstractSoftwareFactory abstractSoftwareFactory = (AbstractSoftwareFactory) XMLUtil.getBean();
		abstractSoftwareFactory.operationController().operation();
		abstractSoftwareFactory.interfaceController().displayInterface();
	}
	
	
}