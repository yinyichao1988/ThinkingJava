package chapter21.test7;

public class PairManager2 extends PairManager{
	@Override
	public void increment() {
		Pair temp;
		synchronized(this){
			p.incrementX();
			p.incrementY();
			temp = getPair();
		}
		store(temp);
	}
}
