import spock.lang.Specification


/**
 * Some groovy syntax sugar!
 * Created by josebovet on 8/4/16.
 */
class S1_Basic extends Specification {

    void 'should convert string to upper case'() {
        expect:
        'Hello World!'.toUpperCase() == 'HELLO WORLD!'
    }

    void 'should reverse a string'() {
        expect:
        'Hello World!'.reverse() == '!dlroW olleH'
    }

    void 'should count string size'() {
        expect:
        'Hello World!'.size() == 12
    }

    void 'should replace two strings'() {
        given:
        def word1 = 'Hello'
        def word2 = 'World!'

        expect:
        "${word1} ${word2}" == "Hello World!"
    }

    void 'should remove two letters'() {
        expect:
        'ABBCD' - 'BB' == 'ACD'
    }

    void 'should add pattern twice'() {
        expect:
        'ABC' * 2 == 'ABCABC'
    }

    void 'should take chars from subString'() {
        expect:
        '!abcdefg!'[1..7] == 'abcdefg'
        '!abcdefg!'.drop(1) == 'abcdefg!'
        '!abcdefg!'.take(8) == '!abcdefg'
    }

    void 'should tokenize a String'() {
        given:
        def word = 'Hello World!'

        expect:
        word.tokenize() == ['Hello', 'World!']
        word.tokenize().class.name == 'java.util.ArrayList'
    }

    void 'should get first 5 letters from alphabet'() {
        given:
        def alphabet = 'a'..'e'

        expect:
        alphabet.size() == 5
        alphabet == ['a', 'b', 'c', 'd', 'e']

    }

    void 'should get map values'() {
        given:
        def map = [color: 'Blue', weight: 500, shape: 'Circle', price: 150]

        expect:
        map.color == 'Blue'
        map.weight == 500
        map.shape == 'Circle'
        map.price == 30 * 5
    }

    void 'should get words size in map'() {
        given:
        def os = ['GNU/Linux', 'OSX', 'Windows', 'Unix']

        expect:
        os.collectEntries { [(it): it.length()] } == ['GNU/Linux': 9, 'OSX': 3, 'Windows': 7, 'Unix': 4]
        os.collect { it.size() } == [9, 3, 7, 4]
        os.collect { it.size() }.max() == 9
        os.collect { it.size() }.min() == 3
    }
}