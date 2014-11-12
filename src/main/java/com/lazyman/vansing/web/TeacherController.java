package com.lazyman.vansing.web;
import com.lazyman.vansing.domain.Teacher;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/teachers")
@Controller
@RooWebScaffold(path = "teachers", formBackingObject = Teacher.class)
public class TeacherController {
}
