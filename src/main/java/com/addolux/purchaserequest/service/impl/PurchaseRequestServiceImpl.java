package com.addolux.purchaserequest.service.impl;

import com.addolux.purchaserequest.dto.PurchaseRequestDTO;
import com.addolux.purchaserequest.service.PurchaseRequestService;

import java.util.ArrayList;
import java.util.List;

public class PurchaseRequestServiceImpl implements PurchaseRequestService {

    @Override
    public List<PurchaseRequestDTO> getAllPurchaseRequests() {
        return getDummyPurchaseRequestData();
    }

    private List<PurchaseRequestDTO> getDummyPurchaseRequestData() {
        List<PurchaseRequestDTO> purchaseRequestDTOs = new ArrayList<PurchaseRequestDTO>();
        //Create dummy data here
        return purchaseRequestDTOs;
    }
}
