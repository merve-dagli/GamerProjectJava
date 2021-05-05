package Entities;

import Abstract.Entity;

public class Store implements Entity {
	private int storeId;
	private String storeName;
	
	public Store() {}

	public Store(int storeId, String storeName) {
		super();
		this.storeId = storeId;
		this.storeName = storeName;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}
