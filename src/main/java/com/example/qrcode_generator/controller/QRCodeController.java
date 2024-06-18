package com.example.qrcode_generator.controller;

import com.example.qrcode_generator.service.QRCodeService;
import com.google.zxing.WriterException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class QRCodeController {

    @Autowired
    private QRCodeService qrCodeService;

    @GetMapping("/generateQRCode")
    public ResponseEntity<byte[]> generateQRCode(@RequestParam String text,
                                                 @RequestParam(defaultValue = "200") int width,
                                                 @RequestParam(defaultValue = "200") int height) {
        try {
            byte[] qrCodeImage = qrCodeService.generateQRCode(text, width, height);
            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "image/png");
            return new ResponseEntity<>(qrCodeImage, headers, HttpStatus.OK);
        } catch (WriterException | IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}

