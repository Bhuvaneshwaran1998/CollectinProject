package arrayList;

public class Market {
	
	private String storeName;
	private int storeNo;
	private int storeRent;
	private String storeLocation;
	private boolean isFoodStore;
	
	
	public Market(String storeName, int storeNo, int storeRent, String storeLocation, boolean isFoodStore) {
		super();
		this.storeName = storeName;
		this.storeNo = storeNo;
		this.storeRent = storeRent;
		this.storeLocation = storeLocation;
		this.isFoodStore = isFoodStore;
	}


	public String getStoreName() {
		return storeName;
	}


	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}


	public int getStoreNo() {
		return storeNo;
	}


	public void setStoreNo(int storeNo) {
		this.storeNo = storeNo;
	}


	public int getStoreRent() {
		return storeRent;
	}


	public void setStoreRent(int storeRent) {
		this.storeRent = storeRent;
	}


	public String getStoreLocation() {
		return storeLocation;
	}


	public void setStoreLocation(String storeLocation) {
		this.storeLocation = storeLocation;
	}


	public boolean getisFoodStore() {
		return isFoodStore;
	}


	public void setFoodStore(boolean isFoodStore) {
		this.isFoodStore = isFoodStore;
	}


	@Override
	public String toString() {
		return "Market [storeName=" + storeName + ", storeNo=" + storeNo + ", storeRent=" + storeRent
				+ ", storeLocation=" + storeLocation + ", isFoodStore=" + isFoodStore + "]";
	}
	
	
	

}
