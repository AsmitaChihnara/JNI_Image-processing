package resizeImage;

public class ResizeImage {
	public native void resizeImage(String imageLocation);
	static{
		System.loadLibrary("ResizeImage");
	}
	public static void main(String[] args){
		String imageLocation="D:\\img.jpg";
		ResizeImage ob=new ResizeImage();
		ob.resizeImage(imageLocation);
	}
}
