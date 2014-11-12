package com.lazyman.vansing.web;
import com.lazyman.vansing.domain.Grade;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/grades")
@Controller
@RooWebScaffold(path = "grades", formBackingObject = Grade.class)
public class GradeController {
}
