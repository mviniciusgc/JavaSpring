package com.portal.api.service;

import com.portal.api.client.CarPostStoreClient;
import com.portal.api.dto.CarPostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarPostStoreServiceImpl implements CarPostStoreService {

    @Autowired
    private CarPostStoreClient carpostStoreClient;
    @Override
    public List<CarPostDTO> getCarForSales() {
        return carpostStoreClient.carForSaleClient();
    }

    @Override
    public void changeCarForSale(CarPostDTO carPost, String id) {
        carpostStoreClient.changeCarForSaleClient(carPost, id);
    }

    @Override
    public void removeCarForSale(String id) {
        carpostStoreClient.deleteCarForSaleClient(id);

    }
}
