package com.lazyman.vansing.web;
import com.lazyman.vansing.domain.Payment;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/payments")
@Controller
@RooWebScaffold(path = "payments", formBackingObject = Payment.class)
@RooWebFinder
public class PaymentController {
}
