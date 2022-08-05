class PhotoFrameDisplay
{
	public static void main (String [] args)
	{
		PhotoFrameColor [] color = {PhotoFrameColor.BLACK,PhotoFrameColor.GOLDEN,PhotoFrameColor.BROWN};
		PhotoFrame frame = new PhotoFrame(PhotoFrameMaterial.GLASS,color);
		frame.setSize("A4","Rectangle");
		frame.setInfo(450,6);
		
		frame.printData();
		
	}
}