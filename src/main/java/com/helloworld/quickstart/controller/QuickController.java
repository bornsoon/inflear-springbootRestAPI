package com.helloworld.quickstart.controller;

import com.helloworld.quickstart.dto.ItemDto;
import com.helloworld.quickstart.dto.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class QuickController {

    @PostMapping("/item")
    public ResponseDto registerItem(@RequestBody ItemDto item) {
        log.info("item: {}", item);
        // Alt + Enter 자동 완성
        new ResponseDto();
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
    public String getMember(@RequestParam("empNo") String empNo
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
