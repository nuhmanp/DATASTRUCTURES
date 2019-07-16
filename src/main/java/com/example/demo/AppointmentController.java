package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/appointments")
public class AppointmentController {

  @Autowired
  BinarySearch binarySearch;

  @RequestMapping(method = RequestMethod.GET)
  @ResponseBody
  public BinarySearch createSearch(@RequestBody BinarySearch binarySearch) {
    return binarySearch;

  }

}
