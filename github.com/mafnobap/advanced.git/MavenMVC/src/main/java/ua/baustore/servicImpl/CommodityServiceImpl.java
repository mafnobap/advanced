package ua.baustore.servicImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.baustore.dao.CommodityDao;
import ua.baustore.servic.CommodityService;
import ua.baustore.service.entity.Commodity;

@Service("commodityService")
public class CommodityServiceImpl implements CommodityService {
	
	
	@Autowired 
	private CommodityDao commodityDao;

	public void save(Commodity commodity) {
		commodityDao.save(commodity);
		
	}

	public void delete(int commodityID) {
		commodityDao.delete(commodityID);
		
	}

	public List<Commodity> getAllCommodities() {
	
		return commodityDao.findAll();
	}

	public Commodity findOneById(int id) {
		
		return commodityDao.findOne(id);
	}
	








}
