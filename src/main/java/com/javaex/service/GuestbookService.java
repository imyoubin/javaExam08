package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.repository.GuestbookRepository;
import com.javaex.vo.GuestbookVO;

@Service
public class GuestbookService {

    @Autowired
    private GuestbookRepository guestbookRepository;

    public List<GuestbookVO> getGuestList() {
        return guestbookRepository.fetchGuestbookList();
    }
}









