interface Person{
	public void eat();
}
class Apple implements Person{
	@Override
	public void eat() {
		System.out.println("吃苹果");
	}
}
class Banana implements Person{
	@Override
	public void eat(){
		System.out.println("吃香蕉");
	}
}
  //工厂类
class Factory{
	public static Person getInstance(String className) {
		switch(className) {
		case"苹果":
			return new Apple();
		case"苹果":
			return new Banana();
		default:
			return null;	
		}
	}
}
public class TestFruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=Factory.getInstance("苹果");
		p.eat();
	}

}
