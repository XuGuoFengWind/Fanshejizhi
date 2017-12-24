interface Person{
	public void eat();
}
class Apple implements Person{
	@Override
	public void eat() {
		System.out.println("��ƻ��");
	}
}
class Banana implements Person{
	@Override
	public void eat(){
		System.out.println("���㽶");
	}
}
  //������
class Factory{
	public static Person getInstance(String className) {
		switch(className) {
		case"ƻ��":
			return new Apple();
		case"�㽶":
			return new Banana();
		default:
			return null;	
		}
	}
}
public class TestFruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=Factory.getInstance("ƻ��");
		p.eat();
	}

}
