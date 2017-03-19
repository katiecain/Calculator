/**
 * Created by kcain on 3/18/2017.
 */
import spock.lang.*
class CalculatorSpec extends spock.lang.Specification {
    def "adding two whole numbers"() {
        given: "a new calculator class is created"
        def calc = new Calculator()

        expect: "Adding two numbers returns their sum"
        calc.add(1, 2) == 3
    }
    def "subtracting two whole numbers"(){
        given: "a new calculator class is created"
        def calc = new Calculator()

        expect: "subtracting two numbers returns their difference"
        calc.subtract(1, 1) == 0
    }
    def "multiplying two whole numbers"(){
        given: "a new calculator class is created"
        def calc = new Calculator()

        expect: "multiplying two numbers returns the right total"
        calc.multiply(2, 2) == 4
    }
    def "dividing two whole numbers"(){
        given: "a new calculator class is created"
        def calc = new Calculator()

        expect:
        calc.divide(2,2) == 1
    }
}
