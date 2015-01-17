package utils;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import java.awt.image.SampleModel;
import java.awt.image.TileObserver;
import java.awt.image.WritableRaster;
import java.io.File;
import java.net.URL;
import java.util.Vector;

import javax.imageio.ImageIO;

public class ImageProxy extends BufferedImage
{
	private BufferedImage img = null;
	private static final String PATH = "resources/";

	public ImageProxy(String name)
	{
		super(1, 1, TYPE_4BYTE_ABGR);
		try
		{
			ClassLoader clsLd = getClass().getClassLoader();
			String imgPath = new File(PATH, name).getPath();
			URL imgUrl = clsLd.getResource(imgPath);
			img = ImageIO.read(imgUrl);
		} catch (Exception ex)
		{
			img = new BufferedImage(215, 30, TYPE_4BYTE_ABGR);
			try(AutoCloseableGraphics g = new AutoCloseableGraphics(img.createGraphics()))
			{
				g.setColor(Color.PINK);
				g.drawString("Echec du chargement de l'image", 2, 20);
			}
		}
	}
	
	@Override
	public int getType()
	{
		return img.getType();
	}

	@Override
	public ColorModel getColorModel()
	{
		return img.getColorModel();
	}

	@Override
	public WritableRaster getRaster()
	{
		return img.getRaster();
	}

	@Override
	public WritableRaster getAlphaRaster()
	{
		return img.getAlphaRaster();
	}

	@Override
	public int getRGB(int x, int y)
	{
		return img.getRGB(x, y);
	}

	@Override
	public int[] getRGB(int startX, int startY, int w, int h, int[] rgbArray,
			int offset, int scansize)
	{
		return img.getRGB(startX, startY, w, h, rgbArray, offset, scansize);
	}

	@Override
	public synchronized void setRGB(int x, int y, int rgb)
	{
		img.setRGB(x, y, rgb);
	}

	@Override
	public void setRGB(int startX, int startY, int w, int h, int[] rgbArray,
			int offset, int scansize)
	{
		img.setRGB(startX, startY, w, h, rgbArray, offset, scansize);
	}

	@Override
	public int getWidth()
	{
		return img.getWidth();
	}

	@Override
	public int getHeight()
	{
		return img.getHeight();
	}

	@Override
	public int getWidth(ImageObserver observer)
	{
		return img.getWidth(observer);
	}

	@Override
	public int getHeight(ImageObserver observer)
	{
		return img.getHeight(observer);
	}

	@Override
	public ImageProducer getSource()
	{
		return img.getSource();
	}

	@Override
	public Object getProperty(String name, ImageObserver observer)
	{
		return img.getProperty(name, observer);
	}

	@Override
	public Object getProperty(String name)
	{
		return img.getProperty(name);
	}

	@Override
	public Graphics getGraphics()
	{
		return img.getGraphics();
	}

	@Override
	public Graphics2D createGraphics()
	{
		return img.createGraphics();
	}

	@Override
	public BufferedImage getSubimage(int x, int y, int w, int h)
	{
		return img.getSubimage(x, y, w, h);
	}

	@Override
	public boolean isAlphaPremultiplied()
	{
		return img.isAlphaPremultiplied();
	}

	@Override
	public void coerceData(boolean isAlphaPremultiplied)
	{
		img.coerceData(isAlphaPremultiplied);
	}

	@Override
	public Vector<RenderedImage> getSources()
	{
		return img.getSources();
	}

	@Override
	public String[] getPropertyNames()
	{
		return img.getPropertyNames();
	}

	@Override
	public int getMinX()
	{
		return img.getMinX();
	}

	@Override
	public int getMinY()
	{
		return img.getMinY();
	}

	@Override
	public SampleModel getSampleModel()
	{
		return img.getSampleModel();
	}

	@Override
	public int getNumXTiles()
	{
		return img.getNumXTiles();
	}

	@Override
	public int getNumYTiles()
	{
		return img.getNumYTiles();
	}

	@Override
	public int getMinTileX()
	{
		return img.getMinTileX();
	}

	@Override
	public int getMinTileY()
	{
		return img.getMinTileY();
	}

	@Override
	public int getTileWidth()
	{
		return img.getTileWidth();
	}

	@Override
	public int getTileHeight()
	{
		return img.getTileHeight();
	}

	@Override
	public int getTileGridXOffset()
	{
		return img.getTileGridXOffset();
	}

	@Override
	public int getTileGridYOffset()
	{
		return img.getTileGridYOffset();
	}

	@Override
	public Raster getTile(int tileX, int tileY)
	{
		return img.getTile(tileX, tileY);
	}

	@Override
	public Raster getData()
	{
		return img.getData();
	}

	@Override
	public Raster getData(Rectangle rect)
	{
		return img.getData(rect);
	}

	@Override
	public WritableRaster copyData(WritableRaster outRaster)
	{
		return img.copyData(outRaster);
	}

	@Override
	public void setData(Raster r)
	{
		img.setData(r);
	}

	@Override
	public void addTileObserver(TileObserver to)
	{
		img.addTileObserver(to);
	}

	@Override
	public void removeTileObserver(TileObserver to)
	{
		img.removeTileObserver(to);
	}

	@Override
	public boolean isTileWritable(int tileX, int tileY)
	{
		return img.isTileWritable(tileX, tileY);
	}

	@Override
	public Point[] getWritableTileIndices()
	{
		return img.getWritableTileIndices();
	}

	@Override
	public boolean hasTileWriters()
	{
		return img.hasTileWriters();
	}

	@Override
	public WritableRaster getWritableTile(int tileX, int tileY)
	{
		return img.getWritableTile(tileX, tileY);
	}

	@Override
	public void releaseWritableTile(int tileX, int tileY)
	{
		img.releaseWritableTile(tileX, tileY);
	}

	@Override
	public int getTransparency()
	{
		return img.getTransparency();
	}

}
