package ua.baustore.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import ua.baustore.service.entity.Commodity;



public interface CommodityDao extends JpaRepository<Commodity, Integer> {
	
   

}
