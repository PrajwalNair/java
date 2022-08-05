class PhotoFrame
{
	 String size ;
	 int price ;
	 String shape ;
	 int warranty ;
	 PhotoFrameMaterial material ;
	 PhotoFrameColor[] color ;
	 
	 
	 void setSize(String size,String shape)
	 {
		 this.size = size ;
		 this.shape = shape ;
	 }
	 
	 void setInfo(int price,int warranty)
	 {
		 this.price = price ;
		 this.warranty = warranty ;
	 }
	 
	 
	 PhotoFrame(PhotoFrameMaterial material, PhotoFrameColor[] color)
	 {
		 this.material = material ;
		 this.color = color ;
	 }
	 
	 void printData()
	 {
		 System.out.println(this.size);
		 System.out.println(this.price);
		 System.out.println(this.shape);
		 System.out.println(this.warranty);
		 System.out.println(this.material);
		 for(int a=0; a<this.color.length; a++)
		 {
			System.out.println(this.color[a]);
		 }
	 }
	 
	 
	
}