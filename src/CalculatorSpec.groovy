/**
 * Created by kcain on 3/18/2017.
 */
import spock.lang.*
class CalculatorSpec extends spock.lang.Specification {
    def calc = new Calculator()

    def "adding two whole numbers"() {
        given: "a new calculator class is created"

        expect: "Adding two numbers returns their sum"
        calc.add(1, 2) == 3
/*
        def sum = calc.add(1, 1)
        assert 2 == sum
*/
    }
    void testSubtract(){
        def diff = calc.subtract(1, 1)
        assert 0 == diff
    }
    void testMultiply(){
        def total = calc.multiply(2, 2)
        assert 4 == total
    }
    void testDivide(){
        def total = calc.divide(2,2)
        assert 1 == total
    }
}
