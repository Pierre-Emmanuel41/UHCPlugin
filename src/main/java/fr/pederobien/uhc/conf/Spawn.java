package fr.pederobien.uhc.conf;

import java.util.HashMap;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.block.Block;

import fr.pederobien.uhc.managers.WorldManager;

public class Spawn {
	private Block center;
	private static HashMap<Coordinate, Block> config;
	private int width, height, depth;
	private String name;
	
	public Spawn() {
		this(WorldManager.getHighestBlockYAt(0, 0), "Spawn");
	}
	
	public Spawn(Block center, String name) {
		this.center = center;
		this.name = name;
	}
	
	public void extract() {
		config.clear();
		int maxWidth = width/2, maxDepth = depth/2;
		if (width%2 == 1)
			maxWidth += 1;
		if (depth%2 == 1)
			maxDepth += 1;
		
		for (int x = -width/2; x < maxWidth; x++)
			for (int y = 0; y < height; y++)
				for (int z = -depth/2; z < maxDepth; z++)
					config.put(new Coordinate(x, y, z), getBlockFromCenter(x, y, z));
	}
	
	public void addBlocks(List<String> blocks) {
		config.clear();
		for (String block : blocks)
			addBlock(block);
	}
	
	private void addBlock(String block) {
		String[] info = block.split(";");
		int x = Integer.parseInt(info[0]);
		int y = Integer.parseInt(info[1]);
		int z = Integer.parseInt(info[2]);
		Material material = Material.valueOf(info[3]);
		getBlockFromCenter(x, y, z).setType(material);
		config.put(new Coordinate(x, y, z), getBlockFromCenter(x, y, z));
	}
	
	@Override
	public String toString() {
		String toString = "";
		for (Coordinate coord : config.keySet())
			toString += coord.getX() + ";" + coord.getY() + ";" + coord.getZ() + ";" + config.get(coord).getType() + "\r\n";
		return toString;
	}
	
	public Block getCenter() {
		return center;
	}

	public void setCenter(Block center) {
		this.center = center;
	}
	
	public void setCenter(String x, String y, String z) {
		center = WorldManager.getBlockAt(Integer.parseInt(x), Integer.parseInt(y), Integer.parseInt(z));
	}
	
	public void setDimension(String width, String height, String depth) {
		setWidth(Integer.parseInt(width));
		setHeight(Integer.parseInt(height));
		setDepth(Integer.parseInt(depth));
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	public int getDepth() {
		return depth;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	private Block getBlockFromCenter(int x, int y, int z) {
		return WorldManager.getBlockAt(center.getX() + x, center.getY() + y, center.getZ() + z);
	}
	
	private class Coordinate {
		private int x, y, z;
		
		public Coordinate(int x, int y, int z) {
			this.setX(x);
			this.setY(y);
			this.setZ(z);
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getZ() {
			return z;
		}

		public void setZ(int z) {
			this.z = z;
		}
	}
}
