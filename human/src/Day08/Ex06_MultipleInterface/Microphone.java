package Day08.Ex06_MultipleInterface;

public interface Microphone {

	int inputVolumeMex = 50;  	//음성 인식 최대 볼륨
	int inputVolumeMin = 5; 	//음성 인식 최소 볼륨
	
	//음성인식
	String receiveVoice(String voice);
	
	
	
}
