package com.javaex.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.javaex.vo.GuestbookVO;

@Repository
public class GuestbookRepository {

    public List<GuestbookVO> fetchGuestbookList() {
        RestTemplate restTemplate = new RestTemplate();

       
        GuestbookVO[] array = restTemplate.getForObject(
            "http://localhost:9001/guestbook/api/guestbook/list", 
            GuestbookVO[].class
        );

        return Arrays.asList(array);
    }

}
