package Adapter;

//采用继承方式的插座适配器
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf{

	@Override
	public void powerWithThree() {
		this.powerWithTwo();
	}

}
