package com.helloworld.quickstart.controller;

import com.helloworld.quickstart.dto.ItemDto;
import com.helloworld.quickstart.dto.ResponseDto;
import com.helloworld.quickstart.service.QuickService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class QuickController {

    @Autowired // 스프링부트가 Bean 객체 생성
    private QuickService quickService;

    @PostMapping("/item")
    public ResponseDto registerItem(@RequestBody ItemDto item) {

        // QuickService quickService = new QuickService();
        boolean b = quickService.registerItem(item);
        if (b == true) {
            ResponseDto responseDto = new ResponseDto();
            responseDto.setMessage("ok");
            return responseDto;
        }

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage("failed");
        return responseDto;
    }

    @GetMapping("/item")
    public ItemDto getItem(@RequestParam("id") String id) {
        ItemDto res = quickService.getItemById(id);
        return res;
    }


    @GetMapping("/dummy")
    public String dummy() {
        log.info("dummy");
        return "{}";
    }

    @GetMapping("/dummy2")
    public String dummy2() {
        log.info("dummy2");
        return "dummy2";
    }

    @GetMapping("/member")
    public String getMember(@RequestParam(value = "empNo", defaultValue = "1", required = false) String empNo
    , @RequestParam("year") int year) {
        log.info("empNo: {}", empNo);
        log.info("year: {}", year);
        return "ok";
    }

    @GetMapping("/company/{id}")
    public String getCompany(@PathVariable("id") String id) {
        log.info("id: {}", id);
        return "ok";
    }

    @PostMapping("/item1")
    public String registerItem(@RequestBody String item) {
        log.info("item: {}", item);
        return "ok";
    }
    /* RequestBody
    curl -X 'POST' \
      'http://127.0.0.1:8080/item' \
      -H 'accept: * /*' \
      -H 'Content-Type: application/json' \
      -d '"hello"'  <- body에 담기는 부분
     */
}
