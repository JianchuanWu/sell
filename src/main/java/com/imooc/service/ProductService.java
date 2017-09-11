package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wujianchuan
 * 2017/9/11 21:37
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    List<ProductInfo> findUppAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);
}
