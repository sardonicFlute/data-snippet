package snippet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Zhangyuqi on 2018/12/4.
 */
@Controller
@RequestMapping("/stock")
public class StockController {
    @GetMapping("/detail")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("stockName", "stockName");
        model.addAttribute("companyName", "companyName");
        model.addAttribute("industryL1", "industryL1");
        model.addAttribute("industryL2", "industryL2");
        model.addAttribute("board", "board");
        model.addAttribute("l1CsrcIndustryName", "l1CsrcIndustryName");
        model.addAttribute("ticker", "ticker");
        model.addAttribute("reportList", "reportList");
        model.addAttribute("conceptionList",
                "conceptionList");
        model.addAttribute("isModeSimple", "isModeSimple");
        model.addAttribute("usableAmt", "usableAmt");
        model.addAttribute("exchangeCode", "exchangeCode");
        model.addAttribute("exchangeCode2", "exchangeCode2");
        return "stock/detail";
    }
}
