package utils;

import java.awt.Image;
import java.awt.image.ImageObserver;

public class ImageUtil
{
	public static Image resize(Image img, int width, int height, ImageObserver o)
	{
		return img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
	}
	
	public static Image resize(Image img, int width, int height)
	{
		return resize(img, width, height, null);
	}
}
