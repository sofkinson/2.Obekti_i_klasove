package vtoroPaketche;

public class TVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV tv1 = new TV();
		System.out.println("Channel " + tv1.channel + " volume " + tv1.volume + " on: " + tv1.on);
		tv1.switchOn();
		tv1.channelUp();
		tv1.volumeDown();
		System.out.println("Channel " + tv1.channel + " volume " + tv1.volume + " on: " + tv1.on);
		
	}

}
