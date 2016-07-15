package ua.baustore.servic;

import java.util.List;

import ua.baustore.service.entity.Commodity;

  public interface CommodityService {
	
	    void save(Commodity commodity);
		
	    void delete (int commodityID);
		
		List<Commodity> getAllCommodities();
			
		Commodity findOneById(int id);
		


}
