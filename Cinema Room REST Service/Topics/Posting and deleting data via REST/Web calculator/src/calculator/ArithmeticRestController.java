package calculator;

import org.springframework.web.bind.annotation.*;

@RestController
class ArithmeticRestController {

    private String result;

    public void calculate(String operation, int a, int b) {
        if(operation.equals("+")) {
            result = String.valueOf(a+b);
        }
        if(operation.equals("*")) {
            result = String.valueOf(a*b);
        }
        if(operation.equals("-")) {
            result = String.valueOf(a-b);
        }
    }

    @GetMapping("/add")
    public String getAdd(@RequestParam int a, int b){
        calculate("+", a, b);
        return result;
    }

    @GetMapping("/subtract")
    public String getSub(@RequestParam int a, int b){
        calculate("-", a, b);
        return result;
    }

    @GetMapping("/mult")
    public String getMultiply(@RequestParam int a, int b){
        calculate("*", a, b);
        return result;
    }

    @GetMapping("/*")
    public String getDivide(){
        return "Unknown Operation";
    }
}