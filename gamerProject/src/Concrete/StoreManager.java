package Concrete;

import Abstract.StoreService;
import Entities.Store;

public class StoreManager implements StoreService{

	@Override
	public void add(Store store) {
		System.out.println(store.getStoreName());
		
	}

	@Override
	public void delete(Store store) {
		System.out.println(store.getStoreId());
		
	}

	@Override
	public void update(Store store) {
		System.out.println(store.getStoreName());
		
	}

}
